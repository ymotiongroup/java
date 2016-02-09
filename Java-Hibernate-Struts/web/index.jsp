<%-- 
    Document   : index
    Created on : 31-ene-2016, 20:02:08
    Author     : ivan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
        <h1>Hello World!</h1>
        <s:if test="%{#session['Access']== true}">
            <s:property value="mensaje"/>
            Cerrar Session
        </s:if>
        <s:else>
            <s:form action="InicioSesion">
            <s:textfield name="nombre" label="Usuario"/>
            <s:password name="password" label="Password"/>
            <s:submit name="aceptar" label="Iniciar Sesion"/>
            </s:form>
            <s:property value="mensaje"/>
        </s:else>
        
    
</html>
