/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import Modelo.Usuario_model;
import java.security.MessageDigest;
import java.sql.ResultSet;

/**
 *
 * @author WarMachine
 */
public class ControladorUsuarios {

    public String rol(String user) {
        Usuario_model usm = new Usuario_model();
        return usm.rol(user);
    }

    public String nombreUsuario(String user) {

        return "";
    }

    public int cantidadUsuarios() {

        Usuario_model cant = new Usuario_model();
        System.out.println(cant.contarusuarios());
        return cant.contarusuarios();
    }

    public boolean crearUsuario(Usuario us) {
        Usuario_model modeluser = new Usuario_model();
        return modeluser.newUser(us);
    }

    public boolean loginUser(Usuario us) {
        Usuario_model usm = new Usuario_model();
        ResultSet rs;
        rs = usm.autenticacion(us);
        if (rs != null) {
            return true;
        } else {
            return false;
        }
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

//    private static String md5(String clear) throws Exception {
//        MessageDigest md = MessageDigest.getInstance("MD5");
//        byte[] b = md.digest(clear.getBytes());
//
//        int size = b.length;
//        StringBuffer h = new StringBuffer(size);
//        for (int i = 0; i < size; i++) {
//            int u = b[i] & 255;
//            if (u < 16) {
//                h.append("0" + Integer.toHexString(u));
//            } else {
//                h.append(Integer.toHexString(u));
//            }
//        }
//        return h.toString();
//    }

//    
}
