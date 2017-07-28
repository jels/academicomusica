<%-- 
    Document   : menu
    Created on : 21/06/2017, 11:26:31 PM
    Author     : WarMachine
--%>

<%@page import="Controlador.ControladorUsuarios"%>
<%@page import="Controlador.ControladorRoles"%>


<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>

<%
    HttpSession objsession = request.getSession(false);
    String usuario = (String) objsession.getAttribute("usuario");
    ControladorUsuarios contador = new ControladorUsuarios();
    int cantusuarios = contador.cantidadUsuarios();
    ControladorRoles cr=new ControladorRoles();
    int cantroles=cr.cantidadRoles();
    if (objsession.equals(false)) {//esta linea es la que ayuda a que no salga el error de null...
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

            <%@include file="navroot.jsp" %>
            <div id="page-wrapper">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="center">
                            <h1 class="page-header">Bienvenido...<% out.print(usuario); %>  </h1>
                        </div>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- bloque superior (estudiantes y docentes) -->
                <div class="row">
                    <div class="col-lg-3 col-md-6">
                    </div>
                    <div class="col-lg-3 col-md-6">
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                <div class="row">
                                    <div class="col-xs-3">
                                        <i class="fa fa-users  fa-5x"></i>
                                    </div>
                                    <div class="col-xs-9 text-right">
                                        <div class="huge"><% out.print(cantusuarios);%></div>
                                        <div>Usuarios</div>
                                    </div>
                                </div>
                            </div>
                            <a href="ver_user.jsp">
                                <div class="panel-footer">
                                    <span class="pull-left">Ver Detalles</span>
                                    <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                    <div class="clearfix"></div>
                                </div>
                            </a>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6">
                        <div class="panel panel-green">
                            <div class="panel-heading">
                                <div class="row">
                                    <div class="col-xs-3">
                                        <i class="fa fa-briefcase fa-5x"></i>
                                    </div>
                                    <div class="col-xs-9 text-right">
                                        <div class="huge"><% out.print(cantroles); %></div>
                                        <div>Roles</div>
                                    </div>
                                </div>
                            </div>
                            <a href="ver_roles.jsp">
                                <div class="panel-footer">
                                    <span class="pull-left">Ver Detalles</span>
                                    <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                    <div class="clearfix"></div>
                                </div>
                            </a>
                        </div>
                    </div>
                </div>

            </div>
            <!-- /#page-wrapper -->

        </div>
        <!-- /#wrapper -->
    </body>

    <%@include file="foother.jsp" %>

</html>