/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import Modelo.Usuario_model;

/**
 *
 * @author WarMachine
 */
public class ControladorUsuarios {

    public String rol(String user) {
        Usuario_model usm=new Usuario_model();
        return usm.rol(user);
    }

    public String nombreUsuario(String user) {

        return "";
    }
    
    public int cantidadUsuarios() {
        
        Usuario_model cant=new Usuario_model(); 
        System.out.println(cant.contarusuarios());
        return cant.contarusuarios();
    }
    
    
    public String getViewUsers() {
        String htmlcode = "";
        Usuario_model modeluser = new Usuario_model();
        int i = 0;
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
            if (i % 3 == 0) {
                htmlcode += "<div class=\"row\">";
            }
            htmlcode += "<tr>\n"
                    + " <td>"+u.getIdUsuario()+"</td>\n"
                    + " <td>"+u.getNombreUsuario()+"</td>\n"
                    + " <td> ***** </td>\n"
                    + "</tr>\n";

            if (i + 1 % 3 == 0) {
                htmlcode += "<div class=\"clear\"></div>\n"
                        + "			  </div>";
            }
            i++;
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
