/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-10-31 08:56:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userPwd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\"/>\n");
      out.write("    <title>黑马程序员论坛首页</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/common.css\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/common-new.css\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/user_info.css\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/search.css\"/>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.7.2.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/hm-bbs.js\"></script>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        .hm-header-b { border-bottom: 1px solid #d9d9d9; }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- 头部 -->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--头部信息-->\n");
      out.write("<div class=\"hm-header\">\n");
      out.write("    <div class=\"hm-inner clearfix\">\n");
      out.write("        <div class=\"hm-header-t clearfix\">\n");
      out.write("            <h1 class=\"logo l\">\n");
      out.write("                <a href=\"javascript:;\"><img src=\"images/logo.png\" alt=\"\"/></a>\n");
      out.write("            </h1>\n");
      out.write("            <div class=\"search-box l\">\n");
      out.write("                <form action=\"javascript:;\">\n");
      out.write("                    <input type=\"text\" class=\"txt l\" placeholder=\"请输入关键字\">\n");
      out.write("                    <input type=\"button\" value=\"搜索\" class=\"btn l\"/>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"hm-header-b\">\n");
      out.write("            <i class=\"hm-ico-home\"></i>\n");
      out.write("            <a href=\"/indextHtmlServlet\">首页</a><span>></span>修改密码\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--修改密码-->\n");
      out.write("<div class=\"hm-body hm-body-bgc\">\n");
      out.write("    <div class=\"hm-inner\">\n");
      out.write("        <div class=\"user-info clearfix\">\n");
      out.write("            <div class=\"user-info-t\" style=\"height:20px;\"></div>\n");
      out.write("            <div class=\"user-info-l l\">\n");
      out.write("                <div class=\"user-info-l-t\">\n");
      out.write("                    <img src=\"images/default.png\" alt=\"\"/>\n");
      out.write("                    <div class=\"username\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</div>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"user-info-l-b\">\n");
      out.write("                    <li><i class=\"info-icon\"></i>我的资料</li>\n");
      out.write("                    <li class=\"cur\"><i class=\"safe-icon\"></i>修改密码</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"user-info-r r\">\n");
      out.write("                <ul class=\"clearfix hd\">\n");
      out.write("                    <li><a href=\"/showUserByIdServlet\">个人信息</a></li>\n");
      out.write("                    <li class=\"cur\"><a href=\"/userPwd.jsp\">修改密码</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <form action=\"/modifiyPasswordServlet\" method=\"post\">\n");
      out.write("                  <ul class=\"bd\">\n");
      out.write("                    <li class=\"clearfix\">\n");
      out.write("                        <div class=\"info-l\"><i class=\"red\">*</i>旧密码：</div>\n");
      out.write("                        <div class=\"info-r\"><input type=\"password\" name=\"oldPassword\" class=\"txt\"/></div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"clearfix\">\n");
      out.write("                        <div class=\"info-l\"><i class=\"red\">*</i>新密码：</div>\n");
      out.write("                        <div class=\"info-r\"><input type=\"password\" name=\"newPassword\" class=\"txt\"/></div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"clearfix\">\n");
      out.write("                        <div class=\"info-l\"></div>\n");
      out.write("                        <div class=\"info-r\">\n");
      out.write("\t\t\t\t\t\t  <input type=\"submit\" class=\"btn\" value=\"保存\"/>\n");
      out.write("\t\t\t\t\t\t  <span style=\"color:red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Modify_msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                    </li>\n");
      out.write("                  </ul>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- 底部 -->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common/footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
