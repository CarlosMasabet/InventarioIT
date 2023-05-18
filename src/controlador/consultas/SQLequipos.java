package controlador.consultas;

import controlador.utilidades.Colores;
import controlador.utilidades.Tablas;
import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Departamentos;
import modelo.Equipos;

/**
 * Realiza todas la consultas a la base de datos relacionadas a las pc
 *
 * @since 0.1
 * @author Carlos Masabet
 */
public class SQLequipos extends Conexion_SQL implements IConsultas {

    private static SQLequipos instance;

    private final String COLUMNAS[] = {"Marca", "Modelo", "Serial"};
    private DefaultTableModel MODELO;

    private SQLequipos() {
    }

    /**
     * Metodo singleton, valida si ya existe una instancia de esta clase y la
     * devuelbe, si no existe la crea
     *
     * @return objeto de la clase SQLequipos
     */
    public static SQLequipos getInstanceEquipo() {
        if (instance == null) {
            instance = new SQLequipos();
        }
        return instance;
    }

    @Override
    public void decorarTabla(JTable tabla, int num) {
        MODELO = new Tablas(COLUMNAS, 0);

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

    //CRUD
    @Override
    public boolean llenadoTabla(JTable tabla) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT ma.Nombre, mo.Nombre, pc.serial FROM pc inner join marca as ma on pc.marca = ma.id inner join modelo as mo on pc.Modelo = mo.id";
        try {
            decorarTabla(tabla, 0);

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

            case 1:// marca
                sql = "SELECT ma.Nombre, mo.Nombre, pc.serial FROM pc inner join marca as ma on pc.marca = ma.id inner join modelo as mo on pc.Modelo = mo.id where ma.Nombre = ?";
                break;

            case 2://serial
                sql = "SELECT ma.Nombre, mo.Nombre, pc.serial FROM pc inner join marca as ma on pc.marca = ma.id inner join modelo as mo on pc.Modelo = mo.id where pc.serial = ?";
                break;

            case 4://estado
                sql = "SELECT ma.Nombre, mo.Nombre, pc.serial FROM pc inner join marca as ma on pc.marca = ma.id inner join modelo as mo on pc.Modelo = mo.id where pc.estado = ?";
                break;

            case 5:
                sql = "SELECT ma.Nombre, mo.Nombre, pc.serial FROM pc inner join marca as ma on pc.marca = ma.id inner join modelo as mo on pc.Modelo = mo.id where mo.nombre = ?";

        }
        try {
            decorarTabla(tabla, 0);

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

    /**
     * Añade un nuevo equipo o pc a la base de datos
     *
     * @param eq Modelo que almacena los datos a ingresar
     * @param nomModelo El número de id del modelo del pc
     * @return boolean: true si la operación se realizo correctamente o false si
     * no
     */
    public Boolean AñadirEquipos(Equipos eq, String nomModelo) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String SQL1 = "SELECT id FROM modelo WHERE nombre = ?";
        String SQL2 = "INSERT INTO pc (marca, modelo, serial, estado, usuario) VALUES (?, ?, ?, ?, ?)";

        try {
            ps = con.prepareStatement(SQL1);
            ps.setString(1, nomModelo);
            rs = ps.executeQuery();

            if (rs.next()) {
                eq.setModelo(rs.getInt("id"));

                ps = con.prepareStatement(SQL2);
                ps.setInt(1, eq.getMarca());
                ps.setInt(2, eq.getModelo());
                ps.setString(3, eq.getSerial());
                ps.setString(4, eq.getEstado());
                ps.setString(5, eq.getUs());
                ps.execute();
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
     * Elinima el equipo especificado de la base de datos
     *
     * @param serial Serial del equipo a elimininar
     * @return boolean: true si la operación se realizo correctamente o false si
     * no
     */
    public boolean Eliminar(String serial) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT id FROM pc WHERE serial = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, serial);
            rs = ps.executeQuery();

            if (rs.next()) {

                int id = rs.getInt("id");

                String eliminar = "DELETE FROM pc WHERE id = ?";
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

    /**
     * Modifica el registro de una pc en la base de datos
     *
     * @param eq Modelo que alamcena los nuevos datos
     * @param nomModelo Número de id del modelo de la pc
     * @param id Identificador unico de la pc
     * @return boolean: true si la operación se realizo correctamente o false si
     * no
     */
    public boolean Modificar(Equipos eq, String nomModelo, int id) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String SQL1 = "SELECT id FROM modelo WHERE nombre = ?";
        String SQL2 = "UPDATE pc SET usuario = ?, marca = ?, modelo = ?, serial = ?, estado = ? WHERE id = ?";

        try {
            ps = con.prepareStatement(SQL1);
            ps.setString(1, nomModelo);
            rs = ps.executeQuery();

            if (rs.next()) {
                eq.setModelo(rs.getInt("id"));

                ps = con.prepareStatement(SQL2);
                ps.setString(1, eq.getUs());
                ps.setInt(2, eq.getMarca());
                ps.setInt(3, eq.getModelo());
                ps.setString(4, eq.getSerial());
                ps.setString(5, eq.getEstado());

                ps.setInt(6, id);

                ps.execute();
            }

            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } finally {
            closeCon(con);
        }

    }

    //otras funciones
    /**
     * Busca en la base de datos en cual departemento se encuentra una pc
     *
     * @param serial Serial de la pc a buscar
     * @return Modelo con toda la información del departemento
     */
    public Departamentos getdepa(String serial) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT id FROM pc WHERE serial = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, serial);
            rs = ps.executeQuery();

            if (rs.next()) {
                int idpc = rs.getInt(1);

                String sql2 = "SELECT dep.id, dep.nombre, dep.jefe, dep.contacto FROM pc_dep as d inner join departamentos as dep on d.dep_id = dep.id  where d.pc_id = ?;";

                ps = con.prepareStatement(sql2);
                ps.setInt(1, idpc);
                rs = ps.executeQuery();

                if (rs.next()) {
                    int id = rs.getInt(1);
                    String nombre = rs.getString(2);
                    String jefe = rs.getString(3);
                    String contacto = rs.getString(4);

                    Departamentos depa = new Departamentos(id, nombre, jefe, contacto);
                    return depa;
                }
                return null;
            }

            return null;

        } catch (SQLException e) {
            System.out.println(e);
            return null;
        } finally {
            closeCon(con);
        }
    }

