package accesoADatos;

import java.sql.*;
import entidades.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class ContratoData {
    private Connection con;
    private InquilinoData inquilinoData;
    private PropietarioData propietarioData;
    
    public ContratoData(){
        con = Conexion.getConnection();
    }
    
    //MÉTODO CREAR CONTRATO
    public void crearContrato(Contrato contrato){
        try {
            String sql = "INSERT INTO contratodealquiler "
                    + "VALUES (null,?,?,?,?,?,?,?)";

            PreparedStatement ps;
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, contrato.getInmueble().getIdInmueble());
            ps.setInt(2, contrato.getInquilino().getIdInquilino());
            ps.setDate(3, Date.valueOf(contrato.getFechaInicio()));
            ps.setDate(4, Date.valueOf(contrato.getFechaFinal()));
            ps.setDouble(5, contrato.getPrecioAlquiler());
            ps.setBoolean(6, contrato.isVigente());
            ps.setBoolean(7, contrato.isRenovación());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                contrato.setIdContrato(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Contrato creado exitosamente");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse con la tabla contratodealquiler: "+ex.getMessage());
        }
    }
}
