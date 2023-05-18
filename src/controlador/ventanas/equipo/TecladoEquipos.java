package controlador.ventanas.equipo;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TecladoEquipos implements KeyListener {
    
    private Cequipos ce;

    public TecladoEquipos(Cequipos ce) {
        this.ce = ce;
    }



    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //accsesos  
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //busqueda
        ce.Buscar();
    }

}
