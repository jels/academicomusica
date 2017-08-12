/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        Matricula_model matri = new Matricula_model();
        int matricula = matri.contarMatriculas();
        Estudiante_model em = new Estudiante_model();
        int est = em.contarEstudiantes();
        Docente_model dom = new Docente_model();
        int docentes = dom.contarDocentes();
        Materia_model matm = new Materia_model();
        int materias = matm.contarMaterias();
        Curso_model cum = new Curso_model();
        int cursos = cum.contarCursos();

        String htmlcode = "<!-- Bloque Superior (Matriculas y Estudiantes) -->\n"
                + "                <div class=\"row\">\n"
                + "                    <div class=\"col-lg-3 col-md-6\">\n"
                + "                        <div class=\"panel panel-yellow\">\n"
                + "                            <div class=\"panel-heading\">\n"
                + "                                <div class=\"row\">\n"
                + "                                    <div class=\"col-xs-3\">\n"
                + "                                        <i class=\"fa fa-list-ol fa-5x\"></i>\n"
                + "                                    </div>\n"
                + "                                    <div class=\"col-xs-9 text-right\">\n"
                + "                                        <div class=\"huge\">" + matricula + "</div>\n"
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
                + "                                        <div class=\"huge\">" + est + "</div>\n"
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
                + "                    <div class=\"col-lg-3 col-md-4\">\n"
                + "                        <div class=\"panel panel-green\">\n"
                + "                            <div class=\"panel-heading\">\n"
                + "                                <div class=\"row\">\n"
                + "                                    <div class=\"col-xs-3\">\n"
                + "                                        <i class=\"fa fa-briefcase  fa-5x\"></i>\n"
                + "                                    </div>\n"
                + "                                    <div class=\"col-xs-9 text-right\">\n"
                + "                                        <div class=\"huge\">" + docentes + "</div>\n"
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
                + "                    <div class=\"col-lg-3 col-md-4\">\n"
                + "                        <div class=\"panel panel-primary\">\n"
                + "                            <div class=\"panel-heading\">\n"
                + "                                <div class=\"row\">\n"
                + "                                    <div class=\"col-xs-3\">\n"
                + "                                        <i class=\"fa fa-th-list fa-5x\"></i>\n"
                + "                                    </div>\n"
                + "                                    <div class=\"col-xs-9 text-right\">\n"
                + "                                        <div class=\"huge\">" + materias + "</div>\n"
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
                + "                    <div class=\"col-lg-3 col-md-4\">\n"
                + "                      <div class=\"panel panel-default\">\n"
                + "                        <div class=\"panel-heading\">\n"
                + "                            <div class=\"row\">\n"
                + "                                <div class=\"col-xs-3\">\n"
                + "                                    <i class=\"fa fa-comments fa-5x\"></i>\n"
                + "                                </div>\n"
                + "                                <div class=\"col-xs-9 text-right\">\n"
                + "                                    <div class=\"huge\">" + cursos + "</div>\n"
                + "                                    <div>Cursos</div>\n"
                + "                                </div>\n"
                + "                            </div>\n"
                + "                        </div>\n"
                + "                        <a href=\"show_cursos.jsp\">\n"
                + "                            <div class=\"panel-footer\">\n"
                + "                                <span class=\"pull-left\">Ver Detalles</span>\n"
                + "                                <span class=\"pull-right\"><i class=\"fa fa-arrow-circle-right\"></i></span>\n"
                + "                                <div class=\"clearfix\"></div>\n"
                + "                            </div>\n"
                + "                        </a>\n"
                + "                      </div>"
                + "                    </div>"
                + "                </div>";

        return htmlcode;
    }

    private String getViewIndexBoxEst() {
        String htmlcode = "";

        return htmlcode;
    }

    public String getViewNewEst() {

//13
        String htmlcode = ""
                + "                    <form action=\"\" id=\"newPerson\">\n"
                + "                        <h3 class=\"text-center\">Datos del Estudiante</h3>\n"
                + "                        <div class=\"row show-grid\">\n"
                + "                            <div class=\"col-md-4\">\n"
                + "                                <label>Primer Nombre</label>\n"
                + "                                <input class=\"form-control\" id = \"primerNombreE\" placeholder=\"Primer Nombre\" required/>\n"
                + "                            </div>\n"
                + "                            <div class=\"col-md-4\">\n"
                + "                                <label>Segundo Nombre</label>\n"
                + "                                <input class=\"form-control\" id = \"segundoNombreE\" placeholder=\"Segundo Nombre\" >\n"
                + "                            </div>\n"
                + "                            <div class=\"col-md-4\">\n"
                + "                                <label>Primer Apellido</label>\n"
                + "                                <input class=\"form-control\" id = \"primerApelidoE\" placeholder=\"Primer Apellido\" required/>\n"
                + "                            </div>\n"
                + "                        </div>\n"
                + "                        <div class=\"row show-grid\">\n"
                + "                            <div class=\"col-md-4\">\n"
                + "                                <label>Segundo Apellido</label>\n"
                + "                                <input class=\"form-control\" id = \"segundoApelidoE\" placeholder=\"Segundo Apellido\" >\n"
                + "                            </div>\n"
                + "                            <div class=\"col-md-4\">\n"
                + "                                <label>C.I.</label>\n"
                + "                                <input class=\"form-control\" id = \"ciE\" placeholder=\"Numero de CI\" required/>\n"
                + "                            </div>\n"
                + "                            <div class=\"col-md-4\">\n"
                + "                                <label>Nacionalidad</label>\n"
                + "                                <input class=\"form-control\" id = \"nacionalidadE\" placeholder=\"Nacionalidad\" required/>\n"
                + "                            </div>\n"
                + "                        </div>\n"
                + "                        <div class=\"row show-grid\">\n"
                + "                            <div class=\"col-md-4\">\n"
                + "                                <label>Es Interno?</label>\n"
                + "                                <select class=\"form-control\" id=\"internadoE\">\n"
                + "                                    <option value=\"NO\">No</option>\n"
                + "                                    <option value=\"SI\">Si</option>\n"
                + "                                </select>\n"
                + "                            </div>\n"
                + "                            <div class=\"col-md-8\">\n"
                + "                                <label>Direccion Estudiante</label>\n"
                + "                                <input class=\"form-control\" id = \"direccionE\" placeholder=\"Direccion Estudiante\" required/>\n"
                + "                            </div>\n"
                + "                        </div>\n"
                + "                        <div class=\"row show-grid\">\n"
                + "                            <div class=\"col-md-4\">\n"
                + "                                <label>Telefono / Celular</label>\n"
                + "                                <input class=\"form-control\" id = \"telefonoE\" placeholder=\"N° de Telefono / Celular\" required/>\n"
                + "                            </div>\n"
                + "                            <div class=\"col-md-4\">\n"
                + "                                <label>Fecha de Nacimiento</label>\n"
                + "                                <input class=\"form-control\" id = \"nacimientoE\" placeholder=\"YYYY-MM-DD\" pattern=\"^(19|20)+([0-9]{2})([-])([0-9]{1,2})([-])([0-9]{1,2})$\" title=\"YYYY-MM-DD\" required/>\n"
                + "                            </div>\n"
                + "                            <div class=\"col-md-4\">\n"
                + "                                <label>Genero</label>\n"
                + "                                <select class=\"form-control\" id=\"sexoE\">\n"
                + "                                    <option value=\"Masculino\">Masculino</option>\n"
                + "                                    <option value=\"Femenino\">Femenino</option>\n"
                + "                                </select>\n"
                + "                            </div>\n"
                + "                        </div>\n"
                + "                        <div class=\"row show-grid\">\n"
                + "                            <div class=\"col-md-4\">\n"
                + "                                <label>E-Mail</label>\n"
                + "                                <input class=\"form-control\" id = \"emailE\" placeholder=\"ejemplo@ejemplo.com\" pattern=\"^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$\" title=\"ejemplo@ejemplo.com\" required/>\n"
                + "                            </div>\n"
                + "                            <div class=\"col-md-4\">\n"
                + "                                <label>Grado Academico</label>\n"
                + "                                <select class=\"form-control\" id=\"profecionE\">\n"
                + "                                    <option value=\"Primario\">Primario</option>\n"
                + "                                    <option value=\"Secundario\">Secundario</option>\n"
                + "                                    <option value=\"Universitario\">Universitario</option>\n"
                + "                                    <option value=\"Licenciatura\">Licenciatura</option>\n"
                + "                                    <option value=\"Magister\">Magister</option>\n"
                + "                                    <option value=\"Doctor\">Doctor</option>\n"
                + "                                </select>\n"
                + "                            </div>\n"
                + "                            <div class=\"col-md-4\">\n"
                + "                                <label>Modalidad</label>\n"
                + "                                <select class=\"form-control\" id=\"tipoEstudioE\">\n";

        ControladorBody cnb = new ControladorBody();
        htmlcode += cnb.seleccionadorModalidades();
        htmlcode += "\n"
                + "                                </select>\n"
                + "                            </div>\n"
                + "                        </div>\n"
                + "                        <div class=\"row show-grid\">\n"
                + "                            <div class=\"col-md-4\">\n"
                + "                                <label>Dispone Instrumento?</label>\n"
                + "                                <select class=\"form-control\" id=\"estudioMusicaE\">\n"
                + "                                    <option value=\"NO\">No</option>\n"
                + "                                    <option value=\"SI\">Si</option>\n"
                + "                                </select>\n"
                + "                            </div>\n"
                + "                            <div class=\"col-md-4\">\n"
                + "                                <label>Estudio Musica?</label>\n"
                + "                                <select class=\"form-control\" id=\"disponeInstrumentoE\">\n"
                + "                                    <option value=\"NO\">No</option>\n"
                + "                                    <option value=\"SI\">Si</option>\n"
                + "                                </select>\n"
                + "                            </div>\n"
                + "                            <div class=\"col-md-4\">\n"
                + "                                <label>Detalles</label>\n"
                + "                                <textarea class=\"form-control\" id=\"descripcionE\" rows=\"3\" style=\"width: 200px; height: 34px;\" placeholder=\"Estudios Realizados\" required/></textarea>\n"
                + "                            </div>\n"
                + "                        </div>\n"
                + "\n"
                + "                        <h3 class=\"text-center\">Datos del Padre / Encargado</h3>\n"
                + "                        <div class=\"row show-grid\">\n"
                + "                            <div class=\"col-md-4\">\n"
                + "                                <label>Primer Nombre</label>\n"
                + "                                <input class=\"form-control\" id = \"primerNombreP\" placeholder=\"Primer Nombre\" required/>\n"
                + "                            </div>\n"
                + "                            <div class=\"col-md-4\">\n"
                + "                                <label>Segundo Nombre</label>\n"
                + "                                <input class=\"form-control\" id = \"segundoNombreP\" placeholder=\"Segundo Nombre\" >\n"
                + "                            </div>\n"
                + "                            <div class=\"col-md-4\">\n"
                + "                                <label>Primer Apellido</label>\n"
                + "                                <input class=\"form-control\" id = \"primerApelidoP\" placeholder=\"Primer Apellido\" required/>\n"
                + "                            </div>\n"
                + "                        </div>\n"
                + "                        <div class=\"row show-grid\">\n"
                + "                            <div class=\"col-md-4\">\n"
                + "                                <label>Segundo Apellido</label>\n"
                + "                                <input class=\"form-control\" id = \"segundoApelidoP\" placeholder=\"Segundo Apellido\" >\n"
                + "                            </div>\n"
                + "                            <div class=\"col-md-4\">\n"
                + "                                <label>C.I.</label>\n"
                + "                                <input class=\"form-control\" id = \"ciP\" placeholder=\"Numero de CI\" required/>\n"
                + "                            </div>\n"
                + "                            <div class=\"col-md-4\">\n"
                + "                                <label>Nacionalidad</label>\n"
                + "                                <input class=\"form-control\" id = \"nacionalidadP\" placeholder=\"Nacionalidad\" required/>\n"
                + "                            </div>\n"
                + "                        </div>\n"
                + "                        <div class=\"row show-grid\">\n"
                + "                            <div class=\"col-md-4\">\n"
                + "                                <label>Es Interno?</label>\n"
                + "                                <select class=\"form-control\" id=\"internadoP\">\n"
                + "                                    <option value=\"NO\">No</option>\n"
                + "                                    <option value=\"SI\">Si</option>\n"
                + "                                </select>\n"
                + "                            </div>\n"
                + "                            <div class=\"col-md-8\">\n"
                + "                                <label>Dirección Padre</label>\n"
                + "                                <input class=\"form-control\" id = \"direccionP\" placeholder=\"Direccion Padre\" required/>\n"
                + "                            </div>\n"
                + "                        </div>\n"
                + "                        <div class=\"row show-grid\">\n"
                + "                            <div class=\"col-md-4\">\n"
                + "                                <label>Telefono / Celular</label>\n"
                + "                                <input class=\"form-control\" id = \"telefonoP\" placeholder=\"N° de Telefono / Celular\" required/>\n"
                + "                            </div>\n"
                + "                            <div class=\"col-md-4\">\n"
                + "                                <label>Fecha de Nacimiento</label>\n"
                + "                                <input class=\"form-control\" id = \"nacimientoP\" placeholder=\"YYYY-MM-DD\" pattern=\"^(19|20)+([0-9]{2})([-])([0-9]{1,2})([-])([0-9]{1,2})$\" title=\"YYYY-MM-DD\" required/>\n"
                + "                            </div>\n"
                + "                            <div class=\"col-md-4\">\n"
                + "                                <label>Genero</label>\n"
                + "                                <select class=\"form-control\" id=\"sexoP\">\n"
                + "                                    <option value=\"Masculino\">Masculino</option>\n"
                + "                                    <option value=\"Femenino\">Femenino</option>\n"
                + "                                </select>\n"
                + "                            </div>\n"
                + "                        </div>\n"
                + "                        <div class=\"row show-grid\">\n"
                + "                            <div class=\"col-md-4\">\n"
                + "                                <label>E-Mail</label>\n"
                + "                                <input class=\"form-control\" id = \"emailP\" placeholder=\"ejemplo@ejemplo.com\" pattern=\"^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$\" title=\"ejemplo@ejemplo.com\" required/>\n"
                + "                            </div>\n"
                + "                            <div class=\"col-md-4\">\n"
                + "                                <label>Grado Academico</label>\n"
                + "                                <select class=\"form-control\" id=\"profecionP\">\n"
                + "                                    <option value=\"Primario\">Primario</option>\n"
                + "                                    <option value=\"Secundario\">Secundario</option>\n"
                + "                                    <option value=\"Universitario\">Universitario</option>\n"
                + "                                    <option value=\"Licenciado\">Licenciado</option>\n"
                + "                                    <option value=\"Magister\">Magister</option>\n"
                + "                                    <option value=\"Doctor\">Doctor</option>\n"
                + "                                </select>\n"
                + "                            </div>\n"
                + "                        </div>\n"
                + "                        <div class=\"row show-grid\">\n"
                + "                            <div class=\"col-md-2\">\n"
                + "                                <input type=\"button\" id=\"insertarpersona\" value=\"Crear\" class=\"btn btn-default\" />\n"
                + "                            </div>\n"
                + "                        </div>\n"
                + "                    </form>\n";

        return htmlcode;
    }

    public String getViewNewMat(Usuario us) {
        return "";
    }

    public String seleccionadorModalidades() {
        String htmlcode = "";
        Tipoestudiante_model tipomodel = new Tipoestudiante_model();
        int i = 1;
        for (Tipoestudiante t : tipomodel.getAllTipo()) {
            htmlcode += "<option value=" + i + ">" + t.getTipoEstudiante() + "</option>";
            System.out.println("holaaaa en rol...!!!");
            i++;
        }
        return htmlcode;
    }

    public String getViewCursoEst() {
        String htmlcode = "";
        Curso_model cum = new Curso_model();
        Estudiante_model estm = new Estudiante_model();
        ResultSet rs = estm.getAllEstNombre();
        htmlcode += ""
                + "<form action=\"\" id=\"cursoEstudiante\">\n"
                + "                    <h3 class=\"text-center\">Asignar Curso al Estudiante</h3>\n"
                + "                    <div class=\"row show-grid\">\n"
                + "                        <div class=\"col-md-4\">\n"
                + "                            <label>Curso</label>\n"
                + "                            <select class=\"form-control\" id=\"cursoEst\">"
                + "                                 <option value=\"0\"> </option>";
        for (Curso cu : cum.getAllCurso()) {
            htmlcode += "<option value=" + cu.getIdCurso() + ">" + cu.getNombreCurso() + "</option>";
            System.out.println("holaaaa en...!!!");
        }
        htmlcode += "</select>\n"
                + "                        </div>\n"
                + "                        <div class=\"col-md-4\">\n"
                + "                            <label>Estudiante</label>\n"
                + "                            <select class=\"form-control\" id=\"estCurso\">"
                + "                                 <option value=\"0\"> </option>";
        try {
            while (rs.next()) {
                htmlcode += "<option value=" + rs.getString(1) + ">" + rs.getString(2) + " " + rs.getString(3) + "</option>";
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorBody.class.getName()).log(Level.SEVERE, null, ex);
        }

        htmlcode += "</select>\n"
                + "                        </div>\n"
                + "                        <div class=\"col-md-4\">\n"
                + "                            <label>Total a Cancelar</label>\n"
                + "                            <div class=\"input-group\">\n"
                + "                                <span class=\"input-group-addon\">Bs.</span>\n"
                + "                                <input class=\"form-control\" id=\"pagoTotal\" placeholder=\"Total en Bolivianos\" min=\"1\" title=\"Solo numeros...\" type=\"number\" required/>\n"
                + "                            </div>\n"
                + "                        </div>\n"
                + "                    </div>\n"
                + "                    <div class=\"row show-grid\">\n"
                + "                        <div class=\"col-md-4\">\n"
                + "                            <label>Fecha de Matricula</label>\n"
                + "                            <input class=\"form-control\" id = \"fechaMatricula\" placeholder=\"YYYY-MM-DD\" pattern=\"^(19|20)+([0-9]{2})([-])([0-9]{1,2})([-])([0-9]{1,2})$\" title=\"YYYY-MM-DD\" required/>\n"
                + "                        </div>\n"
                + "                    </div>\n"
                + "                    <div class=\"row show-grid\">\n"
                + "                        <div class=\"col-md-2\">\n"
                + "                            <input type=\"submit\" id=\"newCursoEstu\" value=\"Crear\" class=\"btn btn-default center-block\" />\n"
                + "                        </div>\n"
                + "                    </div>\n"
                + "                </form>";

        return htmlcode;
    }

    public String getViewPagos() {
        String htmlcode = "";

        return "";
    }

}
