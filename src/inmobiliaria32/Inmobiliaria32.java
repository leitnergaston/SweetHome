
package inmobiliaria32;

import accesoADatos.Conexion;
import java.sql.Connection;


public class Inmobiliaria32 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("El main");
        
        Connection con = Conexion.getConnection();
    }
    
}
