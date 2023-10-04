
package entidades;

import java.util.ArrayList;


public class Inquilino {
    
    private int id_Inquilino;
    private String nombre;
    private String apellido;
    private long cuit;
    private String lugarDeTrabajo;
    private int dniGarante;
    private String nombreGarante;
    ArrayList<Inmueble> pro = new ArrayList<>();
    private boolean estado; 

    public Inquilino() {
        }

    public Inquilino(int id_Inquilino, String nombre, String apellido, long cuit, String lugarDeTrabajo, int dniGarante, String nombreGarante, boolean estado) {
        this.id_Inquilino = id_Inquilino;
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

    public int getId_Inquilino() {
        return id_Inquilino;
    }

    public void setId_Inquilino(int id_Inquilino) {
        this.id_Inquilino = id_Inquilino;
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

    public ArrayList<Inmueble> getPro() {
        return pro;
    }

    public void setPro(ArrayList<Inmueble> pro) {
        this.pro = pro;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Inquilino{" + "nombre=" + nombre + ", apellido=" + apellido + ", cuit=" + cuit + '}';
    }
    
    
    }

    