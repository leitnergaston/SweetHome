
package entidades;

import java.time.LocalDate;

public class Contrato {
    
    private int id_contrato;
    private Propiedades Propiedades;
    private Inquilino Inquilino;
    private LocalDate fecha_realizacion;
    private LocalDate fecha_inicio;
    private LocalDate fecha_final;
    private double precioAlquiler;
    private boolean vigente;
    private boolean renovación;
    
    
   

    public Contrato() {
    }

    public Contrato(int id_contrato, Propiedades Propiedades, Inquilino Inquilino, LocalDate fecha_realizacion, LocalDate fecha_inicio, LocalDate fecha_final, double precioAlquiler, boolean vigente, boolean renovación) {
        this.id_contrato = id_contrato;
        this.Propiedades = Propiedades;
        this.Inquilino = Inquilino;
        this.fecha_realizacion = fecha_realizacion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
        this.precioAlquiler = precioAlquiler;
        this.vigente = vigente;
        this.renovación = renovación;
    }

    public Contrato(Propiedades Propiedades, Inquilino Inquilino, LocalDate fecha_realizacion, LocalDate fecha_inicio, LocalDate fecha_final, double precioAlquiler, boolean vigente, boolean renovación) {
        this.Propiedades = Propiedades;
        this.Inquilino = Inquilino;
        this.fecha_realizacion = fecha_realizacion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
        this.precioAlquiler = precioAlquiler;
        this.vigente = vigente;
        this.renovación = renovación;
    }

    public Contrato(Propiedades Propiedades, LocalDate fecha_realizacion, LocalDate fecha_inicio, LocalDate fecha_final, double precioAlquiler, boolean vigente, boolean renovación) {
        this.Propiedades = Propiedades;
        this.fecha_realizacion = fecha_realizacion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
        this.precioAlquiler = precioAlquiler;
        this.vigente = vigente;
        this.renovación = renovación;
    }

    public int getId_contrato() {
        return id_contrato;
    }

    public void setId_contrato(int id_contrato) {
        this.id_contrato = id_contrato;
    }

    public Propiedades getPropiedades() {
        return Propiedades;
    }

    public void setPropiedades(Propiedades Propiedades) {
        this.Propiedades = Propiedades;
    }

    public Inquilino getInquilino() {
        return Inquilino;
    }

    public void setInquilino(Inquilino Inquilino) {
        this.Inquilino = Inquilino;
    }

    public LocalDate getFecha_realizacion() {
        return fecha_realizacion;
    }

    public void setFecha_realizacion(LocalDate fecha_realizacion) {
        this.fecha_realizacion = fecha_realizacion;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public LocalDate getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(LocalDate fecha_final) {
        this.fecha_final = fecha_final;
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
        return "Contrato{" + "Propiedades=" + Propiedades + ", fecha_inicio=" + fecha_inicio + ", precioAlquiler=" + precioAlquiler + ", vigente=" + vigente + '}';
    }
    
    
   
    
}
