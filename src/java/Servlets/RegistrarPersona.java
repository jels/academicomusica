/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Controlador.ControladorMatricula;
import Controlador.ControladorUsuarios;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.*;

/**
 *
 * @author Warmachine
 */
public class RegistrarPersona extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=iso-8859-1");
        PrintWriter out = response.getWriter();

        ControladorMatricula crm = new ControladorMatricula();

        Persona estudiante = new Persona();
        estudiante.setPrimerNombreP(request.getParameter("primerNombreE"));
        if (request.getParameter("segundoNombreE").equals("")) {
            estudiante.setSegundoNombreP(null);
        } else {
            estudiante.setSegundoNombreP(request.getParameter("segundoNombreE"));
        }
        estudiante.setPrimerApellidoP(request.getParameter("primerApelidoE"));
        if (request.getParameter("segundoApelidoE").equals("")) {
            estudiante.setSegundoApellidoP(null);
        } else {
            estudiante.setSegundoApellidoP(request.getParameter("segundoApelidoE"));
        }
        estudiante.setCiPersona(request.getParameter("ciE"));
        estudiante.setNacionalidadP(request.getParameter("nacionalidadE"));
        estudiante.setInterno(request.getParameter("internadoE"));
        estudiante.setDireccionPersona(request.getParameter("direccionE"));
        estudiante.setTelefonoPersona(request.getParameter("telefonoE"));
        estudiante.setFechaNacimPersona(request.getParameter("nacimientoE"));
        estudiante.setSexoPersona(request.getParameter("sexoE"));
        estudiante.setEmailPersona(request.getParameter("emailE"));
        estudiante.setProfesionPersona(request.getParameter("profecionE"));
        estudiante.setEstadoPersona(1);

        Persona padre = new Persona();
        padre.setPrimerNombreP(request.getParameter("primerNombreP"));
        if (request.getParameter("segundoNombreP").equals("")) {
            padre.setSegundoNombreP(null);
        } else {
            padre.setSegundoNombreP(request.getParameter("segundoNombreP"));
        }
        padre.setPrimerApellidoP(request.getParameter("primerApelidoP"));
        if (request.getParameter("segundoApelidoP").equals("")) {
            padre.setSegundoApellidoP(null);
        } else {
            padre.setSegundoApellidoP(request.getParameter("segundoApelidoP"));
        }
        padre.setCiPersona(request.getParameter("ciP"));
        padre.setNacionalidadP(request.getParameter("nacionalidadP"));
        padre.setInterno(request.getParameter("internadoP"));
        padre.setDireccionPersona(request.getParameter("direccionP"));
        padre.setTelefonoPersona(request.getParameter("telefonoP"));
        padre.setFechaNacimPersona(request.getParameter("nacimientoP"));
        padre.setSexoPersona(request.getParameter("sexoP"));
        padre.setEmailPersona(request.getParameter("emailP"));
        padre.setProfesionPersona(request.getParameter("profecionP"));
        padre.setEstadoPersona(1);

        int matriculaE = crm.newPersona(estudiante);
        int matriculaP = crm.newPersona(padre);

        if (matriculaE != 0 && matriculaP != 0) {

            Padre pad = new Padre();
            pad.setIdPersona(matriculaP);

            boolean banderap = crm.newPadre(pad);

            int idPadreP = crm.IdPadre(pad);

            Estudiante estu = new Estudiante();
            estu.setIdTipoEstudiante(Integer.parseInt(request.getParameter("tipoEstudioE")));
            estu.setEstudioMusica(request.getParameter("estudioMusicaE"));
            estu.setDisponeInstruento(request.getParameter("disponeInstrumentoE"));
            estu.setDescripcionE(request.getParameter("descripcionE"));
            estu.setActivoE(1);
            estu.setIdPersona(matriculaE);
            estu.setIdPadre(idPadreP);

            boolean banderae = crm.newEstudiante(estu);

            if (banderap && banderae) {
                out.print("true");
            } else {
                out.print("false");
            }
        } else {
            out.print("false");
        }

    }
}
