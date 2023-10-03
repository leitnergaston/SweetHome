
package accesoADatos;

import entidades.Inquilino;
import java.sql.*;
import javax.swing.JOptionPane;


public class InquilinoData {
    
    // Atributo tipo connection para usar sentencias sql
    private Connection con = null;
    
    // Constructor
    public InquilinoData(){
        
        // Inicializar la variable con que la obtenemos de la clase Conexion y accedemos al metodo getConnection q carga los drivers
        con = Conexion.getConnection();
    }
    
    // ====== METODO AGREGAR INQUILINO ======//
    public void agregarInquilino(Inquilino inquilino){
        
        // Sentencia INSERT sql
        String sql = "INSERT INTO inquilinos (idInquilinos, cuit, nombre, apellido, lugarTrabajo, nombreGarante, dniGarante, idInmueble)"
                + " VALUES (null, ?, ?, ?, ?, ?, ?, ?)";
        
        try{
            
            // Generar el ps para enviar las sentencias sql
            // le pasamos la sentencia sql creada
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inquilijno");
        }
                
                
    }
}
