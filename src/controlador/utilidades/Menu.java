package controlador.utilidades;

import controlador.ventanas.usuarios.Cusuarios;
import controlador.consultas.SQLdepartamentos;
import javax.swing.JFrame;
import javax.swing.JLabel;
import controlador.consultas.SQLequipos;
import controlador.consultas.SQLperifericos;
import controlador.consultas.SQLusuarios;
import controlador.ventanas.perifericos.Cperifericos;
import controlador.ventanas.departamentos.Cdepartamentos;
import controlador.ventanas.equipo.Cequipos;
import vista.Vequipos;
import vista.Vreportes;
import vista.Vperifericos;
import vista.Vdepartamentos;
import vista.Vusuarios;

/**
 *Controla el menú lateral de las vetanas
 * @author Carlos Masabet
 * @since 0.1
 */
public class Menu {

    private Imagenes img;
    private boolean cambio = false;
    
    public Menu(Imagenes img) {
        this.img = img;
    }

    public void equipos_entra(JLabel boton, JLabel txt) {
        img.bordes(boton);
        txt.setText("Equipos");
    }

    public void equipos_sale(JLabel boton, JLabel txt) {
        img.no_bordes(boton);
        txt.setText("");
    }

    public void equipos_click(JFrame ventana) {
        if(!cambio){
            cambio = true;
            SQLequipos sql = SQLequipos.getInstanceEquipo();
            Vequipos ve = new Vequipos();

            Cequipos ce = new Cequipos(sql, ve);
            ventana.setVisible(false);
        }
        
    }

    public void reportes_entra(JLabel boton, JLabel txt) {
        img.bordes(boton);
        txt.setText("Reportes");
    }

    public void reportes_sale(JLabel boton, JLabel txt) {
        img.no_bordes(boton);
        txt.setText("");
    }

    public void reportes_click(JFrame ventana) {
        if(!cambio){
            cambio = true;
            Vreportes b = new Vreportes();
            b.setVisible(true);
            ventana.setVisible(false);
        }
        
    }

    public void perifericos_entra(JLabel boton, JLabel txt) {
        img.bordes(boton);
        txt.setText("Perifericos");
    }

    public void perifericos_sale(JLabel boton, JLabel txt) {
        img.no_bordes(boton);
        txt.setText("");
    }

    public void perifericos_click(JFrame ventana) {
        if(!cambio){
            cambio = true;
            Vperifericos b = new Vperifericos();
            SQLperifericos sql = SQLperifericos.getInstance();

            Cperifericos cp = new Cperifericos(sql, b);
            ventana.setVisible(false);
        }
        
    }

    public void usuarios_entra(JLabel boton, JLabel txt) {
        img.bordes(boton);
        txt.setText("Usuarios");
    }

    public void usuarios_sale(JLabel boton, JLabel txt) {
        img.no_bordes(boton);
        txt.setText("");
    }

    public void usuarios_click(JFrame ventana) {
        if(!cambio){
            cambio = true;
            SQLusuarios sql = SQLusuarios.getInstance();
            Vusuarios a = new Vusuarios();

            Cusuarios cus = new Cusuarios(sql, a);
            ventana.setVisible(false);
        }
        
    }

    public void departamento_entra(JLabel boton, JLabel txt) {
        img.bordes(boton);
        txt.setText("Departamentos");
    }

    public void departamento_sale(JLabel boton, JLabel txt) {
        img.no_bordes(boton);
        txt.setText("");
    }

    public void departamento_click(JFrame ventana) {
        if(!cambio){
            cambio = true;
            Vdepartamentos b = new Vdepartamentos();
            SQLdepartamentos dep = SQLdepartamentos.getInstanceDerpartamentos();

            Cdepartamentos cd = new Cdepartamentos(dep, b);
            ventana.setVisible(false);
        }
        
    }
}
