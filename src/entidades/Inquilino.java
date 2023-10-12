
package entidades;

import java.util.ArrayList;


public class Inquilino {
    
    private int idInquilino;
    private long cuit;
    private String apellido;
    private String nombre;
    private String lugarDeTrabajo;
    private int dniGarante;
    private String nombreGarante;
    private boolean estado; 

    public Inquilino() {
    }

    public Inquilino(int idInquilino, String nombre, String apellido, long cuit, String lugarDeTrabajo, int dniGarante, String nombreGarante, boolean estado) {
        this.idInquilino = idInquilino;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuit = cuit;
        this.lugarDeTrabajo = lugarDeTrabajo;
        this.dniGarante = dniGarante;
        this.nombreGarante = nombreGarante;
        this.estado = estado;
    }

    public Inquilino(String nombre, String apellido, long cuit, String lugarDeTrabajo, int dniGarante, String nombreGarante, boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuit = cuit;
        this.lugarDeTrabajo = lugarDeTrabajo;
        this.dniGarante = dniGarante;
        this.nombreGarante = nombreGarante;
        this.estado = estado;
    }

    public int getIdInquilino() {
        return idInquilino;
    }

    public void setIdInquilino(int idInquilino) {
        this.idInquilino = idInquilino;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public String getLugarDeTrabajo() {
        return lugarDeTrabajo;
    }

    public void setLugarDeTrabajo(String lugarDeTrabajo) {
        this.lugarDeTrabajo = lugarDeTrabajo;
    }

    public int getDniGarante() {
        return dniGarante;
    }

    public void setDniGarante(int dniGarante) {
        this.dniGarante = dniGarante;
    }

    public String getNombreGarante() {
        return nombreGarante;
    }

    public void setNombreGarante(String nombreGarante) {
        this.nombreGarante = nombreGarante;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        return   nombre + " " + apellido + " " + cuit ;
    }
    
    
    }

    