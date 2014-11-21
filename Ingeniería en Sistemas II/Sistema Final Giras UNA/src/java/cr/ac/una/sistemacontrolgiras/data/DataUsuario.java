/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cr.ac.una.sistemacontrolgiras.Data;

import cr.ac.una.sistemacontrolgiras.Dominio.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Diego
 */
public class DataUsuario extends BaseData{
    
    public void registrarPersona(Usuario persona) throws SQLException
    {

        
        Connection con = getConexion();
        
        String consulta = "CALL insertarUsuario(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement statement = con.prepareStatement(consulta);
        
        statement.setInt(1, persona.getCedula());
        statement.setString(2, persona.getNombre());
        statement.setString(3, persona.getApellidos());
        statement.setString(4, persona.getPuesto());
        statement.setInt(5, persona.getTelefono());
        statement.setString(6, persona.getDireccion());
        statement.setString(7, persona.getUsuario());
        statement.setString(8, persona.getContrasena());
        statement.setString(9, persona.getFechaInicio());
        statement.setString(10, persona.getFechaFinal());
        
        statement.executeUpdate();
        statement.close();
    
    }
    
    public String getLogueo(String usuario, String contrasena) throws SQLException
    {
        String resultado="";
        Connection conexion= getConexion();
        
        String consulta= "CALL validarUsuario(?,?)";
        
        PreparedStatement prepStatement = conexion.prepareStatement(consulta);
        prepStatement.setString(1, usuario);
        prepStatement.setString(2, contrasena);
        ResultSet  res= prepStatement.executeQuery();
      
        while(res.next())
        {
           resultado += res.getString("usuario")+"-";
           resultado += res.getString("contrasena")+"-";
           resultado += res.getString("puesto");
        }
        return resultado;
        
    }
    
     public void modificarUsuario(Usuario user) throws SQLException
     {
      
         String sql = "UPDATE tb_usuario SET cedula=?,nombre= ?, apellidos=?, puesto=?, telefono=?, direccion=?, usuario=?, contrasena=?, fechaInicio=?, fechaFinal=?"
                + " where cedula =  '" + user.getCedula()+ "'"; 
        
        Connection conec = getConexion();
        PreparedStatement statement = conec.prepareStatement(sql);
        statement.setInt(1, user.getCedula());
        statement.setString(2, user.getNombre());
        statement.setString(3, user.getApellidos());
        statement.setString(4, user.getPuesto());
        statement.setInt(5, user.getTelefono());
        statement.setString(6, user.getDireccion());
        statement.setString(7, user.getUsuario());  
        statement.setString(8, user.getContrasena());
        statement.setString(9, user.getFechaInicio());
        statement.setString(10, user.getFechaFinal());
        
        statement.executeUpdate(); 
        
        statement.close();
        conec.close();
        
     }
    
}
