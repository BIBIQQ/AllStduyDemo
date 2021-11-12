package com.ff.web;

import com.alibaba.fastjson.JSON;
import com.ff.config.SpringConfig;
import com.ff.pojo.Brand;
import com.ff.pojo.PageBean;
import com.ff.service.SpringBrandService;
import com.ff.service.impl.BrandLogServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/brand2/*")
public class BrandServlet2 extends BaseServlet {
    private SpringBrandService springBrandService = ctx.getBean(SpringBrandService.class);


    //获取所有商品信息
    private void findAllBrandServlet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取所有商品信息
        List<Brand> allBrands = springBrandService.findAllBrand();
        //转成JSON
        String string = JSON.toJSONString(allBrands);
        System.out.println(string);
        response.setContentType("text/json;charset=utf-8");
        //发送到界面
        response.getWriter().write(string);
    }

    //添加商品
    private void addBrandServlet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获得请求数据
        BufferedReader reader = request.getReader();
        String brands = reader.readLine();
        Brand brand = JSON.parseObject(brands, Brand.class);
        if (brand.getBrandName().length() > 0 && brand.getCompanyName().length() > 0 && brand.getBrandName() != null && brand.getCompanyName() != null) {
            //添加到数据库
            int result = springBrandService.addBrand(brand);

            //将反馈响应到页面
            response.getWriter().write("true");
        } else {
            response.getWriter().write("false");
        }
    }

    //修改商品信息
    private void updataBrandServlet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取对象
        String sjson = request.getReader().readLine();
        //转换类型
        Brand brand = JSON.parseObject(sjson, Brand.class);
        //执行语句
        int result = springBrandService.modifyBrand(brand);
        if (result>0) {
            response.getWriter().write("true");
        } else {
            response.getWriter().write("false");
        }
    }

    //删除商品
    private void removeBrandServlet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取对象
        String sjson = request.getReader().readLine();
        //转换类型
        Brand brand = JSON.parseObject(sjson, Brand.class);
        Integer id = brand.getId();
        //执行语句
        int result = springBrandService.removeBrandById(id);
        if (result>0) {

            response.getWriter().write("true");
        } else {
            response.getWriter().write("false");
        }
    }

    //批量删除
    private void removeBrandByIdServlet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //接受数据
        String idsStr = request.getReader().readLine();
        int[] ids = JSON.parseObject(idsStr, int[].class);
        int result = springBrandService.removeBrandByIds(ids);
        if (result>0) {
            response.getWriter().write("true");
        } else {
            response.getWriter().write("false");

        }
    }
    //分页
    private void selectBrandByPageServlet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //接受当前页码
        String currentPage = request.getParameter("currentPage");
        String pageSize = request.getParameter("pageSize");
        //反馈结果
        PageBean<Brand> brandPageBean = springBrandService.seletByPage(Integer.parseInt(currentPage), Integer.parseInt(pageSize));
        String jsonString = JSON.toJSONString(brandPageBean);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(jsonString);
    }
    //多条件分页查询
    private void selectBrandByPageAndCounditionServlet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //接受当前页码
        String currentPage = request.getParameter("currentPage");
        String pageSize = request.getParameter("pageSize");

        //获取条件搜索
        String brands = request.getReader().readLine();
        //处理数据
        Brand brand = JSON.parseObject(brands, Brand.class);

        //执行语句
        PageBean<Brand> brandPageBean = springBrandService.selectBrandByPageAndCoundition(Integer.parseInt(currentPage), Integer.parseInt(pageSize), brand);
        //编码
        response.setContentType("text/json;charset= utf-8");
        //转义
        String jsonString = JSON.toJSONString(brandPageBean);
        //写到界面
        response.getWriter().write(jsonString);
    }

}
