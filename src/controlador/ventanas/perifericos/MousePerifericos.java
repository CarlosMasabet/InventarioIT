
package controlador.ventanas.perifericos;

import controlador.utilidades.Colores;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.Vperifericos;


public class MousePerifericos implements MouseListener{
    
    Vperifericos ve;
    Colores col;

    public MousePerifericos(Vperifericos ve, Colores col) {
        this.ve = ve;
        this.col = col;
        
        ve.cbbuscar.addMouseListener(this);
        ve.cbtipobusqueda.addMouseListener(this);
        
        ve.btnabriragregar.addMouseListener(this);
        ve.btnagregar.addMouseListener(this);
        
        ve.btnabrirReasignar.addMouseListener(this);
        ve.btnreasignar.addMouseListener(this);
        
        ve.btndetalles.addMouseListener(this);
        
        ve.btneliminar.addMouseListener(this);
        
        ve.btntipo.addMouseListener(this);
        ve.btnnuevoperi.addMouseListener(this);
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
    
    //pone los botones de color oscuro
    @Override
    public void mouseEntered(MouseEvent me) {
        //combobox
        if (me.getSource().equals(ve.cbbuscar)){
            col.cbEntra(ve.cbbuscar);
        }
        if (me.getSource().equals(ve.cbtipobusqueda)){
            col.cbEntra(ve.cbtipobusqueda);
        }
        
        //botones
        if (me.getSource().equals(ve.btnabriragregar)){
            col.btnEntra(ve.btnabriragregar);
        }
        if (me.getSource().equals(ve.btnagregar)){
            col.btnEntra(ve.btnagregar);
        }
        
        if(me.getSource().equals(ve.btnabrirReasignar)){
            col.btnEntra(ve.btnabrirReasignar);
        }
        if (me.getSource().equals(ve.btnreasignar)){
            col.btnEntra(ve.btnreasignar);
        }
        
        if (me.getSource().equals(ve.btndetalles)){
            col.btnEntra(ve.btndetalles);
        }
        
        if (me.getSource().equals(ve.btneliminar)){
            col.btnEntra(ve.btneliminar);
        }
        
        if (me.getSource().equals(ve.btntipo)){
            col.btnEntra(ve.btntipo);
        }
        if (me.getSource().equals(ve.btnnuevoperi)){
            col.btnEntra(ve.btnnuevoperi);
        }
    }

    //debuelbe los botones a su color original
    @Override
    public void mouseExited(MouseEvent me) {
        //combobox
        if (me.getSource().equals(ve.cbbuscar)){
            col.cbEntra(ve.cbbuscar);
        }
        if (me.getSource().equals(ve.cbtipobusqueda)){
            col.cbEntra(ve.cbtipobusqueda);
        }
        
        //botones
        if (me.getSource().equals(ve.btnabriragregar)){
            col.btnSale(ve.btnabriragregar);
        }
        if (me.getSource().equals(ve.btnagregar)){
            col.btnSale(ve.btnagregar);
        }
        
        if(me.getSource().equals(ve.btnabrirReasignar)){
            col.btnSale(ve.btnabrirReasignar);
        }
        if (me.getSource().equals(ve.btnreasignar)){
            col.btnSale(ve.btnreasignar);
        }
        
        if (me.getSource().equals(ve.btndetalles)){
            col.btnSale(ve.btndetalles);
        }
        
        if (me.getSource().equals(ve.btneliminar)){
            col.btnSale(ve.btneliminar);
        }
        
        if (me.getSource().equals(ve.btntipo)){
            col.btnSale(ve.btntipo);
        }
        if (me.getSource().equals(ve.btnnuevoperi)){
            col.btnSale(ve.btnnuevoperi);
        }
    }
    
}
