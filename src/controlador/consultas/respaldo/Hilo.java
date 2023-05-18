package controlador.consultas.respaldo;

import java.io.IOException;
import java.io.InputStream;
import javax.swing.JOptionPane;

/**
 * Captura y muestra posibles errores a la hora de respaldar y recuperar la base
 * de datos
 *
 * @author Carlos Masabet
 * @since 0.3
 */
public class Hilo extends Thread {

    private final InputStream is;

    public Hilo(InputStream is) {
        this.is = is;
    }

    @Override
    public void run() {
        try {
            byte[] buffer = new byte[1000];
            int leido = is.read(buffer);
            while (leido > 0) {
                String texto = new String(buffer, 0, leido);
                System.out.print(texto);
                leido = is.read(buffer);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "A ocurrido un error al generar el respaldo\n Error: " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

}
