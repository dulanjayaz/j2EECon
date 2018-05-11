package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("      <link rel=\"stylesheet\" href=\"font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <style>\n");
      out.write("body {\n");
      out.write("    background-image: url(\"images/back3.png\");\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"text-align: center;\">\n");
      out.write("        <form action=\"\"  method=\"post\">\n");
      out.write("              <fieldset id='fieldsetcss'>\n");
      out.write("                <legend id=\"legendcss\" >Please Signup</legend>\n");
      out.write("                \n");
      out.write("                <div class=\"form-inline\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"nm\" placeholder=\"Your name\"/>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("                <br>\n");
      out.write("             <div class=\"form-inline\">\n");
      out.write("                <input type=\"text\" class=\"form-control\"  name=\"ls\" placeholder=\"Your location\"/>\n");
      out.write("            </div>\n");
      out.write("                 <br>\n");
      out.write("                 <div class=\"form-inline\">\n");
      out.write("                <input type=\"text\" class=\"form-control\"  name=\"tp\" placeholder=\"Your Phone number\"/>\n");
      out.write("            </div>\n");
      out.write("                 <br>\n");
      out.write("                 <div class=\"form-inline\">\n");
      out.write("                <input type=\"text\" class=\"form-control\"  name=\"un\" placeholder=\"Your User Name\"/>\n");
      out.write("            </div>\n");
      out.write("                 <br>\n");
      out.write("                 <div class=\"form-inline\">\n");
      out.write("                <input type=\"password\" class=\"form-control\"  name=\"ps\" placeholder=\"Your Password\"/>\n");
      out.write("            </div>\n");
      out.write("                 <br>\n");
      out.write("                 <div class=\"form-inline\">\n");
      out.write("                <input type=\"text\" class=\"form-control\"  name=\"em\" placeholder=\"Your Email\"/>\n");
      out.write("            </div>\n");
      out.write("                 <br>\n");
      out.write("                \n");
      out.write("            <button type=\"submit\" class=\"btn btn-danger\">Signup</button>\n");
      out.write("            <a href=\"login.jsp\" class=\"btn btn-default\">Back</a>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        ");

            String  a = request.getParameter("nm");
            String  b = request.getParameter("ls"); 
            String  c = request.getParameter("tp"); 
            String  d = request.getParameter("un"); 
            String  e = request.getParameter("ps");
            String  f = request.getParameter("em"); 
            String host ="jdbc:mysql://localhost/jspdatabase";
            Connection conn=null;
            PreparedStatement stmt = null;
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            if(a!=null && b!=null && c!=null && d!=null && e!=null && f!=null)
            {
               conn=DriverManager.getConnection(host,"root","");
               String data = "insert into record(name,address,phone,username,password,email) values(?,?,?,?,?,?)";
               stmt= conn.prepareStatement(data);
               stmt.setString(1,a);
               stmt.setString(2,b);
               stmt.setString(3,c);
               stmt.setString(4,d);
               stmt.setString(5,e);
               stmt.setString(6,f);
               
               stmt.executeUpdate();
               response.sendRedirect("login.jsp");
               
            }
            
            
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
