/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-11-04 12:23:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class top_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Language\" content=\"zh-cn\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<style type=\"text/css\">\n");
      out.write("BODY {\n");
      out.write("\tMARGIN: 0px;\n");
      out.write("\tBACKGROUND-COLOR: #ffffff\n");
      out.write("}\n");
      out.write("\n");
      out.write("BODY {\n");
      out.write("\tFONT-SIZE: 12px;\n");
      out.write("\tCOLOR: #000000\n");
      out.write("}\n");
      out.write("\n");
      out.write("TD {\n");
      out.write("\tFONT-SIZE: 12px;\n");
      out.write("\tCOLOR: #000000\n");
      out.write("}\n");
      out.write("\n");
      out.write("TH {\n");
      out.write("\tFONT-SIZE: 12px;\n");
      out.write("\tCOLOR: #000000\n");
      out.write("}\n");
      out.write(".height1{width:100%; height:74px; }\n");
      out.write(".img_logo{\n");
      out.write("\tmin-width:100%;\n");
      out.write("\tmax-width:100%;\n");
      out.write("\theight:74px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/css/Style.css\"\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tfunction exitSys() {\n");
      out.write("\t\tvar flag = window.confirm(\"确认退出系统吗?\");\n");
      out.write("\t\tif (flag) {\n");
      out.write("            window.top.open('', '_parent', '');\n");
      out.write("            window.top.close();\n");
      out.write("            window.location.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/ToLoginServlet\";\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("</HEAD>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"height1\">\n");
      out.write("\t\t<img class=\"img_logo\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/images/top_bg.jpg\">\n");
      out.write("\t</div>\n");
      out.write("\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td height=\"26\" valign=\"bottom\"\n");
      out.write("\t\t\t\tbackground=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/images/mis_01.jpg\">\n");
      out.write("\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td width=\"85%\" align=\"left\">\n");
      out.write("\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \n");
      out.write("\t\t\t\t\t\t\t<font color=\"#000000\">\n");
      out.write("\t\t\t\t\t\t\t\t<script language=\"JavaScript\">\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\ttmpDate = new Date();\n");
      out.write("\t\t\t\t\t\t\t\t\tdate = tmpDate.getDate();\n");
      out.write("\t\t\t\t\t\t\t\t\tmonth = tmpDate.getMonth() + 1;\n");
      out.write("\t\t\t\t\t\t\t\t\tyear = tmpDate.getFullYear();\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.write(year);\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.write(\"年\");\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.write(month);\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.write(\"月\");\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.write(date);\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.write(\"日 \");\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\tmyArray = new Array(6);\n");
      out.write("\t\t\t\t\t\t\t\t\tmyArray[0] = \"星期日\"\n");
      out.write("\t\t\t\t\t\t\t\t\tmyArray[1] = \"星期一\"\n");
      out.write("\t\t\t\t\t\t\t\t\tmyArray[2] = \"星期二\"\n");
      out.write("\t\t\t\t\t\t\t\t\tmyArray[3] = \"星期三\"\n");
      out.write("\t\t\t\t\t\t\t\t\tmyArray[4] = \"星期四\"\n");
      out.write("\t\t\t\t\t\t\t\t\tmyArray[5] = \"星期五\"\n");
      out.write("\t\t\t\t\t\t\t\t\tmyArray[6] = \"星期六\"\n");
      out.write("\t\t\t\t\t\t\t\t\tweekday = tmpDate.getDay();\n");
      out.write("\t\t\t\t\t\t\t\t\tif (weekday == 0 | weekday == 6) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdocument.write(myArray[weekday])\n");
      out.write("\t\t\t\t\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdocument.write(myArray[weekday])\n");
      out.write("\t\t\t\t\t\t\t\t\t};\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</script> \n");
      out.write("\t\t\t\t\t\t\t</font>\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t<td width=\"15%\">\n");
      out.write("\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"16\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/images/mis_05b.jpg\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/images/mis_05a.jpg\" width=\"6\" height=\"18\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"155\" valign=\"bottom\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/images/mis_05b.jpg\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<font color=\"blue\">\n");
      out.write("                                            <a href=\"javascript:void(0)\" onclick=\"exitSys()\">退出系统</a>\n");
      out.write("                                        </font>\n");
      out.write("                                    </td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"10\" align=\"right\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/images/mis_05b.jpg\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/resources/images/mis_05c.jpg\" width=\"6\" height=\"18\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t<td align=\"right\" width=\"5%\"></td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\n");
      out.write("</body>\n");
      out.write("</HTML>\n");
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
