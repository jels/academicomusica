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
public class Persona1 {

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

    public Persona1() {
    }

    public Persona1(String PrimerNombreP, String SegundoNombreP, String PrimerApellidoP, String SegundoApellidoP, String ciPersona, String direccionPersona, String telefonoPersona, String fechaNacimPersona, String sexoPersona, String emailPersona, String profesionPersona) {
        super();
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
    }

    public String getPrimerNombreP() {
        return PrimerNombreP;
    }

    public void setPrimerNombreP(String PrimerNombreP) {
        this.PrimerNombreP = PrimerNombreP;
    }

    public String getSegundoNombreP() {
        return SegundoNombreP;
    }

    public void setSegundoNombreP(String SegundoNombreP) {
        this.SegundoNombreP = SegundoNombreP;
    }

    public String getPrimerApellido() {
        return PrimerApellidoP;
    }

    public void setPrimerApellidoP(String PrimerApellidoP) {
        this.PrimerApellidoP = PrimerApellidoP;
    }
    
    public String getSegundoApellidoP()  {
        return SegundoApellidoP;
    }
    
    public void setSegundoApellidoP(String SegundoApellidoP) {
        this.SegundoApellidoP = SegundoApellidoP;
    }
    
    public String getciPersona () {
        return ciPersona;
    }
    
    public void setciPersona (String ciPersona) {
        this.ciPersona = ciPersona;
    }
    
    public String getdireccionPersona () {
        return direccionPersona;
    }
    
    public void direccionPersona (String direccionPersona)  {
        this.direccionPersona = direccionPersona;
    }
    
    public String telefonoPersona ()  {
        return telefonoPersona;
    }
    
    public void telefonoPersona (String telefonoPersona)    {
        this.telefonoPersona = telefonoPersona;
    }
    
    public String fechaNacimPersona ()  {
        return fechaNacimPersona;
    }
    
    public void fechaNacimPersona (String fechaNacimPersona)    {
        this.fechaNacimPersona = fechaNacimPersona;
    }
    
    public String sexoPersona   ()  {
        return sexoPersona;
    }
    
    public void sexoPersona (String sexoPersona)    {
        this.sexoPersona = sexoPersona;
    }
    
//    public String emailPersona ()       
}
