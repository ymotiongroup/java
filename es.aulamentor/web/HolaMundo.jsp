<%-- 
    Document   : HolaMundo
    Created on : 21-ene-2016, 13:58:36
    Author     : ivan
--%>

<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date, es.*"%>
<%! 
    String var  = "hola Mundo"; 
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
          if( var != "hola Mundo"){ 
         %>
        <h1>Hola World!</h1>
        <%
            }else{
        %>
        <h1>Hola Mundo</h1>
        <%
          }  
        %>
        <p>
            La Hora Actual es : <%= Calendar.getInstance().getTime()  %>  
        </p>
    </body>
</html>
