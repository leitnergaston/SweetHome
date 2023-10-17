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
        propietarioData = new PropietarioData();
        inquilinoData = new InquilinoData();
        
        String sql = "INSERT INTO inmueble (idInmueble, idPropietario, idInquilino, direccion, tipo, superficie, precio, zona, disponible) "
                + "VALUES (null, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            if (inmueble.getPropietario() == null) {
                ps.setNull(1, 0);
            } else {
                ps.setInt(1, inmueble.getPropietario().getIdPropietario());
            }

            if (inmueble.getInquilino() == null) {
                ps.setNull(2, 0);
            } else {
                ps.setInt(2, inmueble.getInquilino().getIdInquilino());
            }

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
        propietarioData = new PropietarioData();
        inquilinoData = new InquilinoData();
        String sql = "UPDATE inmueble SET direccion = ?, tipo = ?, superficie = ?, precio = ?, zona = ?, disponible = ?, idPropietario = ? "
                + "WHERE idInmueble = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, inmueble.getDireccion());
            ps.setString(2, inmueble.getTipo());
            ps.setDouble(3, inmueble.getSuperficie());
            ps.setDouble(4, inmueble.getPrecio());
            ps.setString(5, inmueble.getZona());
            ps.setBoolean(6, inmueble.isDisponible());
            ps.setInt(7, inmueble.getPropietario().getIdPropietario());
            ps.setInt(8, inmueble.getIdInmueble());

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
        propietarioData = new PropietarioData();
        inquilinoData = new InquilinoData();
        try {
            String sql = "UPDATE inmueble SET disponible = 0 WHERE idInmueble = ? AND disponible = 1";

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
        
        propietarioData = new PropietarioData();
        inquilinoData= new InquilinoData();
        
        Inmueble inmueble = null;

        String sql = "SELECT idPropietario, idInquilino, direccion, tipo, superficie, precio, zona, disponible "
                + "FROM inmueble WHERE idInmueble = ?";

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
                inmueble.setSuperficie(rs.getDouble("superficie"));
                inmueble.setPrecio(rs.getDouble("precio"));
                inmueble.setZona(rs.getString("zona"));
                inmueble.setDisponible(rs.getBoolean("disponible"));
                
                //JOptionPane.showMessageDialog(null,"Inmueble encontrado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inmueble " + ex.getMessage());
        }
        return inmueble;
    }

    //====== LISTAR INMUEBLES DISPONIBLES ======//
    public ArrayList<Inmueble> listarInmueblesDisponiblesONo(boolean disponible) {
        
        propietarioData = new PropietarioData();
        inquilinoData= new InquilinoData();
        
        ArrayList<Inmueble> inmuebles = new ArrayList<>();

        try {
            String sql = "SELECT * FROM inmueble WHERE disponible = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, disponible);
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

        propietarioData = new PropietarioData();
        inquilinoData= new InquilinoData();
        
        ArrayList<Inmueble> inmuebles = new ArrayList<>();

        try {
            String sql = "SELECT * FROM inmueble WHERE idPropietario = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inmueble inmueble = new Inmueble();
                inmueble.setIdInmueble(rs.getInt("idInmueble"));
                inmueble.setPropietario(propietarioData.buscarPropietarioPorId(id));
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

        propietarioData = new PropietarioData();
        inquilinoData= new InquilinoData();
        
        ArrayList<Inmueble> inmuebles = new ArrayList<>();
        try {
            String sql = "SELECT * FROM inmueble";
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
    public ArrayList<Inmueble> listarInmueblesPorParametros(String tipo, double superficieMinima, double precioMinimo, double precioMaximo, String zona) {

        propietarioData = new PropietarioData();
        inquilinoData= new InquilinoData();
        
        ArrayList<Inmueble> inmuebles = new ArrayList<>();

        try {
            String sql = "SELECT * FROM inmueble "
                    + "WHERE tipo LIKE ? AND superficie >= ? AND precio BETWEEN ? AND ? AND zona LIKE ?";
            
            PreparedStatement ps = con.prepareStatement(sql);

            // Asignar los valores de los parametros
            ps.setString(1, tipo);
            ps.setDouble(2, superficieMinima);
            ps.setDouble(3, precioMinimo);
            ps.setDouble(4, precioMaximo);
            ps.setString(5, zona);

            ResultSet rs = ps.executeQuery();

            // Listar los inmuebles con los parametros elegidos
            while (rs.next()) {
                Inmueble inmueble = new Inmueble();
                inmueble.setIdInmueble(rs.getInt("idInmueble"));
                inmueble.setPropietario(propietarioData.buscarPropietarioPorId(rs.getInt("idPropietario")));
                inmueble.setInquilino(inquilinoData.buscarInquilinoPorId(rs.getInt("idInquilino")));
                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setTipo(rs.getString("tipo"));
                inmueble.setZona(rs.getString("zona"));
                inmueble.setSuperficie(rs.getDouble("superficie"));
                inmueble.setPrecio(rs.getDouble("precio"));
                inmueble.setDisponible(rs.getBoolean("disponible"));
                inmuebles.add(inmueble);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inmueble " + ex.getMessage());
        }
        return inmuebles;
    }
    
    public ArrayList<Inmueble> buscarInmueblePorDireccion(String direccion){
    
        propietarioData = new PropietarioData();
        inquilinoData= new InquilinoData();
        
        ArrayList<Inmueble> inmuebles = new ArrayList<>();

        try {
            String sql = "SELECT * FROM inmueble "
                    + "WHERE direccion LIKE ?"; 
            
            PreparedStatement ps = con.prepareStatement(sql);

            // Asignar los valores de los parametros
            ps.setString(1, direccion);

            ResultSet rs = ps.executeQuery();

            // Listar los inmuebles con los parametros elegidos
            while (rs.next()) {
                Inmueble inmueble = new Inmueble();
                inmueble.setIdInmueble(rs.getInt("idInmueble"));
                inmueble.setPropietario(propietarioData.buscarPropietarioPorId(rs.getInt("idPropietario")));
                inmueble.setInquilino(inquilinoData.buscarInquilinoPorId(rs.getInt("idInquilino")));
                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setTipo(rs.getString("tipo"));
                inmueble.setZona(rs.getString("zona"));
                inmueble.setSuperficie(rs.getDouble("superficie"));
                inmueble.setPrecio(rs.getDouble("precio"));
                inmueble.setDisponible(rs.getBoolean("disponible"));
                inmuebles.add(inmueble);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inmueble " + ex.getMessage());
        }
        return inmuebles;
    }
}
