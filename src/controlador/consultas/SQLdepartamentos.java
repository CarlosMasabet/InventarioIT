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

/**
 * Realiza todas la consultas a la base de datos relacionadas a los
 * departamentps
 *
 * @since 0.2
 * @author Carlos Masabet
 */
public class SQLdepartamentos extends Conexion_SQL implements IConsultas {

    private static SQLdepartamentos instance;

    private final String COLUMNAS[] = {"Departamento", "Jefe", "Contacto"};
    private final String COLUMNAS2[] = {"Marca", "Serial", "Departamento"};
    private DefaultTableModel MODELO;

    private SQLdepartamentos() {
    }

    /**
     * Metodo singleton, valida si ya existe una instancia de esta clase y la
     * devuelbe, si no existe la crea
     *
     * @return objeto de la clase SQLdepartamentos
     */
    public static SQLdepartamentos getInstanceDerpartamentos() {
        if (instance == null) {
            instance = new SQLdepartamentos();
        }
        return instance;
    }

    @Override
    public void decorarTabla(JTable tabla, int num) {
        if (num == 1) {
            MODELO = new Tablas(COLUMNAS, 0);
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

        String sql = "SELECT nombre, jefe, contacto FROM departamentos;";
        try {
            decorarTabla(tabla, 1);

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

    //llenado de las tablas
    /**
     * Llena una segunda tabla, con la información de la ubicación de los pc
     *
     * @param tabla JTable a llenar
     * @return boolean: true si la operación se realizo correctamente o false si
     * no
     */
    public Boolean tablaVinculos(JTable tabla) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "select ma.nombre, pc.serial,  dep.nombre from pc_dep as pd inner join pc on pd.pc_id = pc.id inner join departamentos as dep on pd.dep_id = dep.id inner join marca as ma on pc.Marca = ma.id;";
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

            case 1:// departamento
                sql = "select ma.nombre, pc.serial,  dep.nombre from pc_dep as pd inner join pc on pd.pc_id = pc.id inner join departamentos as dep on pd.dep_id = dep.id inner join marca as ma on pc.Marca = ma.id where dep.nombre = ?;";
                break;

            case 2://serial
                sql = "select ma.nombre, pc.serial,  dep.nombre from pc_dep as pd inner join pc on pd.pc_id = pc.id inner join departamentos as dep on pd.dep_id = dep.id inner join marca as ma on pc.Marca = ma.id where pc.serial = ?;";
                break;
        }
        try {
            decorarTabla(tabla, 2);

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
     * Crea un nuevo departemento en la base de datos
     *
     * @param depa Objeto que contiene todos los datos a ingresar
     * @return boolean: true si la operación se realizo correctamente o false si
     * no
     */
    public Boolean nuevoDepa(Departamentos depa) {
        PreparedStatement ps;
        Connection con = getConnection();

        String sql = "INSERT INTO departamentos (nombre , jefe, contacto) VALUES (?, ?, ?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, depa.getNombre());
            ps.setString(2, depa.getJefe());
            ps.setString(3, depa.getContacto());
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
     * Modifica el registro de un departemento en la base de datos
     *
     * @param depa bjeto que contiene todos los datos a ingresar
     * @return boolean: true si la operación se realizo correctamente o false si
     * no
     */
    public Boolean ModificarDepa(Departamentos depa) {
        PreparedStatement ps;
        Connection con = getConnection();

        String SQL = "UPDATE departamentos SET nombre = ?, jefe = ?, contacto = ? WHERE id = ?;";

        try {

            ps = con.prepareStatement(SQL);
            ps.setString(1, depa.getNombre());
            ps.setString(2, depa.getJefe());
            ps.setString(3, depa.getContacto());
            ps.setInt(4, depa.getId());
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
     * Asigna una pc al departamento indicado
     *
     * @param depa id del departamentos al que se va a asignar
     * @param eq id de la pc a signar
     * @return boolean: true si la operación se realizo correctamente o false si
     * no
     */
    public Boolean AsignarEquipo(int depa, int eq) {
        PreparedStatement ps;
        Connection con = getConnection();

        String sql = "INSERT INTO pc_dep (dep_id, pc_id) VALUES (?, ?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, depa);
            ps.setInt(2, eq);
            ps.execute();

            return true;

        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return false;

        } finally {
            closeCon(con);
        }
    }

    /**
     * Modifica el registro de la asignación de un pc
     *
     * @param depa id del departamentos al que se va a asignar
     * @param eq id de la pc a resignar
     * @return boolean: true si la operación se realizo correctamente o false si
     * no
     */
    public Boolean ReasignarEquipo(int depa, int eq) {
        PreparedStatement ps;
        Connection con = getConnection();

        String sql = "UPDATE pc_dep SET dep_id = ? WHERE pc_id = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, depa);
            ps.setInt(2, eq);
            ps.execute();

            return true;

        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return false;

        } finally {
            closeCon(con);
        }
    }

    //Retornan datos
    /**
     * Extrar toda la información de un departamentos de la base de datos
     *
     * @param depa Nombre del departamento
     * @return objeto don todos los datos del departamento
     */
    public Departamentos getDepa(String depa) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "select * from departamentos where nombre = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, depa);
            rs = ps.executeQuery();

            if (rs.next()) {

                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                String jefe = rs.getString(3);
                String contacto = rs.getString(4);

                Departamentos datos = new Departamentos(id, nombre, jefe, contacto);
                return datos;
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
     * Busca el id del departamento especificado
     *
     * @param depa Nombre del departamento
     * @return id del departamento
     */
    public int getId(String depa) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT id FROM departamentos WHERE nombre = ?";
        try {

            ps = con.prepareCall(sql);
            ps.setString(1, depa);
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

    /**
     * Busca donde esta asignada una pc
     *
     * @param idpc Id de la pc
     * @return Nombre del departamento donde esta esignada
     */
    public String getAsig(int idpc) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "select dep.nombre from pc_dep as pd inner join departamentos as dep on pd.dep_id = dep.id where pd.pc_id = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idpc);
            rs = ps.executeQuery();

            if (rs.next()) {
                String nombre = rs.getString(1);

                return nombre;
            }
            return null;

        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return null;

        } finally {
            closeCon(con);
        }

    }

    //comprobaciones
    /**
     * Valida si ya exite el registro del departamento especificado en la base
     * de datos
     *
     * @param depaid id del departamento
     * @return int: El resultado sera "0" si el departamento no existe en el
     * registro o "1" si este ya existe
     */
    public int validaDepa(int depaid) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT COUNT(id) FROM departamentos WHERE id = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, depaid);
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
     * Valida si ya exite el registro del departamento especificado en la base
     * de datos
     *
     * @param depa Nombre del departamento
     * @return int: El resultado sera "0" si el departamento no existe en el
     * registro o"1" si este ya existe
     */
    public int validaDepa(String depa) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT COUNT(id) FROM departamentos WHERE nombre = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, depa);
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
     * Confirma que un pc no haya sido aginado antes
     *
     * @param serial Serial de la pc
     * @return int: El resultado sera "0" si la pc no a sido asognada o "1" si
     * este ya existe
     */
    public int validaAsignacion(String serial) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT COUNT(dep_id) FROM pc_dep WHERE pc_id = ?";

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
    }//valida si un pc ya esta asignado

    //llena los combobox
    /**
     * Llena una barra desplegable o JCombobox con todos los departamentos en la
     * base de datos
     *
     * @param cb Barra desplegable o JCombobox a llenar
     */
    public void cbDepa(JComboBox cb) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT nombre FROM departamentos;";

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
}
