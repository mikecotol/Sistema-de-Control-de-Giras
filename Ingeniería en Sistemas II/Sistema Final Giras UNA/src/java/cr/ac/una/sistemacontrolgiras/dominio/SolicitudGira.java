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
public class SolicitudGira 
{
     private int consecutivo;
    private String ambitoGira;
    private String carrera;
    private String nombreAcademico;
    private String provincia;
    private String canton;
    private String distritio;
    private String fechaSalida;
    private String horaSalida;
    private String fechaRegreso;
    private String horaRegreso; 
    private String itinerario;   
    private String lugarHospedaje;
    private int diasHospedaje;
    private String objetivoGira; 
    private boolean respuesta;
    private String descripción;
    private String participantes;

    public SolicitudGira() {
    }

    public SolicitudGira(int consecutivo, String ambitoGira, String carrera, String nombreAcademico, String provincia, String canton, String distritio, String fechaSalida, String horaSalida, String fechaRegreso, String horaRegreso, String itinerario, String lugarHospedaje, int diasHospedaje, String objetivoGira, boolean respuesta, String descripción, String participantes) {
        this.consecutivo = consecutivo;
        this.ambitoGira = ambitoGira;
        this.carrera = carrera;
        this.nombreAcademico = nombreAcademico;
        this.provincia = provincia;
        this.canton = canton;
        this.distritio = distritio;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.fechaRegreso = fechaRegreso;
        this.horaRegreso = horaRegreso;
        this.itinerario = itinerario;
        this.lugarHospedaje = lugarHospedaje;
        this.diasHospedaje = diasHospedaje;
        this.objetivoGira = objetivoGira;
        this.respuesta = respuesta;
        this.descripción = descripción;
        this.participantes = participantes;
    }

    public SolicitudGira(String ambitoGira, String carrera, String nombreAcademico, String provincia, String canton, String distritio, String fechaSalida, String horaSalida, String fechaRegreso, String horaRegreso, String itinerario, String lugarHospedaje, int diasHospedaje, String objetivoGira, String participantes) {
        this.ambitoGira = ambitoGira;
        this.carrera = carrera;
        this.nombreAcademico = nombreAcademico;
        this.provincia = provincia;
        this.canton = canton;
        this.distritio = distritio;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.fechaRegreso = fechaRegreso;
        this.horaRegreso = horaRegreso;
        this.itinerario = itinerario;
        this.lugarHospedaje = lugarHospedaje;
        this.diasHospedaje = diasHospedaje;
        this.objetivoGira = objetivoGira;
        this.participantes = participantes;
    }
    
    public int getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getAmbitoGira() {
        return ambitoGira;
    }

    public void setAmbitoGira(String ambitoGira) {
        this.ambitoGira = ambitoGira;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNombreAcademico() {
        return nombreAcademico;
    }

    public void setNombreAcademico(String nombreAcademico) {
        this.nombreAcademico = nombreAcademico;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getDistritio() {
        return distritio;
    }

    public void setDistritio(String distritio) {
        this.distritio = distritio;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getFechaRegreso() {
        return fechaRegreso;
    }

    public void setFechaRegreso(String fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

    public String getHoraRegreso() {
        return horaRegreso;
    }

    public void setHoraRegreso(String horaRegreso) {
        this.horaRegreso = horaRegreso;
    }

    public String getItinerario() {
        return itinerario;
    }

    public void setItinerario(String itinerario) {
        this.itinerario = itinerario;
    }

    public String getLugarHospedaje() {
        return lugarHospedaje;
    }

    public void setLugarHospedaje(String lugarHospedaje) {
        this.lugarHospedaje = lugarHospedaje;
    }

    public int getDiasHospedaje() {
        return diasHospedaje;
    }

    public void setDiasHospedaje(int diasHospedaje) {
        this.diasHospedaje = diasHospedaje;
    }

    public String getObjetivoGira() {
        return objetivoGira;
    }

    public void setObjetivoGira(String objetivoGira) {
        this.objetivoGira = objetivoGira;
    }

    public boolean isRespuesta() {
        return respuesta;
    }

    public void setRespuesta(boolean respuesta) {
        this.respuesta = respuesta;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getParticipantes() {
        return participantes;
    }

    public void setParticipantes(String participantes) {
        this.participantes = participantes;
    }        
}
