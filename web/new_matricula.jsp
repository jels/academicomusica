<%-- 
    Document   : new_matricula
    Created on : 02/08/2017, 10:08:47 AM
    Author     : WarMachine
--%>

<%@page import="Controlador.ControladorRoles"%>
<%@page import="Controlador.ControladorBody"%>
<%@page import="Controlador.ControladorNav"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
                <div class="panel-heading">
                    <h1>Gestionar Matricula</h1>
                </div>
                <!-- /.panel-heading -->
                <div class="panel-body">
                    <!-- Nav tabs -->
                    <ul class="nav nav-tabs">
                        <li class=""><a href="#new" data-toggle="tab" aria-expanded="false">Nuevo Estudiante</a>
                        </li>
                        <li class=""><a href="#curso" data-toggle="tab" aria-expanded="false">Curso-Estudiante</a>
                        </li>
                        <li class=""><a href="#pago" data-toggle="tab" aria-expanded="false">Pagos</a>
                        </li>
                    </ul>

                    <!-- Tab panes -->
                    <div class="tab-content">
                        
                        <% ControladorBody cnb=new ControladorBody(); %>
                        <%=cnb.getViewNewEst() %>
                        
                        <div class="tab-pane fade" id="curso">
                            
                        </div>
                        <div class="tab-pane fade" id="pago">
                            <h4>Roles</h4>
                            <div id="actroles">

                            </div>
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