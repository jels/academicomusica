<%-- 
    Document   : new_user
    Created on : 19/07/2017, 11:43:46 AM
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

    <%@include file="head.jsp"  %>
    <body>

        <div id="wrapper">

            <%@include file="navroot.jsp" %>

            <div id="page-wrapper">

                <div class="panel-heading">
                    <h1>Gestionar Los Roles</h1>
                </div>
                <!-- /.panel-heading -->
                <div class="panel-body">
                    <!-- Nav tabs -->
                    <ul class="nav nav-tabs">
                        <li class=""><a href="#crear" data-toggle="tab" aria-expanded="false">Crear</a>
                        </li>
                        <li class=""><a href="#actualizarrol" data-toggle="tab" aria-expanded="false">Actualizar</a>
                        </li>
                        <li class=""><a href="#darbajarol" data-toggle="tab" aria-expanded="false">Dar de Baja</a>
                        </li>
                    </ul>

                    <!-- Tab panes -->
                    <div class="tab-content">
                        <div class="tab-pane fade" id="crear">
                            </br>
                            <div class="col-md-6">
                                <form action="rol.do" id="insertarMateria">
                                    <div class="form-group">
                                        <label>Nombre Rol</label>
                                        <input class="form-control" id = "nombrerol">
                                        <label>Descripcion Rol</label>
                                        <input class="form-control" id = "descripcionrol">
                                        </br>
                                        <input type="button" id="insertarrol" value="Crear" class="btn btn-default" />
                                    </div>
                                </form>
                            </div>
                        </div>
                        <div class="tab-pane fade" id="actualizarrol">
                            <h4>Roles</h4>
                            <div id="actroles">

                            </div>
                        </div>
                        <div class="tab-pane fade" id="darbajarol">
                            <h4>Roles</h4>
                            <div id="actroles">

                            </div>
                        </div>
                    </div>
                </div>
                <!-- /.panel-body -->
            </div>
        </div>
    </body>

    <%@include file="foother.jsp" %>
    
</html>

