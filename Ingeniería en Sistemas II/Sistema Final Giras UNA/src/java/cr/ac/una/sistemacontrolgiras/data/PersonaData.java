/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cr.ac.una.sistemacontrolgiras.Data;

import cr.ac.una.sistemacontrolgiras.Dominio.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Mike
 */
public class PersonaData extends BaseData
{
    public void insertarClientes(PersonaData persona) throws SQLException
    {    
   
        Connection conexion = super.getConexion();

        String sql = "CALL insertarPersonas(?,?,?,?,?,?)"; 

        PreparedStatement statement= conexion.prepareStatement(sql);  
        
        statement.setInt(1, persona.getCedula());
        statement.setString(2, persona.getNombre());
        statement.setString(3, persona.getApellidos());
        statement.setInt(4, persona.getTelefono());
        statement.setString(5, persona.getDireccion());
        statement.setString(6, persona.getCorreo());
        
        statement.execute();      
        statement.close();
        conexion.close();

    }
    
    public LinkedList<Persona> getPersonas() throws SQLException
     {
    
        LinkedList<Persona> personas = new LinkedList<Persona>();

        Connection conexion =super.getConexion();
        
        String query ="CALL seleccionarPersonas";

        PreparedStatement statement= conexion.prepareStatement(query);
        ResultSet resultados= statement.executeQuery();

        while(resultados.next())
        {
          int cedula = resultados.getInt("cedula");
          String nombre = resultados.getString("nombre");
          String apellidos = resultados.getString("apellidos");
          int telefono = resultados.getInt("telefono");
          String direccion = resultados.getString("direccion");
          String correo = resultados.getString("correo");
          
          Persona persona = new Persona(cedula, nombre, apellidos, telefono, direccion, correo);
          personas.add(persona);
        }
          
        statement.close();
        conexion.close();
        return personas;
    }

    private int getCedula() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getApellidos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int getTelefono() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getDireccion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getCorreo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
