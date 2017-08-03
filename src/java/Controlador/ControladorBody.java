/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Rol_model;
import Modelo.Usuario;
import Modelo.Usuario_model;

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
            case "Secretari@":
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

    public String getViewBienvenida(String user) {

        String htmlcode = "";
        Usuario us = new Usuario();
        us.setNombreUsuario(user);
        Rol_model rm = new Rol_model();
        String rol = rm.findRol(us);
        Usuario_model usm = new Usuario_model();
        String usuario = usm.usuario(user);
        switch (rol) {
            case "SuperAdministrador":
                htmlcode += "<div class=\"row\">\n"
                        + "      <div class=\"col-lg-12\">\n"
                        + "          <div class=\"center\">\n"
                        + "             <h1 class=\"page-header\">Bienvenido..." + rol + " : " + usuario + "</h1>\n"
                        + "         </div>\n"
                        + "      </div>\n"
                        + "  </div>";
                break;
            case "Director":
                htmlcode += "<div class=\"row\">\n"
                        + "      <div class=\"col-lg-12\">\n"
                        + "          <div class=\"center\">\n"
                        + "             <h1 class=\"page-header\">Bienvenid@..." + rol + " : " + usuario + "</h1>\n"
                        + "         </div>\n"
                        + "      </div>\n"
                        + "  </div>";
                break;
            case "Docente":
                htmlcode += "<div class=\"row\">\n"
                        + "      <div class=\"col-lg-12\">\n"
                        + "          <div class=\"center\">\n"
                        + "             <h1 class=\"page-header\">Bienvenid@..." + rol + " : " + usuario + "</h1>\n"
                        + "         </div>\n"
                        + "      </div>\n"
                        + "  </div>";
                break;
            case "Secretari@":
                htmlcode += "<div class=\"row\">\n"
                        + "      <div class=\"col-lg-12\">\n"
                        + "          <div class=\"center\">\n"
                        + "             <h1 class=\"page-header\">Bienvenid@..." + rol + " : " + usuario + "</h1>\n"
                        + "         </div>\n"
                        + "      </div>\n"
                        + "  </div>";
                break;
            case "Estudiante":
                htmlcode += "<div class=\"row\">\n"
                        + "      <div class=\"col-lg-12\">\n"
                        + "          <div class=\"center\">\n"
                        + "             <h1 class=\"page-header\">Bienvenid@..." + rol + " : " + usuario + "</h1>\n"
                        + "         </div>\n"
                        + "      </div>\n"
                        + "  </div>";
                break;
            case "false":
                htmlcode += "<div class=\"row\">\n"
                        + "      <div class=\"col-lg-12\">\n"
                        + "          <div class=\"center\">\n"
                        + "             <h1 class=\"page-header\">Bienvenido...: Usuario inexistente </h1>\n"
                        + "         </div>\n"
                        + "      </div>\n"
                        + "  </div>";
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
                + "                                        <div class=\"huge\">" + user + "</div>\n"
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
        ControladorRoles cnr = new ControladorRoles();
        int roles = cnr.cantidadRoles();
        ControladorUsuarios cnu = new ControladorUsuarios();
        int user = cnu.cantidadUsuarios();

        String htmlcode = "<!-- Bloque Superior (Matriculas y Estudiantes) -->\n"
                + "                <div class=\"row\">\n"
                + "                    <div class=\"col-lg-3 col-md-6\">\n"
                + "                    </div>\n"
                + "                    <div class=\"col-lg-3 col-md-6\">\n"
                + "                        <div class=\"panel panel-yellow\">\n"
                + "                            <div class=\"panel-heading\">\n"
                + "                                <div class=\"row\">\n"
                + "                                    <div class=\"col-xs-3\">\n"
                + "                                        <i class=\"fa fa-list-ol fa-5x\"></i>\n"
                + "                                    </div>\n"
                + "                                    <div class=\"col-xs-9 text-right\">\n"
                + "                                        <div class=\"huge\">" + user + "</div>\n"
                + "                                        <div>Matriculados</div>\n"
                + "                                    </div>\n"
                + "                                </div>\n"
                + "                            </div>\n"
                + "                            <a href=\"show_matriculas.jsp\">\n"
                + "                                <div class=\"panel-footer\">\n"
                + "                                    <span class=\"pull-left\">Ver Detalles</span>\n"
                + "                                    <span class=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\n"
                + "                                    <div class=\"clearfix\"></div>\n"
                + "                                </div>\n"
                + "                            </a>\n"
                + "                        </div>\n"
                + "                    </div>\n"
                + "                    <div class=\"col-lg-3 col-md-6\">\n"
                + "                        <div class=\"panel panel-red\">\n"
                + "                            <div class=\"panel-heading\">\n"
                + "                                <div class=\"row\">\n"
                + "                                    <div class=\"col-xs-3\">\n"
                + "                                        <i class=\"fa fa-users fa-5x\"></i>\n"
                + "                                    </div>\n"
                + "                                    <div class=\"col-xs-9 text-right\">\n"
                + "                                        <div class=\"huge\">" + roles + "</div>\n"
                + "                                        <div>Estudiantes</div>\n"
                + "                                    </div>\n"
                + "                                </div>\n"
                + "                            </div>\n"
                + "                            <a href=\"show_estudiantes.jsp\">\n"
                + "                                <div class=\"panel-footer\">\n"
                + "                                    <span class=\"pull-left\">Ver Detalles</span>\n"
                + "                                    <span class=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\n"
                + "                                    <div class=\"clearfix\"></div>\n"
                + "                                </div>\n"
                + "                            </a>\n"
                + "                        </div>\n"
                + "                    </div>\n"
                + "                </div>"
                + "<!-- Bloque Inferior (Docentes y Materias) -->\n"
                + "                <div class=\"row\">\n"
                + "                    <div class=\"col-lg-3 col-md-6\">\n"
                + "                    </div>\n"
                + "                    <div class=\"col-lg-3 col-md-6\">\n"
                + "                        <div class=\"panel panel-green\">\n"
                + "                            <div class=\"panel-heading\">\n"
                + "                                <div class=\"row\">\n"
                + "                                    <div class=\"col-xs-3\">\n"
                + "                                        <i class=\"fa fa-briefcase  fa-5x\"></i>\n"
                + "                                    </div>\n"
                + "                                    <div class=\"col-xs-9 text-right\">\n"
                + "                                        <div class=\"huge\">" + user + "</div>\n"
                + "                                        <div>Docentes</div>\n"
                + "                                    </div>\n"
                + "                                </div>\n"
                + "                            </div>\n"
                + "                            <a href=\"show_user.jsp\">\n"
                + "                                <div class=\"panel-footer\">\n"
                + "                                    <span class=\"pull-left\">Ver Detalles</span>\n"
                + "                                    <span class=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\n"
                + "                                    <div class=\"clearfix\"></div>\n"
                + "                                </div>\n"
                + "                            </a>\n"
                + "                        </div>\n"
                + "                    </div>\n"
                + "                    <div class=\"col-lg-3 col-md-6\">\n"
                + "                        <div class=\"panel panel-primary\">\n"
                + "                            <div class=\"panel-heading\">\n"
                + "                                <div class=\"row\">\n"
                + "                                    <div class=\"col-xs-3\">\n"
                + "                                        <i class=\"fa fa-th-list fa-5x\"></i>\n"
                + "                                    </div>\n"
                + "                                    <div class=\"col-xs-9 text-right\">\n"
                + "                                        <div class=\"huge\">" + roles + "</div>\n"
                + "                                        <div>Materias</div>\n"
                + "                                    </div>\n"
                + "                                </div>\n"
                + "                            </div>\n"
                + "                            <a href=\"show_materias.jsp\">\n"
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

    private String getViewIndexBoxEst() {
        String htmlcode = "";

        return htmlcode;
    }

    public String getViewNewEst(String user) {

        Rol_model rm = new Rol_model();
        Usuario us = new Usuario();
        us.setNombreUsuario(user);
        String rol = rm.findRol(us);
        String htmlcode = "";
        switch (rol) {
            case "SuperAdministrador":
                break;
            case "Director":
                htmlcode += "<div class=\"tab-pane fade\" id=\"crear\">\n"
                        + "                            </br>\n"
                        + "                            <div class=\"col-md-6\">\n"
                        + "                                <form action=\"reg-persona.do\" id=\"idPersona\">\n"
                        + "                                    <div class=\"form-group\">\n"
                        + "                                        <label>Primer Nombre</label>\n"
                        + "                                        <input class=\"form-control\" id = \"primerNombreP\">\n"
                        + "                                          <label>Segundo Nombre</label>\n"
                        + "                                        <input class=\"form-control\" id = \"segundoNombreP\">\n"
                        + "                                        <label>Primer Apellido</label>\n"
                        + "                                        <input class=\"form-control\" id = \"primerApellidoP\">\n"
                        + "                                          <label>Segundo Apellido</label>\n"
                        + "                                        <input class=\"form-control\" id = \"segundoApellidoP\">\n"
                        + "                                        <label>C.I.</label>\n"
                        + "                                        <input class=\"form-control\" id = \"ciPersona\">\n"
                        + "                                          <label>Dirección</label>\n"
                        + "                                        <input class=\"form-control\" id = \"direccionPersona\">\n"
                        + "                                        <label>Teléfono</label>\n"
                        + "                                        <input class=\"form-control\" id = \"telefonoPersona\">\n"
                        + "                                          <label>Fecha de Nacimiento</label>\n"
                        + "                                        <input class=\"form-control\" id = \"fechaNacimPersona\">\n"
                        + "                                        <label>Sexo</label>\n"
                        + "                                        <input class=\"form-control\" id = \"sexoPersona\">\n"
                        + "                                          <label>Correo Electrónico</label>\n"
                        + "                                        <input class=\"form-control\" id = \"e-mailPersona\">\n"
                        + "                                        <label>Profesión</label>\n"
                        + "                                        <input class=\"form-control\" id = \"profecionPersona\">\n"
                        + "                                        </br>\n"
                        + "                                        <input type=\"button\" id=\"insertarpersona\" value=\"Crear\" class=\"btn btn-default\" />\n"
                        + "                                    </div>\n"
                        + "                                </form>\n"
                        + "                            </div>\n"
                        + "                        </div>";
                break;
            case "Secretari@":
                htmlcode += "<div class=\"tab-pane fade\" id=\"new\">\n"
                        + "    </br>\n"
                        + "    <form action=\"\" id=\"idPersona\">\n"
                        + "        <div class=\"col-md-6\">\n"
                        + "            <div class=\"form-group\">\n"
                        + "                <label>Primer Nombre</label>\n"
                        + "                <input class=\"form-control\" id = \"primerNombreP\">\n"
                        + "                <label>Primer Apellido</label>\\\n"
                        + "                <input class=\"form-control\" id = \"primerApellidoP\">\n"
                        + "                <label>C.I.</label>\n"
                        + "                <input class=\"form-control\" id = \"ciPersona\">\n"
                        + "                <label>Teléfono</label>\n"
                        + "                <input class=\"form-control\" id = \"telefonoPersona\">\n"
                        + "                <label>Sexo</label>\n"
                        + "                <input class=\"form-control\" id = \"sexoPersona\">\n"
                        + "                <label>Profesión</label>\\n\"\n"
                        + "                <input class=\"form-control\" id = \"profecionPersona\">\n"
                        + "                <label>Contraceña</label>\n"
                        + "                <input class=\"form-control\" id = \"pass\">\n"
                        + "                </br>\n"
                        + "            </div>\n"
                        + "        </div>\n"
                        + "        <div class=\"col-md-6\">\n"
                        + "            <div class=\"form-group\">\n"
                        + "                <label>Segundo Nombre</label>\n"
                        + "                <input class=\"form-control\" id = \"segundoNombreP\">\n"
                        + "                <label>Segundo Apellido</label>\n"
                        + "                <input class=\"form-control\" id = \"segundoApellidoP\">\n"
                        + "                <label>Dirección</label>\n"
                        + "                <input class=\"form-control\" id = \"direccionPersona\">\n"
                        + "                <label>Fecha de Nacimiento</label>\n"
                        + "                <input class=\"form-control\" id = \"fechaNacimPersona\">\n"
                        + "                <label>Correo Electrónico</label>\n"
                        + "                <input class=\"form-control\" id = \"e-mailPersona\">\n"
                        + "                <label>Usuario</label>\n"
                        + "                <input class=\"form-control\" id = \"usuarioEst\">\n"
                        + "                <label>Repita Contraceña</label>\n"
                        + "                <input class=\"form-control\" id = \"pass2\">\n"
                        + "                </br>\n"
                        + "            </div>\n"
                        + "        </div>\n"
                        + "        <div class=\"col-md-6\">\n"
                        + "            <input type=\"button\" id=\"insertarpersona\" value=\"Crear\" class=\"btn btn-default\" />\n"
                        + "        </div>\n"
                        + "    </form>\n"
                        + "</div>";
                break;
            case "Docente":
                break;
            case "Estudiante":
                break;

        }

        return htmlcode;
    }
    
    public String getViewNewMat(Usuario us){
        return "";
    }
    

}
