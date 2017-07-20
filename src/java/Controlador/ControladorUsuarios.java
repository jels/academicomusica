/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

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
}
