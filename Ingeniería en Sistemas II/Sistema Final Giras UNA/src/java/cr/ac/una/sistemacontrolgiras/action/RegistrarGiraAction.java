
package cr.ac.una.sistemacontrolgiras.action;

import cr.ac.una.sistemacontrolgiras.Data.DataGira;
import cr.ac.una.sistemacontrolgiras.Dominio.SolicitudGira;
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
public class RegistrarGiraAction extends DispatchAction {

    public ActionForward registrarGira(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        DataGira dg = new DataGira();
        
        String ambitoGira = request.getParameter("ambitoGira");
        String carrera = request.getParameter("carrera");
        String nombreAcademico = request.getParameter("nombreResponsable");
        String provincia = request.getParameter("provincia");
        String canton = request.getParameter("canton");
        String distritio = request.getParameter("distritio");
        String fechaSalida = request.getParameter("fechaSalida");
        String horaSalida = request.getParameter("horaSalida");
        String fechaRegreso = request.getParameter("fechaRegreso");
        String horaRegreso = request.getParameter("horaRegreso");
        String itinerario = request.getParameter("itinerario");
        String lugarHospedaje = request.getParameter("lugarHospedaje");
        int diasHospedaje = Integer.parseInt(request.getParameter("diasHospedaje"));
        String objetivoGira = request.getParameter("objetivoGira");
        String participantes = request.getParameter("participantes");

        SolicitudGira solicitudGira = new SolicitudGira(ambitoGira, carrera, nombreAcademico, provincia, canton, distritio, fechaSalida, horaSalida, fechaRegreso, horaRegreso, itinerario, lugarHospedaje, diasHospedaje, objetivoGira, participantes);
        dg.insertarSolicitud(solicitudGira);
        
        return mapping.findForward("Solicitud");
    }
}
