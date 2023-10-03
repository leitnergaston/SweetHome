/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author estudiante
 */
public class Propietarios {
    
    private int idPropietario;
    private String apellido;
    private int dni;
    private String nombre;
    private String domicilio;
    private int contacto;
    private Contrato idInmueble;

    public Propietarios() {
    }

    public Propietarios(int idPropietario, String apellido, int dni, String nombre, String domicilio, int contacto, Contrato idInmueble) {
        this.idPropietario = idPropietario;
        this.apellido = apellido;
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.contacto = contacto;
        this.idInmueble = idInmueble;
    }

    public Propietarios(String apellido, int dni, String nombre, String domicilio, int contacto, Contrato idInmueble) {
        this.apellido = apellido;
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.contacto = contacto;
        this.idInmueble = idInmueble;
    }

    public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    public Contrato getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(Contrato idInmueble) {
        this.idInmueble = idInmueble;
    }

    @Override
    public String toString() {
        return   "apellido=" + apellido + ", dni=" + dni + ", nombre=" + nombre + ", domicilio=" + domicilio ;
    }

      
}
