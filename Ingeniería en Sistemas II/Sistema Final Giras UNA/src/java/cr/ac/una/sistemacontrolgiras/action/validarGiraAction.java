
package cr.ac.una.sistemacontrolgiras.action;

import cr.ac.una.sistemacontrolgiras.Data.AutomovilData;
import java.util.Date;
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
public class validarGiraAction extends DispatchAction {

    public ActionForward iniciar(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        return mapping.getInputForward();
    }
    
       public ActionForward validarSolicitudFechaAuto(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
           
        java.util.Date fecha = new Date();
        int mesActual = fecha.getMonth();
        int diaActual = fecha.getDay();
        int anioActual = fecha.getYear();
        String placa= request.getParameter("placa");
        String diaUsuario="";
        String mesUsuario="";
        String anioUsuario="";
        int contador=0;
        
        String fechaSolicitud = request.getParameter("fechaGira");
        String fechaRegresoSolicitud = request.getParameter("fechaRegreso");
        for(int i=0; i<fechaSolicitud.length()-1;i++)
        {
            
            if(fechaSolicitud.charAt(i)!='/')
            {
                contador++;
                
                while(contador<=2)
                {
                    diaUsuario+=fechaSolicitud.charAt(i);
                }
                while(contador>2 && contador<=4)
                {
                    mesUsuario+=fechaSolicitud.charAt(i);
                }
                
                while(contador>4 && contador<=6)
                {
                    anioUsuario+=fechaSolicitud.charAt(i);
                }
                
            }          
        }
        
        AutomovilData da = new AutomovilData();
        
        int diaSolicitud = Integer.parseInt(diaUsuario);
        int mesSolicitud = Integer.parseInt(mesUsuario);
        int anioSolicitud = Integer.parseInt(anioUsuario);
        boolean respuesta = da.VerificarDisponibilidadAuto(fechaSolicitud, fechaRegresoSolicitud, placa);
        
        if(((((diaSolicitud <= 17) && (mesSolicitud>mesActual) && (anioSolicitud == anioActual)) || ((diaSolicitud >= 17) && (mesSolicitud>mesActual) && (anioSolicitud == anioActual)))&& (respuesta)))
        {
            String mensaje = "correcto";
            request.setAttribute("mensaje", mensaje);
            
        }
        else
        {
            String mensaje = "incorrecto";
            request.setAttribute("mensaje", mensaje);
            
            // return mapping.findForward("errorgira");   
        }
        
        return mapping.findForward("exitogira");
    }
}
