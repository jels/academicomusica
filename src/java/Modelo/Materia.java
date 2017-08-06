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

    public Materia(int idMateria, String nombreMateria, String descripcionMateria) {
        this.idMateria = idMateria;
        this.nombreMateria = nombreMateria;
        this.descripcionMateria = descripcionMateria;
    }
    
    public int getIdMateria() {
        return idMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public String getDescripcionMateria() {
        return descripcionMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public void setDescripcionMateria(String descripcionMateria) {
        this.descripcionMateria = descripcionMateria;
    }

}
