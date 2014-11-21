/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cr.ac.una.sistemacontrolgiras.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego
 */
public class BaseData {
    
      private Connection conexion;
    private final String url;
    private final String contra;
    private final String usuario;
    private final String Servidor;
    
    public BaseData()
    {
        usuario="root";
        contra="";
        Servidor="jdbc:mysql://localhost/bdgirasuna";
        url= "com.mysql.jdbc.Driver";
    }
    
    public Connection getConexion() throws SQLException
    {
        try {
            Class.forName(url);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BaseData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.conexion=(Connection)DriverManager.getConnection(Servidor, usuario, contra);
        System.out.println("Conexion realizada con éxito");
        return this.conexion;
    }
}
