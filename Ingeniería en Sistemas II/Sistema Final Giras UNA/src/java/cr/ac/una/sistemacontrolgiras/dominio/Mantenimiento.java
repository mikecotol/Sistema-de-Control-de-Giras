/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cr.ac.una.sistemacontrolgiras.Dominio;

/**
 *
 * @author Mike
 */
public class Mantenimiento 
{
    private String placa;
    private String descripcion;

    public Mantenimiento() {
    }

    public Mantenimiento(String placa, String descripcion) {
        this.placa = placa;
        this.descripcion = descripcion;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
