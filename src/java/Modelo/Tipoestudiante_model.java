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
public class Tipoestudiante_model {

    Conexion cn = new Conexion();

    public ArrayList<Tipoestudiante> getAllTipo() {
        ArrayList<Tipoestudiante> tipo = new ArrayList<>();
        PreparedStatement pst;
        ResultSet rs;

        try {
            String sql = "SELECT * FROM tipoestudiante ";
            pst = cn.getConnection().prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                tipo.add(new Tipoestudiante(rs.getInt("idTipoEstudiante"), rs.getString("tipoEstudiante")));
            }

        } catch (Exception e) {
            System.out.println("Error getAllRol: " + e);
        }

        return tipo;
    }

}
