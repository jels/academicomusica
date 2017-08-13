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
public class Padre_model {

    Conexion cn = new Conexion();

    public int contarPadres() {

        PreparedStatement pst;
        ResultSet rs;
        try {
            String consulta = "SELECT COUNT(idPadre) FROM padres";
            pst = cn.getConnection().prepareStatement(consulta);
            rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            } else {
                return 0;
            }

        } catch (Exception ex) {
            System.err.println("Error contarPadres: " + ex);
            return 0;
        }

    }

    public boolean newFather(Padre pa) {

        PreparedStatement pst;

        try {
            String consulta = "INSERT INTO padres(idPersona) VALUES (?)";
            pst = cn.getConnection().prepareStatement(consulta);
            pst.setInt(1, pa.getIdPersona());
            return pst.executeUpdate() == 1;
        } catch (Exception ex) {
            System.err.println("Error Crear Padre: " + ex);
            return false;
        }
    }

    public ResultSet getAllPadres(int idPadre) {

        PreparedStatement pst;
        ResultSet rs = null;

        try {
            String sql = "SELECT p.primerNombreP, p.primerApellidoP, p.telefonoPersona "
                    + "FROM persona p, padres pa "
                    + "WHERE p.idPersona=pa.idPersona "
                    + "AND pa.idPadre = ?";

            pst = cn.getConnection().prepareStatement(sql);
            pst.setInt(1, idPadre);
            rs = pst.executeQuery();
            return rs;
        } catch (Exception e) {
            System.out.println("Error getAllPadres: " + e);
            return rs;
        }

    }

    public int getIdPadre(Padre pa) {

        PreparedStatement pst;
        ResultSet rs;

        try {
            String sql = "SELECT idPadre "
                    + "FROM padres "
                    + "WHERE idPersona = ?";

            pst = cn.getConnection().prepareStatement(sql);
            pst.setInt(1, pa.getIdPersona());
            rs = pst.executeQuery();
            if (rs.next()) {
                System.out.println("idpadre" + rs.getInt(1));
                return rs.getInt(1);
            } else {
                return 0;
            }
        } catch (Exception e) {
            System.out.println("Error getAllPadres: " + e);
            return 0;
        }
    }

}
