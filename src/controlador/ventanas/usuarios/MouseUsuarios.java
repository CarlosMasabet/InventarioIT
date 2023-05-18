package controlador.ventanas.usuarios;

import controlador.utilidades.Colores;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.Vusuarios;

public class MouseUsuarios implements MouseListener {

    Vusuarios ve;
    Colores col;

    public MouseUsuarios(Vusuarios ve, Colores col) {
        this.ve = ve;
        this.col = col;

        ve.btnabrirAñadir.addMouseListener(this);
        ve.btnagregar_us.addMouseListener(this);

        ve.btneliminar.addMouseListener(this);

        ve.btnabrirMod.addMouseListener(this);
        ve.btnguardar.addMouseListener(this);

        ve.btnabrirModDat.addMouseListener(this);
        ve.btnmodDatos.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    //pone los botones de color oscuro cuando el mouse pasa por encima
    @Override
    public void mouseEntered(MouseEvent me) {
        if (me.getSource().equals(ve.btnabrirAñadir)) {
            col.btnEntra(ve.btnabrirAñadir);
        }
        if (me.getSource().equals(ve.btnagregar_us)) {
            col.btnEntra(ve.btnagregar_us);
        }
        
        if (me.getSource().equals(ve.btneliminar)){
            col.btnEntra(ve.btneliminar);
        }
        
        if (me.getSource().equals(ve.btnabrirMod)){
            col.btnEntra(ve.btnabrirMod);
        }
        if (me.getSource().equals(ve.btnguardar)){
            col.btnEntra(ve.btnguardar);
        }
        
        if(me.getSource().equals(ve.btnabrirModDat)){
            col.btnEntra(ve.btnabrirModDat);
        }
        if (me.getSource().equals(ve.btnmodDatos)){
            col.btnEntra(ve.btnmodDatos);
        }
    }

    //debuelve los botones a su color original
    @Override
    public void mouseExited(MouseEvent me) {
        if (me.getSource().equals(ve.btnabrirAñadir)) {
            col.btnSale(ve.btnabrirAñadir);
        }
        if (me.getSource().equals(ve.btnagregar_us)) {
            col.btnSale(ve.btnagregar_us);
        }
        
        if (me.getSource().equals(ve.btneliminar)){
            col.btnSale(ve.btneliminar);
        }
        
        if (me.getSource().equals(ve.btnabrirMod)){
            col.btnSale(ve.btnabrirMod);
        }
        if (me.getSource().equals(ve.btnguardar)){
            col.btnSale(ve.btnguardar);
        }
        
        if(me.getSource().equals(ve.btnabrirModDat)){
            col.btnSale(ve.btnabrirModDat);
        }
        if (me.getSource().equals(ve.btnmodDatos)){
            col.btnSale(ve.btnmodDatos);
        }
    }

}
