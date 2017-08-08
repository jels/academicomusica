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
public class Curso {

    private int idCurso;
    private String nombreCurso;
    private String detalleCurso;

    public Curso() {
    }

    public Curso(int idCurso, String nombreCurso, String detalleCurso) {
        this.idCurso = idCurso;
        this.nombreCurso = nombreCurso;
        this.detalleCurso = detalleCurso;
    }

    /**
     * @return the idCurso
     */
    public int getIdCurso() {
        return idCurso;
    }

    /**
     * @param idCurso the idCurso to set
     */
    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    /**
     * @return the nombreCurso
     */
    public String getNombreCurso() {
        return nombreCurso;
    }

    /**
     * @param nombreCurso the nombreCurso to set
     */
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    /**
     * @return the detalleCurso
     */
    public String getDetalleCurso() {
        return detalleCurso;
    }

    /**
     * @param detalleCurso the detalleCurso to set
     */
    public void setDetalleCurso(String detalleCurso) {
        this.detalleCurso = detalleCurso;
    }

}
