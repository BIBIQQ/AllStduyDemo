/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-10-29 07:09:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\"/>\r\n");
      out.write("    <title>黑马程序员论坛首页</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/common.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/common-new.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/user_info.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/search.css\"/>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/hm-bbs.js\"></script>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        .hm-header-b { border-bottom: 1px solid #d9d9d9; }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 头部 -->\r\n");
      out.write("<div class=\"hm-top-nav\">\r\n");
      out.write("    <div class=\"hm-inner clearfix\">\r\n");
      out.write("        <div class=\"hm-inner-l l\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"hm-inner-r r\">\r\n");
      out.write("            <div class=\"box\">\r\n");
      out.write("                欢迎<a href=\"user_info.html\" style=\"margin-right:0px;padding:0px 5px;color:blue;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</a>回来！\r\n");
      out.write("                <a href=\"#\">【注销】</a>\r\n");
      out.write("                <div id=\"dialogBg\"></div>\r\n");
      out.write("                <div id=\"dialog\" class=\"animated\">\r\n");
      out.write("                    <img class=\"dialogIco\" width=\"50\" height=\"40\" src=\"images/ico.png\"/>\r\n");
      out.write("                    <div class=\"dialogTop\" style=\"height:25px;\">\r\n");
      out.write("                        <a href=\"javascript:;\" class=\"closeDialogBtn\">关闭</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <form action=\"\" method=\"post\">\r\n");
      out.write("                        <ul class=\"editInfos\">\r\n");
      out.write("                            <li>用户名：<input type=\"text\" id=\"userName\" name=\"userName\"\r\n");
      out.write("                                           class=\"ipt\"/></li>\r\n");
      out.write("                            <li>密&nbsp;&nbsp;&nbsp;码：<input type=\"password\"\r\n");
      out.write("                                                            id=\"userPass\" name=\"userPass\" class=\"ipt\"/></li>\r\n");
      out.write("                            <li><input type=\"submit\" value=\"登录\" class=\"submitBtn\"/></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--头部信息-->\r\n");
      out.write("<div class=\"hm-header\">\r\n");
      out.write("    <div class=\"hm-inner clearfix\">\r\n");
      out.write("        <div class=\"hm-header-t clearfix\">\r\n");
      out.write("            <h1 class=\"logo l\">\r\n");
      out.write("                <a href=\"javascript:;\"><img src=\"images/logo.png\" height=\"64\" width=\"168\" alt=\"\"/></a>\r\n");
      out.write("            </h1>\r\n");
      out.write("            <div class=\"search-box l\">\r\n");
      out.write("                <form action=\"javascript:;\">\r\n");
      out.write("                    <input type=\"text\" class=\"txt l\" placeholder=\"请输入关键字\">\r\n");
      out.write("                    <input type=\"button\" value=\"搜索\" class=\"btn l\"/>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"hm-header-b\">\r\n");
      out.write("            <i class=\"hm-ico-home\"></i>\r\n");
      out.write("            <a href=\"index.html\">首页</a><span>></span>个人信息\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"hm-body hm-body-bgc\">\r\n");
      out.write("    <div class=\"hm-inner\">\r\n");
      out.write("        <div class=\"user-info clearfix\">\r\n");
      out.write("            <div class=\"user-info-t\" style=\"height:20px;\"></div>\r\n");
      out.write("\r\n");
      out.write("            <!--左侧用户名，头像-->\r\n");
      out.write("            <div class=\"user-info-l l\">\r\n");
      out.write("                <div class=\"user-info-l-t\">\r\n");
      out.write("                    <img src=\"images/default.png\"/>\r\n");
      out.write("                    <div class=\"username\">张无忌</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul class=\"user-info-l-b\">\r\n");
      out.write("                    <li class=\"cur\"><i class=\"info-icon\"></i>我的资料</li>\r\n");
      out.write("                    <li><i class=\"safe-icon\"></i>修改密码</li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <!--右侧用户信息-->\r\n");
      out.write("            <div class=\"user-info-r r\">\r\n");
      out.write("                <ul class=\"clearfix hd\">\r\n");
      out.write("                    <li class=\"cur\"><a href=\"user_info.html\">个人信息</a></li>\r\n");
      out.write("                    <li><a href=\"user_pwd.html\">修改密码</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <form action=\"#\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("                    <ul class=\"bd\">\r\n");
      out.write("                        <li class=\"clearfix\">\r\n");
      out.write("                            <div class=\"info-l\"><i class=\"red\">*</i>用户名：</div>\r\n");
      out.write("                            <div class=\"info-r\"><input type=\"text\" class=\"txt\" value=\"\" readonly=\"readonly\"/></div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"clearfix\">\r\n");
      out.write("                            <div class=\"info-l\">邮箱地址：</div>\r\n");
      out.write("                            <div class=\"info-r\"><input type=\"text\" name=\"email\" class=\"txt\" value=\"\"/></div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"clearfix\">\r\n");
      out.write("                            <div class=\"info-l\">上传头像：</div>\r\n");
      out.write("                            <div class=\"info-r\"><input type=\"file\" name=\"picUrl\" class=\"file-btn\"/></div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"clearfix\">\r\n");
      out.write("                            <div class=\"info-l\"></div>\r\n");
      out.write("                            <div class=\"info-r\">\r\n");
      out.write("                                <input type=\"submit\" class=\"btn\" value=\"保存\"/>\r\n");
      out.write("                                <span style=\"color:red;\">修改成功！</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 底部 -->\r\n");
      out.write("<div class=\"hm-footer\" style=\"padding-top:10px;\">\r\n");
      out.write("    <div class=\"hm-inner\">\r\n");
      out.write("        <div class=\"hm-footer-cpr\">\r\n");
      out.write("            <p>Copyright@2006-2017 ITCAST. All Rights Reserved</p>\r\n");
      out.write("            <p>传智播客 版权所有</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
