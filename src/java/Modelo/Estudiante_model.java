/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author WarMachine
 */
public class Estudiante_model {

    Conexion cn = new Conexion();

    public int contarEstudiantes() {

        PreparedStatement pst;
        ResultSet rs;
        try {
            String consulta = "SELECT COUNT(idEstudiante) FROM estudiante";
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

    public ResultSet getAllEst() {

        PreparedStatement pst;
        ResultSet rs = null;

        try {
            String sql = "SELECT p.primerNombreP, p.primerApellidoP, "
                    + "p.sexoPersona, e.estudioMusica, "
                    + "e.disponeInstrumentos, t.tipoEstudiante "
                    + "FROM estudiante e, persona p, tipoestudiante t "
                    + "WHERE p.idPersona=e.idPersona "
                    + "AND t.idTipoEstudiante=e.idTipoEstudiante";
            pst = cn.getConnection().prepareCall(sql);
            rs = pst.executeQuery();
            return rs;
        } catch (Exception e) {
            System.out.println("Error getAllRol: " + e);
            return rs;
        }
    }

}
