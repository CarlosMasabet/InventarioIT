package controlador.consultas;

import controlador.utilidades.Colores;
import controlador.utilidades.Tablas;
import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Perifericos;

/**
 * Realiza todas la consultas a la base de datos relacionadas a los perifericos
 *
 * @author Carlos Masabet
 * @since 0.2
 */
public class SQLperifericos extends Conexion_SQL implements IConsultas {

    private static SQLperifericos instance;

    private final String COLUMNAS1[] = {"Periferico", "Serial"};
    private final String COLUMNAS2[] = {"Serial", "Periferico", "PC"};
    private DefaultTableModel MODELO;

    private SQLperifericos() {
    }

    //singleton
    /**
     * Metodo singleton, valida si ya existe una instancia de esta clase y la
     * devuelbe, si no existe la crea
     *
     * @return objeto de la clase SQLperifericos
     */
    public static SQLperifericos getInstance() {
        if (instance == null) {
            instance = new SQLperifericos();
        }
        return instance;
    }

    @Override
    public void decorarTabla(JTable tabla, int num) {
        if (num == 1) {
            MODELO = new Tablas(COLUMNAS1, 0);
        } else {
            MODELO = new Tablas(COLUMNAS2, 0);
        }

        tabla.setModel(MODELO);

        tabla.setFocusable(false);
        tabla.getTableHeader().setReorderingAllowed(false);
        tabla.getTableHeader().setBackground(Colores.AZUL);
        tabla.getTableHeader().setForeground(Color.WHITE);
        tabla.getTableHeader().setFont(new Font("time new roman", Font.BOLD, 18));
        tabla.getTableHeader().setOpaque(false);
        tabla.setSelectionForeground(Color.BLACK);
        tabla.setSelectionBackground(Colores.GRIS_OSCURO);
        tabla.setBackground(Color.WHITE);
        tabla.setRowHeight(20);
    }

