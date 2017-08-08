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
 * @author Luis
 */
public class Materia_model {
    
    Conexion cn = new Conexion();
    
    public int contarMaterias() {

        PreparedStatement pst;
        ResultSet rs;
        try {
            String consulta = "SELECT COUNT(idMateria) FROM materia";
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
    
    public boolean insertarMateria(Materia mat) {

        PreparedStatement pst;
        int rs;

        try {
            String consulta = "INSERT INTO CURSO (idCurso, nombreCurso, detalleCurso) values(null,?,?)";
            pst = cn.getConnection().prepareStatement(consulta);
            pst.setString(1, mat.getNombreMateria());
            pst.setString(2, mat.getDescripcionMateria());
            rs = pst.executeUpdate();
            if (rs == 1) {
                return true;
            }
            else
            {
                return false;
            }

        } catch (Exception ex) {
            System.err.println("Error: " + ex);
            return false;
        }
    }
    
    public ResultSet getAllMate() {

        PreparedStatement pst;
        ResultSet rs = null;

        try {
            String sql = "SELECT * "
                    + "FROM materia";
            pst = cn.getConnection().prepareCall(sql);
            rs = pst.executeQuery();
            return rs;
        } catch (Exception e) {
            System.out.println("Error getAllMate: " + e);
            return rs;
        }
    }
    
}
