<%-- 
    Document   : modificarVehiculo
    Created on : 19/06/2014, 04:56:52 AM
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
        <title><bean:message key="vehiculo.modificar"/></title>
    </head>
    <body>  

        <form method="get" action="./modificarVehiculo.do"> 
        
          <input type="hidden" name="metodo" value="modificarVehiculo"/>
            
            <fieldset id="form2">

                <legend><h1><bean:message key="vehiculo.modificar"/></h1></legend>

                <bean:message key="vehiculo.placa"/>
                
                <select name="placa">
                       
                        <logic:iterate name="lista" id="automovil">
                            <option value= "${automovil.placa}"> 
                                <bean:write name="automovil" property="placa"/> 
                            </option> 
                        </logic:iterate>
                            
                  </select> <br/><br/>
                
                <bean:message key="vehiculo.marca"/>
                <input type="text" name="marca" value="" class="textbox"/><br/><br/>

                <bean:message key="vehiculo.color"/>
                <input type="text" name="color" value="" class="textbox"/> <br/><br/>

                <bean:message key="vehiculo.modelo"/>
                <input type="text" name="modelo" value="" class="textbox"/><br/><br/>

                <bean:message key="vehiculo.capacidad"/>
                <input type="text" name="capacidad" value="" class="textbox"/><br/><br/>
                
                <bean:message key="vehiculo.tipo"/>
                <input type="text" name="tipo" value="" class="textbox"/><br/><br/>
                
                <bean:message key="vehiculo.estado"/>
                <input type="text" name="estado" value="" class="textbox"/><br/><br/>
                
                <input type="submit" value="Enviar" onclick="mensaje()" class="boton"/>         
                <p id="exito">&nbsp;</p>

            </fieldset>
        </form>
    </body>
</html>
