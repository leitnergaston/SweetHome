
package inmobiliaria32;

import accesoADatos.*;
import entidades.*;
import java.sql.Connection;
import java.time.LocalDate;


public class Inmobiliaria32 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("El main");
        
        Connection con = Conexion.getConnection();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Inmueble inmueble = new Inmueble(1,null, null, "Calle Falsa 123", "casa falsa", 50, 100000, "San Justo", true);
        Inquilino inquilino = new Inquilino(1,"Juan", "Cabral", 20654123782L, "San Justo", 126547, "Juana", true);
        Contrato contrato = new Contrato(inmueble,inquilino,LocalDate.of(2000, 5, 2),LocalDate.of(2003,5,2),100000,true,false);
        ContratoData contratoData = new ContratoData();
        contratoData.crearContrato(contrato);
        
    }
    
}
