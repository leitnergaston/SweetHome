
package entidades;

import java.time.LocalDate;

public class Contrato {
    
    private int idContrato;
    private Inmueble inmueble;
    private Inquilino inquilino;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private double precioAlquiler;
    private boolean vigente;
    private boolean renovacion;
    
    
    public Contrato() {
    }

    public Contrato(int idContrato, Inmueble inmueble, Inquilino Inquilino, LocalDate fechaInicio, LocalDate fechaFinal, double precioAlquiler, boolean vigente, boolean renovacion) {
        this.idContrato = idContrato;
        this.inmueble = inmueble;
        this.inquilino = Inquilino;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.precioAlquiler = precioAlquiler;
        this.vigente = vigente;
        this.renovacion = renovacion;
    }

    public Contrato(Inmueble inmueble, Inquilino Inquilino, LocalDate fechaInicio, LocalDate fechaFinal, double precioAlquiler, boolean vigente, boolean renovacion) {
        this.inmueble = inmueble;
        this.inquilino = Inquilino;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.precioAlquiler = precioAlquiler;
        this.vigente = vigente;
        this.renovacion = renovacion;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public void setInquilino(Inquilino Inquilino) {
        this.inquilino = Inquilino;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }

    public boolean isRenovacion() {
        return renovacion;
    }

    public void setRenovacion(boolean renovacion) {
        this.renovacion = renovacion;
    }

    @Override
    public String toString() {
        return "Contrato{" + "idContrato=" + idContrato + ", inmueble=" + inmueble + ", inquilino=" + inquilino + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + ", precioAlquiler=" + precioAlquiler + ", vigente=" + vigente + ", renovacion=" + renovacion + '}';
    }

   
    
   
    
}
