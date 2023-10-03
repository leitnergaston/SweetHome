/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesoADatos;

import entidades.Propietarios;
import java.sql.Connection;

/**
 *
 * @author estudiante
 */
public class PropietarioData {
    
// Atributo tipo connection para poder usar sentencias sql
    private Connection con = null;

    public PropietarioData() {
        
        // Inicializar la variable `con` de la clase Conexion
        //accedemos al metodo getConnection q se encarga de cargar drivers y establecer conexion a la bd
        con = Conexion.getConnection();
    }

    public void agregarPropietario(Propietarios propietario){
        /*String sql = "INSERT INTO `propietarios`(`idPropietario`, `dni`, `apellido`, `nombre`, `domicilio`, `contacto`, `idInmueble`) "
        + "VALUES (null,?,?,?,?,?,?)";*/
    }
    public Propietarios buscarPropietario(int dni){
        Propietarios dueño = null;
        return dueño;
    }
    
    public void modificarPropietario(){
        
    }
}
