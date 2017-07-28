<%-- 
    Document   : index
    Created on : 14/05/2017, 09:49:12 AM
    Author     : WarMachine
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<%
    session.invalidate();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no"/>
        <title>Bienvenidos a Musica UAB</title>
        <link rel="shortcut icon" href="img/logoMusica.png">
        <!-- CSS  -->
        <link href="css/css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="css/css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    </head>
    <body class="grey lighten-2">
        <header>
            <div class="fixed-action-btn vertical click-to-toggle">
                <a class="btn-floating btn-large black pulse">
                    <i class="material-icons ">menu</i>
                </a>
                <ul>
                    <li><a href="login.jsp" class="btn-floating btn tooltipped orange" data-position="left" data-delay="50" data-tooltip="Login"><i class="material-icons">lock</i></a></li>
                    <li><a href="index.jsp" class="btn-floating btn tooltipped grey" data-position="left" data-delay="50" data-tooltip="Inicio"><i class="material-icons">dashboard</i></a></li>
                    <li><a href="#" class="btn-floating btn tooltipped red" data-position="left" data-delay="50" data-tooltip="Noticias"><i class="material-icons">list</i></a></li>
                    <li><a href="#" class="btn-floating btn tooltipped light-green" data-position="left" data-delay="50" data-tooltip="Testimonios"><i class="material-icons">comment</i></a></li>
                    <li><a href="#" class="btn-floating btn tooltipped deep-purple" data-position="left" data-delay="50" data-tooltip="Multimedia"><i class="material-icons">perm_media</i></a></li>
                    <li><a href="#" class="btn-floating btn tooltipped blue-grey" data-position="left" data-delay="50" data-tooltip="Carreras"><i class="material-icons">info</i></a></li>
                    <li><a href="#" class="btn-floating btn tooltipped blue-grey" data-position="left" data-delay="50" data-tooltip="Contactos"><i class="material-icons">perm_identity</i></a></li>
                </ul>
            </div>

            <div class="navbar">

                <nav class="black" role="navigation">
                    <div class="nav-wrapper container">
                        <ul class="right hide-on-med-and-down">

                            <li>
                                <a id="logo-container" href="index.jsp" class="brand-logo center grey-text text-lighten-3">
                                    Departamento de Formacion Musical UAB
                                </a>
                            </li>
                        </ul>
                        <ul id="nav-mobile" class="side-nav">
                            <li><a href="login.jsp"><i class="fa fa-sign-in"></i>Login</a></li>
                            <li><a href="#">Inicio</a></li>
                        </ul>
                        <a href="#" data-activates="nav-mobile" class="button-collapse menu">
                            <i class="fa fa-navicon"> </i>
                            <img src="" alt="log" class="circle responsive-img" height="20" width="20"> 
                            Departamento de Formacion Musical UAB
                        </a>
                    </div>
                </nav>

            </div>
        </header>
        <div class="section">
            <div class="row">
                <div class="col s12">
                    <div class="slider">
                        <ul class="slides">
                            <li>
                                <img src="img/bannerMusica.jpg" class="responsive-img">
                            </li>
                            <li>
                                <img src="img/flashMobUab.jpg" class="responsive-img">
                            </li>
                        </ul>

                    </div>
                </div>
            </div>
        </div>


        <br><br><br><br>
    </body>

    <footer class="page-footer black grey-text text-lighten-3">
        <div class="container"  id="contactos">
            <div class="row">
                <div class="col l5 s12">
                    <h5 class="white-text">Departamento de Formacion Musical UAB</h5>
                    <p class="grey-text text-lighten-4">La Armonía no viene de los Instrumentos viene del corazón</p>
                </div>
                <div class="col l4 s12">
                    <h5 class="white-text">Enlaces</h5>
                    <ul>
                        <li><a class="grey-text text-lighten-3" href="#!">Inicio</a></li>
                        <li><a class="grey-text text-lighten-3" href="#!">Carreras</a></li>
                        <li><a class="grey-text text-lighten-3" href="#">Testimonios</a></li>
                        <li><a class="grey-text text-lighten-3" href="#!">Noticias</a></li>
                    </ul>
                </div>
                <div class="col l3 s12 center-align">
                    <h5 class="white-text">Contactenos</h5>
                    <form data-form-output="form-output-global" data-form-type="subscribe" method="post" action="#" class="rd-mailform form-classic form-inline offset-top-15 center-align" novalidate="novalidate">
                        <div class="form-group has-error center-align">
                            <input id="contact-email" type="email" name="email" data-constraints="@Email @Required" class="form-control form-control-has-validation"><span class="form-validation">Ingresa tu E-Mail</span>
                        </div>
                        <button class="btn waves-effect waves-light green darken-4" type="submit" name="action">Enviar</button>
                    </form>
                </div>
            </div>
        </div>
        <div class="footer-copyright">
            <div class="container">
                © 2017 Copyright
                <a class="grey-text text-lighten-4 right" href="#!">EliasSauer</a>
            </div>
        </div>
    </footer>

    <!--  Scripts-->
    <script src="css/js/jquery.min.js"></script>
    <script src="css/js/materialize.min.js"></script>
    <script src="css/js/init.js"></script>
    <script src="css/js/validaciones.js"></script>

    <script type="text/javascript">
        $(document).ready(function () {
            $('.slider').slider();
            $(".button-collapse").sideNav();
            $('.materialboxed').materialbox();
            $('.modal').modal();
            $('.tooltipped').tooltip({delay: 50});
        });
    </script>

</html>