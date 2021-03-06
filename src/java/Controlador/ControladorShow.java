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
public class ControladorShow {

    public String getViewDocentes() {

        String htmlcode = "";
        Docente_model modeldocente = new Docente_model();
        ResultSet rs = modeldocente.getAllDoc();
        int i = 1;
        htmlcode += ""
                + "<div class=\"col-lg-12\">\n"
                + "     <div class=\"panel panel-default\">\n"
                + "         <div class=\"panel-heading\">\n"
                + "         <h3>Docentes</h3>\n"
                + "         </div>\n"
                + "         <div class=\"panel-body\">\n"
                + "             <div class=\"table-responsive\">\n"
                + "                 <table class=\"table table-striped\">\n"
                + "                     <thead>\n"
                + "                         <tr>\n"
                + "                             <th>#</th>\n"
                + "                             <th>Nombre</th>\n"
                + "                             <th>Apellido P.</th>\n"
                + "                             <th>Apellido M.</th>\n"
                + "                             <th>Telefono</th>\n"
                + "                             <th>E-Mail</th>\n"
                + "                             <th>Profecion</th>\n"
                + "                             <th>Ver</th>\n"
                + "                         </tr>\n"
                + "                     </thead>\n"
                + "                         <tbody>\n";
        try {
            while (rs.next()) {
                htmlcode += "<div class=\"row\">"
                        + "<tr>\n"
                        + " <td>" + i + "</td>\n"
                        + " <td>" + rs.getString(1) + "</td>\n"
                        + " <td>" + rs.getString(2) + "</td>\n"
                        + " <td>" + rs.getString(3) + "</td>\n"
                        + " <td>" + rs.getString(4) + "</td>\n"
                        + " <td>" + rs.getString(5) + "</td>\n"
                        + " <td>" + rs.getString(6) + "</td>\n"
                        + " <td>"
                        + "<button type=\"button\" class=\"btn btn-outline btn-info\">Ver</button>"
                        + "</td>\n"
                        + "</tr>\n"
                        + "<div class=\"clear\"></div>\n"
                        + "			  </div>";
                i++;

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorShow.class.getName()).log(Level.SEVERE, null, ex);
        }
        htmlcode += "                   </tbody>\n"
                + "                 </table>\n"
                + "             </div>\n"
                + "         <div>\n"
                + "     </div>\n"
                + "</div>";
        return htmlcode;
    }

    public String getViewEstudiantes() {

        String htmlcode = "";
        Estudiante_model modelestudiante = new Estudiante_model();
        ResultSet rs = modelestudiante.getAllEst();
        int i = 1;
        htmlcode += ""
                + "<div class=\"col-lg-12\">\n"
                + "     <div class=\"panel panel-default\">\n"
                + "         <div class=\"panel-heading\">\n"
                + "            <h3>Estudiantes</h3>\n"
                + "             <div class=\"row\">\n"
                + "                  <div class=\"col-md-4\"></div>\n"
                + "                  <div class=\"col-md-4\"></div>\n"
                + "                  <div class=\"col-md-4\">\n"
                + "                      <div class=\"form-group input-group\">\n"
                + "                          <input class=\"form-control\" type=\"text\" placeholder=\"Buscar Estudiante\" disabled/>\n"
                + "                          <span class=\"input-group-btn\">\n"
                + "                              <button class=\"btn btn-default\" type=\"button\" id=\"busquedaEstudiante\" disabled/><i class=\"fa fa-search\"></i>\n"
                + "                              </button>\n"
                + "                          </span>\n"
                + "                      </div>\n"
                + "                  </div>\n"
                + "             </div>"
                + "         </div>\n"
                + "         <div class=\"panel-body\">\n"
                + "             <div class=\"table-responsive\">\n"
                + "                 <table class=\"table table-striped\">\n"
                + "                     <thead>\n"
                + "                         <tr>\n"
                + "                             <th>#</th>\n"
                + "                             <th>Nombre</th>\n"
                + "                             <th>Genero</th>\n"
                + "                             <th>Musica?</th>\n"
                + "                             <th>Instrumento</th>\n"
                + "                             <th>Curso</th>\n"
                + "                             <th>Ver</th>\n"
                + "                         </tr>\n"
                + "                     </thead>\n"
                + "                         <tbody>\n";
        try {
            while (rs.next()) {
                htmlcode += "<div class=\"row\">"
                        + "<tr>\n"
                        + " <td>" + i + "</td>\n"
                        + " <td>" + rs.getString(1) + " " + rs.getString(2) + "</td>\n"
                        + " <td>" + rs.getString(3) + "</td>\n"
                        + " <td>" + rs.getString(4) + "</td>\n"
                        + " <td>" + rs.getString(5) + "</td>\n"
                        + " <td>" + rs.getString(6) + "</td>\n"
                        + " <td>"
                        + "<button type=\"button\" class=\"btn btn-outline btn-info\">Ver</button>"
                        + "</td>\n"
                        + "</tr>\n"
                        + "<div class=\"clear\"></div>\n"
                        + "			  </div>";
                i++;

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorShow.class.getName()).log(Level.SEVERE, null, ex);
        }
        htmlcode += "                   </tbody>\n"
                + "                 </table>\n"
                + "             </div>\n"
                + "         <div>\n"
                + "     </div>\n"
                + "</div>";
        return htmlcode;
    }

