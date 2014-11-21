<%-- 
    Document   : eliminarVehiculo
    Created on : 18/06/2014, 10:52:29 PM
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
        <title><bean:message key="vehiculo.eliminar"/></title>
    </head>
    <body>
        <fieldset id='formularios'>  
            <legend><h1><bean:message key="vehiculo.eliminar"/></h1></legend>
               
               <bean:message key="vehiculo.placa"/>
               <select name="placa">
                       
                        <logic:iterate name="lista" id="automovil">
                            <option value= "${automovil.placa}"> 
                                <bean:write name="automovil" property="placa"/> 
                            </option> 
                        </logic:iterate>
                            
                  </select> <br/><br/>
               
               <input type="submit" value="Eliminar"  class="boton"/> <br/><br/>
        </fieldset>
    </body>
</html>

