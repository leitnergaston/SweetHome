
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
    private boolean renovación;
    
    
    public Contrato() {
    }

    public Contrato(int idContrato, Inmueble Propiedades, Inquilino Inquilino, LocalDate fechaInicio, LocalDate fechaFinal, double precioAlquiler, boolean vigente, boolean renovación) {
        this.idContrato = idContrato;
        this.inmueble = Propiedades;
        this.inquilino = Inquilino;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.precioAlquiler = precioAlquiler;
        this.vigente = vigente;
        this.renovación = renovación;
    }

    public Contrato(Inmueble Propiedades, Inquilino Inquilino, LocalDate fechaInicio, LocalDate fechaFinal, double precioAlquiler, boolean vigente, boolean renovación) {
        this.inmueble = Propiedades;
        this.inquilino = Inquilino;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.precioAlquiler = precioAlquiler;
        this.vigente = vigente;
        this.renovación = renovación;
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

    public boolean isRenovación() {
        return renovación;
    }

    public void setRenovación(boolean renovación) {
        this.renovación = renovación;
    }

    @Override
    public String toString() {
        return "Contrato{" + "Propiedades=" + inmueble + ", fecha_inicio=" + fechaInicio + ", precioAlquiler=" + precioAlquiler + ", vigente=" + vigente + '}';
    }
    
    
   
    
}
