package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("      <link rel=\"stylesheet\" href=\"font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        function validate()\n");
      out.write("        \n");
      out.write("    {\n");
      out.write("        var uname=document.myForm.username.value;\n");
      out.write("        if(uname==\"\")\n");
      out.write("        {\n");
      out.write("            alert(\"Please Enter Username\");\n");
      out.write("            document.myForm.username.focus();\n");
      out.write("            return false;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        if((uname.length<3)||uname.length>15)\n");
      out.write("        {\n");
      out.write("            alert(\"username must be 5-15\");\n");
      out.write("            document.myForm.username.focus();\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("         var password=document.myForm.password.value;\n");
      out.write("         var illegalChar=/[\\W_]/;\n");
      out.write("        if(password==\"\")\n");
      out.write("        {\n");
      out.write("            alert(\"Please Enter Password\");\n");
      out.write("            document.myForm.password.focus();\n");
      out.write("            return false;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        else if((password.length<5)||password.length>15)\n");
      out.write("        {\n");
      out.write("            alert(\"password must be 5-15\");\n");
      out.write("            document.myForm.password.focus();\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        else if(illegalChar.test(password)){\n");
      out.write("          alert(\"password contains illegal character\");\n");
      out.write("           document.myForm.password.focus();\n");
      out.write("           return false;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    }\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </script>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"text-align: center;\">\n");
      out.write("        <form name=\"myForm\" method=\"POST\" action=\"connection.jsp\">\n");
      out.write("            <fieldset id='fieldsetcss'>\n");
      out.write("                <legend id=\"legendcss\">Please Sign in</legend>\n");
      out.write("                <div class=\"form-inline\">\n");
      out.write("                    <input type=\"text\" name=\"username\" class=\"form-control\" placeholder=\"Enter username\" value=\"\" />\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"form-inline\">\n");
      out.write("                    <input type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"Enter Password\" value=\"\" />\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <button type=\"submit\" name=\"action\" onClick=\" return validate(); \" value=\"signin\" class=\"btn btn-lg btn-primary\">Signin</button>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <p>If you havn't account</p>\n");
      out.write("                <br>\n");
      out.write("                <button type=\"submit\" name=\"action\" value=\"signup\" class=\"btn btn-lg btn-danger\">Signup</button>\n");
      out.write("                \n");
      out.write("        </form>\n");
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
