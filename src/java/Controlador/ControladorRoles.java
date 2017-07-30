/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import java.util.ArrayList;

/**
 *
 * @author WarMachine
 */
public class ControladorRoles {

    public int cantidadRoles() {

        Rol_model cant = new Rol_model();
        System.out.println(cant.contarroles());
        return cant.contarroles();
    }

    public boolean crearRol(Rol r) {
        Rol_model modelrol = new Rol_model();
        return modelrol.crear_rol(r);
    }

    public String getViewRol() {
        String htmlcode = "";
        Rol_model modelrol = new Rol_model();
        int i = 0;
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

    public String seleccionadorRoles() {
        String htmlcode = "";
        Rol_model modelrol = new Rol_model();
        int i = 1;
        htmlcode += " <label> Roles </label>"
                + "<select class=\"form-control\" id=\"idRol\">";
        for (Rol r : modelrol.getAllRol()) {
            htmlcode += "<option value="+i+">" + r.getNombreRol() + "</option>";
            System.out.println("holaaaa en rol...!!!");
            i++;
        }
        htmlcode += "</select>";
        return htmlcode;
    }

//    public String getDetallesProductos(int idProducto){
//        String htmlcode = "";
//        Producto pr = new ModeloProductos().getProducto(idProducto);
//        htmlcode = "<div class=\"single\" >\n" +
//"         \n" +
//"		<div class=\"cont span_2_of_3\">\n" +
//"			  <div class=\"labout span_1_of_a1\">\n" +
//"				<!-- start product_slider -->\n" +
//"				     <ul id=\"etalage\">\n" +
//"							<li>\n" +
//"								<a href=\"optionallink.html\">\n" +
//"									<img class=\"etalage_thumb_image\" src='"+pr.getImg1()+"' />\n" +
//"									<img class=\"etalage_source_image\" src='"+pr.getImg1()+"' />\n" +
//"								</a>\n" +
//"							</li>\n" +
//"							<li>\n" +
//"								<img class=\"etalage_thumb_image\" src='"+pr.getImg2()+"' />\n" +
//"									<img class=\"etalage_source_image\" src='"+pr.getImg2()+"' />\n" +
//"							</li>\n" +
//                                                        "<li>\n" +
//"								<img class=\"etalage_thumb_image\" src='"+pr.getImg3()+"' />\n" +
//"									<img class=\"etalage_source_image\" src='"+pr.getImg3()+"' />\n" +
//"							</li>\n" +
//                                                        "<li>\n" +
//"								<img class=\"etalage_thumb_image\" src='"+pr.getImg4()+"' />\n" +
//"									<img class=\"etalage_source_image\" src='"+pr.getImg4()+"' />\n" +
//"							</li>\n" +
//                                                        "<li>\n" +
//"								<img class=\"etalage_thumb_image\" src='"+pr.getImg5()+"' />\n" +
//"									<img class=\"etalage_source_image\" src='"+pr.getImg5()+"' />\n" +
//"							</li>\n" +
//"						</ul>\n" +
//"					\n" +
//"					\n" +
//"			<!-- end product_slider -->\n" +
//"			</div>\n" +
//"			<div class=\"cont1 span_2_of_a1\">\n" +
//"				<h3 class=\"m_3\">"+pr.getNombre()+"</h3>\n" +
//"				\n" +
//"				<div class=\"price_single\">\n" +							  
//"							  <span class=\"actual\">$"+pr.getPrecio()+"</span><a href=\"#\">click for offer</a>\n" +
//"							</div>\n" +
//"				<ul class=\"options\">\n" +
//"					<h4 class=\"m_9\">Select a Size</h4>\n" +
//"					<li><a href=\"#\">"+pr.getSize()+"</a></li>\n" +					
//"					<div class=\"clear\"></div>\n" +
//"				</ul>\n" +
//"				<div class=\"btn_form\">\n" +
//"				   <form>\n" +
//"					 <input type=\"submit\" value=\"buy now\" title=\"\">\n" +
//"				  </form>\n" +
//"				</div>\n" +
//"				<ul class=\"add-to-links\">\n" +
//"    			   <li><img src=\"images/wish.png\" alt=\"\"/><a href=\"#\">Add to wishlist</a></li>\n" +
//"    			</ul>\n" +
//"    			<p class=\"m_desc\">"+pr.getDescripcion()+"</p>\n" +
//"    			\n" +
//"                <div class=\"social_single\">	\n" +
//"				   <ul>	\n" +
//"					  <li class=\"fb\"><a href=\"#\"><span> </span></a></li>\n" +
//"					  <li class=\"tw\"><a href=\"#\"><span> </span></a></li>\n" +
//"					  <li class=\"g_plus\"><a href=\"#\"><span> </span></a></li>\n" +
//"					  <li class=\"rss\"><a href=\"#\"><span> </span></a></li>		\n" +
//"				   </ul>\n" +
//"			    </div>\n" +
//"			</div>\n" +
//"			<div class=\"clear\"></div>\n" +
//"     \n" +
//"     \n" +
//"        \n" +
//"	    \n" +
//"	 <div class=\"toogle\">\n" +
//"     	<h3 class=\"m_3\">Product Details</h3>\n" +
//"     	<p class=\"m_text\">"+pr.getDetalles()+"</p>\n" +
//"     </div>					\n" +
//"	 <div class=\"toogle\">\n" +
//"     	<h3 class=\"m_3\">Product Reviews</h3>\n" +
//"     	<p class=\"m_text\">"+pr.getReviews()+"</p>\n" +
//"     </div>\n" +
//"     </div>\n" +
//"     <div class=\"clear\"></div>\n" +
//"	 \n" +
//"	 \n" +
//"       </div>";
//        
//        return htmlcode;
//    }  
//    
//    public String getPanelView(){
//        String htmlcode = "";
//        ModeloProductos mp = new ModeloProductos();
//        ArrayList<Producto> productos = mp.getAllProductos();
//        
//        htmlcode += "<table border=\"1\">\n" +
//"            <tr>\n" +
//"                <th>ID</th>\n" +
//"                <th>Nombre</th>\n" +
//"                <th>Precio</th>\n" +
//"                <th>Categoria</th>\n" +
//"                <th>Acciones</th>\n" +
//"            </tr>\n" ;      
//
//        
//        for(Producto p : productos){
//            htmlcode += "<tr>\n" +
//"                <td id='id_producto'>"+p.getId()+"</td>\n" +
//    "                <td>"+p.getNombre()+"</td>\n" +
//    "                <td>"+p.getPrecio()+"</td>\n" +
//    "                <td>"+p.getCategoria()+"</td>\n" +
//    "                <td><a id='btn-eliminar' href=\"\">Eliminar</a> <a id='btn-modificar' href='modificar.jsp?id="+p.getId()+"'>Modificar</a></td>\n" +
//    "            </tr>\n";
//        }
//        
//        htmlcode += "</table>";
//        
//        return htmlcode;
//    }
//    
//    public boolean deleteProducto(int id){
//        ModeloProductos mp = new ModeloProductos();
//        return mp.deleteProducto(id);
//    }
//    
//    public String getEditViewProducto(int idProducto){
//        ModeloProductos mp = new ModeloProductos();
//        Producto pr = mp.getProducto(idProducto);
//        String htmlcode = "";
//        htmlcode += " <form id='frmmodificar' name='frmmodificar'>\n" +
//"            <table>\n" +
//                 "<tr>\n" +                    
//"                    <td><input type=\"hidden\" name=\"idproducto\" id=\"nombre\" value='"+pr.getId()+"'></td>\n" +
//"                </tr>\n" +
//"                <tr>\n" +
//"                    <td><label for=\"\">Nombre:</label></td>\n" +
//"                    <td><input type=\"text\" name=\"nombre\" id=\"nombre\" value='"+pr.getNombre()+"'></td>\n" +
//"                </tr>\n" +
//"                <tr>\n" +
//"                    <td><label for=\"\">Descripcion:</label></td>\n" +
//"                    <td><textarea cols=\"30\" rows=\"6\" name=\"descripcion\" id=\"descripcion\">"+pr.getDescripcion()+"</textarea></td>\n" +
//"                </tr>\n" +
//"                <tr>\n" +
//"                    <td><label for=\"\">Precio:</label></td>\n" +
//"                    <td><input type=\"text\" name=\"precio\" id=\"precio\" value='"+pr.getPrecio()+"'></td>\n" +
//"                </tr>\n" +
//"                <tr>\n" +
//"                    <td><label for=\"\">Categoria:</label></td>\n" +
//"                    <td><input type=\"text\" name=\"categoria\" id=\"categoria\" value='"+pr.getCategoria()+"'></td>\n" +
//"                </tr>\n" +
//"                <tr>\n" +
//"                    <td><label for=\"\">Detalles:</label></td>\n" +
//"                    <td><textarea cols=\"30\" rows=\"6\" name=\"detalles\" id=\"detalles\">"+pr.getDetalles()+"</textarea></td>\n" +
//"                </tr>\n" +
//"                <tr>\n" +
//"                    <td><label for=\"\">Reviews:</label></td>\n" +
//"                    <td><textarea cols=\"30\" rows=\"6\" name=\"reviews\" id=\"reviews\">"+pr.getReviews()+"</textarea></td>\n" +
//"                </tr>\n" +                                  
//"                 <tr>\n" +
//"                    <td></td>\n" +
//"                    <td><input type=\"submit\" value=\"Modificar Producto\" id=\"btnmodificarproducto\"></td>\n" +
//"                </tr>\n" +
//"                \n" +
//"                \n" +
//"            </table>\n" +
//"        </form>";
//        return htmlcode;
//    }
//    
//    public boolean updateProducto(Producto p){
//        ModeloProductos mp = new ModeloProductos();
//        return mp.update_producto(p);
//    }
}
