package com.ff.service.Impl;

import com.ff.dao.BrandsDao;
import com.ff.pojo.Brand;
import com.ff.pojo.PageBean;
import com.ff.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author FF
 * @date 2021/11/11
 * @TIME:10:18
 */
@Service
public class BrandServiceImpl  implements BrandService {

    @Autowired
    private BrandsDao brandsMapper;

    @Override
    public List<Brand> findAllBrand() {
        return brandsMapper.findAllBrand();
    }

    @Override
    public int addBrand(Brand brand) {
        return brandsMapper.addBrand(brand);
    }

    @Override
    public Brand selectBrandById(Brand brand) {
        return brandsMapper.selectBrandById(brand);
    }

    @Override
    public int modifyBrand(Brand brand) {
        return brandsMapper.modifyBrand(brand);
    }

    @Override
    public int removeBrandById(Integer id) {
        return brandsMapper.removeBrandById(id);
    }

    @Override
    public List<Brand> findBrandByVal(Integer val) {
        return brandsMapper.findBrandByVal(val);
    }

    @Override
    public int removeBrandByIds(int[] ids) {

        return brandsMapper.deleteBrandById(ids);
    }

    @Override
    public PageBean<Brand> seletByPage(int currentPage, int pageSize) {
        int begin = (currentPage - 1) * currentPage;
        //当前页数
        List<Brand> brands = brandsMapper.seletByPage(begin, pageSize);
        int totalCount = brandsMapper.selectTotalCount();
        PageBean<Brand> brandPageBean = new PageBean<>();
        brandPageBean.setRows(brands);
        brandPageBean.setTotalCount(totalCount);

        return brandPageBean;
    }

    @Override
    public int selectTotalCount() {
        return brandsMapper.selectTotalCount();
    }

    @Override
    public  PageBean<Brand> selectBrandByPageAndCoundition(int currentPage, int pageSize, Brand brand) {

        //   当前页数
        int begin = (currentPage - 1) * pageSize;
        //处理数据
        String brandName = brand.getBrandName();
        String companyName = brand.getCompanyName();
        if(brandName != null && brandName.length() > 0){
            brand.setBrandName("%"+brandName+"%");
        }
        if(companyName != null && companyName.length() > 0){
            brand.setCompanyName("%"+companyName+"%");
        }
        //获取数据
        List<Brand> brands = brandsMapper.selectBrandByPageAndCoundition(begin, pageSize, brand);

        int ByCountAndPage = brandsMapper.selectByCounditionTotalCount(brand);
        //封装数据
        PageBean<Brand> brandPageBean = new PageBean<>();
        brandPageBean.setTotalCount(ByCountAndPage);
        brandPageBean.setRows(brands);

        return brandPageBean;
    }

    @Override
    public int selectByCounditionTotalCount(Brand brand) {
        return brandsMapper.selectByCounditionTotalCount(brand);
    }
}
