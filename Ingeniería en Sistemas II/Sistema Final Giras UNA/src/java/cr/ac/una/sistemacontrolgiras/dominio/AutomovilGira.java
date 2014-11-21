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
public class AutomovilGira {

    private int consecutivo;
    private String placaAuto;
    private String fechaReservada;
    private String fechaRegreso;

    public AutomovilGira(int consecutivo, String placaAuto, String fechaReservada, String fechaRegreso) {
        this.consecutivo = consecutivo;
        this.placaAuto = placaAuto;
        this.fechaReservada = fechaReservada;
        this.fechaRegreso = fechaRegreso;
    }
    
    public AutomovilGira()
    {
    }

    public int getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getPlacaAuto() {
        return placaAuto;
    }

    public void setPlacaAuto(String placaAuto) {
        this.placaAuto = placaAuto;
    }

    public String getFechaReservada() {
        return fechaReservada;
    }

    public void setFechaReservada(String fechaReservada) {
        this.fechaReservada = fechaReservada;
    }
    
     public String getFechaRegreso() {
        return fechaRegreso;
    }

    public void setFechaRegreso(String fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }
    
    
    
    
}
