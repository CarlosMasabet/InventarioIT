package controlador.ventanas.departamentos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Controla los eventos del Teclado en la venta de Departamentos
 *
 * @author Carlos Masabet
 * @since 0.2
 */
public class TecladoDepa implements KeyListener {

    Cdepartamentos cd;

    public TecladoDepa(Cdepartamentos cd) {
        this.cd = cd;
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
    }

    //Realiza  las busquedas cada vez que se deja oprimir una tecla
    @Override
    public void keyReleased(KeyEvent ke) {
        cd.buscar();
    }

}
