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
 * @author Luis
 */
public class Materia_model {
    
    Conexion cn = new Conexion();

    public boolean insertarMateria(Usuario us) {

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
    
}
