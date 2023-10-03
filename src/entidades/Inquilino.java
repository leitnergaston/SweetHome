
package entidades;

import java.util.ArrayList;


public class Inquilino {
    private int id_Inquilino;
    private String nombre;
    private String apellido;
    private int DNI;
    private char caracter;
    ArrayList<Propiedades> pro = new ArrayList<>();
    private char tipo; 

    public Inquilino() {
    }

    public Inquilino(int id_Inquilino, String nombre, String apellido, int DNI, char caracter, char tipo) {
        this.id_Inquilino = id_Inquilino;
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.caracter = caracter;
        this.tipo = tipo;
    }

    public Inquilino(String nombre, String apellido, int DNI, char caracter, char tipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.caracter = caracter;
        this.tipo = tipo;
    }

    public int getId_Inquiolino() {
        return id_Inquilino;
    }

    public void setId_Inquiolino(int id_Inquilino) {
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

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public ArrayList<Propiedades> getPro() {
        return pro;
    }

    public void setPro(ArrayList<Propiedades> pro) {
        this.pro = pro;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    
    public void agregarInquilino(){
        
    }
    
    public void eliminarInquilino(){
        
    }
    
    public void buscarInquilino(){
        
    }
    
    public void modificarDatos(){
        
    }
    
    public boolean multarInquilino(){
        
        return false;
    }

    @Override
    public String toString() {
        return "Inquilino{" + "id_Inquiolino=" + id_Inquilino + ", nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", caracter=" + caracter + ", pro=" + pro + ", tipo=" + tipo + '}';
    }
}


