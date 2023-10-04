package entidades;

import java.util.ArrayList;

public class Inmueble {
    
    private int idInmueble;
    private Propietario propietario;
    private Inquilino inquilino;
    private String direccion;
    private String tipo;
    private double superficie;
    private double precio;
    private String zona;
    private boolean disponible;

    public Inmueble() {
    }

    public Inmueble(int idInmueble, Propietario propietario, Inquilino inquilino, String direccion, String tipo, double superficie, double precio, String zona, boolean disponible) {
        this.idInmueble = idInmueble;
        this.propietario = propietario;
        this.inquilino = inquilino;
        this.direccion = direccion;
        this.tipo = tipo;
        this.superficie = superficie;
        this.precio = precio;
        this.zona = zona;
        this.disponible = disponible;
    }

    public Inmueble(Propietario propietario, Inquilino inquilino, String direccion, String tipo, double superficie, double precio, String zona, boolean disponible) {
        this.propietario = propietario;
        this.inquilino = inquilino;
        this.direccion = direccion;
        this.tipo = tipo;
        this.superficie = superficie;
        this.precio = precio;
        this.zona = zona;
        this.disponible = disponible;
    }

    

    public int getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Propiedades{" + "direccion=" + direccion + ", tipo=" + tipo + ", disponible=" + disponible + '}';
    }
    
    
   
}
