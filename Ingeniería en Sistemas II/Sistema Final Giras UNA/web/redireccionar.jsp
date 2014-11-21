<%-- 
    Document   : redireccionar
    Created on : 19/06/2014, 07:50:03 AM
    Author     : Yari
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1></h1>

        <%
            Object respuesta = request.getAttribute("mensaje");
            if (respuesta == "correcto") {
        %>        
        <jsp:forward page="RegistrarGira.jsp"/>
        <%
        } else {
        %>
        <jsp:forward page="validarSolicitudGira.jsp"/>
        <%
            }
        %>
    </body>
</html>
