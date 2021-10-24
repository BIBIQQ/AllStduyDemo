package com.demo;

import com.mapper.BrandMapper;
import com.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author FF
 * @date 2021/10/20
 * @TIME:19:14
 */
public class Demo {
    SqlSession sqlSession = null;
    BrandMapper mapper = null;

    @Before
    public void befter() throws IOException {
        //    获取 sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //          获得对象，执行sql
        //        默认是手动提交事务，需要手动 提交    true 自动  false 手动
        sqlSession = sqlSessionFactory.openSession(false);
        mapper = sqlSession.getMapper(BrandMapper.class);
    }

    @Test
    public void selectAll() {
        List<Brand> brands = mapper.selectAll();
        System.out.println(brands);
    }

    @Test
    public void selectById() {
        int id = 3;
        Brand brand = mapper.selectID(id);
        System.out.println(brand);
    }

    @Test
    public void selectBymulti() {
//        接受参数
        int status = 1;
        String companyName = "华为";
        String brandName = "华为";
//        处理参数
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";

//        封装对象
       /* Brand brands = new Brand();
        brands.setBrandName(brandName);
        brands.setCompanyName(companyName);
        brands.setStatus(status);*/

        Map map = new HashMap<>();
        map.put("status", status);
        map.put("companyName", companyName);
        map.put("brandName", brandName);
        //        获得对象，执行sql
        List<Brand> brand01 = mapper.selectBymulti(status, companyName, brandName);
//        List<Brand> brand02 = mapper.selectBymulti(brands);
        List<Brand> brand03 = mapper.selectBymulti(map);
        System.out.println(brand03);


    }

    @Test
    public void selectBySingle() {
//            接受参数
        int status = 1;
        String companyName = "华为";
        String brandName = "华为";
//        处理参数
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";
        Brand brands = new Brand();
//        brands.setBrandName(brandName);
//        brands.setCompanyName(companyName);
//        brands.setStatus(status);

        List<Brand> brand = mapper.selectBySingle(brands);
        System.out.println(brand);
        sqlSession.close();
    }

    @Test
    public void testAdd() throws IOException {
//      设置参数
        String brandName = "香飘飘";
        String companyName = "香飘飘";
        int ordered = 2;
        String description = "把你捧在手心";
        int status = 1;

//       设置参数
        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setCompanyName(companyName);
        brand.setDescription(description);
        brand.setBrandName(brandName);
        brand.setOrdered(ordered);


        mapper.add(brand);
        Integer id = brand.getId();
        System.out.println(id);
    }

    @Test
    public void testUpdata() throws IOException {
//      设置参数
        String brandName = "香飘";
        String companyName = "飘飘";
        int ordered = 7;
        String description = "把你捧在手心,暖暖的很贴心";
        int status = 1;

        int id = 13;

//       设置参数
        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setCompanyName(companyName);
        brand.setBrandName(brandName);
        brand.setDescription(description);
        brand.setOrdered(ordered);
        brand.setId(id);

        int updata = mapper.updata(brand);
        System.out.println(updata > 0);
    }

    @Test
    public void deletById() {
//        获取参数
        int id = 5;
        mapper.deletById(id);
    }

    @Test
    public void deletByIds() {
//        获取参数
        int[] id = {4, 5, 6};
        mapper.deletByIds(id);
    }

    @Test
    public void selectId() {
        int id = 1;
//        获得对象，执行sql
//          默认是手动提交事务，需要手动 提交    true 自动  false 手动
        Brand brand = mapper.selectById(id);
        System.out.println(brand);
    }

    @After
    public void after() {
        //        释放资源
        sqlSession.commit();
        sqlSession.close();
    }
}

