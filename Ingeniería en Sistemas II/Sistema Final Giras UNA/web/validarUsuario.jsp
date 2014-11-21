<%-- 
    Document   : validarUsuario
    Created on : 6/05/2014, 04:05:06 PM
    Author     : Yari
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@page session='true'%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel='stylesheet' type='text/css' href='diseno.css' />
        <title><bean:message key="usuario.logeo"/></title>
          
    </head>
    <body>
         <form  id="forma" method="get" action="./validarUsuario.do" > 
              <input type="hidden" name="metodo" value="validarUsuario"/>
                 
             <br>  <bean:message key="usuario.usuario"/>
              <input type="text" name="usuario" value="" class="textbox" /><br>
                                     
              <bean:message key="usuario.contrasena"/>
              <input  type="password" name="contrasena" value="" class="textbox" /><br> <br>
                                     
              <input type="submit" value="Ingresar" class="boton"/>
        </form>    
    </body>
</html>
