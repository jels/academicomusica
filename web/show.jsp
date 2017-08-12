<%-- 
    Document   : show
    Created on : 02/08/2017, 02:58:33 PM
    Author     : WarMachine
--%>
<%@page import="Controlador.ControladorBody"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>



<!DOCTYPE html>
<html>


    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Academico Musica</title>

        <link href="css/new/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="css/new/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">
        <link href="css/new/dist/css/sb-admin-2.css" rel="stylesheet">
        <link href="css/new/vendor/morrisjs/morris.css" rel="stylesheet">
        <link href="css/new/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    </head>

    <body>

        <div id="wrapper">

            <div id="page-wrapper">

                <div class="panel-heading">
                    <h1>Gestionar Pagos</h1>
                </div>
                <!-- desde aki cortar...-->

                </br>
                <form action="" id="cursos">
                    <h3 class="text-center">Asignar Curso al Estudiante</h3>
                    <div class="row show-grid">
                        <div class="col-md-4">
                            <label>Curso</label>
                            <select class="form-control" id="cursoEst">
                                <option value="Violin">Violin</option>
                                <option value="Piano">Piano</option>
                            </select>
                        </div>
                    </div>
                    <div class="row show-grid">
                        <div class="col-md-2">
                            <input type="button" id="newCursoEstu" value="Crear" class="btn btn-default center-block">
                        </div>
                    </div>
                </form>




            </div>
        </div>


        <!-- desde aki cortar...-->









        <!--
        
        
        
        <div class="col-md-4">
                        <label>Estudiante</label>
                        <select class="form-control" id="estCurso" required/>
                        <option> </option>
                        <option>1</option>
                        <option>2</option>
                        </select>
                    </div>
                    <div class="col-md-4">
                        <label>Total a Cancelar</label>
                        <div class="input-group">
                            <span class="input-group-addon">Bs.</span>
                            <input class="form-control" placeholder="Total en Bolivianos" min="1" title="Solo numeros..." type="number" required/>
                        </div>
                    </div>
                </div>
                <div class="row show-grid">
                    <div class="col-md-4">
                        <label>Fecha de Matricula</label>
                        <input class="form-control" id = "nacimientoE" placeholder="YYYY-MM-DD" pattern="^(19|20)+([0-9]{2})([-])([0-9]{1,2})([-])([0-9]{1,2})$" title="YYYY-MM-DD" required/>
                    </div>
                </div>
        
        
        
        
                        <div class="row show-grid">
                            </br>
                            <form action="" id="idPersona">
                                <h3 class="text-center">Datos del Estudiante</h3>
                                <div class="row show-grid">
                                    <div class="col-md-4">
                                        <label>Primer Nombre</label>
                                        <input class="form-control" id = "primerNombreE" placeholder="Primer Nombre" required/>
                                    </div>
                                    <div class="col-md-4">
                                        <label>Segundo Nombre</label>
                                        <input class="form-control" id = "segundoNombreE" placeholder="Segundo Nombre" >
                                    </div>
                                    <div class="col-md-4">
                                        <label>Primer Apellido</label>
                                        <input class="form-control" id = "primerApelidoE" placeholder="Primer Apellido" required/>
                                    </div>
                                </div>
                                <div class="row show-grid">
                                    <div class="col-md-4">
                                        <label>Segundo Apellido</label>
                                        <input class="form-control" id = "segundoApelidoE" placeholder="Segundo Apellido" >
                                    </div>
                                    <div class="col-md-4">
                                        <label>C.I.</label>
                                        <input class="form-control" id = "ciE" placeholder="Numero de CI" required/>
                                    </div>
                                    <div class="col-md-4">
                                        <label>Nacionalidad</label>
                                        <input class="form-control" id = "nacionalidadE" placeholder="Nacionalidad" required/>
                                    </div>
                                </div>
                                <div class="row show-grid">
                                    <div class="col-md-4">
                                        <label>Es Interno?</label>
                                        <select class="form-control" id="internadoE">
                                            <option value="NO">No</option>
                                            <option value="SI">Si</option>
                                        </select>
                                    </div>
                                    <div class="col-md-8">
                                        <label>Direccion Estudiante</label>
                                        <input class="form-control" id = "direccionE" placeholder="Direccion Estudiante" required/>
                                    </div>
                                </div>
                                <div class="row show-grid">
                                    <div class="col-md-4">
                                        <label>Telefono / Celular</label>
                                        <input class="form-control" id = "telefonoE" placeholder="N° de Telefono / Celular" required/>
                                    </div>
                                    <div class="col-md-4">
                                        <label>Fecha de Nacimiento</label>
                                        <input class="form-control" id = "nacimientoE" placeholder="YYYY-MM-DD" pattern="^(19|20)+([0-9]{2})([-])([0-9]{1,2})([-])([0-9]{1,2})$" title="YYYY-MM-DD" required/>
                                    </div>
                                    <div class="col-md-4">
                                        <label>Genero</label>
                                        <select class="form-control" id="sexoE">
                                            <option value="Masculino">Masculino</option>
                                            <option value="Femenino">Femenino</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="row show-grid">
                                    <div class="col-md-4">
                                        <label>E-Mail</label>
                                        <input class="form-control" id = "emailE" placeholder="ejemplo@ejemplo.com" pattern="^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$" title="ejemplo@ejemplo.com" required/>
                                    </div>
                                    <div class="col-md-4">
                                        <label>Grado Academico</label>
                                        <select class="form-control" id="profecionE">
                                            <option value="Primario">Primario</option>
                                            <option value="Secundario">Secundario</option>
                                            <option value="Universitario">Universitario</option>
                                            <option value="Licenciatura">Licenciatura</option>
                                            <option value="Magister">Magister</option>
                                            <option value="Doctor">Doctor</option>
                                        </select>
                                    </div>
                                    <div class="col-md-4">
                                        <label>Modalidad</label>
                                        <select class="form-control" id="tipoEstudioE">
        <% ControladorBody cnb = new ControladorBody();%>
        <%=cnb.seleccionadorModalidades()%>
    
    </select>
    </div>
    </div>
    <div class="row show-grid">
    <div class="col-md-4">
    <label>Dispone Instrumento?</label>
    <select class="form-control" id="estudioMusicaE">
        <option value="NO">No</option>
        <option value="SI">Si</option>
    </select>
    </div>
    <div class="col-md-4">
    <label>Estudio Musica?</label>
    <select class="form-control" id="disponeInstrumentoE">
        <option value="NO">No</option>
        <option value="SI">Si</option>
    </select>
    </div>
    <div class="col-md-4">
    <label>Detalles</label>
    <textarea class="form-control" id="descripcionE" rows="3" style="width: 200px; height: 34px;" placeholder="Estudios Realizados" required/></textarea>
    </div>
    </div>
    
    <h3 class="text-center">Datos del Padre / Encargado</h3>
    <div class="row show-grid">
    <div class="col-md-4">
    <label>Primer Nombre</label>
    <input class="form-control" id = "primerNombreP" placeholder="Primer Nombre" required/>
    </div>
    <div class="col-md-4">
    <label>Segundo Nombre</label>
    <input class="form-control" id = "segundoNombreP" placeholder="Segundo Nombre" >
    </div>
    <div class="col-md-4">
    <label>Primer Apellido</label>
    <input class="form-control" id = "primerApelidoP" placeholder="Primer Apellido" required/>
    </div>
    </div>
    <div class="row show-grid">
    <div class="col-md-4">
    <label>Segundo Apellido</label>
    <input class="form-control" id = "segundoApelidoP" placeholder="Segundo Apellido" >
    </div>
    <div class="col-md-4">
    <label>C.I.</label>
    <input class="form-control" id = "ciP" placeholder="Numero de CI" required/>
    </div>
    <div class="col-md-4">
    <label>Nacionalidad</label>
    <input class="form-control" id = "nacionalidadP" placeholder="Nacionalidad" required/>
    </div>
    </div>
    <div class="row show-grid">
    <div class="col-md-4">
    <label>Es Interno?</label>
    <select class="form-control" id="internadoP">
        <option value="NO">No</option>
        <option value="SI">Si</option>
    </select>
    </div>
    <div class="col-md-8">
    <label>Dirección Padre</label>
    <input class="form-control" id = "direccionP" placeholder="Direccion Padre" required/>
    </div>
    </div>
    <div class="row show-grid">
    <div class="col-md-4">
    <label>Telefono / Celular</label>
    <input class="form-control" id = "telefonoP" placeholder="N° de Telefono / Celular" required/>
    </div>
    <div class="col-md-4">
    <label>Fecha de Nacimiento</label>
    <input class="form-control" id = "nacimientoP" placeholder="YYYY-MM-DD" pattern="^(19|20)+([0-9]{2})([-])([0-9]{1,2})([-])([0-9]{1,2})$" title="YYYY-MM-DD" required/>
    </div>
    <div class="col-md-4">
    <label>Genero</label>
    <select class="form-control" id="sexoP">
        <option value="Masculino">Masculino</option>
        <option value="Femenino">Femenino</option>
    </select>
    </div>
    </div>
    <div class="row show-grid">
    <div class="col-md-4">
    <label>E-Mail</label>
    <input class="form-control" id = "emailP" placeholder="ejemplo@ejemplo.com" pattern="^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$" title="ejemplo@ejemplo.com" required/>
    </div>
    <div class="col-md-4">
    <label>Grado Academico</label>
    <select class="form-control" id="profecionP">
        <option value="Primario">Primario</option>
        <option value="Secundario">Secundario</option>
        <option value="Universitario">Universitario</option>
        <option value="Licenciado">Licenciado</option>
        <option value="Magister">Magister</option>
        <option value="Doctor">Doctor</option>
    </select>
    </div>
    </div>
    <div class="row show-grid">
    <div class="col-md-2">
    <input type="button" id="insertarpersona" value="Crear" class="btn btn-default" />
    </div>
    </div>
    </form>
    </div> -->
        <!-- hasta aki cortar...-->
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

        </br>
        <div class="row">

        </div>
    </div>
</div>

<!-- /#wrapper -->

</body>

<footer class="">



    <script src="css/new/vendor/jquery/jquery.min.js"></script>
    <script src="css/new/vendor/bootstrap/js/bootstrap.min.js"></script>
    <script src="css/new/vendor/metisMenu/metisMenu.min.js"></script>
    <script src="css/new/vendor/raphael/raphael.min.js"></script>
    <script src="css/new/vendor/morrisjs/morris.min.js"></script>
    <script src="css/new/data/morris-data.js"></script>
    <script src="css/new/dist/js/sb-admin-2.js"></script>
    <script src="css/js/validaciones.js"></script>

</footer>

</html>