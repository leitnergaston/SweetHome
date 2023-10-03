
package accesoADatos;

import entidades.*;
import java.time.LocalDate;


public class ContratoData {
    private int id_contrato;
    Inquilino Inquilino;
    private LocalDate fecha_realizacion;
    private LocalDate fecha_inicio;
    private LocalDate fecha_final;
    private char marca;
    Propiedades Propiedades;
    private String vendedor;

    public ContratoData() {
    }

    public ContratoData(Inquilino Inquilino, LocalDate fecha_realizacion, LocalDate fecha_inicio, LocalDate fecha_final, char marca, Propiedades Propiedades, String vendedor) {
        this.Inquilino = Inquilino;
        this.fecha_realizacion = fecha_realizacion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
        this.marca = marca;
        this.Propiedades = Propiedades;
        this.vendedor = vendedor;
    }

    public ContratoData(int id_contrato, Inquilino Inquilino, LocalDate fecha_realizacion, LocalDate fecha_inicio, LocalDate fecha_final, char marca, Propiedades Propiedades, String vendedor) {
        this.id_contrato = id_contrato;
        this.Inquilino = Inquilino;
        this.fecha_realizacion = fecha_realizacion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
        this.marca = marca;
        this.Propiedades = Propiedades;
        this.vendedor = vendedor;
    }

    public int getId_contrato() {
        return id_contrato;
    }

    public void setId_contrato(int id_contrato) {
        this.id_contrato = id_contrato;
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

    public char getMarca() {
        return marca;
    }

    public void setMarca(char marca) {
        this.marca = marca;
    }

    public Propiedades getPropiedades() {
        return Propiedades;
    }

    public void setPropiedades(Propiedades Propiedades) {
        this.Propiedades = Propiedades;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }
    
    private void buscarContrato(){
        
    }
    
    private void cancelacion(){
        
    }
    
    private void crearContrato(){
        
    }
    
    private void renovacionContrato(){
        
    }
    

    @Override
    public String toString() {
        return "ContratoDeAlquiler{" + "id_contrato=" + id_contrato + ", Inquilino=" + Inquilino + ", fecha_realizacion=" + fecha_realizacion + ", fecha_inicio=" + fecha_inicio + ", fecha_final=" + fecha_final + ", marca=" + marca + ", Propiedades=" + Propiedades + ", vendedor=" + vendedor + '}';
    }
    
    
}
