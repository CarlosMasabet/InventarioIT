
package controlador.ventanas.perifericos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class TecladoPerifericos implements KeyListener{
    Cperifericos cp;

    public TecladoPerifericos(Cperifericos cp) {
        this.cp = cp;
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        cp.buscar();
    }
    
}
