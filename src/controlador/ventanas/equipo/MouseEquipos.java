package controlador.ventanas.equipo;

import controlador.utilidades.Colores;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.Vequipos;

public class MouseEquipos implements MouseListener {

    private Vequipos ve;
    private Colores col;

    public MouseEquipos(Vequipos ve, Colores col) {
        this.ve = ve;
        this.col = col;
        
        ve.cbtipobusqueda.setFocusable(false);
        ve.cbbusqueda.setFocusable(false);
        ve.cbbusModelos.setFocusable(false);

        ve.cbtipobusqueda.addMouseListener(this);
        ve.cbbusqueda.addMouseListener(this);
        ve.cbbusModelos.addMouseListener(this);

        ve.btnañadir.addMouseListener(this);
        ve.btnañadir2.addMouseListener(this);

        ve.btndetalles.addMouseListener(this);
        ve.btnmodificar.addMouseListener(this);
        ve.btnguardar.addMouseListener(this);
        ve.btnperiferico.addMouseListener(this);
        ve.btnnewperi.addMouseListener(this);

        ve.btneliminar.addMouseListener(this);

        ve.btnmarca.addMouseListener(this);
        ve.btnnewMarca.addMouseListener(this);

        ve.btnmodelo.addMouseListener(this);
        ve.btnnewModelo.addMouseListener(this);
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

    //pone los botones de color oscuro cuando se pasael mouse por encima
    @Override
    public void mouseEntered(MouseEvent me) {

        //combobox
        if (me.getSource().equals(ve.cbtipobusqueda)) {
            col.cbEntra(ve.cbtipobusqueda);
        }
        if (me.getSource().equals(ve.cbbusqueda)) {
            col.cbEntra(ve.cbbusqueda);
        }
        if (me.getSource().equals(ve.cbbusModelos)) {
            col.cbEntra(ve.cbbusModelos);
        }

        //botones
        if (me.getSource().equals(ve.btnañadir)) {
            col.btnEntra(ve.btnañadir);
        }

        if (me.getSource().equals(ve.btnañadir2)) {
            col.btnEntra(ve.btnañadir2);
        }

        if (me.getSource().equals(ve.btndetalles)) {
            col.btnEntra(ve.btndetalles);
        }
        if (me.getSource().equals(ve.btnmodificar)) {
            col.btnEntra(ve.btnmodificar);
        }
        if (me.getSource().equals(ve.btnguardar)) {
            col.btnEntra(ve.btnguardar);
        }
        if (me.getSource().equals(ve.btnperiferico)) {
            col.btnEntra(ve.btnperiferico);
        }
        if (me.getSource().equals(ve.btnnewperi)) {
            col.btnEntra(ve.btnnewperi);
        }

        if (me.getSource().equals(ve.btneliminar)) {
            col.btnEntra(ve.btneliminar);
        }

        if (me.getSource().equals(ve.btnmarca)) {
            col.btnEntra(ve.btnmarca);
        }
        if (me.getSource().equals(ve.btnnewMarca)) {
            col.btnEntra(ve.btnnewMarca);
        }

        if (me.getSource().equals(ve.btnmodelo)) {
            col.btnEntra(ve.btnmodelo);
        }
        if (me.getSource().equals(ve.btnnewModelo)) {
            col.btnEntra(ve.btnnewModelo);
        }

    }

    //pone lo botones de color claro cuando se pasa el mouse por encima
    @Override
    public void mouseExited(MouseEvent me) {
        
        //combobox
        if (me.getSource().equals(ve.cbtipobusqueda)) {
            col.cbSale(ve.cbtipobusqueda);
        }
        if (me.getSource().equals(ve.cbbusqueda)) {
            col.cbSale(ve.cbbusqueda);
        }
        if (me.getSource().equals(ve.cbbusModelos)) {
            col.cbSale(ve.cbbusModelos);
        }
        
        //botones
        if (me.getSource().equals(ve.btnañadir)) {
            col.btnSale(ve.btnañadir);
        }
        if (me.getSource().equals(ve.btnañadir2)) {
            col.btnSale(ve.btnañadir2);
        }

        if (me.getSource().equals(ve.btndetalles)) {
            col.btnSale(ve.btndetalles);
        }
        if (me.getSource().equals(ve.btnmodificar)) {
            col.btnSale(ve.btnmodificar);
        }
        if (me.getSource().equals(ve.btnguardar)) {
            col.btnSale(ve.btnguardar);
        }
        if (me.getSource().equals(ve.btnperiferico)) {
            col.btnSale(ve.btnperiferico);
        }
        if (me.getSource().equals(ve.btnnewperi)) {
            col.btnSale(ve.btnnewperi);
        }

        if (me.getSource().equals(ve.btneliminar)) {
            col.btnSale(ve.btneliminar);
        }

        if (me.getSource().equals(ve.btnmarca)) {
            col.btnSale(ve.btnmarca);
        }
        if (me.getSource().equals(ve.btnnewMarca)) {
            col.btnSale(ve.btnnewMarca);
        }

        if (me.getSource().equals(ve.btnmodelo)) {
            col.btnSale(ve.btnmodelo);
        }
        if (me.getSource().equals(ve.btnnewModelo)) {
            col.btnSale(ve.btnnewModelo);
        }

    }

}
