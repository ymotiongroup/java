<%-- 
    Document   : index
    Created on : 19-dic-2015, 10:56:48
    Author     : ivan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/style.css" type="text/css" rel="stylesheet">
        <script src="JS/script.js"></script>
        <title>index Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <div>
            <form action="Autenticacion" method="post">
                <p><input type="text" name="user" id="user"></p>
                <p><input type="password" name="pass" id="pass"></p>
                <p><input type="submit" name="entrar" id="entrar" value="Entrar"></p>
            </form>
            
        </div>
    </body>
</html>
