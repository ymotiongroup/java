<%-- 
    Document   : index
    Created on : 21-ene-2016, 9:12:51
    Author     : ivan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora</title>
    </head>
    <body>
        <form method="POST" action="${pageContext.request.contextPath}/Servlet">
            
            <table>
                <tr>
                    <td>Primer Numero :</td>
                    <td><input name="param1"></td>
                </tr>
                <tr>
                    <td>Segundo Numero :</td>
                    <td><input name="param2"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Sumar"></td>
                </tr>
            </table>
        </form>
             
    </body>
</html>