    /**
     * Crea un nuevo registro de una marca en la base de datos
     *
     * @param nombre Nombre de la marca
     * @return boolean: true si la operación se realizo correctamente o false si
     * no
     */
    public Boolean añadirMarca(String nombre) {
        PreparedStatement ps;
        Connection con = getConnection();

        String sql = "INSERT INTO marca (nombre) VALUES (?)";

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
     * Crea un nuevo registro de un modelo en la base de datos
     *
     * @param nombre Nombre del modelo
     * @param marca Id de la marca del modelo
     * @return boolean: true si la operación se realizo correctamente o false si
     * no
     */
    public Boolean añadirModelo(String nombre, int marca) {
        PreparedStatement ps;
        Connection con = getConnection();

        String sql1 = "INSERT INTO modelo (nombre, marca) VALUES (?, ?)";

        try {
            ps = con.prepareStatement(sql1);
            ps.setString(1, nombre);
            ps.setInt(2, marca);
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } finally {
            closeCon(con);
        }
    }

    //comprobaciones 
    /**
     * Valida si ya exite el registro de una pc en la base de datos
     *
     * @param serial Serial de la pc
     * @return int: El resultado sera "0" si la pc no existe en el registro o
     * "1" si este ya existe
     */
    public int validaPC(String serial) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT COUNT(id) FROM pc WHERE serial = ?";

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
     * Valida si una marca ya estan en la base de datos
     *
     * @param nombre Nombre de la marca
     * @return El resultado sera "0" si la marca no existe en el
     * registro o "1" si este ya existe
     */
    public int validaMarca(String nombre) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT COUNT(id) FROM marca WHERE nombre = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
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
     * Valida si un modelo ya estan en la base de datos
     *
     * @param nombre Nombre del modelo
     * @return El resultado sera "0" si la modelo no existe en el
     * registro o "1" si este ya existe
     */
    public int validaModelo(String nombre) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT COUNT(id) FROM modelo WHERE nombre = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
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

    //llenado de desplegables desde un base de datos
    /**
     * Llena una barra desplegable o JCombobox con todas las marcas en la base
     * de datos
     *
     * @param cb Barra desplegable o JCombobox a llenar
     */
    public void cbMarca(JComboBox cb) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();
        String sql = "SELECT nombre FROM marca";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData mt = rs.getMetaData();

            int num = mt.getColumnCount();

            while (rs.next()) {
                String[] lista = new String[num];

                for (int i = 0; i < num; i++) {
                    lista[i] = rs.getString("nombre");
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
     * Llena una barra desplegable o JCombobox con todos los modelos en la base
     * de datos
     *
     * @param cb Desplegable o JCombobox a llenar
     * @param marca Id de la marca a la que pertenece el modelo
     */
    public void cbModelo(JComboBox cb, int marca) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "select mo.nombre from modelo as mo inner join marca as ma on mo.marca = ma.id where ma.id = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, marca);
            rs = ps.executeQuery();
            ResultSetMetaData mt = rs.getMetaData();

            int num = mt.getColumnCount();

            while (rs.next()) {
                String[] lista = new String[num];

                for (int i = 0; i < num; i++) {
                    lista[i] = rs.getString("nombre");

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

    //retotnan datos
    /**
     * Extrae toda la información de una pc de la base de datos
     *
     * @param serial Serial de la pc
     * @return Objeto con los datos
     */
    public Equipos getEquipo(String serial) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT pc.id, pc.usuario, ma.Nombre, mo.Nombre, pc.estado FROM pc inner join marca as ma on pc.marca = ma.id inner join modelo as mo on pc.Modelo = mo.id WHERE pc.serial = ?";
        try {

            ps = con.prepareCall(sql);
            ps.setString(1, serial);
            rs = ps.executeQuery();

            if (rs.next()) {

                int id = rs.getInt(1);
                String usuario = rs.getString(2);
                String marca = rs.getString(3);
                String modelo = rs.getString(4);
                String estado = rs.getString(5);

                Equipos equipo = new Equipos(id, marca, modelo, serial, estado, usuario);
                return equipo;
            }

            return null;

        } catch (SQLException e) {
            System.out.println(e);
            return null;
        } finally {
            closeCon(con);
        }
    }

    /**
     * Busca el id de una pc
     *
     * @param serial Serial de la pc
     * @return int: el id de la pc introducida
     */
    public int getid(String serial) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT id FROM pc WHERE serial = ?";
        try {

            ps = con.prepareCall(sql);
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
}
