<%-- 
    Document   : viewpro
    Created on : Apr 11, 2018, 11:26:22 PM
    Author     : DulanjayaSamarajeewa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.Blob"%>
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
        <div id="top-nav" class="navbar navbar-inverse navbar-static-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="adminview.jsp">Dashboard</a>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a class="dropdown-toggle" role="button" data-toggle="dropdown" href="#"><i class="glyphicon glyphicon-user"></i> worker <span class="caret"></span></a>
                    <ul id="g-account-menu" class="dropdown-menu" role="menu">
                        <li><a href="#">My Profile</a></li>
                    </ul>
                </li>
                <li><a href="index.html"><i class="glyphicon glyphicon-lock"></i> Logout</a></li>
            </ul>
        </div>
    </div>
            </div>
        
        
        <div class="container-fluid">
    <div class="row">
        <div class="col-sm-3">
            <!-- Left column -->
            <a href="#"><strong><i class="glyphicon glyphicon-wrench"></i> Project</strong></a>

            <hr>
             <ul class="nav nav-stacked">
                <li class="nav-header"> <a href="#" data-toggle="collapse" data-target="#userMenu">My Project <i class="glyphicon glyphicon-chevron-down"></i></a>
                    <ul class="nav nav-stacked collapse in" id="userMenu">
                        <li class="active"> <a href="back.html"><i class="glyphicon glyphicon-home"></i> Home</a></li>
                        <li><a href="view.jsp"><i class="glyphicon glyphicon-envelope"></i> view  <span class="badge badge-info">4</span></a></li>
                        <li><a href="#"><i class="glyphicon glyphicon-cog"></i> Options</a></li>
                       
                        <li><a href="index.html"><i class="glyphicon glyphicon-off"></i> Logout</a></li>
                    </ul>
                </li>
            
                </li>
                

                    
                </li>
                
            </ul>

           

            
        </div>
        
        
        <div class="col-sm-9">

            <!-- column 2 -->
            <ul class="list-inline pull-right">
                <li><a href="#"><i class="glyphicon glyphicon-cog"></i></a></li>
                <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="glyphicon glyphicon-comment"></i><span class="count">3</span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="#">1. Is there a way..</a></li>
                        <li><a href="#">2. Hello, admin. I would..</a></li>
                        <li><a href="#"><strong>All messages</strong></a></li>
                    </ul>
                </li>
                <li><a href="#"><i class="glyphicon glyphicon-user"></i></a></li>
                <li><a title="Add Widget" data-toggle="modal" href="#addWidgetModal"><span class="glyphicon glyphicon-plus-sign"></span> Add Widget</a></li>
            </ul>
            <a href="#"><strong><i class="glyphicon glyphicon-dashboard"></i> My Dashboard</strong></a>
            <hr>

           

                   
        <br>
        <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4>My  PROJECT</h4></div>
        <form method="post" action="upload" enctype="multipart/form-data">
        <table class="table table-bordered" align="left">
            <tr>
                <th>Project ID</th>
                <th>Project Name</th>
                <th>Message</th>
                <th>Photo</th>
                <th>Location</th>
                <th>Owner Name</th>
                <th>Contact</th>
            </tr>
            
              <%
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
                          %>
                          <tr>
                          <td><%=res.getInt("contact_id")%></td>
                          <td><%=res.getString("project_name")%></td>
                          <td><%=res.getString("comment")%></td>
                          <td><%=res.getBlob("photo")%></td>
                          <td><%=res.getString("location")%></td>
                           <td><%=res.getString("ownername")%></td>
                           <td><%=res.getString("tpnumber")%></td>
                         
                          </tr>
                          <%
                       }
                       
                       
                    }
                    catch(Exception ex)
                    {
                        out.println("Exception:"+ex.getMessage());
                    }
                    
                    
                    
                    
                    %>
              
            
        </table>
        </form>
        </div>
                    
                     <br>
                     <br>
                     <br>
       <div class="panel-body">
           <div class="panel-heading">
                            <h4>Add comment</h4></div>
                            <form method="post" action="FileUploadDBServlet" enctype="multipart/form-data">
                                <div class="control-group">
                                    <label>Name</label>
                                    <div class="controls">
                                        <input type="text" class="form-control" placeholder="Enter Name" name="firstName" size="50"/>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label>Message</label>
                                    <div class="controls">
                                        <input type="text" class="form-control" placeholder="Enter Name" name="lastName" size="50"/>
                                    </div>
                                </div>
                                
                                <div class="control-group">
                                    <label>Image</label>
                                    <div class="controls">
                                        <input type="file" name="photo" size="50"/>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label></label>
                                    <div class="controls">
                                        <button type="submit" class="btn btn-primary">
                                            Post
                                        </button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    
    </body>
</html>

