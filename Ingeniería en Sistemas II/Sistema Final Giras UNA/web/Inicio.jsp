<%-- 
    Document   : Inicio
    Created on : 13/06/2014, 11:14:57 AM
    Author     : Yari
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel='stylesheet' type='text/css' href='diseno.css' />
        <script lang="JavaScript" src="Ajax.js"></script>
        <title><bean:message key="pagina.Inicio"/></title>
    </head>
    <body>
        <table  id='tabla'>
            <tr> 
                <td colspan="2"> 

                    <img src="./Imagenes/bannePrincipal_1.png"heigth="300" width="1000">   
                </td> 
            </tr>
            <tr colspan="2">

                <td><div id="encapsulado" psotion="top"><jsp:include page="validarUsuario.jsp"></jsp:include></div></td>
                
                <td> <div id="encapsulado"><jsp:include page="Bienvenida.jsp" ></jsp:include></div></td>
            </tr>

        </table>
    </body>
</html>
