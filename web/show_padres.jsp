<%-- 
    Document   : show_padres
    Created on : 12/08/2017, 03:41:50 PM
    Author     : WarMachine
--%>

<%@page import="Controlador.ControladorShow"%>
<%@page import="Controlador.ControladorRoles"%>
<%@page import="Controlador.ControladorNav"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>

<%
    HttpSession objsession = request.getSession(false);
    String usuario = (String) objsession.getAttribute("usuario");
    if (objsession.equals(false) || usuario == null) {//esta linea es la que ayuda a que no salga el error de null...
        session.invalidate();
        response.sendRedirect("index.jsp");
    } else {
        ControladorRoles cnr = new ControladorRoles();
        if (!cnr.secreOdire(usuario)) {
            response.sendRedirect("index.jsp");
        }
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
                    <% ControladorShow cns = new ControladorShow();%>
                    <%=cns.getViewPadres()%>
                </div>
            </div>

        </div>
        <!-- /#wrapper -->

    </body>

    <%@include file="foother.jsp" %>

</html>