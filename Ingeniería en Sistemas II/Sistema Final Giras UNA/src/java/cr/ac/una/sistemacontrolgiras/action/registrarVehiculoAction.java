/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cr.ac.una.sistemacontrolgiras.action;

import cr.ac.una.sistemacontrolgiras.Data.AutomovilData;
import cr.ac.una.sistemacontrolgiras.Dominio.Automovil;
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
public class registrarVehiculoAction extends DispatchAction {

    public ActionForward registrarVehiculo(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception 
    {
        AutomovilData dataAutomovil = new AutomovilData();
        
        String placa = request.getParameter("placa");
        String marca = request.getParameter("marca");
        String color = request.getParameter("color");
        String modelo = request.getParameter("modelo");
        String capacidad = request.getParameter("capacidad");
        String tipo = request.getParameter("tipo");
        String estado = request.getParameter("estado");
        
        Automovil auto = new Automovil(placa, marca, color, modelo, capacidad, tipo, estado);
        dataAutomovil.insertarAutomoviles(auto);
              
        return mapping.findForward("exito");
    }
}
