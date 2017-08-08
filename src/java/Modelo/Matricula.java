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
public class Matricula {
    
    
    private int idMatricula;
    private String fechaMatricula;
    private int montoTotal;
    private int idEstudiante;
    private int idCurso;
    private int estadoMatricula;

    public Matricula() {
    }

    public Matricula(int idMatricula, String fechaMatricula, int montoTotal, int idEstudiante, int idCurso, int estadoMatricula) {
        this.idMatricula = idMatricula;
        this.fechaMatricula = fechaMatricula;
        this.montoTotal = montoTotal;
        this.idEstudiante = idEstudiante;
        this.idCurso = idCurso;
        this.estadoMatricula = estadoMatricula;
    }
   
    /**
     * @return the idMatricula
     */
    public int getIdMatricula() {
        return idMatricula;
    }

    /**
     * @param idMatricula the idMatricula to set
     */
    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    /**
     * @return the fechaMatricula
     */
    public String getFechaMatricula() {
        return fechaMatricula;
    }

    /**
     * @param fechaMatricula the fechaMatricula to set
     */
    public void setFechaMatricula(String fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    /**
     * @return the montoTotal
     */
    public int getMontoTotal() {
        return montoTotal;
    }

    /**
     * @param montoTotal the montoTotal to set
     */
    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    /**
     * @return the idEstudiante
     */
    public int getIdEstudiante() {
        return idEstudiante;
    }

    /**
     * @param idEstudiante the idEstudiante to set
     */
    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
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
     * @return the estadoMatricula
     */
    public int getEstadoMatricula() {
        return estadoMatricula;
    }

    /**
     * @param estadoMatricula the estadoMatricula to set
     */
    public void setEstadoMatricula(int estadoMatricula) {
        this.estadoMatricula = estadoMatricula;
    }
    
    
    
}
