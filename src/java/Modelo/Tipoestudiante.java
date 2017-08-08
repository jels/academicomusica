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
public class Tipoestudiante {

    private int idTipoEstudiante;
    private String tipoEstudiante;

    public Tipoestudiante() {
    }

    public Tipoestudiante(int idTipoEstudiante, String tipoEstudiante) {
        this.idTipoEstudiante = idTipoEstudiante;
        this.tipoEstudiante = tipoEstudiante;
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
     * @return the tipoEstudiante
     */
    public String getTipoEstudiante() {
        return tipoEstudiante;
    }

    /**
     * @param tipoEstudiante the tipoEstudiante to set
     */
    public void setTipoEstudiante(String tipoEstudiante) {
        this.tipoEstudiante = tipoEstudiante;
    }

}
