/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

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
public class registrarmateria extends HttpServlet {

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
        Materia mat = new Materia();
        mat.setnombreMateria(request.getParameter("nombremateria"));
        mat.setdescripcionMateria(request.getParameter("descripcionmateria"));
        Materia_model matmodel = new Materia_model();
        if (matmodel.insertarMateria(mat)) {
            out.print("true");
        } else {
            out.print("false");
        }
    }

}
