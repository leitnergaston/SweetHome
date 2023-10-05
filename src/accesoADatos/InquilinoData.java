package accesoADatos;

import entidades.Inquilino;
import accesoADatos.InmuebleData;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class InquilinoData {

    // Atributo tipo connection para usar sentencias sql
    private Connection con = null;
    private InmuebleData inmuebleData;

    // Constructor 
    public InquilinoData() {
        con = Conexion.getConnection();
    }

    // ====== METODO AGREGAR INQUILINO ======//
    public void agregarInquilino(Inquilino inquilino) {
        // Sentencia INSERT
        String sql = "INSERT INTO `inquilino`(`idInquilino`, `cuit`, `apellido`, `nombre`,"
                + " `lugarDeTrabajo`, `dniGarante`, `nombreGarante`, `estado`) VALUES (null,?,?,?,?,?,?,?)";
        try {
            // Generar el objeto PreparedStatement para enviar la sentencia sql
            // le pasamos la sentencia sql y que devuelva la lista de las claves generadas
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setLong(1, inquilino.getCuit()); // seteamos el primer parametro(primer ?)  y lo obtenemos de la clase alumno
            ps.setString(2, inquilino.getApellido());
            ps.setString(3, inquilino.getNombre());
            ps.setString(4, inquilino.getLugarDeTrabajo());
            ps.setInt(5, inquilino.getDniGarante());
            ps.setString(6, inquilino.getNombreGarante());
            ps.setBoolean(7, inquilino.isEstado());

            ps.executeUpdate(); // Enviamos la sentencia

            ResultSet rs = ps.getGeneratedKeys(); // obtener la tabla de la columna id

            // Si hay un elemento agregado
            if (rs.next()) {
                inquilino.setIdInquilino(rs.getInt(1)); // Seteamos el id, lo extraemos del rs y el numero de columna
                JOptionPane.showMessageDialog(null, "inquilino añadido con exito."); // Informamos q se agregó exitosamente el alumno
            }

            ps.close(); // Cerramos el objeto preparedStatement

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inquilino " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);

        }
    }

    //====== METODO ELIMINAR INQUILINO ======//
    public void eliminarInquilino(int cuit) {
        try {
            String sql = "UPDATE inquilino SET estado = 0 WHERE cuit = ? AND estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cuit);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó el inquilino.");
            } else {
                JOptionPane.showMessageDialog(null, "El inquilino no existe o ya fue dado de baja");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inquilino");
        }
    }

    //====== METODO MODIFICAR INQUILINO ======//
    public void modificarinquilino(Inquilino inquilino) {
        String sql = "UPDATE inquilino SET apellido = ?, nombre = ?, lugarDeTrabajo = ?, dniGarante=?"
                + "nombreGarante=?, estado=? WHERE dni = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, inquilino.getApellido());
            ps.setString(2, inquilino.getNombre());
            ps.setString(3, inquilino.getLugarDeTrabajo());
            ps.setInt(4, inquilino.getDniGarante());
            ps.setString(5, inquilino.getNombreGarante());
            ps.setBoolean(6, inquilino.isEstado());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El inquilino no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inquilino " + ex.getMessage());
        }
    }

    //====== METODO BUSCAR INQUILINO(id) ======//
    public Inquilino buscarInquilinoPorId(int id) {
        Inquilino inquilino = null; // declarar un alumno para almacenar info si se encuentra en la bd
        String sql = "SELECT cuit, apellido, nombre, lugarDeTrabajo, dniGarante, nombreGarante, FROM inquilino"
                + " WHERE idInquilino = ? AND estado = 1"; // consulta sql
        PreparedStatement ps = null; // declarar un ps para preparar la consulta sql
        try {
            ps = con.prepareStatement(sql); // objeto ps a partir de la consulta sql 
            ps.setInt(1, id); // establecer el primer parametro ? de la consulta con el valor id
            ResultSet rs = ps.executeQuery(); // ejecutamos la consulta y se almacenan los resultados en el objeto rs

            // si hay al menos una fila de resultado en el rs
            if (rs.next()) {
                // creamos un inquilino y asignamos los valores obtenidos de la consulta sql a las propìedades del objeto alumno usando metodos set
                inquilino = new Inquilino();
                inquilino.setIdInquilino(id);
                inquilino.setCuit(rs.getInt("cuit"));
                inquilino.setApellido(rs.getString("apellido"));
                inquilino.setNombre(rs.getString("nombre"));
                inquilino.setLugarDeTrabajo(rs.getString("lugarDeTrabajo"));
                inquilino.setDniGarante(rs.getInt("dniGarante"));
                inquilino.setNombreGarante(rs.getString("nombreGarante"));
                inquilino.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el inquilino");
            }
            ps.close(); // cerramos el objeto ps
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inquilino " + ex.getMessage());
        }
        return inquilino; // devuelve el objeto alumno con la info del alumno encontrado en la bs
    }

    //====== METODO BUSCAR INQUILINO(cuit) ======//
    public Inquilino buscarinquilinoCUIT(long cuit) {
        Inquilino inquilino = null; // declarar un alumno para almacenar info si se encuentra en la bd
        String sql = "SELECT idInquilino, apellido, nombre, lugarDeTrabajo, dniGarante, nombreGarante, FROM inquilino"
                + " WHERE cuit = ? AND estado = 1"; // consulta sql
        PreparedStatement ps = null; // declarar un ps para preparar la consulta sql
        try {
            ps = con.prepareStatement(sql); // objeto ps a partir de la consulta sql 
            ps.setInt(1, (int) cuit); // establecer el primer parametro ? de la consulta con el valor cuit
            ResultSet rs = ps.executeQuery(); // ejecutamos la consulta y se almacenan los resultados en el objeto rs

            // si hay al menos una fila de resultado en el rs
            if (rs.next()) {
                // creamos un inquilino y asignamos los valores obtenidos de la consulta sql a las propìedades del objeto alumno usando metodos set
                inquilino = new Inquilino();
                inquilino.setIdInquilino(rs.getInt("idInquilino"));
                inquilino.setCuit(rs.getInt("cuit"));
                inquilino.setApellido(rs.getString("apellido"));
                inquilino.setNombre(rs.getString("nombre"));
                inquilino.setLugarDeTrabajo(rs.getString("lugarDeTrabajo"));
                inquilino.setDniGarante(rs.getInt("dniGarante"));
                inquilino.setNombreGarante(rs.getString("nombreGarante"));
                inquilino.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el inquilino");
            }
            ps.close(); // cerramos el objeto ps
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inquilino " + ex.getMessage());
        }
        return inquilino; // devuelve el objeto alumno con la info del alumno encontrado en la bs
    }

    //====== METODO LISTAR INQUILINO() ======//
    public ArrayList<Inquilino> listarinquilinos() {
        ArrayList<Inquilino> inquilinos = new ArrayList<>(); // declarar la lista q contendrá objetos de tipo Alumno
        try {
            String sql = "SELECT `idInquilino`, `cuit`, `apellido`, `nombre`, `lugarDeTrabajo`,"
                    + " `dniGarante`, `nombreGarante`, `estado` FROM `inquilino` WHERE estado=1"; // consulta sql
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) { // recorrer las filas de resultados en el rs

                // en cada iteracion se crea un objeto Alumno y asignamos sus propiedades obtenidos del rs usando metodos get
                Inquilino inquilino = new Inquilino();
                inquilino.setIdInquilino(rs.getInt("idInquilino"));
                inquilino.setCuit(rs.getInt("cuit"));
                inquilino.setApellido(rs.getString("apellido"));
                inquilino.setNombre(rs.getString("nombre"));
                inquilino.setLugarDeTrabajo(rs.getString("lugarDeTrabajo"));
                inquilino.setDniGarante(rs.getInt("dniGarante"));
                inquilino.setNombreGarante(rs.getString("nombreGarante"));
                inquilino.setEstado(rs.getBoolean("estado"));
                inquilinos.add(inquilino);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inquilino " + ex.getMessage());
        }
        return inquilinos; // devolvemos una lista de objetos Alumno

    }
}
