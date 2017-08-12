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
 * @author Jorge
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

//        Usuario us = new Usuario();
//        us.setNombreUsuario(request.getParameter("nombreUsuario"));
//        us.setPassword(request.getParameter("passUsuario"));
//        us.setIdPersona(1);
//        us.setIdRol(Integer.parseInt(request.getParameter("idRol")));
//        ControladorUsuarios cru = new ControladorUsuarios();
        ControladorMatricula crm = new ControladorMatricula();

//                tipoEstudioE
//        estudioMusicaE 
//                disponeInstrumentoE
//        descripcionE
        Persona estudiante = new Persona();
        estudiante.setPrimerNombreP(request.getParameter("primerNombreE"));
        if (request.getParameter("segundoNombreE").equals("")) {
            estudiante.setSegundoNombreP(null);
        } else {
            estudiante.setSegundoNombreP(request.getParameter("segundoNombreE"));
        }
        estudiante.setPrimerApellidoP(request.getParameter("primerApelidoE"));
        if (request.getParameter("segundoApelidoE").equals("")) {
            estudiante.setPrimerApellidoP(null);
        } else {
            estudiante.setPrimerApellidoP(request.getParameter("segundoApelidoE"));
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

        //primerNombreP
        //segundoNombreP
        //primerApelidoP
        //segundoApelidoP
        //ciP
        //nacionalidadP
        //internadoP
        //direccionP
        //telefonoP
        //nacimientoP
        //sexoP
        //emailP
        //profecionP
        Persona padre = new Persona();
        padre.setPrimerNombreP(request.getParameter(""));
        if (request.getParameter("").equals("")) {
            padre.setSegundoNombreP(null);
        } else {
            padre.setSegundoNombreP(request.getParameter(""));
        }
        padre.setPrimerApellidoP(request.getParameter(""));
        if (request.getParameter("").equals("")) {
            padre.setPrimerApellidoP(null);
        } else {
            padre.setPrimerApellidoP(request.getParameter(""));
        }
        padre.setCiPersona(request.getParameter(""));
        padre.setNacionalidadP(request.getParameter(""));
        padre.setInterno(request.getParameter(""));
        padre.setDireccionPersona(request.getParameter(""));
        padre.setTelefonoPersona(request.getParameter(""));
        padre.setFechaNacimPersona(request.getParameter(""));
        padre.setSexoPersona(request.getParameter(""));
        padre.setEmailPersona(request.getParameter(""));
        padre.setProfesionPersona(request.getParameter(""));

        boolean existeU = true;
        boolean existePa = crm.exitePersona(padre);
        boolean existeEs = crm.exitePersona(estudiante);
        if (existePa && existeEs && existeU) {

//            boolean u = cru.crearUsuario(us);
            boolean est = crm.newPersona(estudiante);
            boolean pa = crm.newPersona(padre);
            if (pa && est) {

                Estudiante estu = new Estudiante();

                out.print("true");
            } else {
                out.print("false");
            }

        } else {
            out.print("false");
        }

        Materia mat = new Materia();
        mat.setNombreMateria(request.getParameter("nombremateria"));
        mat.setDescripcionMateria(request.getParameter("descripcionmateria"));
        Materia_model matmodel = new Materia_model();
        if (matmodel.insertarMateria(mat)) {
            out.print("true");
        } else {
            out.print("false");
        }

    }

}
