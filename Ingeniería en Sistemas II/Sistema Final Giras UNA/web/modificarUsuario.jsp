<%-- 
    Document   : modificarAutorizado
    Created on : 19/06/2014, 06:55:16 AM
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
         
        <title><bean:message key="usuario.modificar"/></title>
    </head>
    <body>
        <h1><bean:message key="usuario.modificar"/></h1>
        
        <form method="get" action="./ModificarUsuario.do"> 
            <input type="hidden" name="metodo" value="modificarUsuario"/>
            
              <bean:message key="usuario.cedula"/>
               
              <input type="text" name="cedula" value="" /><br/><br/>
              
              <bean:message key="usuario.nombre"/>
              <input type="text" name="nombre" value="" /><br/><br/>
              
              <bean:message key="usuario.apellidos"/>
              <input type="text" name="apellidos" value="" /><br/><br/>
              
              <bean:message key="usuario.telefono"/>
              <input type="text" name="telefono" value="" /><br/><br/>
              
              <bean:message key="usuario.direccion"/>
              <input type="text" name="direccion" value="" /><br/><br/>
              
              <bean:message key="usuario.perfil"/>
              
              <select name="perfil">
                  <option><bean:message key="usuario.perfil1"/></option>
                  <option><bean:message key="usuario.perfil2"/></option>
                  <option><bean:message key="usuario.perfil3"/></option>
                  <option><bean:message key="usuario.perfil4"/></option>
                  <option><bean:message key="usuario.perfil5"/></option>
              </select> <br/><br/>
              
               <bean:message key="usuario.fechaInicio"/>
              <input type="date" name="fechaInicio" value="" /><br/><br/>
              
               <bean:message key="usuario.fechaFinal"/>
              <input type="date" name="fechaFinal" value="" /><br/><br/>
              
               <bean:message key="usuario.usuario"/>
               <input type="text" name="usuario" value="" /><br/><br/>
                            
               <bean:message key="usuario.contrasena"/>
               <input type="password" name="contrasena" value="" /><br/><br/>
                            
              <input type="submit" value="Guardar" onclick="mensaje()" class="boton"/>         
              <p id="exito">&nbsp;</p>
        </form>    
    </body>
</html>
