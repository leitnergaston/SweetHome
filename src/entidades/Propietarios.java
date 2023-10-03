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
public class Propietarios {
    
    private int idPropietario;
    private int dni;
    private String apellido;
    private String nombre;
    private String domicilio;
    private int telefono;
    private String mail;
   ArrayList<Propiedades> propiedad = new ArrayList<>();

    public Propietarios() {
    }

    public Propietarios(int idPropietario, int dni, String apellido, String nombre, String domicilio, int telefono, String mail) {
        this.idPropietario = idPropietario;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.mail = mail;
    }

    public Propietarios(int dni, String apellido, String nombre, String domicilio, int telefono, String mail) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.mail = mail;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public ArrayList<Propiedades> getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(ArrayList<Propiedades> propiedad) {
        this.propiedad = propiedad;
    }

    @Override
    public String toString() {
        return "Propietarios{" + "dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre + '}';
    }

    
      
}
