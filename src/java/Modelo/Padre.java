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
public class Padre {

    private int idPadre;
    private int idPersona;

    public Padre() {
    }

    public Padre(int idPadre, int idPersona) {
        this.idPadre = idPadre;
        this.idPersona = idPersona;
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
