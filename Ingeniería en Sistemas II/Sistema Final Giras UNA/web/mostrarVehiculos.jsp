<%-- 
    Document   : mostrarVehiculos
    Created on : 19/06/2014, 06:20:05 AM
    Author     : Yari
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="vehiculos.mostrar"/></title>
    </head>
    <body>
        <fieldset id="form2">
            <legend><h1><bean:message key="vehiculos.mostrar"/></h1> </legend>
            <table >
                <thead>
                    <tr>
                        <th><bean:message key="vehiculo.placa"/></th>
                        <th><bean:message key="vehiculo.marca"/></th>
                        <th><bean:message key="vehiculo.modelo"/></th>
                        <th><bean:message key="vehiculo.color"/></th>
                        <th><bean:message key="vehiculo.capacidad"/></th>
                        <th><bean:message key="vehiculo.tipo"/></th>
                        <th><bean:message key="vehiculo.estado"/></th>

                    </tr>
                </thead>
                <tbody>
                    <logic:iterate name="lista" id="automovil">
                        <tr>  
                            <td>${automovil.placa}</a></td>   
                            <td>${automovil.marca}</td>     
                            <td>${automovil.modelo}</td> 
                            <td>${automovil.color}</td> 
                            <td>${automovil.capacidad}</td> 
                            <td>${automovil.tipo}</td>
                            <td>${automovil.estado}</td> 
                        </tr>
                    </logic:iterate>
                </tbody>
            </table>  
        </fieldset>
    </body>
</html>
