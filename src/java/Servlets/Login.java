/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Controlador.ControladorUsuarios;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Modelo.*;
        
/**
 *
 * @author WarMachine
 */
public class Login extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    //protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Si lo queremos hacer a traves de un get, tenemos que poner el codigo del post en esta clase        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=iso-8859-1");
        PrintWriter out = response.getWriter();
        Usuario us = new Usuario();
        us.setNombreUsuario(request.getParameter("username"));
        us.setPassword(request.getParameter("password"));
        ControladorUsuarios cuser = new ControladorUsuarios();
        if (cuser.loginUser(us)) {
            HttpSession objsession = request.getSession(true);
            objsession.setAttribute("usuario", us.getNombreUsuario());
            out.print("true");
        } else {
            out.print("false");
        }
    }

}
