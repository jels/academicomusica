/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.oracle.webservices.api.databinding.DatabindingModeFeature;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author WarMachine
 */
public class Matricula_model {

    Conexion cn = new Conexion();

    public int contarMatriculas() {

        PreparedStatement pst;
        ResultSet rs;
        try {
            String consulta = "SELECT COUNT(idMatricula) FROM matricula WHERE estadoMatricula=1";
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

    public ResultSet getAllMatri() {

        PreparedStatement pst;
        ResultSet rs = null;

        try {
            String sql = "SELECT p.primerNombreP, p.primerApellidoP, c.nombreCurso, "
                    + "m.fechaMatricula, t.tipoEstudiante "
                    + "FROM matricula m, estudiante e, "
                    + "tipoestudiante t, curso c, persona p "
                    + "WHERE p.idPersona=e.idPersona "
                    + "AND t.idTipoEstudiante=e.idTipoEstudiante "
                    + "AND e.idEstudiante=m.idEstudiante "
                    + "AND c.idCurso=m.idCurso ";
            pst = cn.getConnection().prepareCall(sql);
            rs = pst.executeQuery();
            return rs;
        } catch (Exception e) {
            System.out.println("Error getAllRol: " + e);
            return rs;
        }
    }

    public boolean newMatricula(Matricula ma) {

        PreparedStatement pst;

        try {
            String consulta = "INSERT INTO matricula(fechaMatricula, "
                    + "montoTotal, idEstudiante, "
                    + "idCurso, estadoMatricula) "
                    + "VALUES (?,?,?,?,?)";
            pst = cn.getConnection().prepareStatement(consulta);
            pst.setString(1, ma.getFechaMatricula());
            pst.setInt(2, ma.getMontoTotal());
            pst.setInt(3, ma.getIdEstudiante());
            pst.setInt(4, ma.getIdCurso());
            pst.setInt(5, ma.getEstadoMatricula());
            return pst.executeUpdate() == 1;

        } catch (Exception ex) {
            System.err.println("Error newMatricula: " + ex);
            return false;
        }
        
    }

    public boolean finMatricula() {
        return finEstudiante() && finMatri() && finPersona();
    }

    private boolean finEstudiante() {

        PreparedStatement pst;
        try {
            String consulta = "UPDATE estudiante SET activo=0 WHERE activo=1";
            pst = cn.getConnection().prepareStatement(consulta);
            return pst.executeUpdate() == 1;
        } catch (Exception ex) {
            System.err.println("Error Cambiar estado Matricula: " + ex);
            return false;
        }
    }

    private boolean finPersona() {

        PreparedStatement pst;
        try {
            String consulta = "UPDATE persona SET estadoPersona=0 WHERE estadoPersona=1";
            pst = cn.getConnection().prepareStatement(consulta);
            return pst.executeUpdate() == 1;
        } catch (Exception ex) {
            System.err.println("Error Cambiar estado Matricula: " + ex);
            return false;
        }
    }

    private boolean finMatri() {

        PreparedStatement pst;
        try {
            String consulta = "UPDATE matricula SET estadoMatricula=0 WHERE estadoMatricula=1";
            pst = cn.getConnection().prepareStatement(consulta);
            return pst.executeUpdate() == 1;
        } catch (Exception ex) {
            System.err.println("Error Cambiar estado Matricula: " + ex);
            return false;
        }
    }

}
