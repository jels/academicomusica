/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
                    window.location.href="menu.jsp";
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
//
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