/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author WarMachine
 */
public class Docente_model {

    Conexion cn = new Conexion();

    public int contarDocentes() {

        PreparedStatement pst;
        ResultSet rs;
        try {
            String consulta = "SELECT COUNT(idDocente) FROM docente";
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

    public ResultSet getAllDoc() {

        PreparedStatement pst;
        ResultSet rs = null;

        try {
            String sql = "SELECT p.primerNombreP, "
                    + "p.primerApellidoP, p.segundoApellidoP, "
                    + "p.telefonoPersona, p.emailPersona, "
                    + "p.profecionPersona "
                    + "FROM persona p, docente d "
                    + "WHERE p.idPersona=d.idPersona";
            pst = cn.getConnection().prepareCall(sql);
            rs = pst.executeQuery();
            return rs;
        } catch (Exception e) {
            System.out.println("Error getAllRol: " + e);
            return rs;
        }
    }
    
}
