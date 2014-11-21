<%-- 
    Document   : InicioUsuarioAdministrativo
    Created on : 18/06/2014, 10:30:01 PM
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
        <script lang="JavaScript" src="Ajax.js"></script>

        <title><bean:message key="pagina.InicioUsuarioSolicitante"/></title>
    </head>
    <body>
        <table  id='tabla'>
            <tr>
                <td colspan="2"> 

                    <jsp:include page="MenuUsuarioAdministrador.jsp" ></jsp:include>
                    </td> 
                </tr>
                <tr> 
                    <td colspan="2"> 

                        <img src="./Imagenes/bannePrincipal_1.png"heigth="300" width="1000">   
                    </td> 
                </tr>
                
                    <tr colspan="2">

                        <td ><div id="encapsulado"> <jsp:include page="BienvenidaSolicitante.jsp" ></jsp:include>  </div></td>
                        <td id="td1" position="rigth"> 

                           <marquee id="movible" direction="up"  SCROLLAMOUNT="3" >
                            <h4><bean:message key="pagina.Noticia1"/> </h4><br><br>
                            <h4><bean:message key="pagina.Noticia2"/></h4><br><br>
                            <h4> <bean:message key="pagina.Noticia3"/></h4><br><br>
                          </marquee>
                      </td>
                      
                   </tr>
              
        </table>
    </body>
</html>

