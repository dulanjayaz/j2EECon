<%-- 
    Document   : addnew
    Created on : Apr 12, 2018, 3:09:41 PM
    Author     : DulanjayaSamarajeewa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.PreparedStatement" %>
<%@page import="java.sql.Connection" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
      <link rel="stylesheet" href="font-awesome-4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="css/style.css">
    <style>
body {
    background-image: url("images/back3.png");
}

</style>
    </head>
    <body style="text-align: center;">
        <form action=""  method="post">
              <fieldset id='fieldsetcss'>
                <legend id="legendcss" >Please Signup</legend>
                
                <div class="form-inline">
                <input type="text" class="form-control" name="nm" placeholder="Your name"/>
            </div>
                
                <br>
             <div class="form-inline">
                <input type="text" class="form-control"  name="ls" placeholder="Your location"/>
            </div>
                 <br>
                 <div class="form-inline">
                <input type="text" class="form-control"  name="tp" placeholder="Your Phone number"/>
            </div>
                 <br>
                 <div class="form-inline">
                <input type="text" class="form-control"  name="un" placeholder="Your User Name"/>
            </div>
                 <br>
                 <div class="form-inline">
                <input type="password" class="form-control"  name="ps" placeholder="Your Password"/>
            </div>
                 <br>
                 <div class="form-inline">
                <input type="text" class="form-control"  name="em" placeholder="Your Email"/>
            </div>
                 <br>
                
            <button type="submit" class="btn btn-danger">Signup</button>
            <a href="login.jsp" class="btn btn-default">Back</a>
        </form>
        
        <%
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
            
            %>