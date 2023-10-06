package accesoADatos;

import java.sql.*;
import entidades.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class ContratoData {

    private Connection con;
    private InquilinoData inquilinoData;
    private InmuebleData inmuebleData;

    public ContratoData() {
        con = Conexion.getConnection();
    }

    //==========MÉTODO CREAR CONTRATO==========//
    public void crearContrato(Contrato contrato) {
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
            ps.setBoolean(7, contrato.isRenovacion());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                contrato.setIdContrato(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Contrato creado exitosamente");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse con la tabla contratodealquiler: " + ex.getMessage());
        }
    }

    //==========MÉTODO MODIFICAR CONTRATO==========//
    public void modificarContrato(Contrato contrato) {
        try {
            String sql = "UPDATE contratodealquiler "
                    + "SET idInmueble=?, idInquilino=?, fechaInicio=?, fechaFinalizacion=?, "
                    + "precioAlquiler=?, vigente=?, renovado=? "
                    + "WHERE idContrato=?";

            PreparedStatement ps;
            ps = con.prepareStatement(sql);
            ps.setInt(1, contrato.getInmueble().getIdInmueble());
            ps.setInt(2, contrato.getInquilino().getIdInquilino());
            ps.setDate(3, Date.valueOf(contrato.getFechaInicio()));
            ps.setDate(4, Date.valueOf(contrato.getFechaFinal()));
            ps.setDouble(5, contrato.getPrecioAlquiler());
            ps.setBoolean(6, contrato.isVigente());
            ps.setBoolean(7, contrato.isRenovacion());
            ps.setInt(8, contrato.getIdContrato());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Contrato modificado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "El contrato que intenta modificar no se encuentra en la base de datos");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse con la tabla contratodealquiler: " + ex.getMessage());
        }
    }

    //==========MÉTODO ELIMINAR CONTRATO==========//
    public void eliminarContrato(int id) {
        try {
            String sql = "UPDATE contratoDeAlquiler "
                    + "SET vigente=0 "
                    + "WHERE idContrato = ? AND vigente=1";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Contrato eliminado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "El contrato que intenta eliminar no está vigente "
                        + "o no se encuentra en la base de datos");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse con la tabla contratodealquiler: " + ex.getMessage());
        }
    }

    //==========MÉTODO BUSCAR CONTRATO POR ID==========//
    public Contrato buscarContratoPorId(int id) {
        Contrato contrato = null;
        inquilinoData = new InquilinoData();
        inmuebleData = new InmuebleData();
        try {
            String sql = "SELECT * FROM contratodealquiler WHERE idContrato = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                contrato = new Contrato();
                contrato.setIdContrato(rs.getInt("idContrato"));
                contrato.setInmueble(inmuebleData.buscarInmueble(rs.getInt("idInmueble")));
                contrato.setInquilino(inquilinoData.buscarInquilinoPorId(rs.getInt("idInquilino")));
                contrato.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                contrato.setFechaFinal(rs.getDate("fechaFinalizacion").toLocalDate());
                contrato.setPrecioAlquiler(rs.getDouble("precioAlquiler"));
                contrato.setVigente(rs.getBoolean("vigente"));
                contrato.setRenovacion(rs.getBoolean("renovado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe ningún contrato con ese Id");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse con la tabla contratodealquiler: " + ex.getMessage());
        }

        return contrato;

    }

    //==========MÉTODO BUSCAR CONTRATO POR INMUEBLE==========//
    public ArrayList<Contrato> listarContratosPorInmueble(int idInmueble) {
        ArrayList<Contrato> contratos = new ArrayList<>();
        Contrato contrato;
        inquilinoData = new InquilinoData();
        inmuebleData = new InmuebleData();
        try {
            String sql = "SELECT * FROM contratodealquiler WHERE idInmueble = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idInmueble);
            ResultSet rs = ps.executeQuery();
            boolean bandera = false;
            while (rs.next()) {
                contrato = new Contrato();
                contrato.setIdContrato(rs.getInt("idContrato"));
                contrato.setInmueble(inmuebleData.buscarInmueble(rs.getInt("idInmueble")));
                contrato.setInquilino(inquilinoData.buscarInquilinoPorId(rs.getInt("idInquilino")));
                contrato.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                contrato.setFechaFinal(rs.getDate("fechaFinalizacion").toLocalDate());
                contrato.setPrecioAlquiler(rs.getDouble("precioAlquiler"));
                contrato.setVigente(rs.getBoolean("vigente"));
                contrato.setRenovacion(rs.getBoolean("renovado"));
                contratos.add(contrato);
                bandera = true;
            }
            if(!bandera){
                JOptionPane.showMessageDialog(null, "No existe ningún contrato asociado con ese inmueble");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse con la tabla contratodealquiler: " + ex.getMessage());
        }

        return contratos;
    }
    
    //==========MÉTODO BUSCAR CONTRATOS VIGENTES==========//
    public ArrayList<Contrato> listarContratosVigentes(){
        ArrayList<Contrato> contratos = new ArrayList<>();
        Contrato contrato;
        inquilinoData = new InquilinoData();
        inmuebleData = new InmuebleData();
        try {
            String sql = "SELECT * FROM contratodealquiler WHERE vigente = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            boolean bandera = false;
            while (rs.next()) {
                contrato = new Contrato();
                contrato.setIdContrato(rs.getInt("idContrato"));
                contrato.setInmueble(inmuebleData.buscarInmueble(rs.getInt("idInmueble")));
                contrato.setInquilino(inquilinoData.buscarInquilinoPorId(rs.getInt("idInquilino")));
                contrato.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                contrato.setFechaFinal(rs.getDate("fechaFinalizacion").toLocalDate());
                contrato.setPrecioAlquiler(rs.getDouble("precioAlquiler"));
                contrato.setVigente(rs.getBoolean("vigente"));
                contrato.setRenovacion(rs.getBoolean("renovado"));
                contratos.add(contrato);
                bandera = true;
            }
            if(!bandera){
                JOptionPane.showMessageDialog(null, "En este momento no hay ningún contrato vigente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse con la tabla contratodealquiler: " + ex.getMessage());
        }

        return contratos;
    }
    
}
