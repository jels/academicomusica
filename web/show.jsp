<%-- 
    Document   : show
    Created on : 02/08/2017, 02:58:33 PM
    Author     : WarMachine
--%>


<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

    <%@include file="head.jsp" %>

    <body>

        <div id="wrapper">
            <div id="page-wrapper">
                <div class="row">
                    <div class="tab-pane fade" id="new">
                        </br>
                        <form action="" id="idPersona">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label>Primer Nombre</label>
                                    <input class="form-control" id = "primerNombreP">
                                    <label>Primer Apellido</label>
                                    <input class="form-control" id = "primerApellidoP">
                                    <label>C.I.</label>
                                    <input class="form-control" id = "ciPersona">
                                    <label>Teléfono</label>
                                    <input class="form-control" id = "telefonoPersona">
                                    <label>Sexo</label>
                                    <input class="form-control" id = "sexoPersona">
                                    <label>Profesión</label>
                                    <input class="form-control" id = "profecionPersona">
                                    <label>Contraceña</label>
                                    <input class="form-control" id = "pass">
                                    </br>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label>Segundo Nombre</label>
                                    <input class="form-control" id = "segundoNombreP">
                                    <label>Segundo Apellido</label>
                                    <input class="form-control" id = "segundoApellidoP">
                                    <label>Dirección</label>
                                    <input class="form-control" id = "direccionPersona">
                                    <label>Fecha de Nacimiento</label>
                                    <input class="form-control" id = "fechaNacimPersona">
                                    <label>Correo Electrónico</label>
                                    <input class="form-control" id = "e-mailPersona">
                                    <label>Usuario</label>
                                    <input class="form-control" id = "usuarioEst">
                                    <label>Repita Contraceña</label>
                                    <input class="form-control" id = "pass2">
                                    </br>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <input type="button" id="insertarpersona" value="Crear" class="btn btn-default" />
                            </div>
                        </form>


                        <div class="form-group">
                            <label>Inline Radio Buttons</label>
                            <label class="radio-inline">
                                <input name="optionsRadiosInline" id="optionsRadiosInline1" value="option1" checked="" type="radio">1
                            </label>
                            <label class="radio-inline">
                                <input name="optionsRadiosInline" id="optionsRadiosInline2" value="option2" type="radio">2
                            </label>
                            <label class="radio-inline">
                                <input name="optionsRadiosInline" id="optionsRadiosInline3" value="option3" type="radio">3
                            </label>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- /#wrapper -->
    </body>

    <%@include file="foother.jsp" %>

</html>