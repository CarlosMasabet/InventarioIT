package controlador.ventanas.usuarios;

import controlador.ventanas.login.Clogin;
import controlador.utilidades.Hash;
import controlador.consultas.SQLusuarios;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Usuarios;
import proyecto.Proyecto;
import vista.Vusuarios;

public class Cusuarios implements ActionListener {

    private SQLusuarios sql;
    private Vusuarios ve;
    private MouseUsuarios mu;

    private String TIPO_US, NOMBRE, CODIGO;
    private Boolean seleccionado = false;
    private Boolean selecCambio;

    public Cusuarios(SQLusuarios sql, Vusuarios ve) {
        this.sql = sql;
        this.ve = ve;

        mu = new MouseUsuarios(ve, Proyecto.color);

        ve.btnabrirAñadir.addActionListener(this);
        ve.btnagregar_us.addActionListener(this);
        ve.btneliminar.addActionListener(this);
        ve.btnabrirMod.addActionListener(this);
        ve.btnguardar.addActionListener(this);
        ve.btnmodDatos.addActionListener(this);
        ve.btnabrirModDat.addActionListener(this);

        ve.jtusuarios.addMouseListener(new MouseAdapter() {
            DefaultTableModel modelo = new DefaultTableModel();

            @Override
            public void mouseClicked(MouseEvent e) {
                int i = ve.jtusuarios.getSelectedRow();
                TIPO_US = ve.jtusuarios.getValueAt(i, 3).toString();
                NOMBRE = ve.jtusuarios.getValueAt(i, 1).toString();
                CODIGO = ve.jtusuarios.getValueAt(i, 0).toString();
                seleccionado = true;
            }
        });

        Iniciar();
    }