    public String getViewMaterias() {
        String htmlcode = "";
        Materia_model modelmate = new Materia_model();
        ResultSet rs = modelmate.getAllMate();
        int i = 1;
        htmlcode += ""
                + "<div class=\"col-lg-12\">\n"
                + "     <div class=\"panel panel-default\">\n"
                + "         <div class=\"panel-heading\">\n"
                + "         <h3>Materias</h3>\n"
                + "         </div>\n"
                + "         <div class=\"panel-body\">\n"
                + "             <div class=\"table-responsive\">\n"
                + "                 <table class=\"table table-striped\">\n"
                + "                     <thead>\n"
                + "                         <tr>\n"
                + "                             <th>#</th>\n"
                + "                             <th>Nombre</th>\n"
                + "                             <th>Descripcion</th>\n"
                + "                             <th>Ver</th>\n"
                + "                         </tr>\n"
                + "                     </thead>\n"
                + "                         <tbody>\n";
        try {
            while (rs.next()) {
                htmlcode += "<div class=\"row\">"
                        + "<tr>\n"
                        + " <td>" + i + "</td>\n"
                        + " <td>" + rs.getString(2) + "</td>\n"
                        + " <td>" + rs.getString(3) + "</td>\n"
                        + " <td>"
                        + "<button type=\"button\" class=\"btn btn-outline btn-info\">Ver</button>"
                        + "</td>\n"
                        + "</tr>\n"
                        + "<div class=\"clear\"></div>\n"
                        + "			  </div>";
                i++;

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorShow.class.getName()).log(Level.SEVERE, null, ex);
        }
        htmlcode += "                   </tbody>\n"
                + "                 </table>\n"
                + "             </div>\n"
                + "         <div>\n"
                + "     </div>\n"
                + "</div>";
        return htmlcode;
    }

    public String getViewMatricula() {
        String htmlcode = "";
        Matricula_model modelmatri = new Matricula_model();
        ResultSet rs = modelmatri.getAllMatri();
        int i = 1;
        htmlcode += ""
                + "<div class=\"col-lg-12\">\n"
                + "     <div class=\"panel panel-default\">\n"
                + "         <div class=\"panel-heading\">\n"
                + "         <h3>Materias</h3>\n"
                + "         </div>\n"
                + "         <div class=\"panel-body\">\n"
                + "             <div class=\"table-responsive\">\n"
                + "                 <table class=\"table table-striped\">\n"
                + "                     <thead>\n"
                + "                         <tr>\n"
                + "                             <th>#</th>\n"
                + "                             <th>Nombre</th>\n"
                + "                             <th>Curso</th>\n"
                + "                             <th>Fecha</th>\n"
                + "                             <th>Modalidad</th>\n"
                + "                             <th>Ver</th>\n"
                + "                         </tr>\n"
                + "                     </thead>\n"
                + "                         <tbody>\n";
        try {
            while (rs.next()) {
                htmlcode += "<div class=\"row\">"
                        + "<tr>\n"
                        + " <td>" + i + "</td>\n"
                        + " <td>" + rs.getString(1) + " " + rs.getString(2) + "</td>\n"
                        + " <td>" + rs.getString(3) + "</td>\n"
                        + " <td>" + rs.getString(4) + "</td>\n"
                        + " <td>" + rs.getString(5) + "</td>\n"
                        + " <td>"
                        + "<button type=\"button\" class=\"btn btn-outline btn-info\">Ver</button>"
                        + "</td>\n"
                        + "</tr>\n"
                        + "<div class=\"clear\"></div>\n"
                        + "			  </div>";
                i++;

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorShow.class.getName()).log(Level.SEVERE, null, ex);
        }
        htmlcode += "                   </tbody>\n"
                + "                 </table>\n"
                + "             </div>\n"
                + "         <div>\n"
                + "     </div>\n"
                + "</div>";
        return htmlcode;
    }

