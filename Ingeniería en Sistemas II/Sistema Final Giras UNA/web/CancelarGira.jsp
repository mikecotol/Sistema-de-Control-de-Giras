<%-- 
    Document   : CancelarGira
    Created on : 18/06/2014, 10:38:53 PM
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
        <title><bean:message key="gira.cancelar"/></title>
    </head>
    <body>
        <fieldset id='formularios'>  
            <legend><h1><bean:message key="gira.cancelar"/></h1></legend>
               
               <bean:message key="gira.numeroSolicitud"/>
               <input type="text" name="numeroSolicitud" value="" /> <br/><br/>
               
               <input type="submit" value="Eliminar"  class="boton"/> <br/><br/>
        </fieldset>
    </body>
</html>
