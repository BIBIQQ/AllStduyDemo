package com.itheima.web.servlet;

import org.apache.commons.io.IOUtils;
import sun.nio.ch.IOUtil;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author FF
 * @date 2021/10/28
 * @TIME:15:04
 */
@WebServlet("/resp4")
public class ResponseServlet4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("Content-Type","application/octet-stream");
        //读取文件
        FileInputStream fileInputStream = new FileInputStream("E:\\微信图片_20210716212009.jpg");
        // 获取response字节流
        ServletOutputStream outputStream = resp.getOutputStream();

        //复制
      /*  byte[] bytes = new byte[1024];
        int len = 0;
        while (((len = fileInputStream.read(bytes)) != -1)) {
            outputStream.write(bytes,0,len);
        }*/
       //文件对拷
        IOUtils.copy(fileInputStream,outputStream);
        //关流
        fileInputStream.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
