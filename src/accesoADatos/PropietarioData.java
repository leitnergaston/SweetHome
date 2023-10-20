/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesoADatos;

import entidades.Propietario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author estudiante
 */
public class PropietarioData {
    
// Atributo tipo connection para poder usar sentencias sql
    private Connection con = null;
    
            
    public PropietarioData() {
        
        // Inicializar la variable `con` de la clase Conexion
        //accedemos al metodo getConnection q se encarga de cargar drivers y establecer conexion a la bd
        con = Conexion.getConnection();
       
    }
    
    //***** Método que crea el propietario****//
    public void crearPropietario(Propietario propietario){
        
        String sql = "INSERT INTO propietario(idPropietario, dni, apellido, nombre, domicilio, telefono, eMail, estado)"
                + "VALUES (null,?,?,?,?,?,?,?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, propietario.getDni());
            ps.setString(2, propietario.getApellido());
            ps.setString(3, propietario.getNombre());
            ps.setString(4, propietario.getDomicilio());
            ps.setString(5, propietario.getTelefono());
            ps.setString(6, propietario.getMail());
            ps.setBoolean(7, propietario.isEstado());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                propietario.setIdPropietario(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Propietario agregado con exito");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al crear el propietario / o propietario duplicado: " + ex.getMessage());
        }
    }
   
    //****Método para modificar un propietario****//
    public void modificarPropietario(Propietario propietario){
        
        try {
        String sql = "UPDATE propietario SET dni=?,apellido= ?,nombre= ?,domicilio= ?,"
                + "telefono= ?,eMail= ?, estado=? "
                + "WHERE idPropietario = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, propietario.getDni());
            ps.setString(2, propietario.getApellido());
            ps.setString(3, propietario.getNombre());
            ps.setString(4, propietario.getDomicilio());
            ps.setString(5, propietario.getTelefono());
            ps.setString(6, propietario.getMail());
            ps.setBoolean(7, propietario.isEstado());
            ps.setInt(8, propietario.getIdPropietario());

            int modifico = ps.executeUpdate();
            if (modifico == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El propietario no existe");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario: " + ex.getMessage());
        }
    }
    
    //****Método para eliminar un propietario****//
    public void eliminarPropietario(int id){
        try {
            String sql = "UPDATE propietario SET estado = 0 WHERE idPropietario = ? AND estado = 1 ";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int exitoso = ps.executeUpdate();

            if (exitoso == 1) {
                JOptionPane.showMessageDialog(null, "Eliminado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El propietario no existe o ya fue dado de baja.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario: " + ex.getMessage());
        }
    }
    
    //****Método para buscar por Id un propietario****//
    public Propietario buscarPropietarioPorId(int id){
        
        
        Propietario prop = null;
        try {
        String sql = "SELECT dni, apellido, nombre, domicilio, telefono, eMail, estado "
                + "FROM propietario "
                + "WHERE idPropietario = ? ";
            
        PreparedStatement ps = con.prepareStatement(sql); 
        ps.setInt(1, id); 
        ResultSet rs = ps.executeQuery(); 
        
        if(rs.next()){
            prop = new Propietario();
            prop.setIdPropietario(id);
            prop.setDni(rs.getInt("dni"));
            prop.setApellido(rs.getString("apellido"));
            prop.setNombre(rs.getString("nombre"));
            prop.setDomicilio(rs.getString("domicilio"));
            prop.setTelefono(rs.getString("telefono"));
            prop.setMail(rs.getString("eMail"));
            prop.setEstado(rs.getBoolean("estado"));
            
        }
            ps.close(); 
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario: " + ex.getMessage());
        }
        return prop;
    }
    
    //****Método para buscar por Dni un propietario****//
     public Propietario buscarPropietarioPorDni(int dni){
        
        
        Propietario prop = null;
        
        try {
        String sql = "SELECT idPropietario, apellido, nombre, domicilio, telefono, eMail, estado "
                + "FROM propietario "
                + "WHERE dni = ? ";
            
        PreparedStatement ps = con.prepareStatement(sql); 
        ps.setInt(1, dni); 
        ResultSet rs = ps.executeQuery(); 
        
        if(rs.next()){
            prop = new Propietario();
            prop.setIdPropietario(rs.getInt("idPropietario"));
            prop.setDni(dni);
            prop.setApellido(rs.getString("apellido"));
            prop.setNombre(rs.getString("nombre"));
            prop.setDomicilio(rs.getString("domicilio"));
            prop.setTelefono(rs.getString("telefono"));
            prop.setMail(rs.getString("eMail"));
            prop.setEstado(rs.getBoolean("estado"));
            
        }
            ps.close(); 
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario: " + ex.getMessage());
        }
        return prop;
    }
     
    //****Método para listar todos los propietario****// 
    public ArrayList<Propietario> listarPropietarios() { 
        
        
        ArrayList<Propietario> prop = new ArrayList<>(); 
        
        try {
        String sql = "SELECT idPropietario, dni, apellido, nombre, domicilio, telefono, eMail, estado "
                + "FROM propietario ";
        
         
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Propietario propietario = new Propietario();
                propietario.setIdPropietario(rs.getInt("idPropietario"));
                propietario.setDni(rs.getInt("dni"));
                propietario.setApellido(rs.getString("apellido"));
                propietario.setNombre(rs.getString("nombre"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setTelefono(rs.getString("telefono"));
                propietario.setMail(rs.getString("eMail"));
                propietario.setEstado(rs.getBoolean("estado"));
                prop.add(propietario);
            }
            ps.close();
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario: " + ex.getMessage());
        }
        
        return prop;
    }
    
    public ArrayList<Propietario> listarPropietariosActivosONo(boolean estado) { 
         
        ArrayList<Propietario> prop = new ArrayList<>(); 
        
        try {
        String sql = "SELECT idPropietario, dni, apellido, nombre, domicilio, telefono, eMail, estado "
                + "FROM propietario "
                + "WHERE estado = ?";
        
         
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, estado);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Propietario propietario = new Propietario();
                propietario.setIdPropietario(rs.getInt("idPropietario"));
                propietario.setDni(rs.getInt("dni"));
                propietario.setApellido(rs.getString("apellido"));
                propietario.setNombre(rs.getString("nombre"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setTelefono(rs.getString("telefono"));
                propietario.setMail(rs.getString("eMail"));
                propietario.setEstado(rs.getBoolean("estado"));
                prop.add(propietario);
            }
            ps.close();
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario: " + ex.getMessage());
        }
        
        return prop;
    }
    
    public ArrayList<Propietario> listarPropietariosPorApellido(String apellido){
    
        ArrayList<Propietario> prop = new ArrayList<>(); 
        
        try {
        String sql = "SELECT idPropietario, dni, apellido, nombre, domicilio, telefono, eMail, estado "
                + "FROM propietario "
                + "WHERE apellido LIKE ?";
        
         
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, apellido);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Propietario propietario = new Propietario();
                propietario.setIdPropietario(rs.getInt("idPropietario"));
                propietario.setDni(rs.getInt("dni"));
                propietario.setApellido(rs.getString("apellido"));
                propietario.setNombre(rs.getString("nombre"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setTelefono(rs.getString("telefono"));
                propietario.setMail(rs.getString("eMail"));
                propietario.setEstado(rs.getBoolean("estado"));
                prop.add(propietario);
            }
            ps.close();
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario: " + ex.getMessage());
        }
        
        return prop;
    }
    
    public ArrayList<Propietario> listarPropietariosPorNombre(String nombre){
        ArrayList<Propietario> prop = new ArrayList<>(); 
        
        try {
        String sql = "SELECT idPropietario, dni, apellido, nombre, domicilio, telefono, eMail, estado "
                + "FROM propietario "
                + "WHERE nombre LIKE ?";
        
         
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Propietario propietario = new Propietario();
                propietario.setIdPropietario(rs.getInt("idPropietario"));
                propietario.setDni(rs.getInt("dni"));
                propietario.setApellido(rs.getString("apellido"));
                propietario.setNombre(rs.getString("nombre"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setTelefono(rs.getString("telefono"));
                propietario.setMail(rs.getString("eMail"));
                propietario.setEstado(rs.getBoolean("estado"));
                prop.add(propietario);
            }
            ps.close();
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario: " + ex.getMessage());
        }
        
        return prop;
    
    }
}

