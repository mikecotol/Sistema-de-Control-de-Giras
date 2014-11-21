<%-- 
    Document   : Bienvenida
    Created on : 15/06/2014, 09:43:44 PM
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
        <title>Bienvenida</title>
    </head>
    <body>
        <form >
            <fieldset>
                <legend><h3>Sistema de Control del Giras</h3></legend>
                <h3> 
                    <bean:message key="pagina.instrucciones1"/>
                    <bean:message key="pagina.instrucciones2"/>
                    <bean:message key="pagina.instrucciones3"/>
                    <bean:message key="pagina.instrucciones4"/>
                    <bean:message key="pagina.instrucciones5"/>
                </h3>
                <table id="tablaIn" >
                    <thead >
                        <tr>
                            <th><bean:message key="pagina.mes"/></th>
                            <th><bean:message key="pagina.fecha"/></th>
                        </tr>
                    </thead>
                    <tbody >

                        <tr >
                            <td><center><bean:message key="pagina.julio"/></center></td>
                            <td><center><bean:message key="pagina.fechajulio"/></center></td>
                        </tr>
                        <tr>
                            <td><center><bean:message key="pagina.agosto"/></center></td>
                            <td><center><bean:message key="pagina.fechaagosto"/></center></td>
                        </tr>
                        <tr>
                            <td><center><bean:message key="pagina.setiembre"/></center></td>
                            <td><center><bean:message key="pagina.fechasetiembre"/></center></td>
                        </tr>
                        <tr>
                            <td><center><bean:message key="pagina.octubre"/></center></td>
                            <td><center><bean:message key="pagina.fechaoctubre"/></center></td>
                        </tr>
                        <tr>
                            <td><center><bean:message key="pagina.noviembre"/></center></td>
                            <td><center><bean:message key="pagina.fechanoviembre"/></center></td>
                        </tr>
                        <tr>
                            <td><center><bean:message key="pagina.diciembre"/></center></td>
                            <td><center><bean:message key="pagina.fechadiciembre"/></center></td>
                        </tr>
                    </tbody>
                </table>
            </fieldset>
        </form>

    </body>
</html>