    public String getViewRol() {

        String htmlcode = "";
        Rol_model modelrol = new Rol_model();

        htmlcode += ""
                + "<div class=\"col-lg-12\">\n"
                + "     <div class=\"panel panel-default\">\n"
                + "         <div class=\"panel-heading\">\n"
                + "         <h3>Roles</h3>\n"
                + "         </div>\n"
                + "         <div class=\"panel-body\">\n"
                + "             <div class=\"table-responsive\">\n"
                + "                 <table class=\"table table-striped\">\n"
                + "                     <thead>\n"
                + "                         <tr>\n"
                + "                             <th>#</th>\n"
                + "                             <th>Nombre Rol</th>\n"
                + "                             <th>Descripcion Rol</th>\n"
                + "                         </tr>\n"
                + "                     </thead>\n"
                + "                         <tbody>\n";
        for (Rol r : modelrol.getAllRol()) {

            htmlcode += "<div class=\"row\">"
                    + "<tr>\n"
                    + " <td>" + r.getIdRol() + "</td>\n"
                    + " <td>" + r.getNombreRol() + "</td>\n"
                    + " <td>" + r.getDescripcionRol() + "</td>\n"
                    + "</tr>\n"
                    + "<div class=\"clear\"></div>\n"
                    + "			  </div>";

        }
        htmlcode += "                   </tbody>\n"
                + "                 </table>\n"
                + "             </div>\n"
                + "         <div>\n"
                + "     </div>\n"
                + "</div>";
        return htmlcode;
    }

    public String getViewUsers() {

        String htmlcode = "";
        Usuario_model modeluser = new Usuario_model();

        htmlcode += ""
                + "<div class=\"col-lg-12\">\n"
                + "     <div class=\"panel panel-default\">\n"
                + "         <div class=\"panel-heading\">\n"
                + "         <h3>Usuarios</h3>\n"
                + "         </div>\n"
                + "         <div class=\"panel-body\">\n"
                + "             <div class=\"table-responsive\">\n"
                + "                 <table class=\"table table-striped\">\n"
                + "                     <thead>\n"
                + "                         <tr>\n"
                + "                             <th>#</th>\n"
                + "                             <th>Username</th>\n"
                + "                             <th>Password</th>\n"
                + "                         </tr>\n"
                + "                     </thead>\n"
                + "                         <tbody>\n";
        for (Usuario u : modeluser.getAllUser()) {
            System.out.println("holaaaa...!!!");
            htmlcode += "<div class=\"row\">"
                    + "<tr>\n"
                    + " <td>" + u.getIdUsuario() + "</td>\n"
                    + " <td>" + u.getNombreUsuario() + "</td>\n"
                    + " <td> ***** </td>\n"
                    + "</tr>\n"
                    + "<div class=\"clear\"></div>\n"
                    + "			  </div>";

        }
        htmlcode += "                   </tbody>\n"
                + "                 </table>\n"
                + "             </div>\n"
                + "         <div>\n"
                + "     </div>\n"
                + "</div>";
        return htmlcode;
    }

