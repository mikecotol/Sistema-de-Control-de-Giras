<%-- 
    Document   : MenuUsuarioSolicitante
    Created on : 18/06/2014, 10:28:53 AM
    Author     : Yari
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv='Content-Type' content='text/html; charset=utf-8'/>
        <meta http-equiv='X-UA-Compatible' content='IE=edge,chrome=1'/>
        <link rel='stylesheet' type='text/css' href='styles.css' />
        <script lang="JavaScript" src="Ajax.js"></script>

        <title><bean:message key="pagina.menuSolictante"/></title>
    </head>
    <body>
        <div id='cssmenu'>
            <ul>
                <li class='active'><a href='InicioUsuarioSolicitante.jsp'><span>Inicio</span></a></li>
                <li><a href='FuncionesSolicitante.jsp'<span><bean:message key="menuSolicitante.solicitar"/></span></a></li>
                <li><a href='#'onclick="cargarPagina('./ConsultarGira.jsp')"<span><bean:message key="menuSolicitante.consultar"/></span></a></li>
                <li><a href='#'onclick="cargarPagina('./Documentos.jsp')"<span><bean:message key="menuSolicitante.documentos"/></span></a></li>
                <li class='last'><a href='#'onclick="cargarPagina('./contactenos.jsp')"<span><bean:message key="pagina.contacto"/></span></a></li>
            </ul>
        </div>
    </body>
</html>

