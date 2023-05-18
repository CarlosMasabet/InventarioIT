package controlador.utilidades;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JComboBox;

/**
 * Define los colores que se van a usar en el programa y cambia los colores
 * algunos objetos
 *
 * @author Carlos Masabet
 * @since 0.3
 */
public class Colores {

    public static final Color AZUL = new Color(0x001b42);

    public static final Color GRIS_OSCURO = new Color(0x999eaa);

    public static final Color GRIS_CLARO = new Color(0xdee7f0);

    public static final Color ROJO = new Color(0xCE0000);

    /**
     * Regresa un boton a su color original cuando el mouse sale
     *
     * @param btn Boton al que se va a cambiar el color
     */
    public void btnSale(JButton btn) {
        Color a = btn.getBackground();

        if (a == ROJO) {
            btn.setBackground(AZUL);
        } else {
            btn.setBackground(ROJO);
        }

        btn.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }

    /**
     * Cambia el color de un boton cuando el mouse pasa por arriba dependiendo
     * del color inical, si el boton es rojo lo cambia a azul y viseversa
     *
     * @param btn Boton al que se va a cambiar el color
     */
    public void btnEntra(JButton btn) {

        Color a = btn.getBackground();

        if (a == ROJO) {
            btn.setBackground(AZUL);
        } else {
            btn.setBackground(ROJO);
        }

        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    /**
     * Regresa un Commbox a su color original cuando el mouse sale
     *
     * @param cb Commbox al que se va a cambiar el color
     */
    public void cbSale(JComboBox cb) {
        Color a = cb.getBackground();

        if (a == ROJO) {
            cb.setBackground(AZUL);
        } else {
            cb.setBackground(ROJO);
        }

        cb.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }

    /**
     * Cambia el color de un Commbox cuando el mouse pasa por arriba dependiendo
     * del color inical, si el Commbox es rojo lo cambia a azul y viseversa
     *
     * @param cb Commbox al que se va a cambiar el color
     */
    public void cbEntra(JComboBox cb) {
        Color a = cb.getBackground();

        if (a == ROJO) {
            cb.setBackground(AZUL);
        } else {
            cb.setBackground(ROJO);
        }

        cb.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

}
