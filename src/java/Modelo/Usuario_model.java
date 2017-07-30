/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author WarMachine
 */
public class Usuario_model {

    Conexion cn = new Conexion();

    public ResultSet autenticacion(Usuario us) {

        PreparedStatement pst;
        ResultSet rs;

        try {
            String consulta = "SELECT * FROM usuario where nombreUsuario = ? and passUsuario = ?";
            pst = cn.getConnection().prepareStatement(consulta);
            pst.setString(1, us.getNombreUsuario());
            pst.setString(2, us.getPassword());
            rs = pst.executeQuery();
            if (rs.absolute(1)) {
                return rs;
            } else {
                return null;
            }

        } catch (Exception ex) {
            System.err.println("Error: " + ex);
            return null;
        }
    }

    public String rolusuario(Usuario us) {

        PreparedStatement pst;
        ResultSet rs;
        String nombre = "false";
        try {
            String consulta = "SELECT r.nombreRol FROM roles r, usuario u WHERE r.idRol=u.idRol AND u.nombreUsuario = ? AND u.passUsuario = ? ";
            pst = cn.getConnection().prepareStatement(consulta);
            pst.setString(1, us.getNombreUsuario());
            rs = pst.executeQuery();
            if (rs.next()) {
                nombre = "Bienvenido " + rs.getString(0);
            }

            return nombre;
        } catch (Exception ex) {
            System.err.println("Error: " + ex);
            return nombre;
        }

    }

    public String bienvenida(Usuario us) {
        PreparedStatement pst;
        ResultSet rs;
        String nombre = "false";
        try {
            String consulta = "SELECT r.nombreRol FROM roles r,  usuario u WHERE r.idRol=u.idRol AND nombreUsuario = ?";
            pst = cn.getConnection().prepareStatement(consulta);
            pst.setString(1, us.getNombreUsuario());
            rs = pst.executeQuery();
            if (rs.next()) {
                nombre = "Bienvenido " + rs.getString(1);
            }

            return nombre;
        } catch (Exception ex) {
            System.err.println("Error: " + ex);
            return nombre;
        }
    }

    public String usuario(String us) {
        PreparedStatement pst;
        ResultSet rs;
        String nombre = "";
        try {
            String consulta = "SELECT r.nombreRol, p.primerNombreP, p.primerApellidoP, u.nombreUsuario "
                    + "FROM roles r, persona p, usuario u "
                    + "WHERE r.idRol=u.idRol "
                    + "AND p.idPersona=u.idPersona "
                    + "AND nombreUsuario = ?";
            pst = cn.getConnection().prepareStatement(consulta);
            pst.setString(1, us);
            rs = pst.executeQuery();
            if (rs.next()) {
                nombre = "Bienvenido " + rs.getString(1);
            }

            return nombre;
        } catch (Exception ex) {
            System.err.println("Error: " + ex);
            return nombre;
        }
    }

    public String rol(String us) {

        PreparedStatement pst;
        ResultSet rs;
        String nombre = "false";
        try {
            String consulta = "SELECT r.nombreRol FROM roles r, usuario u WHERE r.idRol=u.idRol AND u.nombreUsuario = ? ";
            pst = cn.getConnection().prepareStatement(consulta);
            pst.setString(1, us);
            rs = pst.executeQuery();
            if (rs.next()) {
                nombre = rs.getString(1);
                return nombre;
            } else {
                return nombre;
            }

        } catch (Exception ex) {
            System.err.println("Error: " + ex);
            return nombre;
        }
    }

    public int contarusuarios() {
        PreparedStatement pst;
        ResultSet rs;
        try {
            String consulta = "SELECT COUNT(nombreUsuario) FROM usuario ";
            pst = cn.getConnection().prepareStatement(consulta);
            rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            } else {
                return 0;
            }

        } catch (Exception ex) {
            System.err.println("Error: " + ex);
            return 0;
        }
    }

    public ArrayList<Usuario> getAllUser() {
        ArrayList<Usuario> us = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT * FROM usuario";
            pst = cn.getConnection().prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                us.add(new Usuario(rs.getInt("idUsuario"), rs.getString("nombreUsuario"), rs.getString("passUsuario"), rs.getInt("idPersona"), rs.getInt("idRol")));
            }

        } catch (Exception e) {
            System.out.println("Error getAllUser: " + e);
        }

        return us;
    }

    public boolean newUser(Usuario us) {
        System.out.println("nombre: " + us.getNombreUsuario());
        System.out.println("pass: " + us.getPassword());
        System.out.println("idPersona: " + us.getIdPersona());
        System.out.println("idRol: " + us.getIdRol());
        PreparedStatement pst;

        try {
            if (!existe(us)) {
                String consulta = "INSERT INTO usuario(nombreUsuario, passUsuario, idPersona, idRol) VALUES (?,?,?,?)";
                pst = cn.getConnection().prepareStatement(consulta);
                pst.setString(1, us.getNombreUsuario());
                pst.setString(2, us.getPassword());
                pst.setInt(3, us.getIdPersona());
                pst.setInt(4, us.getIdRol());
                return pst.executeUpdate() == 1;
            } else {
                return false;
            }

        } catch (Exception ex) {
            System.err.println("Error User: " + ex);
            return false;
        }

    }

    private boolean existe(Usuario us) {

        PreparedStatement pst;
        ResultSet rs;

        try {
            String consulta = "SELECT * FROM usuario where nombreUsuario = ?";
            pst = cn.getConnection().prepareStatement(consulta);
            pst.setString(1, us.getNombreUsuario());
            rs = pst.executeQuery();
            return rs.absolute(1);
        } catch (Exception ex) {
            System.err.println("Error: " + ex);
            return false;
        }
    }

}
