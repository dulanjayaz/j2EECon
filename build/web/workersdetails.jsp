<%-- 
    Document   : workersdetails
    Created on : Apr 13, 2018, 12:48:14 AM
    Author     : DulanjayaSamarajeewa
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.PreparedStatement" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.*;" %>
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
    <body>
        <p><br/></p>
        <div class="row">
        <div class="col-md-6">
            <h3>Workers Details</h3>
        </div>
            <div class="col-md-4">
                <form action="" method="get">
                    <input type="text"  class="form-control" name="q" placeholder="Search here...example type of workers"/>
                    
                </form>
            </div>
        
        </div>
        <p></p>
        <table class="table table-bordered table-striped table-hover">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>NAME</th>
                    <th>Type</th>
                    <th>Email</th>
                    <th>Contact</th>
                    
                    <th class="text-center">Action</th>
                    
                    
                    
                </tr>
            </thead>
            <tbody>
                <%
                    String host ="jdbc:mysql://localhost/appdb";
                    Connection conn=null;
                    Statement stat=null;
                    ResultSet res=null;
                    Class.forName("com.mysql.jdbc.Driver");
                    conn=DriverManager.getConnection(host,"root","");
                    stat=conn.createStatement();
                    
                    String query = request.getParameter("q");
                    String data;
                    if(query!=null)
                    {
                        data="select * from workers where type like '%"+query+"%'";
                    }else
                    {
                       data= "select * from workers";
                    }
                    res=stat.executeQuery(data);
                    while(res.next()){
                    
                    
                    
                    
                    
                    %>
                    <tr>
                        <td><%=res.getInt("id")%></td>
                        <td><%=res.getString("name")%></td>
                        <td><%=res.getString("type")%></td>
                        <td><%=res.getString("email")%></td>
                        <td><%=res.getString("tpnumber")%></td>
                        <td class="text">
                            <a href="create.jsp" class="btn btn-warning">Add project</a>
                            <a href="#" class="btn btn-primary">Message</a>
                        </td>
                        
                    </tr>
                    <%
                        }
                     %>
            </tbody>
        </table>
    </body>
</html>

