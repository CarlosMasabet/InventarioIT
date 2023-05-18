package controlador.consultas;

import controlador.utilidades.Colores;
import controlador.utilidades.Tablas;
import java.awt.Color;
import java.awt.Font;
import modelo.Usuarios;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Realiza todas las consultas a la base de datos relacionadas a los perifericos
 *
 * @author Carlos Masabet
 * @since 0.1
 */
public class SQLusuarios extends Conexion_SQL implements IConsultas {//389,339,423

    private static SQLusuarios instance;
    public String error;

    private final String COLUMNAS[] = {"Codigo", "Nombre", "Ultima sesión", "Tipo"};
    private DefaultTableModel MODELO;

    private SQLusuarios() {
    }

    //singleton
    /**
     * Metodo singleton, valida si ya existe una instancia de esta clase y
     * ladevuelbe, si no existe la crea
     *
     * @return objeto de la clase SQLusuarios
     */
    public static SQLusuarios getInstance() {
        if (instance == null) {
            instance = new SQLusuarios();
        }
        return instance;
    }

    /**
     * Valida los datos introducidos en el login para permitor o no el acceso al
     * progarma
     *
     * @param us Todos los datos del usuario
     * @return int: Devuelve "0" en caso de que todos los datos sean correctos,
     * "1" si la contraseña esta equivocada, "2" si el usuario no existe y "3"
     * si hay problemas de conexión a la base de datos
     */
    public int InicioSesion(Usuarios us) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT id, nombre, contraseña, tipo_us FROM usuarios WHERE codigo = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, us.getCodigo());
            rs = ps.executeQuery();

            if (rs.next()) {
                if (us.getContraseña().equals(rs.getString(3))) {

                    us.setId(rs.getInt("id"));
                    us.setTipo_us(rs.getInt("tipo_us"));
                    us.setNombre(rs.getString("nombre"));

                    String update = "UPDATE usuarios SET ult_sesion = ? WHERE id = ?";
                    ps = con.prepareCall(update);
                    ps.setString(1, us.getUlima_secion());
                    ps.setInt(2, us.getId());

                    ps.execute();
                    return 0;// 0 = entrar

                } else {
                    return 1;// 1 = error de contraseña
                }
            } else {
                return 2;// 2 = error de usuario
            }

        } catch (SQLException e) {
            System.out.println("error: " + e);
            error = e.toString();
            return 3;// 3 = probelmas de conexión
        } finally {
            closeCon(con);
        }

    }

    /**
     * Crea un nuevo usuario
     *
     * @param us Todos los datos del usuario
     * @return boolean: true si la operación se realizo correctamente o false si
     * no
     */
    public boolean Reguistrar(Usuarios us) {
        PreparedStatement ps;
        Connection con = getConnection();

        String sql = "INSERT INTO usuarios (codigo, nombre, contraseña, tipo_us) VALUES(?, ?, ?, ?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, us.getCodigo());
            ps.setString(2, us.getNombre());
            ps.setString(3, us.getContraseña());
            ps.setInt(4, us.getTipo_us());
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
     * Valida si ya existe un usuario con el codigo ingresado
     *
     * @param codigo Codigo del usuario a confirmar
     * @return boolean: true si la operación se realizo correctamente o false si
     * no
     */
    public int ValidarUsusario(String codigo) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT COUNT(id) FROM usuarios WHERE codigo = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, codigo);
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
     * Elimina un usuario de la base de datos
     *
     * @param codigo Codigo del usuario a eliminar
     * @return boolean: true si la operación se realizo correctamente o false si
     * no
     */
    public boolean Eliminar(String codigo) {
        PreparedStatement ps;
        Connection con = getConnection();

        String sql = "DELETE FROM usuarios WHERE codigo = ?";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, codigo);
            System.out.println(codigo);
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
     * Cambia la contraseña del usuario espesificado
     *
     * @param us Objeto con todos los datos del usuario
     * @return boolean: true si la operación se realizo correctamente o false si
     * no
     */
    public boolean ModificarClave(Usuarios us) {
        PreparedStatement ps;
        Connection con = getConnection();

        String sql = "UPDATE usuarios SET contraseña = ? WHERE id = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, us.getContraseña());
            ps.setInt(2, us.getId());
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
     * Modifica los datos del usuatio especificado
     *
     * @param us Objeto con todos los datos del usuario
     * @param codigo Codigo del usuario
     * @return boolean: true si la operación se realizo correctamente o false si
     * no
     */
    public boolean ModificarDatos(Usuarios us, String codigo) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT id FROM usuarios WHERE codigo = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, codigo);
            rs = ps.executeQuery();

            if (rs.next()) {
                us.setId(rs.getInt(1));

                String update = "UPDATE usuarios SET codigo = ?, nombre = ?, tipo_us = ? WHERE id = ?";

                ps = con.prepareStatement(update);
                ps.setString(1, us.getCodigo());
                ps.setString(2, us.getNombre());
                ps.setInt(3, us.getTipo_us());
                ps.setInt(4, us.getId());
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
     * Busca en la base de datos toda la información de un usuario
     *
     * @param codigo Codigo del usuario
     * @return Objeto de la clase Usuarios
     */
    public Usuarios getUs(String codigo) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "SELECT us.id, us.codigo, us.nombre, ti.desc FROM usuarios AS us INNER JOIN tipo_us AS ti ON us.tipo_us = ti.tipo where codigo = ?;";
        try {

            ps = con.prepareCall(sql);
            ps.setString(1, codigo);
            rs = ps.executeQuery();

            if (rs.next()) {

                int id = rs.getInt(1);
                String cod = rs.getString(2);
                String nombre = rs.getString(3);
                String tipo = rs.getString(4);

                Usuarios us = new Usuarios(id, codigo, nombre, tipo);

                return us;
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
     * Busca el id del usuario especificado
     *
     * @param codigo Codigo del usuario
     * @return El id del usuario
     */
    public int getId(String codigo) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "select id from usuarios where codigo = ?";

        try {

            ps = con.prepareCall(sql);
            ps.setString(1, codigo);
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
     * Busca el id del usuario especificado
     *
     * @param nombre Nombre del usuario
     * @return El id del usuario
     */
    public int getIdNom(String nombre) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();

        String sql = "select id from usuarios where nombre = ?";
        try {

            ps = con.prepareCall(sql);
            ps.setString(1, nombre);
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

    @Override
    public void decorarTabla(JTable tabla, int num) {
        MODELO = new Tablas(COLUMNAS, 0);

        tabla.setModel(MODELO);

        tabla.setFocusable(false);
        tabla.getTableHeader().setReorderingAllowed(false);
        tabla.getTableHeader().setBackground(Colores.ROJO);
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

        String sql = " SELECT us.codigo, us.nombre, us.ult_sesion, ti.desc FROM usuarios as us INNER JOIN tipo_us as ti ON us.tipo_us = ti.tipo";

        try {
            decorarTabla(tabla, 0);

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData md = rs.getMetaData();

            int numCloumn = md.getColumnCount();

            while (rs.next()) {
                Object[] lista = new Object[numCloumn];
                for (int i = 0; i < numCloumn; i++) {
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
        //Este metodo no es usado en esta clase
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
