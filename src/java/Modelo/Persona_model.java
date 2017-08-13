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
public class Persona_model {

    Conexion cn = new Conexion();

    public boolean existencia(Persona per) {

        System.out.println("ciPersona= " + per.getCiPersona());
        PreparedStatement pst;
        ResultSet rs;

        try {
            String consulta = "SELECT idPersona FROM persona WHERE ciPersona = ?";
            pst = cn.getConnection().prepareStatement(consulta);
            pst.setString(1, per.getCiPersona());
            rs = pst.executeQuery();
            if (rs.absolute(1)) {
                System.out.println("true");
                return true;
            } else {
                System.out.println("false");
                return false;
            }

        } catch (Exception ex) {
            System.err.println("Error existencia: " + ex);
            return false;
        }

    }

    public int newPerson(Persona p) {

        PreparedStatement pst;

        try {
            String consulta = "INSERT INTO persona (primerNombreP, segundoNombreP, "
                    + "primerApellidoP, segundoApellidoP, ciPersona, nacionalidadP, "
                    + "interno, direccionPersona, telefonoPersona, fechaNacimPersona, "
                    + "sexoPersona, emailPersona, profecionPersona, estadoPersona) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = cn.getConnection().prepareStatement(consulta);
            pst.setString(1, mayusculaPrimeraLetra(p.getPrimerNombreP()));
            if (p.getSegundoNombreP() == null) {
                pst.setString(2, null);
            } else {
                pst.setString(2, mayusculaPrimeraLetra(p.getSegundoNombreP()));
            }
            pst.setString(3, mayusculaPrimeraLetra(p.getPrimerApellidoP()));
            if (p.getSegundoApellidoP() == null) {
                pst.setString(4, null);
            } else {
                pst.setString(4, mayusculaPrimeraLetra(p.getSegundoApellidoP()));
            }
            pst.setString(5, p.getCiPersona());
            pst.setString(6, mayusculaPrimeraLetra(p.getNacionalidadP()));
            pst.setString(7, p.getInterno());
            pst.setString(8, mayusculaPrimeraLetra(p.getDireccionPersona()));
            pst.setString(9, p.getTelefonoPersona());
            pst.setString(10, p.getFechaNacimPersona());
            pst.setString(11, mayusculaPrimeraLetra(p.getSexoPersona()));
            pst.setString(12, p.getEmailPersona());
            pst.setString(13, mayusculaPrimeraLetra(p.getProfesionPersona()));
            pst.setInt(14, p.getEstadoPersona());

            if (pst.executeUpdate() == 1) {
                return findIdPerson(p);
            } else {
                return 0;
            }
        } catch (Exception ex) {
            System.err.println("Error newPerson: " + ex);
            return 0;
        }

    }

    public int findIdPerson(Persona p) {

        PreparedStatement pst;
        ResultSet rs;
        try {
            String consulta = "SELECT idPersona FROM persona WHERE ciPersona = ?";
            pst = cn.getConnection().prepareStatement(consulta);
            pst.setString(1, p.getCiPersona());
            rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            } else {
                return 0;
            }

        } catch (Exception ex) {
            System.err.println("Error findIdPerson: " + ex);
            return 0;
        }

    }

    public boolean finEstudiantes() {

        return false;
    }

    private String mayusculaPrimeraLetra(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        } else {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1, str.length()).toLowerCase();
        }

    }

}
