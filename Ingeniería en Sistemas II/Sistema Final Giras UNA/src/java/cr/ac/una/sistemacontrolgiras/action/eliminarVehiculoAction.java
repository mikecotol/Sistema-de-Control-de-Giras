
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
public class eliminarVehiculoAction extends DispatchAction {

    public ActionForward iniciar(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
          
        AutomovilData autoData = new AutomovilData();
        
        LinkedList<Automovil> lista = autoData.getAutomoviles();
        request.setAttribute("lista", lista);
       
        return mapping.getInputForward();
    }   
    
    public ActionForward eliminarVehiculo(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
       AutomovilData dataAuto= new AutomovilData();
       
       String placa= request.getParameter("placa");
       
       dataAuto.eliminarAutomovil(placa);
       
       return mapping.findForward("exito");
    }
}
