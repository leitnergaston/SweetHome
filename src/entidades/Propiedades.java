package entidades;

import java.util.ArrayList;

public class Propiedades {
    
    private int idInmueble;
    private Propietarios id_Propietario;
    private Inquilino id_Inquilino;
    private String nombre;
    private String apellido;
    private int DNI;
    private String domicilio;
    private int telefono;
//     ArrayList<Propiedades> pro = new ArrayList<>();

    public Propiedades() {
    }

    public Propiedades(int idInmueble, Propietarios id_Propietario, Inquilino id_Inquilino, String nombre, String apellido, int DNI, String domicilio, int telefono) {
        this.idInmueble = idInmueble;
        this.id_Propietario = id_Propietario;
        this.id_Inquilino = id_Inquilino;
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }
    
    
    public Propiedades(Propietarios id_Propietario, Inquilino id_Inquilino, String nombre, String apellido, int DNI, String domicilio, int telefono) {
        this.id_Propietario = id_Propietario;
        this.id_Inquilino = id_Inquilino;
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public int getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
    }

    public Propietarios getId_Propietario() {
        return id_Propietario;
    }

    public void setId_Propietario(Propietarios id_Propietario) {
        this.id_Propietario = id_Propietario;
    }

    public Inquilino getId_Inquilino() {
        return id_Inquilino;
    }

    public void setId_Inquilino(Inquilino id_Inquilino) {
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

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
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

    @Override
    public String toString() {
        return "Propiedades{" + "nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + '}';
    }

    
  
}
