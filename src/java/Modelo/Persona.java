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
public class Persona {

    private int idPersona;
    private String PrimerNombreP;
    private String SegundoNombreP;
    private String PrimerApellidoP;
    private String SegundoApellidoP;
    private String ciPersona;
    private String direccionPersona;
    private String telefonoPersona;
    private String fechaNacimPersona;
    private String sexoPersona;
    private String emailPersona;
    private String profesionPersona;
    private String interno;
    private String nacionalidadP;

    public Persona() {

    }

    public Persona(int idPersona, String PrimerNombreP, String SegundoNombreP, String PrimerApellidoP, String SegundoApellidoP, String ciPersona, String direccionPersona, String telefonoPersona, String fechaNacimPersona, String sexoPersona, String emailPersona, String profesionPersona, String interno, String nacionalidadP) {
        this.idPersona = idPersona;
        this.PrimerNombreP = PrimerNombreP;
        this.SegundoNombreP = SegundoNombreP;
        this.PrimerApellidoP = PrimerApellidoP;
        this.SegundoApellidoP = SegundoApellidoP;
        this.ciPersona = ciPersona;
        this.direccionPersona = direccionPersona;
        this.telefonoPersona = telefonoPersona;
        this.fechaNacimPersona = fechaNacimPersona;
        this.sexoPersona = sexoPersona;
        this.emailPersona = emailPersona;
        this.profesionPersona = profesionPersona;
        this.interno = interno;
        this.nacionalidadP = nacionalidadP;
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
     * @return the PrimerNombreP
     */
    public String getPrimerNombreP() {
        return PrimerNombreP;
    }

    /**
     * @param PrimerNombreP the PrimerNombreP to set
     */
    public void setPrimerNombreP(String PrimerNombreP) {
        this.PrimerNombreP = PrimerNombreP;
    }

    /**
     * @return the SegundoNombreP
     */
    public String getSegundoNombreP() {
        return SegundoNombreP;
    }

    /**
     * @param SegundoNombreP the SegundoNombreP to set
     */
    public void setSegundoNombreP(String SegundoNombreP) {
        this.SegundoNombreP = SegundoNombreP;
    }

    /**
     * @return the PrimerApellidoP
     */
    public String getPrimerApellidoP() {
        return PrimerApellidoP;
    }

    /**
     * @param PrimerApellidoP the PrimerApellidoP to set
     */
    public void setPrimerApellidoP(String PrimerApellidoP) {
        this.PrimerApellidoP = PrimerApellidoP;
    }

    /**
     * @return the SegundoApellidoP
     */
    public String getSegundoApellidoP() {
        return SegundoApellidoP;
    }

    /**
     * @param SegundoApellidoP the SegundoApellidoP to set
     */
    public void setSegundoApellidoP(String SegundoApellidoP) {
        this.SegundoApellidoP = SegundoApellidoP;
    }

    /**
     * @return the ciPersona
     */
    public String getCiPersona() {
        return ciPersona;
    }

    /**
     * @param ciPersona the ciPersona to set
     */
    public void setCiPersona(String ciPersona) {
        this.ciPersona = ciPersona;
    }

    /**
     * @return the direccionPersona
     */
    public String getDireccionPersona() {
        return direccionPersona;
    }

    /**
     * @param direccionPersona the direccionPersona to set
     */
    public void setDireccionPersona(String direccionPersona) {
        this.direccionPersona = direccionPersona;
    }

    /**
     * @return the telefonoPersona
     */
    public String getTelefonoPersona() {
        return telefonoPersona;
    }

    /**
     * @param telefonoPersona the telefonoPersona to set
     */
    public void setTelefonoPersona(String telefonoPersona) {
        this.telefonoPersona = telefonoPersona;
    }

    /**
     * @return the fechaNacimPersona
     */
    public String getFechaNacimPersona() {
        return fechaNacimPersona;
    }

    /**
     * @param fechaNacimPersona the fechaNacimPersona to set
     */
    public void setFechaNacimPersona(String fechaNacimPersona) {
        this.fechaNacimPersona = fechaNacimPersona;
    }

    /**
     * @return the sexoPersona
     */
    public String getSexoPersona() {
        return sexoPersona;
    }

    /**
     * @param sexoPersona the sexoPersona to set
     */
    public void setSexoPersona(String sexoPersona) {
        this.sexoPersona = sexoPersona;
    }

    /**
     * @return the emailPersona
     */
    public String getEmailPersona() {
        return emailPersona;
    }

    /**
     * @param emailPersona the emailPersona to set
     */
    public void setEmailPersona(String emailPersona) {
        this.emailPersona = emailPersona;
    }

    /**
     * @return the profesionPersona
     */
    public String getProfesionPersona() {
        return profesionPersona;
    }

    /**
     * @param profesionPersona the profesionPersona to set
     */
    public void setProfesionPersona(String profesionPersona) {
        this.profesionPersona = profesionPersona;
    }

    /**
     * @return the interno
     */
    public String getInterno() {
        return interno;
    }

    /**
     * @param interno the interno to set
     */
    public void setInterno(String interno) {
        this.interno = interno;
    }

    /**
     * @return the nacionalidadP
     */
    public String getNacionalidadP() {
        return nacionalidadP;
    }

    /**
     * @param nacionalidadP the nacionalidadP to set
     */
    public void setNacionalidadP(String nacionalidadP) {
        this.nacionalidadP = nacionalidadP;
    }

}