    public String getViewCursos() {
        String htmlcode = "";
        Curso_model modelcurso = new Curso_model();
        ResultSet rs = modelcurso.getAllCursos();
        int i = 1;
        htmlcode += ""
                + "<div class=\"col-lg-12\">\n"
                + "     <div class=\"panel panel-default\">\n"
                + "         <div class=\"panel-heading\">\n"
                + "         <h3>Cursos</h3>\n"
                + "         </div>\n"
                + "         <div class=\"panel-body\">\n"
                + "             <div class=\"table-responsive\">\n"
                + "                 <table class=\"table table-striped\">\n"
                + "                     <thead>\n"
                + "                         <tr>\n"
                + "                             <th>#</th>\n"
                + "                             <th>Nombre</th>\n"
                + "                             <th>Descripcion</th>\n"
                + "                             <th>Estado</th>\n"
                + "                             <th>Ver</th>\n"
                + "                         </tr>\n"
                + "                     </thead>\n"
                + "                         <tbody>\n";
        try {
            while (rs.next()) {
                htmlcode += "<div class=\"row\">"
                        + "<tr>\n"
                        + " <td>" + i + "</td>\n"
                        + " <td>" + rs.getString(2) + "</td>\n"
                        + " <td>" + rs.getString(3) + "</td>\n";
                if (rs.getInt(4) == 1) {
                    htmlcode += " <td>SI</td>\n";
                } else {
                    htmlcode += " <td>NO</td>\n";
                }
                htmlcode += " <td>"
                        + "<button type=\"button\" class=\"btn btn-outline btn-info\">Ver</button>"
                        + "</td>\n"
                        + "</tr>\n"
                        + "<div class=\"clear\"></div>\n"
                        + "			  </div>";
                i++;

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorShow.class.getName()).log(Level.SEVERE, null, ex);
        }
        htmlcode += "                   </tbody>\n"
                + "                 </table>\n"
                + "             </div>\n"
                + "         <div>\n"
                + "     </div>\n"
                + "</div>";
        return htmlcode;
    }

    public String getViewPadres() {
        String htmlcode = "";
        Estudiante_model modelest = new Estudiante_model();
        Padre_model modelpadre = new Padre_model();
        ResultSet rs1 = modelest.getAllEstudiantes();

        int i = 1;
        htmlcode += ""
                + "<div class=\"col-lg-12\">\n"
                + "     <div class=\"panel panel-default\">\n"
                + "         <div class=\"panel-heading\">\n"
                + "         <h3>Padres</h3>\n"
                + "         </div>\n"
                + "         <div class=\"panel-body\">\n"
                + "             <div class=\"table-responsive\">\n"
                + "                 <table class=\"table table-striped\">\n"
                + "                     <thead>\n"
                + "                         <tr>\n"
                + "                             <th>#</th>\n"
                + "                             <th>Nombre Estudiante</th>\n"
                + "                             <th>Nombre Responsable</th>\n"
                + "                             <th>Telefono Responsable</th>\n"
                + "                             <th>Ver</th>\n"
                + "                         </tr>\n"
                + "                     </thead>\n"
                + "                         <tbody>\n";
        try {
            while (rs1.next()) {
                htmlcode += "<div class=\"row\">"
                        + "<tr>\n"
                        + " <td>" + i + "</td>\n"
                        + " <td>" + rs1.getString(1) + " " + rs1.getString(2) + "</td>\n";
                ResultSet rs2 = modelpadre.getAllPadres(rs1.getInt(3));
                while (rs2.next()) {
                    htmlcode += " <td>" + rs2.getString(1) + " " + rs2.getString(2) + "</td>\n"
                            + " <td>" + rs2.getString(3) + "</td>\n";
                }
                htmlcode += " <td>"
                        + "<button type=\"button\" class=\"btn btn-outline btn-info\">Ver</button>"
                        + "</td>\n"
                        + "</tr>\n"
                        + "<div class=\"clear\"></div>\n"
                        + "			  </div>";
                i++;

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorShow.class.getName()).log(Level.SEVERE, null, ex);
        }
        htmlcode += "                   </tbody>\n"
                + "                 </table>\n"
                + "             </div>\n"
                + "         <div>\n"
                + "     </div>\n"
                + "</div>";
        return htmlcode;
    }

    public String getViewPagos() {

        String htmlcode = "";
        
        
        
        
        return htmlcode;
    }

}
