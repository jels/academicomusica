<%-- 
    Document   : login
    Created on : 14/05/2017, 10:12:14 AM
    Author     : WarMachine
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

    <%@include file="head.jsp" %>

    <body>

        <div class="container">
            <div class="row">
                <div class="col-md-4 col-md-offset-4">
                    <div class="login-panel panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title">Iniciar Sesion</h3>
                        </div>
                        <div class="panel-body">
                            <form action="login.do" id="enviarDatos">
                                <fieldset>
                                    <div class="form-group">
                                        <input class="form-control" id="username" placeholder="Usuario" name="username" type="email" autofocus>
                                    </div>
                                    <div class="form-group">
                                        <input class="form-control" id="password" placeholder="Contraceña" name="password" type="password" value="">
                                    </div>
                                    <div class="checkbox">
                                        <label>
                                            <input name="remember" type="checkbox" value="Remember Me">Recordar Contraceña
                                        </label>
                                    </div>
                                    <!-- Change this to a button or input when using this as a form -->
                                    <input type="button" id="enviardatos" value="Iniciar Sesion" class="btn btn-lg btn-success btn-block" />

                                    <!-- <a href="menu.jsp" class="btn btn-lg btn-success btn-block">Login</a> -->
                                </fieldset>
                            </form>
                        </div>
                        <div id="tabla"></div>
                    </div>
                </div>
            </div>
        </div>


    </body>

    <%@include file="foother.jsp" %>

</html>
