<%-- 
    Document   : RegistrarGira
    Created on : 18/06/2014, 01:56:59 PM
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

        <title><bean:message key="gira.registrar"/></title>
    </head>
    <body>
        <h1><bean:message key="gira.registrar"/></h1>

        <form method="get" action="./RegistrarGira.do">
       
           <input type="hidden" name="metodo" value="registrarGira"/>
           
            <fieldset id="form2">

                <fieldset id="form2">

                    <legend><h1><bean:message key="gira.general"/></h1> </legend>

                    <br/><br/> <bean:message key="gira.ambito"/>
                    <select name="ambito">
                        <option><bean:message key="gira.ambito1"/></option>
                        <option><bean:message key="gira.ambito2"/></option>
                        <option><bean:message key="gira.ambito3"/></option>
                        <option><bean:message key="gira.ambito4"/></option>
                    </select> <br/><br/>

                    <bean:message key="gira.nombreCarreraProyecto"/>
                    <input type="text" name="carrera" value=""  class="textbox"/><br/><br/>

                    <bean:message key="gira.nombreResponsable"/>
                    <input type="text" name="nombreResponsable" value="" class="textbox" /><br/><br/>

                </fieldset> 

                <br/><br/>

                <fieldset id="form2"> 
                    <legend><h1><bean:message key="gira.destino"/> </h1></legend>


                    <bean:message key="gira.provincia"/>
                    <input type="text" name="provincia" value="" class="textbox" /><br/><br/>

                    <bean:message key="gira.canton"/>
                    <input type="text" name="canton" value="" class="textbox" /><br/><br/>

                    <bean:message key="gira.distrito"/>
                    <input type="text" name="distrito" value="" class="textbox" /><br/><br/>
                    
                    <bean:message key="gira.fechaSalida"/>
                    <input type="date" name="fechaSalida" value="" class="textbox" /><br/><br/>

                    <bean:message key="gira.horaSalida"/>
                    <input type="text" name="horaSalida" value="" class="textbox" /><br/><br/>
                    
                     <bean:message key="gira.fechaRegreso"/>
                    <input type="date" name="fechaRegreso" value="" class="textbox" /><br/><br/>

                    <bean:message key="gira.horaRegreso"/>
                    <input type="text" name="horaRegreso" value="" class="textbox" /><br/><br/>

                    <bean:message key="gira.lugarHospedaje"/>
                    <input type="text" name="lugarHospedaje" value="" class="textbox" /><br/><br/>

                    <bean:message key="gira.diasHospedaje"/>
                    <input type="text" name="diasHospedaje" value="" class="textbox"/><br/><br/>

                    <bean:message key="gira.objetivo"/><br/>
                    <textarea name="objetivo" rows="10" cols="35">
                    </textarea> <br/><br/>

                </fieldset>
                <br/><br/>
                <fieldset id="form2">
                    <bean:message key="gira.itinerario"/>
                    <input type=file name="itinerario" class="textbox"> <br/><br/>

                    <bean:message key="gira.participantes"/>
                    <input type=file name="participantes" class="textbox"> <br/><br/>
                </fieldset>
                <input type="submit" value="Enviar" onclick="mensaje()" class="boton"/>         
                <p id="exito">&nbsp;</p>
            </fieldset>
        </form>    
    </body>
</html>

