<%-- 
    Document   : new_matricula
    Created on : 02/08/2017, 10:08:47 AM
    Author     : WarMachine
--%>

<%@page import="Controlador.ControladorBody"%>
<%@page import="Controlador.ControladorNav"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
                <div class="panel-heading">
                    <h1>Gestionar Matricula</h1>
                </div>
                <!-- /.panel-heading -->
                <div class="panel-body">
                    <!-- Nav tabs -->
                    <ul class="nav nav-tabs">
                        <li class=""><a href="#crear" data-toggle="tab" aria-expanded="false">Nuevo Estudiante</a>
                        </li>
                        <li class=""><a href="#actualizarrol" data-toggle="tab" aria-expanded="false">Instrumento-Estudiante</a>
                        </li>
                        <li class=""><a href="#darbajarol" data-toggle="tab" aria-expanded="false">Pagos</a>
                        </li>
                    </ul>

                    <!-- Tab panes -->
                    <div class="tab-content">
                        <div class="tab-pane fade" id="crear">
                            </br>
                            <div class="col-md-6">
                                <form action="" id="newUser">
                                    <div class="form-group">
                                        <label>Usuario</label>
                                        <input class="form-control" id = "nombreUsuario">
                                        <label>Contraceña</label>
                                        <input class="form-control" id = "passUsuario">
                                        
                                        </br>
                                        <input type="button" id="insertarUser" value="Crear" class="btn btn-default" />
                                    </div>
                                </form>
                                <div id="notificacion">

                                </div>
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

            </div>
            <!-- /#page-wrapper -->

        </div>
        <!-- /#wrapper -->
    </body>

    <%@include file="foother.jsp" %>

</html>