<%-- 
    Document   : show_estudiantes
    Created on : 02/08/2017, 03:11:02 PM
    Author     : WarMachine
--%>

<%@page import="Controlador.ControladorRoles"%>
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
                </br>
                <div class="row">
                    
                </div>
            </div>

        </div>
        <!-- /#wrapper -->

    </body>

    <%@include file="foother.jsp" %>

</html>