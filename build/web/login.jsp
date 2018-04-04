<%-- 
    Document   : index
    Created on : Mar 22, 2018, 1:29:11 PM
    Author     : DulanjayaSamarajeewa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
      <link rel="stylesheet" href="font-awesome-4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="css/style.css">
    <script type="text/javascript">
        function validate()
        
    {
        var uname=document.myForm.username.value;
        if(uname=="")
        {
            alert("Please Enter Username");
            document.myForm.username.focus();
            return false;
            
        }
        if((uname.length<3)||uname.length>15)
        {
            alert("username must be 5-15");
            document.myForm.username.focus();
            return false;
        }
         var password=document.myForm.password.value;
         var illegalChar=/[\W_]/;
        if(password=="")
        {
            alert("Please Enter Password");
            document.myForm.password.focus();
            return false;
            
        }
        else if((password.length<5)||password.length>15)
        {
            alert("password must be 5-15");
            document.myForm.password.focus();
            return false;
        }
        else if(illegalChar.test(password)){
          alert("password contains illegal character");
           document.myForm.password.focus();
           return false;

        }
        
        
    }
        
        
    </script>
    </head>
    <body style="text-align: center;">
        <form name="myForm" method="POST" action="connection.jsp">
            <fieldset id='fieldsetcss'>
                <legend id="legendcss">Please Sign in</legend>
                <div class="form-inline">
                    <input type="text" name="username" class="form-control" placeholder="Enter username" value="" />
                </div>
                <br>
                <div class="form-inline">
                    <input type="password" name="password" class="form-control" placeholder="Enter Password" value="" />
                </div>
                <br>
                <button type="submit" name="action" onClick=" return validate(); " value="signin" class="btn btn-lg btn-primary">Signin</button>
                <br>
                <br>
                <br>
                <br>
                <p>If you havn't account</p>
                <br>
                <button type="submit" name="action" value="signup" class="btn btn-lg btn-danger">Signup</button>
                
        </form>
    </body>
</html>