    private void Iniciar() {
        ve.setMinimumSize(Proyecto.TAMAÑO);
        ve.us.setText(Clogin.NomUsuario);
        ve.setTitle(Proyecto.TITULO + "-Usuarios");
        ve.setIconImage(proyecto.Proyecto.ICONO.getImage());
        ve.setLocationRelativeTo(null);
        ve.setResizable(false);
        ve.setVisible(true);

        //ve.btnabrirModDat.setVisible(Clogin.Admin);
        LlenadoTabla();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(ve.btnabrirAñadir)) {
            AbrirAñadir();
        }
        if (e.getSource().equals(ve.btnagregar_us)) {
            AñadirUsuarios();
        }
        if (e.getSource().equals(ve.btneliminar)) {
            Eliminar();
        }
        if (e.getSource().equals(ve.btnabrirMod)) {
            AbrirModCon();
        }
        if (e.getSource().equals(ve.btnguardar)) {
            ModCon();
        }
        if (e.getSource().equals(ve.btnabrirModDat)) {
            AbrirModDat();
        }
        if (e.getSource().equals(ve.btnmodDatos)) {
            ModDatos();
        }
    }

    //Metodos
    private void LlenadoTabla() {
        if (sql.llenadoTabla(ve.jtusuarios)) {

        } else {
            JOptionPane.showMessageDialog(ve, "Error al carga la tabla");
        }
    }

    //Añadir usuarios
    private void AbrirAñadir() {
        if (Clogin.Admin) {//solo el administrador
            ve.jfañadir_us.setResizable(false);
            ve.jfañadir_us.setTitle("Agregar Usuario");
            ve.jfañadir_us.setIconImage(proyecto.Proyecto.ICONO.getImage());
            ve.jfañadir_us.setSize(new Dimension(460, 400));
            ve.jfañadir_us.setLocationRelativeTo(ve);
            ve.titulo.setText("Agregar Usuario");
            ve.btnmodDatos.setVisible(false);
            seleccionado = false;

            //seteo de botones
            ve.btnagregar_us.setVisible(true);
            ve.jfañadir_us.setVisible(true);

            //iniciando componentes necesarios
            ve.txt1.setVisible(true);
            ve.txt2.setVisible(true);
            ve.Separator1.setVisible(true);
            ve.Separator2.setVisible(true);

            vaciarDatos();

        } else {
            JOptionPane.showMessageDialog(ve.jfañadir_us, Proyecto.SIN_PERMISO);
        }

    }

    private void AñadirUsuarios() {

        String nombre = ve.txtnom_us.getText();
        String codigo = ve.txtcod.getText();
        String pass = Arrays.toString(ve.txtpass1.getPassword());
        String pass2 = Arrays.toString(ve.txtpass2.getPassword());

        int t = ve.cbtipoUs.getSelectedIndex();

        //*se puede crear un usuario sin contraseña*
        if (nombre.equals("") || codigo.equals("") || t == 0 || pass.length() == 0 || pass2.length() == 0) {
            JOptionPane.showMessageDialog(ve.jfañadir_us, "Debe llenar todos los datos");

        } else {

            if (pass.length() >= 6) {//confirma que la contraseña tenga almenos 6 caracteres

                if (pass.equals(pass2)) {//confirma que las contraseñas sean iguales

                    if (sql.ValidarUsusario(codigo) == 0) {//valida que no exista un usuario con el mismo codigo
                        String cifrado = Hash.sha1(pass);

                        Usuarios nuevo = new Usuarios(0, codigo, nombre, "");

                        nuevo.setContraseña(cifrado);
                        nuevo.setTipo_us(t + 1);

                        if (sql.Reguistrar(nuevo)) {//ejecuta la insercion en la base de datos
                            JOptionPane.showMessageDialog(ve.jfañadir_us, "Usuario guardadro");
                            vaciarDatos();
                            ve.jfañadir_us.setVisible(false);

                            LlenadoTabla();

                        } else {//ejecuta la insercion en la base de datos
                            JOptionPane.showMessageDialog(ve.jfañadir_us, "Error al guardar usuario");
                        }

                    } else {//valida que no exista un usuario con el mismo codigo
                        JOptionPane.showMessageDialog(ve.jfañadir_us, "Ya existe un usuario con ese nombre");
                    }
                } else {//confirma que las contraseñas sean iguales
                    JOptionPane.showMessageDialog(ve.jfañadir_us, "Las contraseñas no coinciden");
                    ve.txtpass2.setText("");
                }
            } else {//confirma que la contraseña tenga almenos 6 caracteres
                JOptionPane.showMessageDialog(ve, "La contraseña dede tener almenos 6 caracteres");
            }

        }

    }

    //Eliminar
    private void Eliminar() {
        if (Clogin.Admin) {//confirma el tipo de usurio. solo el admin

            if (seleccionado) {//confima que se selecion un usuario

                if (TIPO_US.equals("Administrador")) {// confirma que el usuario no sea admin
                    JOptionPane.showMessageDialog(ve, "No es posible eliminar un usuario Administrador");

                } else {// confirma que el usuario no sea admin
                    int confirmar = JOptionPane.showConfirmDialog(ve, "¿Desea eliminar este usuario?. No prodra recuperarlo despues");

                    if (confirmar == 0) {//cofiema que deberdad se quiera elimiar un usuario

                        if (sql.Eliminar(CODIGO)) {
                            JOptionPane.showMessageDialog(ve, "Usuario eliminado");
                            LlenadoTabla();
                            seleccionado = false;

                        } else {
                            JOptionPane.showMessageDialog(ve, "Error al eliminar usuario");
                        }
                    }
                }
            } else {//confima que se selecion un usuario
                JOptionPane.showMessageDialog(ve, "Debe selecionar un usuario a eliminar");
            }

        } else {//confirma el tipo de usurio
            JOptionPane.showMessageDialog(ve, Proyecto.SIN_PERMISO);
        }
    }

    //Cambiar contraseñas
    private void AbrirModCon() {
        ve.jfmodificar.setResizable(false);
        ve.jfmodificar.setTitle("Cambiar Contraseña");
        ve.jfmodificar.setIconImage(proyecto.Proyecto.ICONO.getImage());
        ve.jfmodificar.setMinimumSize(new Dimension(350, 360));
        ve.jfmodificar.setLocationRelativeTo(ve);

        if (Clogin.Admin) {
            if (seleccionado) {
                //permite modificar las contraseñas de los demas usuarios a los admin
                ve.txtCusuario.setText("Usuario: " + NOMBRE);
                ve.jfmodificar.setVisible(true);
                selecCambio = true;

            } else {
                //si el admin quiere cambiar su contraseña
                ve.txtCusuario.setText("Usuario: " + Clogin.NomUsuario);
                ve.jfmodificar.setVisible(true);
                selecCambio = false;
            }

        } else {
            //permite a los usuarios normales cambiar solo su contraseña
            ve.txtCusuario.setText("Usuario: " + Clogin.NomUsuario);
            ve.jfmodificar.setVisible(true);
            selecCambio = false;
        }
    }

    private void ModCon() {

        String pass = Arrays.toString(ve.txtCpass.getPassword());
        String pass2 = Arrays.toString(ve.txtCpass2.getPassword());

        Usuarios us = new Usuarios();

        if (pass.length() == 0 || pass.length() == 0) {//confirma que las contraseñas no esten vacias
            JOptionPane.showMessageDialog(ve.jfmodificar, "Debe llenar todos los datos");

        } else {//confirma que las contraseñas no esten vacias

            if (pass.length() >= 6) {//confirma que la contraseña tenga almenos 6 caracteres

                if (pass.equals(pass2)) {//confirma que las contraseñas sean iguales

                    String cifrado = Hash.sha1(pass);
                    us.setContraseña(cifrado);
                    System.out.println(pass);

                    int id;

                    if (selecCambio) {
                        id = sql.getId(CODIGO);

                    } else {
                        id = sql.getIdNom(Clogin.NomUsuario);
                    }
                    us.setContraseña(cifrado);
                    us.setId(id);

                    if (sql.ModificarClave(us)) {//ejecuta el update en la base de datos
                        ve.txtCpass.setText("");
                        ve.txtCpass2.setText("");
                        ve.jfmodificar.setVisible(false);
                        JOptionPane.showMessageDialog(ve.jfmodificar, "Contraseña modificada exitosamente");
                    } else {
                        JOptionPane.showMessageDialog(ve.jfmodificar, "Error al modificar contraseña");
                    }

                } else {//confirma que las contraseñas sean iguales
                    JOptionPane.showMessageDialog(ve.jfmodificar, "Las contraseñas no coinciden");
                    ve.txtCpass2.setText("");
                }
            } else {//confirma que la contraseña tenga almenos 6 caracteres
                JOptionPane.showMessageDialog(ve, "La contraseña dede tener almenos 6 caracteres");
            }

        }
    }

    //Cambiar datos
    private void AbrirModDat() {
        //permite modificar los datos de los usuarios a los admin

        if (Clogin.Admin) {

            if (seleccionado) {

                seleccionado = false;

                if (!TIPO_US.equals("Administrador")) {

                    ve.jfañadir_us.setResizable(false);
                    ve.jfañadir_us.setTitle("Modificar Datos");
                    ve.titulo.setText("Modificar Datos");
                    ve.jfañadir_us.setSize(new Dimension(460, 310));
                    ve.jfañadir_us.setLocationRelativeTo(ve);
                    ve.btnmodDatos.setVisible(true);
                    //seteo de botonones
                    ve.btnagregar_us.setVisible(false);
                    ve.jfañadir_us.setVisible(true);

                    //eliminado de  componentes que no se usan
                    ve.txt1.setVisible(false);
                    ve.txt2.setVisible(false);
                    ve.Separator1.setVisible(false);
                    ve.Separator2.setVisible(false);

                    //llenado de los campos
                    ve.txtcod.setText(CODIGO);
                    ve.txtnom_us.setText(NOMBRE);
                    if (TIPO_US.equals("Regular")) {
                        ve.cbtipoUs.setSelectedIndex(1);
                    } else {
                        ve.cbtipoUs.setSelectedIndex(2);
                    }

                } else {
                    JOptionPane.showMessageDialog(ve, "No se pueden cambiar los datos del administrador");
                }

            } else {
                JOptionPane.showMessageDialog(ve, "Debe selecionar un usuario");
            }
        } else {
            JOptionPane.showMessageDialog(ve, Proyecto.SIN_PERMISO);
        }

    }

    private void ModDatos() {
        String nombre = ve.txtnom_us.getText();
        String codigo = ve.txtcod.getText();

        int t = ve.cbtipoUs.getSelectedIndex();
        String tipo = ve.cbtipoUs.getItemAt(t);

        Usuarios mod = sql.getUs(CODIGO);

        //*se puede crear un usuario sin contraseña*
        if (nombre.equals("") || codigo.equals("") || t == 0) {
            JOptionPane.showMessageDialog(ve.jfañadir_us, "Debe llenar todos los datos");

        } else {
            if (nombre.equals(mod.getNombre()) && codigo.equals(mod.getCodigo()) && tipo.equals(mod.getTipoNom())) {
                JOptionPane.showMessageDialog(ve, "Debe cambiar los datos");

            } else {
                //System.out.println(sql.ValidarUsusario(codigo));

                if (!nombre.equals(NOMBRE) && sql.ValidarUsusario(codigo) != 0) {

                    JOptionPane.showMessageDialog(ve.jfañadir_us, "Ya existe un usuario con ese codigo");
                } else {

                    mod.setCodigo(codigo);
                    mod.setNombre(nombre);
                    mod.setTipo_us(t + 1);

                    if (sql.ModificarDatos(mod, CODIGO)) {
                        JOptionPane.showMessageDialog(ve.jfañadir_us, "Datos modificados");
                        vaciarDatos();
                        ve.jfañadir_us.setVisible(false);

                        LlenadoTabla();

                    } else {
                        JOptionPane.showMessageDialog(ve.jfañadir_us, "Error al guardar usuario");
                    }
                }
            }
        }
    }

    //Otros
    private void vaciarDatos() {
        ve.txtcod.setText("");
        ve.txtnom_us.setText("");
        ve.cbtipoUs.setSelectedIndex(0);
        ve.txtpass1.setText("");
        ve.txtpass2.setText("");
    }
}
