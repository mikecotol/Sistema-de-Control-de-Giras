<%-- 
    Document   : validarSolicitudGira
    Created on : 19/06/2014, 04:05:09 AM
    Author     : Yari
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <form method="get" action="./validarGira.do"> 
        
          <input type="hidden" name="metodo" value="validarSolicitudFechaAuto"/>
            <input type="hidden" name="metodo"/>

           <fieldset id="formularios" >
                <legend><h1><bean:message key="gira.consultar"/></h1></legend>

                <bean:message key="gira.fecha"/>
                <input type="date" name="fechaGira" value="" class="textbox"/>

                <bean:message key="gira.regreso"/>
                <input type="date" name="fechaRegreso" value="" class="textbox"/><br/><br/>

                <bean:message key="gira.vehiculo"/>
                <input type="text" name="placa" value="" class="textbox"/> <br/>


                <input type="submit" value="Verificar"  class="boton"/> <br/><br/>
            </fieldset> <br/><br/><br/>
        </form>
    </body>
</html>
