<%-- 
    Document   : index
    Created on : Apr 11, 2018, 1:41:18 PM
    Author     : DulanjayaSamarajeewa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <!-- header -->
<div id="top-nav" class="navbar navbar-inverse navbar-static-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="back.jsp">Dashboard</a>
        </div>
        
                      
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    
                    <a class="dropdown-toggle" role="button" data-toggle="dropdown" href="#"><i class="glyphicon glyphicon-user"></i> Admin <span class="caret"></span></a>
                    <ul id="g-account-menu" class="dropdown-menu" role="menu">
                        <li><a href="#">My Profile</a></li>
                    </ul>
                </li>
             
                <li><a href="index.html"><i class="glyphicon glyphicon-lock"></i> Logout</a></li>
            </ul>
        </div>
    </div>
    <!-- /container -->
</div>
<!-- /Header -->
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
                        <li><a href="workersdetails.jsp"><i class="glyphicon glyphicon-cog"></i> Help us <span class="badge badge-help">10</span></a></li>
                        <li><a href="#"><i class="glyphicon glyphicon-cog"></i> Options</a></li>
                       
                        <li><a href="#"><i class="glyphicon glyphicon-off"></i> Logout</a></li>
                    </ul>
                </li>
            
                </li>
                

                    <ul class="nav nav-stacked collapse" id="menu2">
                        <li><a href="#">Information &amp; Stats</a>
                        </li>
                        <li><a href="#">Views</a>
                        </li>
                        <li><a href="#">Requests</a>
                        </li>
                        <li><a href="#">Timetable</a>
                        </li>
                        <li><a href="#">Alerts</a>
                        </li>
                    </ul>
                </li>
                
            </ul>

           

            
        </div>
        <!-- /col-3 -->
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
                    <div class="col-md-6 text-right">
                <form action="" method="get">
                    <input type="text"  class="form-control" name="q" placeholder="Search my project..."/>
                    
                </form>
            </div>
                <li><a title="Add Widget" data-toggle="modal" href="#addWidgetModal"><span class="glyphicon glyphicon-plus-sign"></span> Add Widget</a></li>
            </ul>
            <a href="#"><strong><i class="glyphicon glyphicon-dashboard"></i> My Dashboard</strong></a>
            <hr>

            <div class="row">
                <!-- center left-->
                <div class="col-md-6">
                  <a href="create.jsp">  <button type="submit" class="btn btn-primary">
                                           C R E A T E    P R O J E C T
                      </button></a>
                    

                    <hr>

                    

                   

                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4>All projects</h4>
                            
          
                        
                        
                        </div>
                        
                      
                    
                        <p></p>
                        
                        <form method="post" action="upload" enctype="multipart/form-data">
        <table class="table table-bordered" align="left">
            <tr>
                <th>Project ID</th>
                <th>Project Name</th>
                <th>Worker Name</th>
            </tr>
            
               <%
                    try
                    {
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
                        data="select * from contacts where project_name like '%"+query+"%'";
                    }else
                    {
                       data= "select * from contacts";
                    }
                    res=stat.executeQuery(data);
                       while(res.next())
                       {
                          %>
                          <tr>
                          <td><%=res.getInt("contact_id")%></td>
                          <td><%=res.getString("project_name")%></td>
                          <td><%=res.getString("workersname")%></td>
                          
                           <td>
                              <a href='viewpro.jsp?u=<%=res.getInt("contact_id")%>' class="btn btn-warning">View</a>
                          </td>
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
                        
                        <!--/panel-body-->
                    </div>
                    <!--/panel-->

                    <hr>

                    <!--tabs-->
                    
                    <!--/tabs-->

                    <hr>
                    
                </div>
                <!--/col-->
                <div class="col-md-6">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4>Notices</h4></div>
                        <div class="panel-body">
                            <div class="alert alert-info">
                                <button type="button" class="close" data-dismiss="alert">×</button>
                                This is a dismissable alert.. just sayin'.
                            </div>
                            <p>This is a dashboard-style layout that uses Bootstrap 3. You can use this template as a starting point to create something more unique.</p>
                            <p>Visit the Bootstrap Playground at <a href="http://bootply.com">Bootply</a> to tweak this layout or discover more useful code snippets.</p>
                        </div>
                    </div>
                   
                    
                    <!--/panel-->

                    
                <!--/col-span-6-->

            </div>
            <!--/row-->

            <hr>

            

            <hr>

            
        </div>
        <!--/col-span-9-->
    </div>
</div>
                    
        
    </body>
</html>
