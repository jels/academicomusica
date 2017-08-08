/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author WarMachine
 */
public class Curso_model {

    Conexion cn = new Conexion();

    public int contarCursos() {

        PreparedStatement pst;
        ResultSet rs;
        try {
            String consulta = "SELECT COUNT(idCurso) FROM curso";
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

    public ResultSet getAllCursos() {

        PreparedStatement pst;
        ResultSet rs = null;

        try {
            String sql = "SELECT * "
                    + "FROM curso";
            pst = cn.getConnection().prepareCall(sql);
            rs = pst.executeQuery();
            return rs;
        } catch (Exception e) {
            System.out.println("Error getAllCurso: " + e);
            return rs;
        }
    }

    public ArrayList<Curso> getAllCurso() {
        ArrayList<Curso> curs = new ArrayList<>();
        PreparedStatement pst;
        ResultSet rs;

        try {
            String sql = "SELECT * FROM curso WHERE activo = 1 ORDER BY nombreCurso ";
            pst = cn.getConnection().prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                curs.add(new Curso(rs.getInt("idCurso"), rs.getString("nombreCurso"), rs.getString("detalleCurso")));
            }

        } catch (Exception e) {
            System.out.println("Error getAllCurso: " + e);
        }

        return curs;
    }

}
