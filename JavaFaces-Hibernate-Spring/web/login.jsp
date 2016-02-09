<%-- 
    Document   : login
    Created on : 30-ene-2016, 14:57:23
    Author     : ivan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">


    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>JSF + HIBERNATE + SPRING</title>
        </head>
        <body>
         <f:view>   
            <h:form id="FormularioLogin">
               <table align="center" >
                 <tr>
                   <td colspan="2">Ingresa Usuario y Contraseña</td>
                 </tr>
                 <tr>
                    <td>Usuario :</td>
                    <td> <h:inputText value="#{loginBean.user}"></h:inputText> </td>
                 </tr>
                 <tr>
                    <td>Password :</td>
                    <td> <h:inputSecret value="#{loginBean.password}"></h:inputSecret></td>
                 </tr>
                 <tr>
                     <td><input type="button" value="Cancelar"></td>
                     <td><h:commandButton value="Aceptar" action="#{loginBean.validarLogin }"></h:commandButton></td>
                 </tr>
              </table>
            </h:form>  
         </f:view>   
        </body>
    </html>

