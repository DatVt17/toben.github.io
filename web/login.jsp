<%-- 
    Document   : login
    Created on : Feb 10, 2022, 4:16:12 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Toben</title>
        <link rel="stylesheet" href="login.css">
    </head>
    <body>
        <div class="header">
            <div class="container">
                <h1>Login</h1>

                <!-- ---------------------------------- -->
<!--                <div class="alert alert-danger" role="alert">
                    This is a danger alert—check it out!
                </div>-->
                <form action="checkAccount" method="post">

                    <input class="inputtext" type="text" placeholder="User name" name="username" value="">
                    <input class="inputpassword" type="password" placeholder="Password" name="password" value="">
                    <h6><a href="signup.jsp">Create new account?</a></h6>
                    <input class="sub" type="submit" value="Login" name="submit">
                </form>
            </div>
        </div>
    </body>
</html>
