package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminback_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html lang=\"en\">\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t\t<meta charset=\"utf-8\">\n");
      out.write("\t\t<title>Home page</title>\n");
      out.write("\t\t<meta name=\"generator\" content=\"Bootply\" />\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("\t\t<link href=\"b.css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\t\t<!--[if lt IE 9]>\n");
      out.write("\t\t\t<script src=\"//html5shim.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("\t\t<![endif]-->\n");
      out.write("\t\t<link href=\"b.css/styles.css\" rel=\"stylesheet\">\n");
      out.write("                <style>\n");
      out.write("body {\n");
      out.write("    background-image: url(\"images/back3.png\");\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\t</head>\n");
      out.write("\t\n");
      out.write("<!-- header -->\n");
      out.write("<div id=\"top-nav\" class=\"navbar navbar-inverse navbar-static-top\">\n");
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
      out.write("                \n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a class=\"dropdown-toggle\" role=\"button\" data-toggle=\"dropdown\" href=\"#\"><i class=\"glyphicon glyphicon-user\"></i> Admin <span class=\"caret\"></span></a>\n");
      out.write("                    <ul id=\"g-account-menu\" class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                        <li><a href=\"#\">My Profile</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("                <li><a href=\"index.html\"><i class=\"glyphicon glyphicon-lock\"></i> Logout</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- /container -->\n");
      out.write("</div>\n");
      out.write("<!-- /Header -->\n");
      out.write("\n");
      out.write("<!-- Main -->\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            <!-- Left column -->\n");
      out.write("            <a href=\"#\"><strong><i class=\"glyphicon glyphicon-wrench\"></i> Project</strong></a>\n");
      out.write("\n");
      out.write("            <hr>\n");
      out.write("             <ul class=\"nav nav-stacked\">\n");
      out.write("                <li class=\"nav-header\"> <a href=\"#\" data-toggle=\"collapse\" data-target=\"#userMenu\">My Project <i class=\"glyphicon glyphicon-chevron-down\"></i></a>\n");
      out.write("                    <ul class=\"nav nav-stacked collapse in\" id=\"userMenu\">\n");
      out.write("                        <li class=\"active\"> <a href=\"#\"><i class=\"glyphicon glyphicon-home\"></i> Home</a></li>\n");
      out.write("                        <li><a href=\"view.jsp\"><i class=\"glyphicon glyphicon-envelope\"></i> view  <span class=\"badge badge-info\">4</span></a></li>\n");
      out.write("                        \n");
      out.write("                       \n");
      out.write("                        <li><a href=\"#\"><i class=\"glyphicon glyphicon-off\"></i> Logout</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            \n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("\n");
      out.write("                    <ul class=\"nav nav-stacked collapse\" id=\"menu2\">\n");
      out.write("                        <li><a href=\"#\">Information &amp; Stats</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#\">Views</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#\">Requests</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#\">Timetable</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#\">Alerts</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("           \n");
      out.write("\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <!-- /col-3 -->\n");
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
      out.write("\n");
      out.write("                    \n");
      out.write("\n");
      out.write("                   \n");
      out.write("\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <h4>Reports</h4></div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("                            <small>Success</small>\n");
      out.write("                            <div class=\"progress\">\n");
      out.write("                                <div class=\"progress-bar progress-bar-success\" role=\"progressbar\" aria-valuenow=\"72\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 72%\">\n");
      out.write("                                    <span class=\"sr-only\">72% Complete</span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <small>Info</small>\n");
      out.write("                            <div class=\"progress\">\n");
      out.write("                                <div class=\"progress-bar progress-bar-info progress-bar-striped active\" role=\"progressbar\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 20%\">\n");
      out.write("                                    <span class=\"sr-only\">20% Complete</span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <small>Warning</small>\n");
      out.write("                            <div class=\"progress\">\n");
      out.write("                                <div class=\"progress-bar progress-bar-warning\" role=\"progressbar\" aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 60%\">\n");
      out.write("                                    <span class=\"sr-only\">60% Complete (warning)</span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <small>Danger</small>\n");
      out.write("                            <div class=\"progress\">\n");
      out.write("                                <div class=\"progress-bar progress-bar-danger\" role=\"progressbar\" aria-valuenow=\"80\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 80%\">\n");
      out.write("                                    <span class=\"sr-only\">80% Complete</span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--/panel-body-->\n");
      out.write("                    </div>\n");
      out.write("                    <!--/panel-->\n");
      out.write("\n");
      out.write("                    <hr>\n");
      out.write("\n");
      out.write("                    <!--tabs-->\n");
      out.write("                    \n");
      out.write("                    <!--/tabs-->\n");
      out.write("\n");
      out.write("                    <hr>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <!--/col-->\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <h4>Notices</h4></div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"alert alert-info\">\n");
      out.write("                                <button type=\"button\" class=\"close\" data-dismiss=\"alert\">×</button>\n");
      out.write("                                This is a dismissable alert.. just sayin'.\n");
      out.write("                            </div>\n");
      out.write("                            <p>This is a dashboard-style layout that uses Bootstrap 3. You can use this template as a starting point to create something more unique.</p>\n");
      out.write("                            <p>Visit the Bootstrap Playground at <a href=\"http://bootply.com\">Bootply</a> to tweak this layout or discover more useful code snippets.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                    \n");
      out.write("                    <!--/panel-->\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                <!--/col-span-6-->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!--/row-->\n");
      out.write("\n");
      out.write("            <hr>\n");
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("            <hr>\n");
      out.write("\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <!--/col-span-9-->\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("<!-- /Main -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- /.modal -->\n");
      out.write("\t<!-- script references -->\n");
      out.write("\t\t\n");
      out.write("\t\n");
      out.write("</html>");
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
