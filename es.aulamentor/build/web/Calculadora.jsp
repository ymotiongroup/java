<%-- 
    Document   : Calculadora
    Created on : 21-ene-2016, 14:38:50
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
        <%@include file="Cabecera.jsp" %>
        <form method="POST" action="Restador">
            <table>
                <tr>
                    <td>Primer Numero</td>
                    <td><input name="param1"></td>
                </tr>
                <tr>
                    <td>Segundo Numero</td>
                    <td><input name="param2"></td>
                <tr>
                    <td><input type="submit" value="Restar"></td>
                </tr>
            </table>
            
        </form>
    </body>
</html>
