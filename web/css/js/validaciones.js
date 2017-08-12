

window.addEventListener('load', function () {
    //alert("Cargado");
    document.getElementById('enviardatos').addEventListener('click', function () {
        //alert('click...');
        var nombre = document.getElementById('username').value;
        var pass = document.getElementById('password').value;
        var bandera = false;
        if (nombre.length > 0 && pass.length > 0) {
            bandera = true;
        }
        if (bandera) {
//            alert('Campos llenos...');
            $.post('login.do', {
                username: nombre,
                password: pass
            }, function (responseText) {
                if (responseText === "true") {
                    $('#tabla').html("<div class=\"panel-body\"><div class=\"alert alert-success text-center\">Usuario Correcto</div></div>");
                    window.location.href = "menu.jsp";
                } else {
                    $('#tabla').html("<div class=\"panel-body\"><div class=\"alert alert-danger text-center\">Usuario Incorrecto</div></div>");
                }


            });
//            document.getElementById('formInicio').submit();
        } else {
            alert('Rellene todos los campos...');
        }
    });
});

window.addEventListener('load', function () {
    document.getElementById('insertarmateria').addEventListener('click', function () {
        //alert('click...');
        var nombremateria = document.getElementById('nombremateria').value;
        var descripcionmateria = document.getElementById('descripcionmateria').value;
        var bandera = false;
        if (nombremateria.length > 0 && descripcionmateria.length > 0) {
            bandera = true;
        }
        if (bandera) {
//            alert('Campos llenos...');
            $.post('reg-mat.do', {
                nombremateria: nombremateria,
                descripcionmateria: descripcionmateria
            }, function (responseText) {
                if (responseText === "true") {
                    alert('Materia registrada correctamente');
                    // $('#tabla').html("<div class=\"panel-body\"><div class=\"alert alert-success text-center\">Usuario Correcto</div></div>");
                    window.location.href = "materia.jsp";
                } else {
                    alert('Hubo un error al registrar materia');
                    // $('#tabla').html("<div class=\"panel-body\"><div class=\"alert alert-danger text-center\">Usuario Incorrecto</div></div>");
                }
            });
//            document.getElementById('formInicio').submit();
        } else {
            alert('Rellene todos los campos...');
        }
    });
});

window.addEventListener('load', function () {
    document.getElementById('cerrarsession').addEventListener('click', function () {
        alert('Esta Cerrando la Session...');
        $('#closesession').html("<% session.invalidate(); %>");
        window.location.href = "index.jsp";
    });
});

window.addEventListener('load', function () {
    document.getElementById('insertarrol').addEventListener('click', function () {
        var nombreRol = document.getElementById('nombreRol').value;
        var descripcionRol = document.getElementById('descripcionRol').value;
        var bandera = false;
        if (nombreRol.length > 0 && descripcionRol.length > 0) {
            bandera = true;
        }
        if (bandera) {
            $.post('regrol.do', {
                nombreRol: nombreRol,
                descripcionRol: descripcionRol
            }, function (responseText) {
                if (responseText === "true") {
                    $('#notificacionrol').html("<div class=\"panel-body\"><div class=\"alert alert-success text-center\">Rol Creado Correctamente</div></div>");
                    window.location.href = "new_rol.jsp";
                } else {
                    $('#notificacionrol').html("<div class=\"panel-body\"><div class=\"alert alert-danger text-center\">Error Al Crear el Rol</div></div>");
                }
            });
        } else {
            alert('Rellene todos los campos...');
        }
    });
});

window.addEventListener('load', function () {
    document.getElementById('insertarUser').addEventListener('click', function () {
        var nombreUsuario = document.getElementById('nombreUsuario').value;
        var passUsuario = document.getElementById('passUsuario').value;
        var idRol = document.getElementById('idRol').value;
        var bandera = false;
        if (nombreUsuario.length > 0 && passUsuario.length > 0 && idRol.length > 0) {
            bandera = true;
        }
        
        if (bandera) {
            $.post('reguser.do', {
                nombreUsuario: nombreUsuario,
                passUsuario: passUsuario,
                idRol: idRol
            }, function (responseText) {
                if (responseText === "true") {
                    $('#notificacion').html("<div class=\"panel-body\"><div class=\"alert alert-success text-center\">Usuario Creado Correctamente</div></div>");
                    window.location.href = "new_user.jsp";
                } else {
                    $('#notificacion').html("<div class=\"panel-body\"><div class=\"alert alert-danger text-center\">Usuario Existente</div></div>");
                }
            });
        } else {
            alert('Rellene todos los campos...');
        }
    });
});


window.addEventListener('load', function () {
    document.getElementById('insertarrol').addEventListener('click', function () {
        var nombreRol = document.getElementById('nombreRol').value;
        var descripcionRol = document.getElementById('descripcionRol').value;
        var bandera = false;
        if (nombreRol.length > 0 && descripcionRol.length > 0) {
            bandera = true;
        }
        if (bandera) {
            $.post('regrol.do', {
                nombreRol: nombreRol,
                descripcionRol: descripcionRol
            }, function (responseText) {
                if (responseText === "true") {
                    $('#notificacionrol').html("<div class=\"panel-body\"><div class=\"alert alert-success text-center\">Rol Creado Correctamente</div></div>");
                    window.location.href = "new_rol.jsp";
                } else {
                    $('#notificacionrol').html("<div class=\"panel-body\"><div class=\"alert alert-danger text-center\">Error Al Crear el Rol</div></div>");
                }
            });
        } else {
            alert('Rellene todos los campos...');
        }
    });
});







//$(document).ready(function () {
//    $('#enviarDatos').click(function (event) {
//        var username = $('#username').val();
//        var password = $('#password').val();
//        //alert("usuario: " + username);
//        //alert("pass: " + password);
//        // Si en vez de por post lo queremos hacer por get, cambiamos el $.post por $.get
//        $.post('login.do', {
//            username: username,
//            password: password
//        }, function (responseText) {
//
//            $('#tabla').html(responseText);
//        });
//        //alert("hola");
//    });
//});