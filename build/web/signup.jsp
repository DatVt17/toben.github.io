<%-- 
    Document   : signup
    Created on : Feb 11, 2022, 10:03:57 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="signup.css">
    </head>
    <body>
        <div class="header">
            <div class="container">
                <h1>Sign Up</h1>

                <!-- ---------------------------------- -->

                <form action="createAccount" method="post">
                    <p class="" style="color: red">${wrongUser}</p>
                    <input class="inputtext" type="text" placeholder="User name" name="username" value="">
                    <p style="color: red">${wrongPassword}</p>
                    <input class="inputpassword" type="password" placeholder="Password" name="password" value="">
                    <p style="color: red">${wrongDuplicatePassword}</p>
                    <input class="inputpassword" type="password" placeholder="Re-Enterpassword" name="repassword" value="">
                    <p style="color: red">${wrongEmail}</p>
                    <input class="inputemail" type="email" placeholder="email" name="email" value="">
                    <div class="gender">
                        Gender:
                        <input class="inputradio" type="radio" name="gender" value="nam" checked>Nam
                        <input class="inputradio" type="radio" name="gender" value="nu">Nữ
<!--                          <input class="inputradio" type="input" name="gender">-->
                    </div>
                    <div class="birthday">
                        Birthday:
                        <input class="inputdate" type="date" name="birthday">
                    </div>
                    <input class="inputreset" type="reset" value="Reset">
                    <input class="sub" type="submit" value="Sign Up" name="submit">
                </form>
            </div>
        </div>
    </body>
</html>
