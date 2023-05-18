
package controlador.ventanas.login;

import controlador.utilidades.Colores;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.Login;


public class MouseLogin implements MouseListener{
    private Login ve;
    private Colores col;

    public MouseLogin(Login ve, Colores col) {
        this.ve = ve;
        this.col = col;

        ve.btnentrar.addMouseListener(this);
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

    @Override
    public void mouseEntered(MouseEvent me) {
        col.btnEntra(ve.btnentrar);
    }

    @Override
    public void mouseExited(MouseEvent me) {
        col.btnSale(ve.btnentrar);
    }
    
}
