/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;

/**
 *
 * @author WarMachine
 */
public class ControladorMatricula {

    private boolean existePersona(Persona per) {

        Persona_model mp = new Persona_model();
        return mp.existencia(per);

    }

    public int newPersona(Persona p) {

        int id;
        if (!existePersona(p)) {
            Persona_model mp = new Persona_model();
            id = mp.newPerson(p);
            System.out.println("idPersona= " + id);
        } else {
            id = 0;
        }
        return id;
    }

    public boolean newEstudiante(Estudiante est) {

        Estudiante_model me = new Estudiante_model();
        return me.newEstudiant(est);

    }

    public boolean newPadre(Padre pa) {

        Padre_model mp = new Padre_model();
        return mp.newFather(pa);

    }

    public int findIdPersona(Persona pe) {

        Persona_model mp = new Persona_model();
        return mp.findIdPerson(pe);

    }

    public boolean estadoMatricula() {

        Persona_model mp = new Persona_model();
        Matricula_model ma = new Matricula_model();

        //cambia el estado del curso de activos a inactivos
        //cambia el estado de todos los estudiantes activos a inactivos
        return ma.finMatricula() && mp.finEstudiantes();

    }

    public int IdPadre(Padre pa) {

        Padre_model padre = new Padre_model();
        return padre.getIdPadre(pa);
    }

    public boolean newMatri(Matricula ma) {

        Matricula_model matr = new Matricula_model();
        return matr.newMatricula(ma);
    }

}
