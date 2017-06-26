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

    public boolean insertarMateria(Materia mat) {

        PreparedStatement pst;
        int rs;

        try {
            String consulta = "INSERT INTO CURSO (idCurso, nombreCurso, detalleCurso) values(null,?,?)";
            pst = cn.getConnection().prepareStatement(consulta);
            pst.setString(1, mat.getnombreMateria());
            pst.setString(2, mat.getdescripcionMateria());
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
    
}
