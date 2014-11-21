/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cr.ac.una.sistemacontrolgiras.Dominio;

/**
 *
 * @author Diego
 */
public class Usuario {
    
    private int cedula;
    private String nombre;
    private String apellidos;
    private String puesto;
    private int telefono;
    private String direccion;
    private String usuario;
    private String contrasena;
    private String fechaInicio;
    private String fechaFinal;

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

     public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Usuario(int cedula, String nombre, String apellidos, String puesto, int telefono, String direccion, String usuario, String contrasena, String fechaInicio, String fechaFinal) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.puesto = puesto;
        this.telefono = telefono;
        this.direccion = direccion;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

 
    
    public Usuario()
    {
      
    }
    
    
}
