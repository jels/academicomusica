/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author WarMachine
 */
public class Usuario_model {

    Conexion cn = new Conexion();

    public boolean autenticacion(Usuario us) {

        PreparedStatement pst;
        ResultSet rs;

        try {
            String consulta = "SELECT * FROM usuario where nombreUsuario = ? and passUsuario = ?";
            pst = cn.getConnection().prepareStatement(consulta);
            pst.setString(1, us.getNombreUsuario());
            pst.setString(2, us.getPassword());
            rs = pst.executeQuery();
            return rs.absolute(1);

        } catch (Exception ex) {
            System.err.println("Error: " + ex);
            return false;
        }
    }

//    public static void main(String[] args) {
//
//        Usuario_model usm = new Usuario_model();
//        Usuario user = new Usuario();
//        boolean ex = usm.autenticacion(user);
//        boolean ne;
//        System.out.println("Existe?: " + ex);
//        
//    }
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

}
