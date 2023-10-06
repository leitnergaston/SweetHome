package inmobiliaria32;

import accesoADatos.Conexion;
import accesoADatos.InmuebleData;
import accesoADatos.InquilinoData;
import accesoADatos.PropietarioData;
import entidades.Inmueble;
import entidades.Inquilino;
import entidades.Propietario;
import java.sql.Connection;
import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {
        Connection con = Conexion.getConnection();
        
        PropietarioData proData = new PropietarioData();
        InquilinoData inqData = new InquilinoData();
        InmuebleData inmData = new InmuebleData();
        
        Propietario propietario = new Propietario(1, 111, "lopez", "mario", "calle 42", "2619845784", "lopezmario@mail.com", true);
        Inquilino inquilino = new Inquilino(2, "maria", "Angeles", 0011100, "ciudad", 010101, "pablo", true);
        Inmueble inmueble = new Inmueble(propietario, inquilino, "palmeras 23", "depto", 400, 80000, "centro", true);
        Inmueble inmueble2 = new Inmueble(null, null, "plaza 45", "casa", 650, 120000, "centro", true);

        //proData.crearPropietario(propietario);
        //inqData.agregarInquilino(inquilino);
        //inmData.crearInmueble(inmueble2);
        proData.crearPropietario(propietario);

        /*
        
        ArrayList<Inmueble> listaInm =  inmData.listarInmueblesPorParametros("depto", 300, 10000, 100000,  "centro");
        
        for(Inmueble inmuebleFor : listaInm){
            System.out.println(inmuebleFor);
        }
        
         */
//        Inmueble inmueble3 = inmData.buscarInmueble(5);
//        
//        System.out.println(inmueble3);
    }
    
}
