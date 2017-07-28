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
 * @author WarMachine
 */
public class Rol_model {

    Conexion cn = new Conexion();

    public int contarroles() {
        PreparedStatement pst;
        ResultSet rs;
        try {
            String consulta = "SELECT COUNT(nombreRol) FROM roles ";
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

    public boolean crear_rol(Rol r) {
        
        
        
        
        
        
        
        
        
        
        return false;

    }

    public ArrayList<Rol> getAllRol(){
        ArrayList<Rol> rol = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String sql = "SELECT * FROM roles ";
            pst = cn.getConnection().prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {                
                rol.add(new Rol(rs.getInt("idRol"), rs.getString("nombreRol"), rs.getString("descripcionRol")));
            }
            
        } catch (Exception e) {
            System.out.println("Error getAllRol: "+e);            
        }       
        
        return rol;
    }

}
