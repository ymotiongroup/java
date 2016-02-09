<%-- 
    Document   : index
    Created on : 22-ene-2016, 10:36:15
    Author     : ivan
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="cabecera.jsp" %> 
       
        <form method="POST" action="Restador">
            <table>
                <tr>
                    <td>Primer Numero</td>
                    <td><input name="param1"></td>
                </tr>
                <tr>
                    <td>Segundo Numero</td>
                    <td><input name="param2"></td>
                </tr>
                <tr>
                    <td><br><input type="submit" value="Restar"></td>
                </tr>
                    
            </table>
        </form>
    </body>
</html>
