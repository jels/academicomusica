<%-- 
    Document   : menu
    Created on : 21/06/2017, 11:26:31 PM
    Author     : WarMachine
--%>

<%@page import="Controlador.ControladorBody"%>
<%@page import="Controlador.ControladorNav"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>

<%
    HttpSession objsession = request.getSession(false);
    String usuario = (String) objsession.getAttribute("usuario");
    if (objsession.equals(false)) {//esta linea es la que ayuda a que no salga el error de null...
        response.sendRedirect("index.jsp");
    } else if (usuario == null) {
        session.invalidate();
        response.sendRedirect("index.jsp");
    }
%>

<!DOCTYPE html>
<html>

    <%@include file="head.jsp" %>

    <body>

        <div id="wrapper">

            <% ControladorNav cnv = new ControladorNav();%>
            <%=cnv.getNav(usuario)%>
            <div id="page-wrapper">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="center">
                            <h1 class="page-header">Bienvenido...<% out.print(usuario); %>  </h1>
                        </div>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <% ControladorBody cnb = new ControladorBody();%>
                <%=cnb.getViewIndexBox(usuario)%>

            </div>
            <!-- /#page-wrapper -->

        </div>
        <!-- /#wrapper -->
    </body>

    <%@include file="foother.jsp" %>

</html>