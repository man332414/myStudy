/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.20
 * Generated at: 2024-10-10 02:20:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>어서와 집이야</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	실습 리스트\r\n");
      out.write("	<p><a href = \"2_1\"> 선언문 태그 예제 2-1</a></p>\r\n");
      out.write("	<p><a href = \"2_2\"> 선언문 태그 예제 2-2</a></p>\r\n");
      out.write("	<p><a href = \"2_3\"> 선언문 태그 예제 2-3</a></p>\r\n");
      out.write("	<br>\r\n");
      out.write("	<p><a href = \"2_4\"> 스크립틀릿 태그 예제 2-4</a></p>\r\n");
      out.write("	<p><a href = \"2_5\"> 스크립틀릿 태그 예제 2-5</a></p>\r\n");
      out.write("	<br>\r\n");
      out.write("	<p><a href = \"2_6\"> 표현문 태그 예제 2-6</a></p>\r\n");
      out.write("	<p><a href = \"2_7\"> 표현문 태그 예제 2-7</a></p>\r\n");
      out.write("	<hr>\r\n");
      out.write("	<p><a href = \"3_1\"> page 디렉티브 태그 예제 3-1</a></p>\r\n");
      out.write("	<p><a href = \"3_2\"> page 디렉티브 태그 예제 3-2</a></p>\r\n");
      out.write("	<p><a href = \"3_3\"> page 디렉티브 태그 예제 3-3</a></p>\r\n");
      out.write("	<p><a href = \"3_4\"> page 디렉티브 태그 예제 3-4</a></p>\r\n");
      out.write("	<p><a href = \"3_6\"> page 디렉티브 태그 예제 3-6</a></p>\r\n");
      out.write("	<p><a href = \"3_7\"> page 디렉티브 태그 예제 3-7</a></p>\r\n");
      out.write("	<p><a href = \"3_9\"> page 디렉티브 태그 예제 3-9</a></p>\r\n");
      out.write("	<p><a href = \"3_10\"> page 디렉티브 태그 예제 3-10</a></p>\r\n");
      out.write("	<p><a href = \"3_11\"> page 디렉티브 태그 예제 3-11</a></p>\r\n");
      out.write("	<hr>\r\n");
      out.write("	<p><a href = \"4_1\"> forward 액션 태그 예제 4-1</a></p>\r\n");
      out.write("	<p><a href = \"4_2\"> include 액션 태그 예제 4-2</a></p>\r\n");
      out.write("	<p><a href = \"4_3\"> param 액션 태그 예제 4-3</a>\r\n");
      out.write("	<p><a href = \"4_4\"> param 액션 태그 예제 4-4</a>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
