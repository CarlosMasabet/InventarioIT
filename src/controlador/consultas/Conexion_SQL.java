package controlador.consultas;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Establece la conección con la base de datos
 *
 * @since 0.1
 * @author Carlos Masabet
 */
public class Conexion_SQL {

    //información de la base de datos
    private  static final String USER = "root";
    private  static final String PASS = "123456";
    private  static final String BD = "inventarioit";
    private  static final String DIRECCION = "localhost";
    private  static final String PORT = ":3306";
    
    //Comandos para hacer el respaldo y la recuperacion de la base de datos
    
    //estructura del comando: mysqldump -u usuario -pcontraseña base-de-datos > ruta
    protected static final String RESPALDAR = "mysqldump -u " +USER+ " -p" +PASS+ " " + BD;
    
    //estructura del comando: mysql -u usuario -pcontraseña base-de-datos
    protected static final String RECUPERAR = "mysql -u " +USER+ " -p" +PASS+ " " +BD;
   
    //direccion completa de la base de datos
    private static final String URL = "jdbc:mysql://" +DIRECCION+PORT+ "/" + BD;
    private static Connection con = null;

    /**
     * Establece la conneción con la base de datos
     * @return Connection
     */
    protected static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    /**
     * Cierra la conneción con la base de datos
     * @param c Variable que alamcena la conneción
     */
    protected static void closeCon(Connection c){
        try {
            c.close();
        } catch (SQLException e) {
            System.out.println("Error: " +e);
        }
    }
}
