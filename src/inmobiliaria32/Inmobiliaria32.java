
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
 
        //PRUEBA CONTRATODATA 
        /*
        --------crearContrato(FUNCIONA)---------
        
        Inmueble inmueble = new Inmueble(1,null, null, "Calle Falsa 123", "casa falsa", 50, 100000, "San Justo", true);
        Inquilino inquilino = new Inquilino(1,"Juan", "Cabral", 20654123782L, "San Justo", 126547, "Juana", true);
        Contrato contrato = new Contrato(inmueble,inquilino,LocalDate.of(2000, 5, 2),LocalDate.of(2003,5,2),100000,true,false);
        ContratoData contratoData = new ContratoData();
        contratoData.crearContrato(contrato);
        
        --------modificarContrato(FUNCIONA)------------
        
        Inmueble inmueble = new Inmueble(2,null, null, "Calle Falsa 123", "casa falsa", 50, 100000, "San Justo", true);
        Inquilino inquilino = new Inquilino(1,"Juan", "Cabral", 20654123782L, "San Justo", 126547, "Juana", true);
        Contrato contrato = new Contrato(3,inmueble,inquilino,LocalDate.of(2010, 5, 2),LocalDate.of(2013,5,2),100000,false,false);
        ContratoData contratoData = new ContratoData();
        contratoData.modificarContrato(contrato);
        
        --------eliminarContrato(FUNCIONA)------------
        ContratoData contratoData = new ContratoData();
        contratoData.eliminarContrato(3);
        */
        

        //PRUEBA INQUILINODATA
        /*Inquilino inq1 = new Inquilino("pepe", "juan", 741056, "toledo", 468004, 
                "marco", true);
        InquilinoData inqData = new InquilinoData();
        inqData.agregarInquilino(inq1);*/
        
        //PRUEBA INQUILINO
        
//        Inquilino inquilino = new Inquilino(1,"pepe", "alberto", 1234, "toledo", 8874, "marco", true);
//        Inquilino inquilino2 = new Inquilino(1,"pepe", "alberto", 1234, "toledo", 8874, "marco", true);
//        InquilinoData inquilinoData = new InquilinoData();
//        //AGREGAR INQUILINO(FUNCIONA)
////        inquilinoData.agregarInquilino(inquilino);
//        //ELIMINAR INQUILINO(funciona)
////        inquilinoData.eliminarInquilino((int) inquilino.getCuit());
//       //MODIFICAR INQUILINO(FUNCIONA)
//       inquilinoData.modificarinquilino(inquilino);


        
        //PRUEBA PROPIETARIODATA
        
        //-------crearPropietario-----------
        
        Propietario propietario = new Propietario(2, 1111, "Perez", "Juana", "Peron 123", "11321456", "juan@mail.com", true);
        PropietarioData propietarioData = new PropietarioData();
        //propietarioData.crearPropietario(propietario); FUNCIONA
        //propietarioData.modificarPropietario(propietario); FUNCIONA
        //propietarioData.eliminarPropietario(1); FUNCIONA
        Propietario pro = propietarioData.buscarPropietarioPorId(1);
        System.out.println("Id: "+pro.getIdPropietario());
        System.out.println("DNI: "+pro.getDni());
        System.out.println("Apellido: "+pro.getApellido());
        System.out.println("Nombre: "+pro.getNombre());
        System.out.println("Domicilio: "+pro.getDomicilio());
        System.out.println("Teléfono: "+pro.getTelefono());
        System.out.println("eMail: "+pro.getMail());
        System.out.println("Estado: "+pro.isEstado());
        /*for(Inmueble inmueble: pro.getInmuebles()){
            System.out.println(inmueble);
        }*/
        
        
        
        
    }
    
}
