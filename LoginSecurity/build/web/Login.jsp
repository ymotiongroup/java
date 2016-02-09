<%-- 
    Document   : Login
    Created on : 19-dic-2015, 22:12:46
    Author     : ivan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form method="POST" action="j_security_check">
          <p><input type="text" placeholder="nombre" id="j_username" name="nombre"></p>
          <p><input type="password" placeholder="pass" id="pass" name="j_password"></p>
          <input type="submit" value="Entrar" id="entrar" name="entrar">
        </form>
    </body>
</html>
