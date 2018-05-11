package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class create_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"b.css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\t\t<!--[if lt IE 9]>\n");
      out.write("\t\t\t<script src=\"//html5shim.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("\t\t<![endif]-->\n");
      out.write("\t\t<link href=\"b.css/styles.css\" rel=\"stylesheet\"\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <div class=\"panel-title\">\n");
      out.write("                                <i class=\"glyphicon glyphicon-wrench pull-right\"></i>\n");
      out.write("                                <h4>IF  YOU  HAVE  ANY  PROBLEM</h4>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <form method=\"post\" action=\"FileUploadDBServlet\" enctype=\"multipart/form-data\">\n");
      out.write("                                <div class=\"control-group\">\n");
      out.write("                                    <label>Name</label>\n");
      out.write("                                    <div class=\"controls\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter Name\" name=\"firstName\" size=\"50\"/>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"control-group\">\n");
      out.write("                                    <label>Message</label>\n");
      out.write("                                    <div class=\"controls\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter Name\" name=\"lastName\" size=\"50\"/>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"control-group\">\n");
      out.write("                                    <label>Image</label>\n");
      out.write("                                    <div class=\"controls\">\n");
      out.write("                                        <input type=\"file\" name=\"photo\" size=\"50\"/>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"control-group\">\n");
      out.write("                                    <label></label>\n");
      out.write("                                    <div class=\"controls\">\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary\">\n");
      out.write("                                            Post\n");
      out.write("                                        </button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <!--/panel content-->\n");
      out.write("                    </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
