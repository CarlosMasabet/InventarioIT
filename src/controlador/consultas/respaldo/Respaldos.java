package controlador.consultas.respaldo;

import controlador.consultas.Conexion_SQL;
import java.awt.HeadlessException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JOptionPane;

/**
 *Contiene el metodo para respaldar la base de datos
 * @author Carlos Masabet
 * @since 0.3
 */
public class Respaldos extends Conexion_SQL{

    /**
     *Genera el respaldo de la base de datos en la misma carpeta donde se encuentra el progarma
     */
    public void respaldar() {
        //mysqldump -u usuario -pcontraseña base-de-datos > ruta

        try {
            Process p = Runtime.getRuntime().exec(RESPALDAR);
            new Hilo(p.getErrorStream()).start();
            InputStream is = p.getInputStream();//Pedimos la entrada
            FileOutputStream fos = new FileOutputStream("backup_equipos.sql"); //creamos el archivo para le respaldo
            byte[] buffer = new byte[1000]; //Creamos una variable de tipo byte para el buffer

            int leido = is.read(buffer); //Devuelve el número de bytes leídos o -1 si se alcanzó el final del stream.
            while (leido > 0) {
                fos.write(buffer, 0, leido);//Buffer de caracteres, Desplazamiento de partida para empezar a escribir caracteres, Número de caracteres para escribir
                leido = is.read(buffer);
            }

            fos.close();//Cierra respaldo
            
            JOptionPane.showMessageDialog(null, "Respaldo generado");

        } catch (HeadlessException | IOException e) {
            
            JOptionPane.showMessageDialog(null, "1A ocurrido un error al generar el respaldo\n Error: " +e, "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }
    
    

}
