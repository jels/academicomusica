<%--
    Document   : new_rol
    Created on : 19/07/2017, 11:42:19 AM
    Author     : WarMachine
--%>

<%@page import="Controlador.ControladorNav"%>
<%@page import="Controlador.ControladorUsuarios"%>
<%
    HttpSession objsession = request.getSession(false);
    String usuario = (String) objsession.getAttribute("usuario");
    if (objsession.equals(false)) {//esta linea es la que ayuda a que no salga el error de null...
        response.sendRedirect("index.jsp");
    } else if (usuario.equals("null")) {
        session.invalidate();
        response.sendRedirect("index.jsp");
    }
%>

<!DOCTYPE html>
<html>

    <%@include file="head.jsp"  %>
    <body>

        <div id="wrapper">

            <% ControladorNav cnv = new ControladorNav();%>
            <%=cnv.getNav(usuario)%>

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
                                <form action="" id="newRol">
                                    <div class="form-group">
                                        <label>Nombre Rol</label>
                                        <input class="form-control" id = "nombreRol">
                                        <label>Descripcion Rol</label>
                                        <input class="form-control" id = "descripcionRol">
                                        </br>
                                        <input type="button" id="insertarrol" value="Crear" class="btn btn-default" />
                                    </div>
                                </form>
                                <div id="notificacionrol">

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
                <!-- /.panel-body -->
            </div>
        </div>
    </body>

    <%@include file="foother.jsp" %>

</html>
