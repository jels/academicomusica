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
public class Docente {

    private int idDocente;
    private int idPersona;
    private String tituloDocente;
    private String fotoDocente;

    public Docente(int idDocente, int idPersona, String tituloDocente, String fotoDocente) {
        this.idDocente = idDocente;
        this.idPersona = idPersona;
        this.tituloDocente = tituloDocente;
        this.fotoDocente = fotoDocente;
    }

    public Docente() {
    }
    
    /**
     * @return the idDocente
     */
    public int getIdDocente() {
        return idDocente;
    }

    /**
     * @param idDocente the idDocente to set
     */
    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
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

    /**
     * @return the tituloDocente
     */
    public String getTituloDocente() {
        return tituloDocente;
    }

    /**
     * @param tituloDocente the tituloDocente to set
     */
    public void setTituloDocente(String tituloDocente) {
        this.tituloDocente = tituloDocente;
    }

    /**
     * @return the fotoDocente
     */
    public String getFotoDocente() {
        return fotoDocente;
    }

    /**
     * @param fotoDocente the fotoDocente to set
     */
    public void setFotoDocente(String fotoDocente) {
        this.fotoDocente = fotoDocente;
    }

}
