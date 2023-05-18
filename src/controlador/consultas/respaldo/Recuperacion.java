package controlador.consultas.respaldo;

import controlador.consultas.Conexion_SQL;
import java.awt.HeadlessException;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *Contiene el metodo para recuperar la base de datos
 * @author Carlos Masabet
 * @since 0.3
 */
public class Recuperacion extends Conexion_SQL{

    /**
     *Recupera la base de datos apartir del backop de la misma
     */
    public void recuperacion() {

        File respaldo = new File("backup_equipos.sql");

        if (respaldo.exists()) {
            //mysql -u user -ppass base-de-datos
            try {
                
                Process p = Runtime.getRuntime().exec(RECUPERAR);
                new Hilo(p.getErrorStream()).start();

                OutputStream os = p.getOutputStream(); //Pedimos la salida
                FileInputStream fis = new FileInputStream("backup_equipos.sql"); //creamos el archivo para le respaldo
                byte[] buffer = new byte[1000]; //Creamos una variable de tipo byte para el buffer

                int leido = fis.read(buffer);//Devuelve el número de bytes leídos o -1 si se alcanzó el final del stream.
                while (leido > 0) {
                    os.write(buffer, 0, leido); //Buffer de caracteres, Desplazamiento de partida para empezar a escribir caracteres, Número de caracteres para escribir
                    leido = fis.read(buffer);
                }

                os.flush(); //vacía los buffers de salida
                os.close(); //Cierra
                fis.close(); //Cierra respaldo
                
                JOptionPane.showMessageDialog(null, "Base de Datos recuperada");
                
            } catch (HeadlessException | IOException e) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se exite un respaldo de la BD en esta pc");
        }

    }

}
