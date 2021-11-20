package com.ff.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.ff.dao.CutKnifeDao;
import com.ff.dao.UserCutknifeDao;
import com.ff.domain.CutKnife;
import com.ff.domain.User;
import com.ff.dao.UserDao;
import com.ff.domain.UserCutknife;
import com.ff.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * <p>
 * APP用户信息表 服务实现类
 * </p>
 *
 * @author 方某
 * @since 2021-11-18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {
    //用户信息
    @Autowired
    private  UserDao userDao;
    //砍价订单表
    @Autowired
    private CutKnifeDao cutKnifeDao;
    //砍价详情中间表
    @Autowired
    private UserCutknifeDao userCutknifeDao;


    /**
     * 砍价
     * 添加中间表 并核对信息
     * @param cutKnifeId
     * @param userId
     * @return
     */
    @Override
    public Map addUserCutknife(Integer cutKnifeId, Integer userId) {
        Map map = new HashMap();
        //判断参数是否合规
        if(cutKnifeId == null || userId == null){
            map.put("message","参数错误，请重新尝试");
            map.put("result","false");
            return map;
        }
        //搜索id值是否存在
        CutKnife cutKnife = cutKnifeDao.selectById(cutKnifeId); // 订单表
        User user = userDao.selectById(userId);  // 用户表


        if (cutKnife ==null || user == null){
            map.put("message","参数错误，请重新尝试");
            map.put("result","false");
            return map;
        }

        //判断用户id是否砍过价
        LambdaQueryWrapper<UserCutknife> lqw = new LambdaQueryWrapper<>();
        lqw.eq(UserCutknife::getCutId,cutKnifeId).eq(UserCutknife::getUserId,userId);
        UserCutknife userCutknife1 = userCutknifeDao.selectOne(lqw);

        if(userCutknife1 != null ){
            map.put("message","已经砍过价格，请更换后重新砍价");
            map.put("result","false");
            return map;
        }


        //获取总金额-已砍金额 = 剩余金额
        int lastMoney = (int) ((cutKnife.getMoney()-cutKnife.getKnifeMoney())*100);  // 扩大到分
        Double cutMoney = 0.0;

        Random random = new Random();

        //生成砍价金额
        int cutMoneys = 0;       // 扩大到分
        cutMoneys = random.nextInt(lastMoney);
        cutMoney = cutMoneys/100.0;          //重新赋值  设置参数
        if(cutMoney == 0){
            map.put("result","砍价失败");
        }

        //判断砍价人数是否超过40人  直接将剩余金额砍完
        if (cutKnife.getKnifeRen()>=40) {
            cutMoney = cutKnife.getMoney()-cutKnife.getKnifeMoney();
            map.put("result","砍价成功");
        }

        //添加到砍价详情表中
        //封装数据
        UserCutknife userCutknife = new UserCutknife();
        userCutknife.setCutId(cutKnifeId);
        userCutknife.setUserId(userId);
        userCutknife.setCutMoney(cutMoney);
        //添加到中间表
        userCutknifeDao.addCutknife(userCutknife);

        //修改砍价订单砍价信息
        //增加  砍价金额   增加一个砍价人数
        cutKnife.setKnifeMoney(cutKnife.getKnifeMoney()+cutMoney);
        cutKnife.setKnifeRen(cutKnife.getKnifeRen()+1);
        //修改订单表
        cutKnifeDao.updateById(cutKnife);

        //传递回去 砍价金额和   用户名
        BigDecimal bg = new BigDecimal(cutMoney);
        cutMoney = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        map.put("kMoney",cutMoney);
        map.put("kUser",user.getName());
        return map;
    }
}
