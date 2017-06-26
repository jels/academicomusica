/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Luis
 */
public class Materia {
    
    private int idMateria;
    private String nombreMateria;
    private String descripcionMateria;
    
    public Materia() {
    }
    
    public void setidMateria(int idUsuario) {
        this.idMateria = idMateria;
    }

    public void setnombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public void setdescripcionMateria(String descripcionMateria) {
        this.descripcionMateria = descripcionMateria;
    }
    
    public int getidMateria() {
        return idMateria;
    }

    public String getnombreMateria() {
        return nombreMateria;
    }

    public String getdescripcionMateria() {
        return descripcionMateria;
    }
    
}
