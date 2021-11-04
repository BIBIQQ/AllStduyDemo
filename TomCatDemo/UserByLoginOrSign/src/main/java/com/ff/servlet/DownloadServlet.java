package com.ff.servlet;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet("/DownloadServlet")
public class DownloadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
        * 下载文件：
        * 1.获取文件路径
        * 2，把文件读到字节输入流中
        * 3.告知浏览器，以下载的方式（告知浏览器下载文件的MIME类型）
        * 4.使用响应对象的字节输入流到浏览器上
        * */

        //1.获取文件路径
        ServletContext context = this.getServletContext();


        String filePath = context.getRealPath("/resource/A.jpg");
        //2.把文件读到字节输入流中
        FileInputStream inputStream = new FileInputStream(filePath);

        //3.设置响应消息头
        response.setHeader("Content-Type","application/octet-stream");// 注意下载的时候，设置响应正文的MIME类型用application/octet-stream
        response.setHeader("Content-Disposition","attachment;filename=1.jpg"); //告知浏览器以下载的方式打开
        //4.使用响应对象的字节输出流输出
       OutputStream outputStream = response.getOutputStream();
       /*int len = 0;
        byte[] bytes = new byte[1024];
        while (((len = inputStream.read(bytes)) != -1)) {
            outputStream.write(bytes,0,len);
        }*/
        //对拷
        IOUtils.copy(inputStream, outputStream);
        inputStream.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request, response);
    }
}