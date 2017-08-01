/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Rol_model;
import Modelo.Usuario;

/**
 *
 * @author WarMachine
 */
public class ControladorBody {

    public String getViewIndexBox(String user) {
        String htmlcode = "";
        Usuario us = new Usuario();
        us.setNombreUsuario(user);
        Rol_model rm = new Rol_model();
        switch (rm.findRol(us)) {
            case "SuperAdministrador":
                htmlcode += getViewIndexBoxRoot();
                break;
            case "Director":
                htmlcode += getViewIndexBoxDire();
                break;
            case "Docente":
                htmlcode += getViewIndexBoxDoce();
                break;
            case "Secretaria":
                htmlcode += getViewIndexBoxSecre();
                break;
            case "Estudiante":
                htmlcode += getViewIndexBoxEst();
                break;
            case "false":
                htmlcode += "";
                break;
            default:
                break;
        }
        return htmlcode;
    }

    private String getViewIndexBoxRoot() {

        ControladorRoles cnr = new ControladorRoles();
        int roles = cnr.cantidadRoles();
        ControladorUsuarios cnu = new ControladorUsuarios();
        int user = cnu.cantidadUsuarios();

        String htmlcode = "<!-- bloque superior (estudiantes y docentes) -->\n"
                + "                <div class=\"row\">\n"
                + "                    <div class=\"col-lg-3 col-md-6\">\n"
                + "                    </div>\n"
                + "                    <div class=\"col-lg-3 col-md-6\">\n"
                + "                        <div class=\"panel panel-primary\">\n"
                + "                            <div class=\"panel-heading\">\n"
                + "                                <div class=\"row\">\n"
                + "                                    <div class=\"col-xs-3\">\n"
                + "                                        <i class=\"fa fa-users  fa-5x\"></i>\n"
                + "                                    </div>\n"
                + "                                    <div class=\"col-xs-9 text-right\">\n"
                + "                                        <div class=\"huge\">"+user+"</div>\n"
                + "                                        <div>Usuarios</div>\n"
                + "                                    </div>\n"
                + "                                </div>\n"
                + "                            </div>\n"
                + "                            <a href=\"ver_user.jsp\">\n"
                + "                                <div class=\"panel-footer\">\n"
                + "                                    <span class=\"pull-left\">Ver Detalles</span>\n"
                + "                                    <span class=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\n"
                + "                                    <div class=\"clearfix\"></div>\n"
                + "                                </div>\n"
                + "                            </a>\n"
                + "                        </div>\n"
                + "                    </div>\n"
                + "                    <div class=\"col-lg-3 col-md-6\">\n"
                + "                        <div class=\"panel panel-green\">\n"
                + "                            <div class=\"panel-heading\">\n"
                + "                                <div class=\"row\">\n"
                + "                                    <div class=\"col-xs-3\">\n"
                + "                                        <i class=\"fa fa-briefcase fa-5x\"></i>\n"
                + "                                    </div>\n"
                + "                                    <div class=\"col-xs-9 text-right\">\n"
                + "                                        <div class=\"huge\">" + roles + "</div>\n"
                + "                                        <div>Roles</div>\n"
                + "                                    </div>\n"
                + "                                </div>\n"
                + "                            </div>\n"
                + "                            <a href=\"ver_roles.jsp\">\n"
                + "                                <div class=\"panel-footer\">\n"
                + "                                    <span class=\"pull-left\">Ver Detalles</span>\n"
                + "                                    <span class=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\n"
                + "                                    <div class=\"clearfix\"></div>\n"
                + "                                </div>\n"
                + "                            </a>\n"
                + "                        </div>\n"
                + "                    </div>\n"
                + "                </div>";

        return htmlcode;
    }

    private String getViewIndexBoxDire() {
        String htmlcode = "";

        return htmlcode;
    }

    private String getViewIndexBoxDoce() {
        String htmlcode = "";

        return htmlcode;
    }

    private String getViewIndexBoxSecre() {
        String htmlcode = "";

        return htmlcode;
    }

    private String getViewIndexBoxEst() {
        String htmlcode = "";

        return htmlcode;
    }

}
