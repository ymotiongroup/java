<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<html>
    <head>
    </head>
    <body>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <h1>Datos del usuario: </h1>
        <jsp:useBean id="friend" scope="request" class="model.Friend" />
        Nombre: <jsp:getProperty name="friend" property="name" /><BR>
        Dirección: <jsp:getProperty name="friend" property="address" /><BR>
        Teléfono: <jsp:getProperty name="friend" property="phone" /><BR>
        Edad: <jsp:getProperty name="friend" property="age" /><BR>
        Nivel de amistad: <jsp:getProperty name="friend" property="friendshipLevel" /><BR>
        Comentario: <jsp:getProperty name="friend" property="comments" /><BR>
        
        <a href="/BasicCRUDWebApp<%=application.getInitParameter("mainForm")%>">Volver al menu principal</a>

    </body>
</html>
