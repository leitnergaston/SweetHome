package accesoADatos;

import entidades.Inmueble;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class InmuebleData {

    private Connection con;
    private InquilinoData inquilinoData;
    private PropietarioData propietarioData;

    public InmuebleData() {
        con = Conexion.getConnection();
    }

    //====== CREAR INMUEBLE ======//
    public void crearInmueble(Inmueble inmueble) {
        String sql = "INSERT INTO inmueble (idInmueble, idPropietario, idInquilino, direccion, tipo, superficie, precio, zona, disponible) "
                + "VALUES (null, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, inmueble.getPropietario().getIdPropietario());
            ps.setInt(2, inmueble.getInquilino().getIdInquilino());
            ps.setString(3, inmueble.getDireccion());
            ps.setString(4, inmueble.getTipo());
            ps.setDouble(5, inmueble.getSuperficie());
            ps.setDouble(6, inmueble.getPrecio());
            ps.setString(7, inmueble.getZona());
            ps.setBoolean(8, inmueble.isDisponible());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                inmueble.setIdInmueble(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inmueble creado con exito!");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inmueble " + ex.getMessage());
        }
    }

    //====== MODIFICAR INMUEBLE ======//
    public void modificarInmueble(Inmueble inmueble) {
        String sql = "UPDATE inmueble SET direccion = ?, tipo = ?, superficie = ?, precio = ?, zona = ?, disponible = ? WHERE idInmueble = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, inmueble.getDireccion());
            ps.setString(2, inmueble.getTipo());
            ps.setDouble(3, inmueble.getSuperficie());
            ps.setDouble(4, inmueble.getPrecio());
            ps.setString(5, inmueble.getZona());
            ps.setBoolean(6, inmueble.isDisponible());
            ps.setInt(7, inmueble.getIdInmueble());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "El inmueble no existe");
            }
            //ps.close(); nose si hace falta cerrar el ps
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inmueble " + ex.getMessage());
        }
    }

    //====== ELIMINAR INMUEBLE ======//
    public void eliminarInmueble(int id) {
        try {
            String sql = "UPDATE inmueble SET disponible = 0 WHERE id = ? AND disponible = 1";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se elminó el inmueble");
            } else {
                JOptionPane.showMessageDialog(null, "El inmueble no existe o ya fue dado de baja");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inmueble " + ex.getMessage());
        }
    }

    //====== BUSCAR INMUEBLE POR ID======//
    public Inmueble buscarInmueble(int id) {
        Inmueble inmueble = null;

        String sql = "SELECT idPropietario, idInquilino, direccion, tipo, superficie, precio, zona, disponible FROM inmueble WHERE idInmueble = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                inmueble = new Inmueble();
                inmueble.setIdInmueble(id);
                inmueble.setPropietario(propietarioData.buscarPropietarioPorId(rs.getInt("idPropietario")));
                inmueble.setInquilino(inquilinoData.buscarInquilinoPorId(rs.getInt("idInquilino")));
                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setTipo(rs.getString("tipo"));
                inmueble.setSuperficie(rs.getDouble("superficie"));;
                inmueble.setPrecio(rs.getDouble("precio"));
                inmueble.setZona(rs.getString("zona"));
                inmueble.setDisponible(rs.getBoolean("disponible"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inmueble " + ex.getMessage());
        }
        return inmueble;
    }

    //====== LISTAR INMUEBLES DISPONIBLES ======//
    public ArrayList<Inmueble> listarInmueblesDisponibles() {

        ArrayList<Inmueble> inmuebles = new ArrayList<>();

        try {
            String sql = "SELECT * FROM inmueble WHERE disponible = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inmueble inmueble = new Inmueble();
                inmueble.setIdInmueble(rs.getInt("idInmueble"));
                inmueble.setPropietario(propietarioData.buscarPropietarioPorId(rs.getInt("idPropietario")));
                inmueble.setInquilino(inquilinoData.buscarInquilinoPorId(rs.getInt("idInquilino")));
                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setTipo(rs.getString("tipo"));
                inmueble.setSuperficie(rs.getDouble("superficie"));
                inmueble.setPrecio(rs.getDouble("precio"));
                inmueble.setZona(rs.getString("zona"));
                inmueble.setDisponible(rs.getBoolean("disponible"));
                inmuebles.add(inmueble);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inmueble " + ex.getMessage());
        }
        return inmuebles;
    }

    //====== LISTAR INMUEBLES POR PROPIETARIO ======//
    public ArrayList<Inmueble> listarInmueblesPorPropietario(int id) {

        ArrayList<Inmueble> inmuebles = new ArrayList<>();

        try {
            String sql = "SELECT * FROM inmueble WHERE idPropietario = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inmueble inmueble = new Inmueble();
                inmueble.setIdInmueble(rs.getInt("idInmueble"));
                inmueble.setPropietario(propietarioData.buscarPropietarioPorId(rs.getInt("idPropietario")));
                inmueble.setInquilino(inquilinoData.buscarInquilinoPorId(rs.getInt("idInquilino")));
                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setTipo(rs.getString("tipo"));
                inmueble.setSuperficie(rs.getDouble("superficie"));
                inmueble.setPrecio(rs.getDouble("precio"));
                inmueble.setZona(rs.getString("zona"));
                inmueble.setDisponible(rs.getBoolean("disponible"));
                inmuebles.add(inmueble);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inmueble " + ex.getMessage());
        }
        return inmuebles;
    }

    //====== LISTAR TODOS LOS INMUEBLES ======//
    public ArrayList<Inmueble> listarInmuebles() {

        ArrayList<Inmueble> inmuebles = new ArrayList<>();
        try {
            String sql = "SELECT * FROM inmueble WHERE 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inmueble inmueble = new Inmueble();
                inmueble.setIdInmueble(rs.getInt("idInmueble"));
                inmueble.setPropietario(propietarioData.buscarPropietarioPorId((rs.getInt("idPropietario"))));
                inmueble.setInquilino(inquilinoData.buscarInquilinoPorId(rs.getInt("idInquilino")));
                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setTipo(rs.getString("tipo"));
                inmueble.setSuperficie(rs.getDouble("superficie"));
                inmueble.setPrecio(rs.getDouble("precio"));
                inmueble.setZona(rs.getString("zona"));
                inmueble.setDisponible(rs.getBoolean("disponible"));
                inmuebles.add(inmueble);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inmueble " + ex.getMessage());
        }
        return inmuebles;
    }

    //====== LISTAR INMUEBLES POR PARAMETROS ======//
    public ArrayList<Inmueble> listarInmueblesPorParametros(int idInmueble, int idPropietario, int idInquilino, String direccion, String tipo, double superficie, double precio, String zona) {

        ArrayList<Inmueble> inmuebles = new ArrayList<>();
        try {
            String sql = "SELECT * FROM inmueble WHERE idInmueble = ?, idPropietario = ?, idInquilino = ?, direccion = ?, tipo = ?, superficie = ?, precio = ?, zona = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, idInmueble);
            ps.setInt(2, idPropietario);
            ps.setInt(3, idInquilino);
            ps.setString(4, direccion);
            ps.setString(5, tipo);
            ps.setDouble(6, superficie);
            ps.setDouble(7, precio);
            ps.setString(8, zona);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al accedel a la tabla inmueble " + ex.getMessage());
        }
        return inmuebles;
    }
}
