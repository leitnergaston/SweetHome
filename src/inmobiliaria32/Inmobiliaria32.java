
package inmobiliaria32;

import accesoADatos.Conexion;
import accesoADatos.InquilinoData;
import entidades.Inquilino;
import java.sql.Connection;


public class Inmobiliaria32 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("El main");
        
        Connection con = Conexion.getConnection();
        Inquilino inq = new Inquilino("pepe", "juan", 741056, "toledo", 468004, 
                "marco", true);
        InquilinoData inqData = new InquilinoData();
        inqData.agregarInquilino(inq);
        
    }
    
}
