<%-- 
    Document   : BienvenidaSolicitante
    Created on : 18/06/2014, 10:11:37 AM
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
        <title><bean:message key="pagina.BienvenidaSolicitante"/></title>
    </head>
    <body>
        <fieldset>
            <legend><bean:message key="pagina.InstruccionesSolicitante"/></legend>
            <h3> 
                <bean:message key="pagina.instruccionsolicitante1"/><br>
              <bean:message key="pagina.instruccionsolicitante2"/>
              <bean:message key="pagina.instruccionsolicitante3"/>
            </h3>
        </fieldset>
   
</body>
</html>
