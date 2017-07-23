/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author WarMachine
 */
public class Usuario {
    
    private int idUsuario;
    private String nombreUsuario;
    private String password;
    private int idPersona;
    private int idRol;
    private String nombreRol;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombreUsuario, String password, int idPersona, int idRol, String nombreRol) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.idPersona = idPersona;
        this.idRol = idRol;
        this.nombreRol = nombreRol;
    }   
    
    public Usuario(int idUsuario, String nombreUsuario, String password, int idPersona, int idRol) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.idPersona = idPersona;
        this.idRol = idRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
            
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public int getIdRol() {
        return idRol;
    }
    
}