    @Override
    public boolean llenadoTabla(JTable tabla) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT p.serial, l.desc, pc.serial FROM  perifericos as p  INNER JOIN lista AS l ON p.tipo = l.idlista INNER JOIN pc ON p.pc = pc.id;";
        try {
            decorarTabla(tabla, 2);

            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            ResultSetMetaData mt = rs.getMetaData();

            int cant_column = mt.getColumnCount();

            while (rs.next()) {
                Object[] lista = new Object[cant_column];
                for (int i = 0; i < cant_column; i++) {
                    lista[i] = rs.getObject(i + 1);
                }
                MODELO.addRow(lista);
            }
            return true;

        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } finally {
            closeCon(con);
        }
    }

    @Override
    public boolean buscar(int selector, String busqueda, JTable tabla) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = null;
        switch (selector) {
            case 1:// serial del periferico
                sql = "SELECT p.serial, l.desc, pc.serial FROM  perifericos as p  INNER JOIN lista AS l ON p.tipo = l.idlista INNER JOIN pc ON p.pc = pc.id where p.serial = ?;";
                break;

            case 2:// tipo de periferico
                sql = "SELECT p.serial, l.desc, pc.serial FROM  perifericos as p  INNER JOIN lista AS l ON p.tipo = l.idlista INNER JOIN pc ON p.pc = pc.id where l.desc = ?;";
                break;

            case 3://serial de la pc
                sql = "SELECT p.serial, l.desc, pc.serial FROM  perifericos as p  INNER JOIN lista AS l ON p.tipo = l.idlista INNER JOIN pc ON p.pc = pc.id where pc.serial = ?;";
                break;
        }
        try {
            MODELO = new DefaultTableModel(COLUMNAS2, 0);
            tabla.setModel(MODELO);

            ps = con.prepareStatement(sql);
            ps.setString(1, busqueda);
            rs = ps.executeQuery();

            ResultSetMetaData MD = rs.getMetaData();
            int num_t = MD.getColumnCount();

            while (rs.next()) {
                Object[] lista = new Object[num_t];
                for (int i = 0; i < num_t; i++) {
                    lista[i] = rs.getObject(i + 1);
                }
                MODELO.addRow(lista);
            }
            return true;

        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return false;

        } finally {
            closeCon(con);
        }
    }

    //CRUD
    /**
     * LLena una tabla con los la lista de los perifericos asignados a una pc
     *
     * @param id Id de la pc a la cual se la van a mostrar sus perifericos
     * @param tabla Tabla donde aparecera la información
     * @return boolean: true si la operación se realizo correctamente o false si
     * no
     */
    public Boolean tablaDetalles(int id, JTable tabla) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT l.desc, p.serial FROM perifericos as p INNER JOIN lista AS l On p.tipo = l.idlista WHERE p.pc = ?";
        try {
            decorarTabla(tabla, 1);

            tabla.getTableHeader().setFont(new Font("time new roman", Font.BOLD, 12));

            ps = con.prepareCall(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            ResultSetMetaData mt = rs.getMetaData();

            int cant_column = mt.getColumnCount();

            while (rs.next()) {
                Object[] lista = new Object[cant_column];
                for (int i = 0; i < cant_column; i++) {
                    lista[i] = rs.getObject(i + 1);
                }
                MODELO.addRow(lista);
            }
            return true;

        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } finally {
            closeCon(con);
        }

    }

    /**
     * Añade un perioferico a la base de datos
     *
     * @param pe Objeto que contiene toda la información del periferico
     * @return boolean: true si la operación se realizo correctamente o false si
     * no
     */
    public Boolean añadir(Perifericos pe) {
        PreparedStatement ps;
        Connection con = getConnection();

        String sql = "INSERT INTO perifericos (pc, tipo, serial) VALUES (?, ?, ?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pe.getPc());
            ps.setInt(2, pe.getTipo());
            ps.setString(3, pe.getSerial());
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } finally {
            closeCon(con);
        }
    }

    /**
     * Cambia la pc a la que esta asignado un periferico
     *
     * @param pe Objeto que contiene toda la información del periferico
     * @param id Id del periferico
     * @return boolean: true si la operación se realizo correctamente o false si
     * no
     */
    public Boolean reasignar(Perifericos pe, int id) {
        PreparedStatement ps;
        Connection con = getConnection();

        String sql = "update perifericos set pc = ? where id = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pe.getPc());
            ps.setInt(2, id);
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } finally {
            closeCon(con);
        }
    }

    /**
     * Elimina un periferico de la base de datos
     *
     * @param serial Serial del periferico a eliminar
     * @return boolean: true si la operación se realizo correctamente o false si
     * no
     */
    public boolean Eliminar(String serial) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT id FROM perifericos WHERE serial = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, serial);
            rs = ps.executeQuery();

            if (rs.next()) {

                int id = rs.getInt("id");

                String eliminar = "DELETE FROM perifericos WHERE id = ?";
                ps = con.prepareStatement(eliminar);
                ps.setInt(1, id);
                ps.execute();
                return true;
            }
            return false;

        } catch (SQLException e) {
            System.out.println(e);
            return false;

        } finally {
            closeCon(con);
        }
    }

    //validaciones para añadir un registro
    /**
     * Valida si ya existe el reregistro de un periferico en la base de datos
     *
     * @param serial Serial del periferico a buscar
     * @return int: El resultado sera "0" si el periferico no existe en el
     * registro o "1" si este ya existe
     */
    public int validarPeriferico(String serial) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT COUNT(id) FROM perifericos WHERE serial = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, serial);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;

        } catch (SQLException e) {
            System.out.println(e);
            return 1;

        } finally {
            closeCon(con);
        }
    }

    /**
     * Valida que un equipo no tengo 2 veces el mismo periferico
     *
     * @param tipo Id del tipo de periferico
     * @param pc Id de la pc
     * @return int: El resultado sera "0" si la pc no tiene aignado ese tipo de
     * periferic en el registro o "1" si ya lo tiene
     */
    public int validaRepeticion(int tipo, int pc) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT COUNT(id) FROM perifericos WHERE tipo = ? AND pc = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, tipo);
            ps.setInt(2, pc);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;

        } catch (SQLException e) {
            System.out.println(e);
            return 1;

        } finally {
            closeCon(con);
        }
    }

    /**
     * Valida si ya exite el registro de una pc en la base de datos
     *
     * @param pc Id de la pc
     * @return int: El resultado sera "0" si la pc no existe en el registro o
     * "1" si este ya existe
     */
    public int validaPC(int pc) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT COUNT(id) FROM pc WHERE id = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pc);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;

        } catch (SQLException e) {
            System.out.println(e);
            return 1;

        } finally {
            closeCon(con);
        }
    }

    /**
     * Busca el id de un periferico
     *
     * @param serial Serial del periferico
     * @return int: el id del periferico introducido
     */
    public int getId(String serial) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT id FROM perifericos where serial = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, serial);
            rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt(1);
                return id;
            }

            return 0;

        } catch (SQLException e) {
            System.out.println(e);
            return 0;

        } finally {
            closeCon(con);
        }
    }

    //consultas de la tabla de tipos de perifericos
    /**
     * Añade un nuevo tipo de periferico a la base de datos
     *
     * @param nombre Nombre del periferico a incluir
     * @return boolean: true si la operación se realizo correctamente o false si
     * no
     */
    public Boolean nuevoLista(String nombre) {
        PreparedStatement ps;
        Connection con = getConnection();

        String sql = "INSERT INTO lista (lista.desc) VALUES (?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } finally {
            closeCon(con);
        }
    }

    /**
     * Llena una barra desplegable o JCombobox con la lista de los tipos de
     * perifericos
     *
     * @param cb Ddesplegable o JCombobox a llenar
     */
    public void cbPerifericos(JComboBox cb) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT lista.desc FROM lista";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData mt = rs.getMetaData();

            int num = mt.getColumnCount();

            while (rs.next()) {
                String[] lista = new String[num];

                for (int i = 0; i < num; i++) {
                    lista[i] = rs.getString(1);
                }

                for (int i = 0; i < num; i++) {
                    cb.addItem(lista[i]);
                }
            }

        } catch (SQLException e) {
            System.out.println(e);

        } finally {
            closeCon(con);
        }
    }

    /**
     * Busca el id del tipo de periferico
     *
     * @param perifeico Nombre del periferico a buscar
     * @return int: el id del tipo de periferico introducido
     */
    public int getIdLista(String perifeico) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT idlista FROM lista WHERE lista.desc = ?";
        try {

            ps = con.prepareCall(sql);
            ps.setString(1, perifeico);
            rs = ps.executeQuery();

            if (rs.next()) {
                int id = rs.getInt(1);
                return id;
            }

            return 0;

        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            closeCon(con);
        }
    }
}
