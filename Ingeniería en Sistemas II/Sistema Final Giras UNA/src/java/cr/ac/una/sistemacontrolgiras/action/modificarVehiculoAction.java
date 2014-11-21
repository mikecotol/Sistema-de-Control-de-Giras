/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cr.ac.una.sistemacontrolgiras.action;

import cr.ac.una.sistemacontrolgiras.Data.AutomovilData;
import cr.ac.una.sistemacontrolgiras.Dominio.Automovil;
import java.util.LinkedList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.actions.DispatchAction;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

/**
 *
 * @author Yari
 */
public class modificarVehiculoAction extends DispatchAction {

    public ActionForward iniciar(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
          
        AutomovilData autoData = new AutomovilData();
        
        LinkedList<Automovil> lista = autoData.getAutomoviles();
        request.setAttribute("lista", lista);
       
        return mapping.getInputForward();
    }   
    public ActionForward modificarVehiculo(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        AutomovilData da = new AutomovilData();
        
        String placa = request.getParameter("placa");
        String marca = request.getParameter("marca");
        String modelo= request.getParameter("modelo");
        String tipoAuto= request.getParameter("tipo");
        String color= request.getParameter("color");
        String estado= request.getParameter("estado");
        String capacidad = request.getParameter("capacidad");

        Automovil auto = new Automovil(placa, marca, color, modelo, capacidad,tipoAuto, estado);
        da.modificarAutomovil(auto);
        
        return mapping.findForward("exito");
    }
}
