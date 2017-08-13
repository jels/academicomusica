/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Controlador.ControladorMatricula;
import Modelo.Curso_model;
import Modelo.Estudiante_model;
import Modelo.Matricula;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author WarMachine
 */
public class MatriculaEstudiante extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);

        response.setContentType("text/html; charset=iso-8859-1");
        PrintWriter out = response.getWriter();

        ControladorMatricula matri = new ControladorMatricula();

        Matricula ma = new Matricula();
        ma.setEstadoMatricula(1);
        ma.setFechaMatricula(request.getParameter("fechaMatricula"));
        ma.setMontoTotal(Integer.parseInt(request.getParameter("pagoTotal")));
        ma.setIdCurso(Integer.parseInt(request.getParameter("cursoEst")));
        ma.setIdEstudiante(Integer.parseInt(request.getParameter("estCurso")));

        System.out.println("Estado= " + ma.getEstadoMatricula());
        System.out.println("Fecha= " + ma.getFechaMatricula());
        System.out.println("Monto= " + ma.getMontoTotal());
        System.out.println("Curso= " + ma.getIdCurso());
        System.out.println("Estudiante= " + ma.getIdEstudiante());
        boolean mat = matri.newMatri(ma);
        System.out.println(" verdad? " + mat);

        if (mat) {
            out.print("true");
        } else {
            out.print("false");
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
