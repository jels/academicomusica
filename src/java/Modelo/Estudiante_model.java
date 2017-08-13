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
            System.err.println("Error contarEstudiantes: " + ex);
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
            System.out.println("Error getAllEst: " + e);
            return rs;
        }
    }

    public ResultSet getAllEstNombre() {

        PreparedStatement pst;
        ResultSet rs = null;

        try {
            String sql = "SELECT e.idEstudiante, p.primerNombreP, p.primerApellidoP "
                    + "FROM estudiante e, persona p "
                    + "WHERE p.idPersona=e.idPersona "
                    + "AND e.activo=1";
            pst = cn.getConnection().prepareCall(sql);
            rs = pst.executeQuery();
            return rs;
        } catch (Exception e) {
            System.out.println("Error getAllEstNombre: " + e);
            return rs;
        }
    }

    public boolean newEstudiant(Estudiante es) {

        PreparedStatement pst;

        try {
            String consulta = "INSERT INTO estudiante (estudioMusica, "
                    + "disponeInstrumentos, idTipoEstudiante, idPadre,"
                    + " idPersona, activo, detallesEstudios) "
                    + "VALUES (?,?,?,?,?,?,?)";
            pst = cn.getConnection().prepareStatement(consulta);
            pst.setString(1, es.getEstudioMusica());
            pst.setString(2, es.getDisponeInstruento());
            pst.setInt(3, es.getIdTipoEstudiante());
            pst.setInt(4, es.getIdPadre());
            pst.setInt(5, es.getIdPersona());
            pst.setInt(6, es.getActivoE());
            pst.setString(7, es.getDescripcionE());
            return pst.executeUpdate() == 1;

        } catch (Exception ex) {
            System.err.println("Error newEstudiant: " + ex);
            return false;
        }
    }

    public ResultSet getAllEstudiantes() {

        PreparedStatement pst;
        ResultSet rs = null;

        try {
            String sql = "SELECT p.primerNombreP, p.primerApellidoP, pa.idPadre "
                    + "FROM persona p, estudiante e, padres pa "
                    + "WHERE p.idPersona=e.idPersona "
                    + "AND e.idPadre=pa.idPadre "
                    + "AND e.activo=1 ";
            pst = cn.getConnection().prepareCall(sql);
            rs = pst.executeQuery();
            return rs;
        } catch (Exception e) {
            System.out.println("Error getAllEstudiantes: " + e);
            return rs;
        }
    }
}
