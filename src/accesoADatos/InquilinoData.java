package accesoADatos;

import entidades.Inquilino;
import java.sql.*;
import javax.swing.JOptionPane;

public class InquilinoData {

    // Atributo tipo connection para usar sentencias sql
    private Connection con = null;

    // Constructor
    public InquilinoData() {

        // Inicializar la variable con que la obtenemos de la clase Conexion y accedemos al metodo getConnection q carga los drivers
        con = Conexion.getConnection();
    }

    // ====== METODO AGREGAR INQUILINO ======//
    public void agregarInquilino(Inquilino inquilino) {

        
    }

    //====== METODO ELIMINAR INQUILINO ======//
    public void eliminarInquilino(int cuit) {

        
    }

    //====== METODO MODIFICAR INQUILINO ======//
    //====== METODO BUSCAR INQUILINO ======//
    //====== METODO MULTAR INQUILINO ======//
}
