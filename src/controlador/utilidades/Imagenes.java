package controlador.utilidades;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *Controla las funciones de las imagens
 * @author Carlos Masabet
 * @since 0.1
 */
public class Imagenes {  


    /**
     *Agusta el tamaño de una imagen al del label que la contiene
     * @param j Label que contiene la imagen
     * @param ruta Ubicaión de la imagen
     */
    public void cambio_tam(JLabel j, String ruta) {

        ImageIcon imagen = new ImageIcon(ruta);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(j.getWidth(), j.getWidth(), Image.SCALE_DEFAULT));
        j.setIcon(icono);
    }

    /**
     *Cambia la imagen que se muestra en un label
     * @param j Label que contiene la imagen
     * @param ruta Ubicaión de la imagen
     */
    public void cambio_img(JLabel j, String ruta) {
        ImageIcon imagen = new ImageIcon(ruta);
        Icon icono = new ImageIcon(imagen.getImage());
        j.setIcon(icono);
    }

    /**
     *Le pone bordes a un label
     * @param j Label
     */
    public void bordes(JLabel j) {
        j.setBorder(javax.swing.BorderFactory.createLineBorder(Color.WHITE));
    }

    /**
     *le quita los bordes a un label
     * @param j Label
     */
    public void no_bordes(JLabel j) {
        j.setBorder(javax.swing.BorderFactory.createLineBorder(Colores.AZUL));
    }
}
