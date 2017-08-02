/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.Persona_1;

public class ActionServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private ArrayList<Persona_1> personas = new ArrayList<>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Si lo queremos hacer a traves de un get, tenemos que poner el codigo del post en esta clase
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=iso-8859-1");
        PrintWriter out = response.getWriter();

        // Obtengo los datos de la peticion
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String edad = request.getParameter("edad");

        // Compruebo que los campos del formulario tienen datos para añadir a la tabla
        if (!nombre.equals("") && !apellido.equals("") && !edad.equals("")) {
            // Creo el objeto persona y lo añado al arrayList
            Persona_1 persona = new Persona_1(nombre, apellido, edad);
            personas.add(persona);
        }

        out.println("<table style= cellspacing='1' bgcolor='#0099cc'>");
        out.println("<tr>");
        out.println("<td style= rowspan='7' align='center' bgcolor='#f8f8f8'> NOMBRE </td>");
        out.println("<td style= rowspan='7' align='center' bgcolor='#f8f8f8'>APELLIDO</td>");
        out.println("<td style= rowspan='7' align='center' bgcolor='#f8f8f8'>EDAD</td>");
        out.println("</tr>");
        for (int i = 0; i < personas.size(); i++) {
            Persona_1 persona = personas.get(i);
            out.println("<tr>");
            out.println("<td style= rowspan='7' align='center' bgcolor='#f8f8f8'>" + persona.getNombre() + "</td>");
            out.println("<td style= rowspan='7' align='center' bgcolor='#f8f8f8'>" + persona.getApellido() + "</td>");
            out.println("<td style= rowspan='7' align='center' bgcolor='#f8f8f8'>" + persona.getEdad() + "</td>");
            out.println("</tr>");
        }
        out.println("</table>");

//        try {
////                PrintWriter out = response.getWriter();
//                //response.setContentType("text/html; charset=iso-8859-1");
//                out.print("<a class=\"green-text\">Usuario ¡Correcto!</a>");
////                Thread.sleep(500);
////            } catch (IOException | InterruptedException e) {
////                System.out.println("error try: " + e);
////            }
//
////            request.getRequestDispatcher("login.do").forward(request, response);
//        } else {
////            PrintWriter out = response.getWriter();
////            response.setContentType("text/html; charset=iso-8859-1");
//            out.print("<a class=\"red-text\">Usuario o Contraceña ¡Incorrectos!</a>");
//        }
//        if (usm.autenticacion(us)) {
//        try {
//
//            Thread.sleep(500);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
//        }
////            request.getRequestDispatcher("index.jsp").forward(request, response);
//            response.sendRedirect("index.jsp");
//
//        } else {
//            System.out.println("usuario...incorrecto...");
//        }
        
        
        
        
        
        
    }
}
