package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.*;;

public final class workersdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("          <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("      <link rel=\"stylesheet\" href=\"font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <p><br/></p>\n");
      out.write("        <div class=\"row\">\n");
      out.write("        <div class=\"col-md-6\">\n");
      out.write("            <h3>Test edit delete</h3>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-6\">\n");
      out.write("            <a href=\"addnew.jsp\" class=\"btn btn-primary\">Add New Data</a>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        <p></p>\n");
      out.write("        <table class=\"table table-bordered table-striped table-hover\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>NAME</th>\n");
      out.write("                    <th>Type</th>\n");
      out.write("                    <th>Email</th>\n");
      out.write("                    <th>Contact</th>\n");
      out.write("                    \n");
      out.write("                    <th class=\"text-center\">Action</th>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    String host ="jdbc:mysql://localhost/appdb";
                    Connection conn=null;
                    Statement stat=null;
                    ResultSet res=null;
                    Class.forName("com.mysql.jdbc.Driver");
                    conn=DriverManager.getConnection(host,"root","");
                    stat=conn.createStatement();
                    String data="select * from workers";
                    res=stat.executeQuery(data);
                    while(res.next()){
                    
                    
                    
                    
                    
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(res.getInt("id"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(res.getString("name"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(res.getString("type"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(res.getString("email"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(res.getString("tpnumber"));
      out.write("</td>\n");
      out.write("                        <td class=\"text\">\n");
      out.write("                            <a href=\"#\" class=\"btn btn-warning\">Add project</a>\n");
      out.write("                            <a href=\"#\" class=\"btn btn-toolbar\">Message</a>\n");
      out.write("                        </td>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        }
                     
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
