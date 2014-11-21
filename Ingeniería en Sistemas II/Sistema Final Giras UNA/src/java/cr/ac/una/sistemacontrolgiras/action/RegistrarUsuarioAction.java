package cr.ac.una.sistemacontrolgiras.action;

import cr.ac.una.sistemacontrolgiras.Data.DataUsuario;
import cr.ac.una.sistemacontrolgiras.Dominio.Usuario;
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
public class RegistrarUsuarioAction extends DispatchAction {

    public ActionForward iniciar(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        return mapping.getInputForward();
    }

 
    public ActionForward registrarUsuario(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        
        DataUsuario du = new DataUsuario();
        
        int cedula = Integer.parseInt(request.getParameter("cedula"));
        String nombre = request.getParameter("nombre");
        String apellidos = request.getParameter("apellidos");
        String puesto = request.getParameter("perfil");
        int telefono = Integer.parseInt(request.getParameter("telefono"));
        String direccion = request.getParameter("direccion");
        String usuario = request.getParameter("usuario");
        String contrasena = request.getParameter("contrasena");
        String fechaInicio=request.getParameter("fechaInicio");
         String fechaFinal=request.getParameter("fechaFinal");
        
        Usuario us = new Usuario(cedula, nombre, apellidos, puesto, telefono, direccion, usuario, contrasena, fechaInicio, fechaFinal);
        du.registrarPersona(us);
        
        return mapping.findForward("registrar");
    }
}
