<%-- 
    Document   : create
    Created on : Apr 9, 2018, 6:55:22 PM
    Author     : DulanjayaSamarajeewa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="b.css/bootstrap.min.css" rel="stylesheet">
		<!--[if lt IE 9]>
			<script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->
		<link href="b.css/styles.css" rel="stylesheet"
    </head>
    <body>
        <div class="panel panel-default">
                        <div class="panel-heading">
                            <div class="panel-title">
                                <i class="glyphicon glyphicon-wrench pull-right"></i>
                                <h4>IF  YOU  HAVE  ANY  PROBLEM</h4>
                            </div>
                        </div>
                        <div class="panel-body">
                            <form method="post" action="FileUploadDBServlet" enctype="multipart/form-data">
                                <div class="control-group">
                                    <label>Project Name</label>
                                    <div class="controls">
                                        <input type="text" class="form-control" placeholder="Enter Project name " name="project_name" size="20"/>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label>Message</label>
                                    <div class="controls">
                                        <input type="text" class="form-control" placeholder="Enter You're Message" name="Message" size="50"/>
                                    </div>
                                </div>
                                 <div class="control-group">
                                    <label>Location</label>
                                    <div class="controls">
                                        <input type="text" class="form-control" placeholder="Enter you're city and home address" name="location" size="50"/>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label>Owerner's name</label>
                                    <div class="controls">
                                        <input type="text" class="form-control" placeholder="Enter you're Name" name="Owerner" size="50"/>
                                    </div>
                                </div>  
                                
                                <div class="control-group">
                                    <label>Contact</label>
                                    <div class="controls">
                                        <input type="text" class="form-control" placeholder="Enter telephone number" name="Tp" size="50"/>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label>Worker's  Id</label>
                                    <div class="controls">
                                        <input type="text" class="form-control" placeholder="Enter worker's Id" name="workerid" size="50"/>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label>Worker's  Name</label>
                                    <div class="controls">
                                        <input type="text" class="form-control" placeholder="Enter worker's Name" name="workename" size="50"/>
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
                                        <a href="view.jsp" class="btn btn-default">Back</a>
                                    </div>
                                </div>
                            </form>
                            
                        </div>
             <div class="control-group">
                                    <label></label>
                                    <div class="controls">
                                        <a href="workersdetails.jsp"><button type="submit" class="btn btn-danger" >
                                            View worker's details
                                            </button></a>*This is help for if you want fill worke's id or workers' name*
                                    </div>
                                </div>
                                
                        <!--/panel content-->
                    </div>
    </body>
</html>
