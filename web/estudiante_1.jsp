<%-- 
    Document   : menu
    Created on : 01/06/2017, 04:22:26 PM
    Author     : WarMachine
--%>

<%@page import="Controlador.ControladorUsuarios"%>

<%
    
%>

<!DOCTYPE html>
<html>

    <%@include file="head.jsp" %>
    <body>

        <div id="wrapper">

            <div id="page-wrapper">

                <div class="panel-heading">
                    <h1>Gestionar Los Estudiantes</h1>
                </div>
                <!-- /.panel-heading -->
                <div class="panel-body">
                    <!-- Nav tabs -->
                    <ul class="nav nav-tabs">
                        <li class=""><a href="#crear" data-toggle="tab" aria-expanded="false">Crear</a>
                        </li>
                        <li class=""><a href="#profile-pills" data-toggle="tab" aria-expanded="false">Actualizar</a>
                        </li>
                        <li class=""><a href="#messages-pills" data-toggle="tab" aria-expanded="false">Dar de Baja</a>
                        </li>
                        <li class=""><a href="#settings-pills" data-toggle="tab" aria-expanded="false">Eliminar</a>
                        </li>
                    </ul>

                    <!-- Tab panes -->
                    <div class="tab-content">
                        
                        <div class="tab-pane fade" id="profile-pills">
                            <h4>Profile Tab</h4>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                        </div>
                        <div class="tab-pane fade" id="messages-pills">
                            <h4>Messages Tab</h4>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                        </div>
                        <div class="tab-pane fade" id="settings-pills">
                            <h4>Settings Tab</h4>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                        </div>
                    </div>
                </div>
                <!-- /.panel-body -->
            </div>
        </div>
    </body>

    <%@include file="foother.jsp" %>
</html>