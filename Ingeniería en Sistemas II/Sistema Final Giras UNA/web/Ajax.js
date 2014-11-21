/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function nuevoAjax(){
    var xmlhttp = false;
    try{
        //cualquier browser que no sea IE
        xmlhttp= ActiveXObject("Msxml2.XMLHTTP");
    }catch(e){
        try{
            //para IE
            xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
        }catch(e){
            xmlhttp= false;
        }
    }
    if(!xmlhttp && typeof XMLHttpRequest != 'undefined' ){
        xmlhttp = new XMLHttpRequest();
    }
    return xmlhttp;
}


function cargarPagina(url){
    var capaMostrarDatosHtml = document.getElementById('encapsulado');
    
    var ajax = new nuevoAjax();
    ajax.open("GET",url);
    ajax.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    ajax.send(null);
    ajax.onreadystatechange=function(){
        if(ajax.readyState==4){
            capaMostrarDatosHtml.innerHTML=ajax.responseText;
        }
    }
}

function mensaje()
{
    document.getElementById('exito').innerHTML="Operación Exitosa!!";
    
}

