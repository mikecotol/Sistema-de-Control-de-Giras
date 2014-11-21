package cr.ac.una.sistemacontrolgiras.action;

import cr.ac.una.sistemacontrolgiras.Data.DataUsuario;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.actions.DispatchAction;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

/**
 *
 * @author Yari
 */
public class validarUsuarioAction extends DispatchAction {

    public ActionForward iniciar(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        return mapping.getInputForward();
    }

    public ActionForward validarUsuario(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        DataUsuario logueo = new DataUsuario();
        String usuario = request.getParameter("usuario");
        String contrasena = request.getParameter("contrasena");

        String resultado = logueo.getLogueo(usuario, contrasena);

        HttpSession session = request.getSession();

        if ((usuario + "-" + contrasena + "-" + "administrativo").equals(resultado)) {

            String tipoUsuario = "administrador";

            session.setAttribute("redirecionamiento", tipoUsuario);
            session.setAttribute("logined", true);
            session.setAttribute("usuario", usuario);
            return mapping.findForward("administrativo");
        } else {
            if ((usuario + "-" + contrasena + "-" + "Asistente Administrativo").equals(resultado)) {

                String tipoUsuario = "Asistente Administrativo";

                session.setAttribute("redirecionamiento", tipoUsuario);

                session.setAttribute("logined", true);
                session.setAttribute("usuario", usuario);
                return mapping.findForward("AsistenteAdministrativo");
            } else {

                if ((usuario + "-" + contrasena + "-" + "ASOECAS").equals(resultado) || (usuario + "-" + contrasena + "-" + "Proyectista").equals(resultado) || (usuario + "-" + contrasena + "-" + "Académico").equals(resultado)) {
                    
                    String tipoUsuario = "Solicitante";

                    session.setAttribute("redirecionamiento", tipoUsuario);

                    session.setAttribute("logined", true);
                    session.setAttribute("usuario", usuario);
                    return mapping.findForward("solicitante");
                    
                    
                } else {
                    String paquete = "Datos incorrectos.";
                    request.setAttribute("paquete", paquete);
                    session.setAttribute("logined", false);
                    return mapping.findForward("error");
                }
            }
        }

    }

    public ActionForward logon(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        HttpSession session = request.getSession();
        session.removeAttribute("logined");
        return mapping.findForward("");
    }
}
