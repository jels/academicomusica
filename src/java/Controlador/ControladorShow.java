/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Rol;
import Modelo.Rol_model;
import Modelo.Usuario;
import Modelo.Usuario_model;

/**
 *
 * @author WarMachine
 */
public class ControladorShow {

    public String getViewDocentes(String user) {
        return "";
    }

    public String getViewRol() {

        String htmlcode = "";
        Rol_model modelrol = new Rol_model();

        htmlcode += ""
                + "<div class=\"col-lg-12\">\n"
                + "     <div class=\"panel panel-default\">\n"
                + "         <div class=\"panel-heading\">\n"
                + "         Roles\n"
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
                + "         Usuarios\n"
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

}
