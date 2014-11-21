<%-- 
    Document   : FuncionesSolicitante
    Created on : 18/06/2014, 07:39:17 PM
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

        <title><bean:message key="pagina.InicioUsuarioSolicitante"/></title>
    </head>
    <body>
        <table  id='tabla'>
            <tr>
                <td colspan="2"> 

                    <jsp:include page="MenuUsuarioSolicitante.jsp" ></jsp:include>
                    </td> 
                </tr>
                <tr> 
                    <td colspan="2"> 

                        <img src="./Imagenes/bannePrincipal_1.png"heigth="300" width="1000">   
                    </td> 
                </tr>

                <tr colspan="2">

                    <td ><div id="encapsulado"> <jsp:include page="validarSolicitudGira.jsp" ></jsp:include>  </div></td>
            </tr>
        </table>
    </body>
</html>
