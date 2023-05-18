package controlador.ventanas.departamentos;

import controlador.utilidades.Colores;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import vista.Vdepartamentos;

/**
 * Controla los eventos del Mouse en la venta de Departamentos
 *
 * @author Carlos Masabet
 * @since 0.2
 */
public class MouseDepa implements MouseListener {

    private Vdepartamentos ve;
    private Colores col;

    static String depa, jefe, contacto, marca, serial;

    public MouseDepa(Vdepartamentos ve, Colores col) {
        this.ve = ve;
        this.col = col;

        ve.cbtabla.addMouseListener(this);
        ve.cbbuscar.addMouseListener(this);
        ve.cbtipobusqueda.addMouseListener(this);

        ve.btnAbrirAsignar.addMouseListener(this);
        ve.btnAsignar.addMouseListener(this);
        ve.btnReasignar.addMouseListener(this);

        ve.btnAbrirModificar.addMouseListener(this);
        ve.btnactualizar.addMouseListener(this);

        ve.btnAbrirSolicitud.addMouseListener(this);
        //ve.btn

        ve.btnAbrirAgregar.addMouseListener(this);
        ve.btnagregar.addMouseListener(this);

        ve.jtdepartamentos.addMouseListener(this);

        ve.btndetalles.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent me) {

        //almacena  el contenido de la celdas seleccionada cuando se hace click en la tabla
        if (me.getSource().equals(ve.jtdepartamentos)) {
            int i = ve.jtdepartamentos.getSelectedRow();
            Cdepartamentos.seleccionado = true;

            switch (Cdepartamentos.tabla) {
                case "departemento":
                    depa = ve.jtdepartamentos.getValueAt(i, 0).toString();
                    jefe = ve.jtdepartamentos.getValueAt(i, 1).toString();
                    contacto = ve.jtdepartamentos.getValueAt(i, 2).toString();
                    break;

                case "asignacione":
                    marca = ve.jtdepartamentos.getValueAt(i, 0).toString();
                    serial = ve.jtdepartamentos.getValueAt(i, 1).toString();
                    depa = ve.jtdepartamentos.getValueAt(i, 2).toString();
                    break;

                case "solicitude":
                    JOptionPane.showMessageDialog(ve, "por hacer");

            }
        }
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
        if (me.getSource().equals(ve.cbtabla)) {
            col.cbEntra(ve.cbtabla);
        }
        if (me.getSource().equals(ve.cbbuscar)) {
            col.cbEntra(ve.cbbuscar);
        }
        if (me.getSource().equals(ve.cbtipobusqueda)) {
            col.cbEntra(ve.cbtipobusqueda);
        }

        //botones
        if (me.getSource().equals(ve.btnAbrirAsignar)) {
            col.btnEntra(ve.btnAbrirAsignar);
        }
        if (me.getSource().equals(ve.btnAsignar)) {
            col.btnEntra(ve.btnAsignar);
        }
        if (me.getSource().equals(ve.btnReasignar)) {
            col.btnEntra(ve.btnReasignar);
        }

        if (me.getSource().equals(ve.btnAbrirModificar)) {
            col.btnEntra(ve.btnAbrirModificar);
        }
        if (me.getSource().equals(ve.btnactualizar)) {
            col.btnEntra(ve.btnactualizar);
        }

        if (me.getSource().equals(ve.btnAbrirSolicitud)) {
            col.btnEntra(ve.btnAbrirSolicitud);
        }

        if (me.getSource().equals(ve.btnAbrirAgregar)) {
            col.btnEntra(ve.btnAbrirAgregar);
        }
        if (me.getSource().equals(ve.btnagregar)) {
            col.btnEntra(ve.btnagregar);
        }

        if (me.getSource().equals(ve.btndetalles)) {
            col.btnEntra(ve.btndetalles);
        }

    }

    //pone lo botones de color claro cuando se pasa el mouse por encima
    @Override
    public void mouseExited(MouseEvent me) {
        //combobox
        if (me.getSource().equals(ve.cbtabla)) {
            col.cbSale(ve.cbtabla);
        }
        if (me.getSource().equals(ve.cbbuscar)) {
            col.cbSale(ve.cbbuscar);
        }
        if (me.getSource().equals(ve.cbtipobusqueda)) {
            col.cbSale(ve.cbtipobusqueda);
        }

        //botones
        if (me.getSource().equals(ve.btnAbrirAsignar)) {
            col.btnSale(ve.btnAbrirAsignar);
        }
        if (me.getSource().equals(ve.btnAsignar)) {
            col.btnSale(ve.btnAsignar);
        }
        if (me.getSource().equals(ve.btnReasignar)) {
            col.btnSale(ve.btnReasignar);
        }

        if (me.getSource().equals(ve.btnAbrirModificar)) {
            col.btnSale(ve.btnAbrirModificar);
        }
        if (me.getSource().equals(ve.btnactualizar)) {
            col.btnSale(ve.btnactualizar);
        }

        if (me.getSource().equals(ve.btnAbrirSolicitud)) {
            col.btnSale(ve.btnAbrirSolicitud);
        }

        if (me.getSource().equals(ve.btnAbrirAgregar)) {
            col.btnSale(ve.btnAbrirAgregar);
        }
        if (me.getSource().equals(ve.btnagregar)) {
            col.btnSale(ve.btnagregar);
        }

        if (me.getSource().equals(ve.btndetalles)) {
            col.btnSale(ve.btndetalles);
        }
    }

}
