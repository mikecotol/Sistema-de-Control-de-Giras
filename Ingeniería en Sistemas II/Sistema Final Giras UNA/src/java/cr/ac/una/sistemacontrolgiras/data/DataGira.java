/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cr.ac.una.sistemacontrolgiras.Data;

import cr.ac.una.sistemacontrolgiras.Dominio.SolicitudGira;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Diego
 */
public class DataGira extends BaseData {
    
    public void insertarSolicitud(SolicitudGira solicitud) throws SQLException
    {

        
        Connection con = getConexion();
        
        String consulta = "CALL insertarSolicitud(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement statement = con.prepareStatement(consulta);
        
        statement.setInt(1, solicitud.getConsecutivo());
        statement.setString(2, solicitud.getAmbitoGira());
        statement.setString(3, solicitud.getCarrera());
        statement.setString(4, solicitud.getNombreAcademico());
        statement.setString(5, solicitud.getProvincia());
        statement.setString(6, solicitud.getCanton());
        statement.setString(7, solicitud.getDistritio());
        statement.setString(8, solicitud.getFechaSalida());
        statement.setString(9, solicitud.getHoraSalida());
        statement.setString(10, solicitud.getFechaRegreso());
        statement.setString(11, solicitud.getHoraRegreso());
        statement.setString(12, solicitud.getItinerario());
        statement.setString(13, solicitud.getLugarHospedaje());
        statement.setInt(14, solicitud.getDiasHospedaje());
        statement.setString(15, solicitud.getObjetivoGira());
        statement.setString(16, solicitud.getParticipantes());
        
        statement.executeUpdate();
        statement.close();
    
    
    }
    
     public LinkedList<SolicitudGira> getSolicitudesEspecifica(int consecutivo) throws SQLException
    {
       LinkedList<SolicitudGira> listaSolicitudes = new LinkedList<SolicitudGira>();
       
        String busqueda = "CALL seleccionarSolicitudEspecifica(?)";
        
        Connection conec = getConexion();
        
        PreparedStatement statement = conec.prepareStatement(busqueda);
        
        statement.setInt(1, consecutivo);
        ResultSet res = statement.executeQuery(); 
        
        while(res.next())
        {        
            SolicitudGira sol = new SolicitudGira();
          
            sol.setConsecutivo(res.getInt(1));
            sol.setAmbitoGira(res.getString(2));
            sol.setCarrera(res.getString(3));
            sol.setNombreAcademico(res.getString(4));
            sol.setProvincia(res.getString(5));
            sol.setCanton(res.getString(6));
            sol.setDistritio(res.getString(7));
            sol.setFechaSalida(res.getString(8));
            sol.setHoraSalida(res.getString(9));
            sol.setFechaRegreso(res.getString(10));
            sol.setHoraRegreso(res.getString(11));
            sol.setItinerario(res.getString(12));
            sol.setLugarHospedaje(res.getString(13));
            sol.setDiasHospedaje(res.getInt(14));
            sol.setObjetivoGira(res.getString(15));
            sol.setParticipantes(res.getString(16));
            
            listaSolicitudes.add(sol);    
        }
        
        
        return listaSolicitudes;
        
    }
     
     public LinkedList<SolicitudGira> getSolicitudes() throws SQLException
    {
        LinkedList<SolicitudGira> listaSolicitudes = new LinkedList<SolicitudGira>();
       
        String busqueda = "CALL seleccionarSolicitud";
        
        Connection conec = getConexion();
        
        PreparedStatement statement = conec.prepareStatement(busqueda);
        ResultSet res = statement.executeQuery();
        
        while(res.next())
        {
            SolicitudGira solicitudGira = new SolicitudGira();
            
            solicitudGira.setConsecutivo(res.getInt(1));
            solicitudGira.setAmbitoGira(res.getString(2));
            solicitudGira.setNombreAcademico(res.getString(3));
            
            listaSolicitudes.add(solicitudGira);        
        }
        
        return listaSolicitudes;
        
    }
     
     public void respuesta(int consecutivo, boolean respuesta,String descripcion) throws SQLException
     {
         
         Connection conexion = getConexion();
         String sql = "CALL insertarRespuesta(?,?,?)";
         PreparedStatement statement = conexion.prepareStatement(sql);
         statement.setInt(1, consecutivo);
         statement.setBoolean(2, respuesta);
         statement.setString(3, descripcion);
         
     
     }
     
     
     public LinkedList<SolicitudGira> getRespuestaSolicitud(int consecutivo) throws SQLException
    {
       LinkedList<SolicitudGira> listaSolicitudes = new LinkedList<SolicitudGira>();
       
        String busqueda = "CALL seleccionarRespuesta(?)";
        
        Connection conec = getConexion();
        PreparedStatement statement = conec.prepareStatement(busqueda);
        statement.setInt(1, consecutivo);
        ResultSet res = statement.executeQuery();
        
        while(res.next())
        {
            SolicitudGira solicitudGira = new SolicitudGira();
            
            solicitudGira.setConsecutivo(res.getInt(1));
            solicitudGira.setRespuesta(res.getBoolean(2));
            solicitudGira.setDescripción(res.getString(3));
            
            listaSolicitudes.add(solicitudGira);
           
        }
            
        return listaSolicitudes;
        
    }
     
     public void modificarSolicitud(SolicitudGira sol) throws SQLException
     {
      
         String sql = "update tb_solicitud set (?,?,?,?,?,?,?,?,?,?,?,?);";
        
        Connection conec = getConexion();
        PreparedStatement statement = conec.prepareStatement(sql);
        statement.setString(1, sol.getAmbitoGira());
        statement.setString(2, sol.getCarrera());
        statement.setString(3, sol.getNombreAcademico());
        statement.setString(4, sol.getProvincia());
        statement.setString(5, sol.getCanton());
        statement.setString(6, sol.getDistritio());
        statement.setString(7, sol.getFechaSalida());
        statement.setString(8, sol.getHoraSalida());
        statement.setString(9, sol.getFechaRegreso());
        statement.setString(10, sol.getHoraRegreso());
        statement.setString(11, sol.getLugarHospedaje());
        statement.setInt(12, sol.getDiasHospedaje());
        
        statement.executeUpdate();
        conec.close();
        
     }
     
     
}