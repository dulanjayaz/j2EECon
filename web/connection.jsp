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
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jspdatabase" , "root","");    
        Statement st = con.createStatement();  
        ResultSet rs = st.executeQuery("Select * from record where username='"+username+"' and password='"+pwd+"'");
        if(rs.next())
        {
            response.sendRedirect("back.html");
        }
        else
        {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Username and password donot match'  );");
            out.println("location='login.jsp';");
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