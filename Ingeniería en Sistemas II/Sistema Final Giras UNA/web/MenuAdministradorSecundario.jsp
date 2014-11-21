<%-- 
    Document   : MenuAdministradorSecundario
    Created on : 18/06/2014, 11:03:47 PM
    Author     : Yari
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv='Content-Type' content='text/html; charset=utf-8'/>
        <meta http-equiv='X-UA-Compatible' content='IE=edge,chrome=1'/>
        <link rel='stylesheet' type='text/css' href='styles.css' />
        <script lang="JavaScript" src="Ajax.js"></script>

        <title><bean:message key="pagina.menuSolictante"/></title>
    </head>
    <body>
        <div id='cssmenu'>
            <ul>
                <li class='active'><a href='InicioUsuarioAdministrativo.jsp'><span>Inicio</span></a></li>
                <li><a href='#'<span><bean:message key="menuAdministrador.Giras"/></span></a>
                    <ul>
                        <li><a href='FuncionesAdministradoSecundario.jsp'<span><h3><bean:message key="menuAdministrador.ingresarGira"/></h3></span></a></li>
                        <li><a href='#'<span><h3><bean:message key="menuAdministrador.modificarGira"/></h3></span></a></li>
                        <li><a href='#'onclick="cargarPagina('./CancelarGira.jsp')"<span><h3><bean:message key="menuAdministrador.cancelarGira"/></h3></span></a></li>
                        
                    </ul>
                </li>
                <li><a href='#'<span><bean:message key="menuAdministrador.Vehiculos"/></span></a>
                    <ul>
                        <li><a href='#'onclick="cargarPagina('./registrarVehiculo.jsp')"<span><h3><bean:message key="menuAdministrador.ingresarVehiculo"/></h3></span></a></li>
                        <li><a href='#'onclick="cargarPagina('./modificarVehiculo.do?metodo=iniciar')"<span><h3><bean:message key="menuAdministrador.modificarVehiculo"/></h3></span></a></li>
                        <li><a href='#'onclick="cargarPagina('./mostrarVehiculos.do?metodo=iniciar')"<span><h3><bean:message key="menuAdministrador.consultarVehiculos"/></h3></span></a></li>
                        <li><a href='#'onclick="cargarPagina('./eliminarVehiculo.do?metodo=iniciar')"<span><h2><bean:message key="menuAdministrador.eliminarVehiculo"/></h3></span></a></li>
                    </ul>
                </li>
                <li><a href='#'<span><bean:message key="menuAdministrador.Autorizados"/></span></a>
                    <ul>
                        <li><a href='#'onclick="cargarPagina('./RegistrarUsuario.do?metodo=iniciar')"<span><h3><bean:message key="menuAdministrador.registrarAutorizado"/></h3></span></a></li>
                        <li><a href='#'onclick="cargarPagina('./modificarUsuario.do?metodo=iniciar')"<span><h3><bean:message key="menuAdministrador.modificarAutorizado"/></h3></span></a></li>
                        <li><a href='#'onclick="cargarPagina('./eliminarAutorizado.jsp')"<span><h3><bean:message key="menuAdministrador.eliminarAutorizado"/></h3></span></a></li>
                    </ul>
                </li>
                <li><a href='#'onclick="cargarPagina('./Documentos.jsp')"<span><bean:message key="menuSolicitante.documentos"/></span></a></li>
                <li class='last'><a href='#'onclick="cargarPagina('./contactenos.jsp')"<span><bean:message key="pagina.contacto"/></span></a></li>
            </ul>
        </div>
    </body>
</html>


