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
public class Estudiante {

    private int idEstudiante;
    private String estudioMusica;
    private String disponeInstruento;
    private String descripcionE;
    private int activoE;
    private int idTipoEstudiante;
    private int idPadre;
    private int idPersona;

    public Estudiante() {
    }

    public Estudiante(int idEstudiante, String estudioMusica, String disponeInstruento, String descripcionE, int activoE, int idTipoEstudiante, int idPadre, int idPersona) {
        this.idEstudiante = idEstudiante;
        this.estudioMusica = estudioMusica;
        this.disponeInstruento = disponeInstruento;
        this.descripcionE = descripcionE;
        this.activoE = activoE;
        this.idTipoEstudiante = idTipoEstudiante;
        this.idPadre = idPadre;
        this.idPersona = idPersona;
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
     * @return the estudioMusica
     */
    public String getEstudioMusica() {
        return estudioMusica;
    }

    /**
     * @param estudioMusica the estudioMusica to set
     */
    public void setEstudioMusica(String estudioMusica) {
        this.estudioMusica = estudioMusica;
    }

    /**
     * @return the disponeInstruento
     */
    public String getDisponeInstruento() {
        return disponeInstruento;
    }

    /**
     * @param disponeInstruento the disponeInstruento to set
     */
    public void setDisponeInstruento(String disponeInstruento) {
        this.disponeInstruento = disponeInstruento;
    }

    /**
     * @return the descripcionE
     */
    public String getDescripcionE() {
        return descripcionE;
    }

    /**
     * @param descripcionE the descripcionE to set
     */
    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    /**
     * @return the activoE
     */
    public int getActivoE() {
        return activoE;
    }

    /**
     * @param activoE the activoE to set
     */
    public void setActivoE(int activoE) {
        this.activoE = activoE;
    }

    /**
     * @return the idTipoEstudiante
     */
    public int getIdTipoEstudiante() {
        return idTipoEstudiante;
    }

    /**
     * @param idTipoEstudiante the idTipoEstudiante to set
     */
    public void setIdTipoEstudiante(int idTipoEstudiante) {
        this.idTipoEstudiante = idTipoEstudiante;
    }

    /**
     * @return the idPadre
     */
    public int getIdPadre() {
        return idPadre;
    }

    /**
     * @param idPadre the idPadre to set
     */
    public void setIdPadre(int idPadre) {
        this.idPadre = idPadre;
    }

    /**
     * @return the idPersona
     */
    public int getIdPersona() {
        return idPersona;
    }

    /**
     * @param idPersona the idPersona to set
     */
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

}
