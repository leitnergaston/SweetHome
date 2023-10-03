package entidades;

import java.util.ArrayList;

public class Propiedades {

    private int id_Propietario;
    private String nombre;
    private String apellido;
    private int DNI;
    private String domicilio;
    private int telefono;
//     ArrayList<Propiedades> pro = new ArrayList<>();

    public Propiedades() {
    }

    public Propiedades(int id_Propietario, String nombre, String apellido, int DNI, String domicilio, int telefono) {
        this.id_Propietario = id_Propietario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public Propiedades(String nombre, String apellido, int DNI, String domicilio, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public int getId_Propietario() {
        return id_Propietario;
    }

    public void setId_Propietario(int id_Propietario) {
        this.id_Propietario = id_Propietario;
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

    public void agregarPropietario() {

    }

    public void buscarPropietario() {

    }

    public void modificarPropietarios() {

    }

    @Override
    public String toString() {
        return "Propiedades{" + "id_Propietario=" + id_Propietario + ", nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", domicilio=" + domicilio + ", telefono=" + telefono + '}';
    }

}
