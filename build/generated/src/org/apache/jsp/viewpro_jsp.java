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

public final class viewpro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("           <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("      <link rel=\"stylesheet\" href=\"font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <style>\n");
      out.write("body {\n");
      out.write("    background-image: url(\"images/back3.png\");\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"top-nav\" class=\"navbar navbar-inverse navbar-static-top\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("            </button>\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">Dashboard</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"navbar-collapse collapse\">\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a class=\"dropdown-toggle\" role=\"button\" data-toggle=\"dropdown\" href=\"#\"><i class=\"glyphicon glyphicon-user\"></i> Admin <span class=\"caret\"></span></a>\n");
      out.write("                    <ul id=\"g-account-menu\" class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                        <li><a href=\"#\">My Profile</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"#\"><i class=\"glyphicon glyphicon-lock\"></i> Logout</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            <!-- Left column -->\n");
      out.write("            <a href=\"#\"><strong><i class=\"glyphicon glyphicon-wrench\"></i> Project</strong></a>\n");
      out.write("\n");
      out.write("            <hr>\n");
      out.write("             <ul class=\"nav nav-stacked\">\n");
      out.write("                <li class=\"nav-header\"> <a href=\"#\" data-toggle=\"collapse\" data-target=\"#userMenu\">My Project <i class=\"glyphicon glyphicon-chevron-down\"></i></a>\n");
      out.write("                    <ul class=\"nav nav-stacked collapse in\" id=\"userMenu\">\n");
      out.write("                        <li class=\"active\"> <a href=\"back.html\"><i class=\"glyphicon glyphicon-home\"></i> Home</a></li>\n");
      out.write("                        <li><a href=\"view.jsp\"><i class=\"glyphicon glyphicon-envelope\"></i> view  <span class=\"badge badge-info\">4</span></a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"glyphicon glyphicon-cog\"></i> Options</a></li>\n");
      out.write("                       \n");
      out.write("                        <li><a href=\"#\"><i class=\"glyphicon glyphicon-off\"></i> Logout</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            \n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("\n");
      out.write("                    \n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("           \n");
      out.write("\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"col-sm-9\">\n");
      out.write("\n");
      out.write("            <!-- column 2 -->\n");
      out.write("            <ul class=\"list-inline pull-right\">\n");
      out.write("                <li><a href=\"#\"><i class=\"glyphicon glyphicon-cog\"></i></a></li>\n");
      out.write("                <li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"glyphicon glyphicon-comment\"></i><span class=\"count\">3</span></a>\n");
      out.write("                    <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                        <li><a href=\"#\">1. Is there a way..</a></li>\n");
      out.write("                        <li><a href=\"#\">2. Hello, admin. I would..</a></li>\n");
      out.write("                        <li><a href=\"#\"><strong>All messages</strong></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"#\"><i class=\"glyphicon glyphicon-user\"></i></a></li>\n");
      out.write("                <li><a title=\"Add Widget\" data-toggle=\"modal\" href=\"#addWidgetModal\"><span class=\"glyphicon glyphicon-plus-sign\"></span> Add Widget</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <a href=\"#\"><strong><i class=\"glyphicon glyphicon-dashboard\"></i> My Dashboard</strong></a>\n");
      out.write("            <hr>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <!-- center left-->\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                  <a href=\"create.jsp\">  <button type=\"submit\" class=\"btn btn-primary\">\n");
      out.write("                                           C R E A T E    P R O J E C T\n");
      out.write("                      </button></a>\n");
      out.write("\n");
      out.write("                    <hr>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <h4>My  PROJECT</h4></div>\n");
      out.write("        <form method=\"post\" action=\"upload\" enctype=\"multipart/form-data\">\n");
      out.write("        <table class=\"table table-bordered\" align=\"left\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Project ID</th>\n");
      out.write("                <th>Project Name</th>\n");
      out.write("                <th>Message</th>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("              ");

                    try
                    {
            String host ="jdbc:mysql://localhost/appdb";
            Statement stat=null;
            ResultSet res=null;
            Connection conn=null;
            PreparedStatement stmt=null;
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn=DriverManager.getConnection(host,"root","");
            
             stat=conn.createStatement();
                String u = request.getParameter("u");
                int num=Integer.parseInt(u);
                String data = "select * from contacts where contact_id ='"+num+"'";
                res=stat.executeQuery(data);
                
                       while(res.next())
                       {
                          
      out.write("\n");
      out.write("                          <tr>\n");
      out.write("                          <td>");
      out.print(res.getInt("contact_id"));
      out.write("</td>\n");
      out.write("                          <td>");
      out.print(res.getString("first_name"));
      out.write("</td>\n");
      out.write("                          <td>");
      out.print(res.getString("last_name"));
      out.write("</td>\n");
      out.write("                         \n");
      out.write("                          </tr>\n");
      out.write("                          ");

                       }
                       
                       
                    }
                    catch(Exception ex)
                    {
                        out.println("Exception:"+ex.getMessage());
                    }
                    
                    
                    
                    
                    
      out.write("\n");
      out.write("              \n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("                    \n");
      out.write("                     <br>\n");
      out.write("        <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <h4>My  PROJECT</h4></div>\n");
      out.write("        <form method=\"post\" action=\"upload\" enctype=\"multipart/form-data\">\n");
      out.write("        <table class=\"table table-bordered\" align=\"left\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Project ID</th>\n");
      out.write("                <th>Project Name</th>\n");
      out.write("                <th>Message</th>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("              ");

                    try
                    {
            String host ="jdbc:mysql://localhost/appdb";
            Statement stat=null;
            ResultSet res=null;
            Connection conn=null;
            PreparedStatement stmt=null;
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn=DriverManager.getConnection(host,"root","");
            
             stat=conn.createStatement();
                String u = request.getParameter("u");
                int num=Integer.parseInt(u);
                String data = "select * from contacts where contact_id ='"+num+"'";
                res=stat.executeQuery(data);
                
                       while(res.next())
                       {
                          
      out.write("\n");
      out.write("                          <tr>\n");
      out.write("                          <td>");
      out.print(res.getInt("contact_id"));
      out.write("</td>\n");
      out.write("                          <td>");
      out.print(res.getString("first_name"));
      out.write("</td>\n");
      out.write("                          <td>");
      out.print(res.getString("last_name"));
      out.write("</td>\n");
      out.write("                         \n");
      out.write("                          </tr>\n");
      out.write("                          ");

                       }
                       
                       
                    }
                    catch(Exception ex)
                    {
                        out.println("Exception:"+ex.getMessage());
                    }
                    
                    
                    
                    
                    
      out.write("\n");
      out.write("              \n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("                    \n");
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
