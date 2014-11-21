<%-- 
    Document   : Documentos
    Created on : 18/06/2014, 08:21:36 PM
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
        <title><bean:message key="gira.documentos"/></title>
    </head>
    <body>   
        <fieldset>
            
            <legend><h1><bean:message key="gira.documentos"/></h1></legend>
           
            <a href="Documentos/Lineamientos_para_Solicitud_de_giras.doc"><bean:message key="documento.documento1"/></a><br/><br/>
            <a href="Documentos/Plantilla_para_Itinerario_de_gira.doc"><bean:message key="documento.documento2"/></a><br/><br/>
            <a href="Documentos/Plantilla_para_participantes_de_la_gira.doc"><bean:message key="documento.documento2"/></a><br/><br/>
        </fieldset>
    </body>
</html>
