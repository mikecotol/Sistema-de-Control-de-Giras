
package cr.ac.una.sistemacontrolgiras.Data;

import cr.ac.una.sistemacontrolgiras.Dominio.AutomovilGira;
import cr.ac.una.sistemacontrolgiras.Dominio.Automovil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Mike
 */
public class AutomovilData extends BaseData
{
    public void insertarAutomoviles(Automovil automovil) throws SQLException
    {    
   
        Connection conexion = super.getConexion();

        String sql = "CALL insertarAutomovil(?,?,?,?,?,?,?)"; 

        PreparedStatement statement= conexion.prepareStatement(sql);  
        
        statement.setString(1, automovil.getPlaca());
        statement.setString(2, automovil.getMarca());
        statement.setString(3, automovil.getColor());
        statement.setString(4, automovil.getModelo());
        statement.setString(5, automovil.getCapacidad());
        statement.setString(6, automovil.getTipo());
        statement.setString(7, automovil.getEstado());
        
        statement.execute();      
        statement.close();
        conexion.close();

    }
    
    public LinkedList<Automovil> getAutomoviles() throws SQLException
     {
    
        LinkedList<Automovil> automoviles = new LinkedList<Automovil>();

        Connection conexion =super.getConexion();
        
        String query ="CALL seleccionarAutomoviles";

        PreparedStatement statement= conexion.prepareStatement(query);
        ResultSet resultados= statement.executeQuery();

        while(resultados.next())
        {
          String placa = resultados.getString("placa");
          String marca = resultados.getString("marca");
          String color = resultados.getString("color");
          String modelo = resultados.getString("modelo");
          String capacidad = resultados.getString("capacidad");
          String tipo = resultados.getString("tipo");
          String estado = resultados.getString("estado");
          
          Automovil automovil = new Automovil(placa, marca, color, modelo, capacidad, tipo, estado);
          automoviles.add(automovil);
        }
          
        statement.close();
        conexion.close();
        return automoviles;
    }
    
     public boolean VerificarDisponibilidadAuto(String fechaSolicitud, String fechaRegresoSolicitud, String placa) throws SQLException {
        
        boolean respuesta = true;
        LinkedList<AutomovilGira> listaSolicitudes = new LinkedList<AutomovilGira>();
        String busqueda = "select * from tb_autoGira where placa = ?;";

        Connection conec = getConexion();

        PreparedStatement statement = conec.prepareStatement(busqueda);
        statement.setString(1, placa);
        ResultSet res = statement.executeQuery();
        while (res.next()) {

            AutomovilGira sol = new AutomovilGira();

            sol.setConsecutivo(res.getInt(1));
            sol.setPlacaAuto(res.getString(2));
            sol.setFechaReservada(res.getString(3));
            sol.setFechaRegreso(res.getString(4));
            listaSolicitudes.add(sol);

        }

  
        for (AutomovilGira ag : listaSolicitudes) 
        {
            int f = Integer.parseInt(ag.getFechaReservada());
            int s = Integer.parseInt(ag.getFechaRegreso());
            int fechaS = Integer.parseInt(fechaSolicitud);
            int fechaR = Integer.parseInt(fechaRegresoSolicitud);
            if((f==fechaS && s==fechaR)||(((fechaS>=f)&&(fechaR<=s))))
            {
                respuesta = false;
            }
            
        }

            return respuesta;

        }
    
    public void modificarAutomovil(Automovil sol) throws SQLException
     {
      
         String sql = "UPDATE tb_automovil SET placa=?, marca= ?, color=?, modelo=?, capacidad=?, tipo=?, estado=?"
                + " where placa =  '" + sol.getPlaca()+ "'"; 
        
        Connection conec = getConexion();
        PreparedStatement statement = conec.prepareStatement(sql);
        statement.setString(1, sol.getPlaca());
        statement.setString(2, sol.getMarca());
        statement.setString(3, sol.getColor());
        statement.setString(4, sol.getModelo());
        statement.setString(5, sol.getCapacidad());
        statement.setString(6, sol.getTipo());  
        statement.setString(7, sol.getEstado());
        
        statement.executeUpdate(); 
        
        statement.close();
        conec.close();
        
     }
    public void eliminarAutomovil(String placa) throws SQLException
    {
        Connection conexion =super.getConexion();

        String sql ="DELETE FROM tb_automovil"
                + " where placa =  '" + placa+ "'"; 
        
        PreparedStatement statement= conexion.prepareStatement(sql);  
       
        statement.execute();      
        statement.close();
        conexion.close();
    }
    
}
