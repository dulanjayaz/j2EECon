<%-- 
    Document   : Admincon
    Created on : Apr 21, 2018, 11:20:08 AM
    Author     : DulanjayaSamarajeewa
--%>

<%@ page import="java.sql.*" %>
<%
    String action=request.getParameter("action");
    if(action.equals("signin"))
    {
        String username=request.getParameter("username");
        String pwd=request.getParameter("password");
        
    try
    {
        Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/appdb" , "root","");    
        Statement st = con.createStatement();  
        ResultSet rs = st.executeQuery("Select * from workers where name='"+username+"' and password='"+pwd+"'");
        if(rs.next())
        {
            response.sendRedirect("adminview.jsp");
        }
        else
        {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Username and password donot match'  );");
            out.println("location='adminlogin.jsp';");
            out.println("</script>");
        }
    }
    catch(Exception e)
            {
            out.println(e);
            }
    }
    else if(action.equals("signup"))
    {
        response.sendRedirect("signup.jsp");
    }
%>