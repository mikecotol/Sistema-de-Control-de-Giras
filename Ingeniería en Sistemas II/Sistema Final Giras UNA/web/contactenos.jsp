<%-- 
    Document   : contactenos
    Created on : 18/06/2014, 12:01:13 PM
    Author     : Yari
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="contacto.contacto"/></title>
    </head>
    <body>
        <fieldset id="id" >
            <legend><h1><bean:message key="pagina.contacto"/></h1></legend>

            <a><img src="Imagenes/correo.png" width="70" border="0" > <bean:message key="contacto.correo"/></a><br>
         
           <a><img src="Imagenes/telefono.png" width="70" border="0" > <bean:message key="contacto.telefono"/></a><br>
        </fieldset>
    </body>
</html>
