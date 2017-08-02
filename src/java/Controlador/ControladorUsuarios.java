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
        return rs != null;
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
