/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class Propietario {
    
    private int idPropietario;
    private int dni;
    private String apellido;
    private String nombre;
    private String domicilio;
    private String telefono;
    private String mail;
    private ArrayList<Inmueble> inmuebles;
    private boolean estado;
    
    public Propietario() {
    }

    public Propietario(int idPropietario, int dni, String apellido, String nombre, String domicilio, String telefono, String mail, boolean estado) {
        this.idPropietario = idPropietario;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.mail = mail;
        inmuebles = new ArrayList<>();
        this.estado = estado;
    }

    public Propietario(int dni, String apellido, String nombre, String domicilio, String telefono, String mail, boolean estado) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.mail = mail;
        inmuebles = new ArrayList<>();
        this.estado = estado;
    }

    public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public ArrayList<Inmueble> getInmuebles() {
        return inmuebles;
    }

    public void setInmuebles(ArrayList<Inmueble> inmuebles) {
        this.inmuebles = inmuebles;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    public void agregarInmueble(Inmueble inmueble){
        inmuebles.add(inmueble);
    }

    @Override
    public String toString() {
        return "Propietarios{" + "dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre + '}';
    }

    
      
}
