<%-- 
    Document   : ver_user
    Created on : 19/07/2017, 12:51:36 PM
    Author     : WarMachine
--%>


<%@page import="Controlador.ControladorUsuarios"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>

<%
    HttpSession objsession = request.getSession(false);
    String usuario = (String) objsession.getAttribute("usuario");
    if (usuario.equals("")) {
        response.sendRedirect("index.jsp");
    } else {
        ControladorUsuarios con = new ControladorUsuarios();
        if ("SuperAdministrador".equals(con.rol(usuario))) {
        } else if ("Director".equals(con.rol(usuario))) {
            response.sendRedirect("menu_director.jsp");
        } else if ("Docente".equals(con.rol(usuario))) {
            response.sendRedirect("menu_docente.jsp");
        } else if ("Estudiante".equals(con.rol(usuario))) {
            response.sendRedirect("menu_estudiante.jsp");
        } else {
            response.sendRedirect("index.jsp");
        }
    }
%>

<!DOCTYPE html>
<html>

    <%@include file="head.jsp" %>

    <body>

        <div id="wrapper">
            <%@include file="navroot.jsp" %>%>
            <div id="page-wrapper">
                </br>
                <div class="row">
                    <%ControladorUsuarios us = new ControladorUsuarios();  %>
                    <%= us.getViewUsers()%>
                </div>
            </div>

        </div>

        <!-- /#wrapper -->

    </body>

    <%@include file="foother.jsp" %>

</html>
