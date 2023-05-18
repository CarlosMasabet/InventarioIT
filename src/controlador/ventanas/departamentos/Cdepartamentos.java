package controlador.ventanas.departamentos;

import controlador.ventanas.login.Clogin;
import controlador.consultas.SQLdepartamentos;
import controlador.consultas.SQLequipos;
import controlador.consultas.SQLperifericos;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Departamentos;
import modelo.Equipos;
import proyecto.Proyecto;
import vista.Vdepartamentos;

/**
 * Controla la venta de Departamentos
 *
 * @author Carlos Masabet
 * @since 0.2
 */
public class Cdepartamentos implements ActionListener {

    private SQLdepartamentos sql;
    private Vdepartamentos ve;
    private MouseDepa md;
    private Departamentos depa;
    private TecladoDepa td;

    public static String tabla;
    public static boolean seleccionado = false;
    private int inicial;

    private final int DEPAS = 0;
    private final int ASIGNACIONES = 1;
    private final int SOLICITUDES = 2;

    public Cdepartamentos(SQLdepartamentos sql, Vdepartamentos ve) {
        this.sql = sql;
        this.ve = ve;

        md = new MouseDepa(ve, Proyecto.color);
        td = new TecladoDepa(this);

        ve.txtbuscar.addKeyListener(td);

        ve.btnAbrirAgregar.addActionListener(this);
        ve.btnagregar.addActionListener(this);

        ve.btnAbrirAsignar.addActionListener(this);
        ve.btnAsignar.addActionListener(this);
        ve.btnReasignar.addActionListener(this);

        ve.btnAbrirModificar.addActionListener(this);

        ve.btndetalles.addActionListener(this);

        ve.btnAbrirSolicitud.addActionListener(this);
        ve.btnactualizar.addActionListener(this);

        ve.cbtipobusqueda.addActionListener(this);
        ve.cbbuscar.addActionListener(this);

        ve.cbtabla.addActionListener(this);
        ve.cbtabla.setFocusable(false);

        ve.cbDepas.setFocusable(false);

        Iniciar();
    }

    private void Iniciar() {
        ve.cbbuscar.setVisible(false);
        ve.txtbuscar.setVisible(false);
        ve.Separado.setVisible(false);

        ve.btnAbrirSolicitud.setVisible(false);

        int selec = ve.cbtabla.getSelectedIndex();
        llenadoTabla(selec);

        ve.setSize(Proyecto.TAMAÑO);
        ve.us.setText(Clogin.NomUsuario);
        ve.setResizable(false);
        ve.setTitle(Proyecto.TITULO + "-Departamentos");
        ve.setIconImage(proyecto.Proyecto.ICONO.getImage());
        ve.setLocationRelativeTo(null);
        ve.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(ve.btnAbrirAgregar)) {
            abrirAgregarDepa();
        }
        if (e.getSource().equals(ve.btnAbrirAsignar)) {
            abrirAsignar();
        }
        if (e.getSource().equals(ve.btnAbrirModificar)) {
            abrirModificarDepa();
        }
        if (e.getSource().equals(ve.btnAbrirSolicitud)) {
            abrirSolicitud();
        }
        if (e.getSource().equals(ve.cbtipobusqueda)) {
            tipoBusqueda();
        }
        if (e.getSource().equals(ve.cbbuscar)) {
            buscar();
        }
        if (e.getSource().equals(ve.btnagregar)) {
            agregar();
        }
        if (e.getSource().equals(ve.cbtabla)) {
            int selec = ve.cbtabla.getSelectedIndex();
            llenadoTabla(selec);
        }
        if (e.getSource().equals(ve.btnAsignar)) {
            asignar();
        }
        if (e.getSource().equals(ve.btnReasignar)) {
            reasignar();
        }
        if (e.getSource().equals(ve.btndetalles)) {
            verDetalles();
        }
        if (e.getSource().equals(ve.btnactualizar)) {
            actualizarDat();
        }
    }

    //selec decide que tabla se muestra, 0 departementos, 1 asignaciones y 2 solicitudes
    private void llenadoTabla(int selec) {

        ImageIcon dep = new ImageIcon("imagenes/fondos/DEPAS.png");
        ImageIcon asig = new ImageIcon("imagenes/fondos/DEPAS2.png");

        Icon fondo;

        switch (selec) {
            case DEPAS://tabla de departementos
                sql.llenadoTabla(ve.jtdepartamentos);
                tabla = "departemento";

                fondo = new ImageIcon(dep.getImage());
                ve.fondoIMG.setIcon(fondo);

                ve.btnAbrirModificar.setVisible(true);
                ve.btndetalles.setVisible(false);
                ve.cbtipobusqueda.setVisible(false);
                ve.txtbuscar.setVisible(false);
                ve.Separado.setVisible(false);
                ve.cbbuscar.setVisible(false);

                ve.btnAbrirAsignar.setText("Asignar Equipo");
                break;

            case ASIGNACIONES://tabla de asignaciones
                sql.tablaVinculos(ve.jtdepartamentos);
                tabla = "asignacione";

                fondo = new ImageIcon(asig.getImage());
                ve.fondoIMG.setIcon(fondo);

                ve.btnAbrirModificar.setVisible(false);
                ve.btndetalles.setVisible(true);
                ve.cbtipobusqueda.setVisible(true);
                ve.btnAbrirAsignar.setText("Reasignar Equipo");
                break;

            case SOLICITUDES://tabla de solicitudes
                tabla = "solicitude";
                JOptionPane.showMessageDialog(ve, "por hacer");
            //sql.(ve.jtdepartamentos);
        }
    }

    private void cambioTabala(int selec) {
        ve.cbtabla.setSelectedIndex(selec);
        llenadoTabla(selec);
    }

    //abrir ventanas
    private void abrirAgregarDepa() {
        if (Clogin.Admin) {
            vaciarCampos();

            ve.btnagregar.setVisible(true);
            ve.btnactualizar.setVisible(false);

            ve.jfagregar.setSize(new Dimension(360, 290));
            ve.jfagregar.setResizable(false);
            ve.jfagregar.setIconImage(proyecto.Proyecto.ICONO.getImage());
            ve.jfagregar.setLocationRelativeTo(ve);
            ve.jfagregar.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(ve, Proyecto.SIN_PERMISO);
        }

    }

    private void abrirAsignar() {
        //lo pueden hacer los admin y los regulares
        if (Clogin.Admin || Clogin.Regular) {

            if (seleccionado) {// confirma que se haya seleccionado una opcion
                ve.jfAsignar.setSize(400, 210);
                ve.jfAsignar.setResizable(false);
                ve.jfAsignar.setIconImage(Proyecto.ICONO.getImage());
                ve.jfAsignar.setLocationRelativeTo(ve);

                switch (tabla) {
                    case "departemento":
                        ve.txtdepa.setVisible(true);
                        ve.txtdepa.setText(MouseDepa.depa);
                        ve.cbDepas.setVisible(false);

                        ve.txtSerialEq.setEditable(true);
                        ve.txtSerialEq.setText("");

                        ve.btnAsignar.setVisible(true);
                        ve.btnReasignar.setVisible(false);

                        seleccionado = false;
                        break;

                    case "asignacione":
                        ve.txtdepa.setVisible(false);

                        ve.cbDepas.removeAllItems();
                        sql.cbDepa(ve.cbDepas);
                        ve.cbDepas.setSelectedItem(MouseDepa.depa);
                        inicial = ve.cbDepas.getSelectedIndex();
                        ve.cbDepas.setVisible(true);

                        ve.txtSerialEq.setEditable(false);
                        ve.txtSerialEq.setText(MouseDepa.serial);

                        ve.btnAsignar.setVisible(false);
                        ve.btnReasignar.setVisible(true);

                        seleccionado = false;
                        break;
                }

                ve.jfAsignar.setVisible(true);

            } else {//genera el mensaje de error
                String mensaje = "!Error. Esto no deberia pasar";
                if (tabla.equals("departemento")) {
                    mensaje = "departamento";
                } else {
                    mensaje = "equipo";
                }
                JOptionPane.showMessageDialog(ve, "Debe selecionar un " + mensaje);
            }

        } else {
            JOptionPane.showMessageDialog(ve, Proyecto.SIN_PERMISO);
        }

    }

    private void abrirModificarDepa() {
        //solo lo puden hace los admin
        if (Clogin.Admin) {

            if (seleccionado) {//confrima que se haya selecionado una opcion
                Departamentos mod = new Departamentos(sql.getId(MouseDepa.depa), MouseDepa.depa, MouseDepa.jefe, MouseDepa.contacto);
                traerDepa(mod);

                ve.txtndepa.setText(mod.getNombre());
                ve.txtnjefe.setText(mod.getJefe());
                ve.txtncontacto.setText(mod.getContacto());

                ve.btnagregar.setVisible(false);
                ve.btnactualizar.setVisible(true);

                ve.jfagregar.setSize(new Dimension(360, 290));
                ve.jfagregar.setResizable(false);
                ve.jfagregar.setIconImage(proyecto.Proyecto.ICONO.getImage());
                ve.jfagregar.setLocationRelativeTo(ve);
                ve.jfagregar.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(ve, "Debe seleccionar un departamento");
            }

        } else {
            JOptionPane.showMessageDialog(ve, Proyecto.SIN_PERMISO);
        }

    }

    private void abrirSolicitud() {
        //lo pueden hacer los admin y los regulares
        if (Clogin.Admin || Clogin.Regular) {

        } else {
            JOptionPane.showMessageDialog(ve, Proyecto.SIN_PERMISO);
        }
    }

    //CRUD
    private void agregar() {
        String depa = ve.txtndepa.getText();
        String jefe = ve.txtnjefe.getText();
        String contacto = ve.txtncontacto.getText();

        if (!depa.equals("") && !jefe.equals("") && !contacto.equals("")) {

            Departamentos nuevo = new Departamentos(sql.getId(depa), depa, jefe, contacto);

            if (sql.validaDepa(nuevo.getId()) == 0) {

                if (sql.nuevoDepa(nuevo)) {
                    vaciarCampos();
                    ve.jfagregar.setVisible(false);
                    cambioTabala(DEPAS);

                    JOptionPane.showMessageDialog(ve.jfagregar, "Departamento registrado");

                } else {
                    JOptionPane.showMessageDialog(ve.jfagregar, "No se ha podio registrar el departemento");
                }
            } else {
                JOptionPane.showMessageDialog(ve.jfagregar, "Ese departamento ya esta registrado");
            }
        } else {
            JOptionPane.showMessageDialog(ve.jfagregar, Proyecto.LLENAR_DATOS);
        }
    }

    //otros
    private void tipoBusqueda() {
        int tipo = ve.cbtipobusqueda.getSelectedIndex();

        switch (tipo) {
            case 0:// nada por defecto
                ve.cbbuscar.setVisible(false);
                ve.txtbuscar.setVisible(false);
                ve.Separado.setVisible(false);

                ve.cbbuscar.removeAllItems();
                ve.txtbuscar.setText("");

                break;

            case 1://busqueda por departamento
                ve.txtbuscar.setVisible(false);
                ve.Separado.setVisible(false);
                ve.txtbuscar.setText("");

                ve.cbbuscar.removeAllItems();
                sql.cbDepa(ve.cbbuscar);
                ve.cbbuscar.setVisible(true);
                break;

            case 2://busqueda por el serial
                ve.cbbuscar.removeAllItems();
                ve.cbbuscar.setVisible(false);

                ve.txtbuscar.setText("");
                ve.txtbuscar.setVisible(true);
                ve.Separado.setVisible(true);
                break;
        }
    }

    protected void buscar() {
        int selector = ve.cbtipobusqueda.getSelectedIndex();
        String buscar = null;
        Boolean buscando = false;
        switch (selector) {
            case 0: //nada, por defecto
                cambioTabala(ASIGNACIONES);
                buscando = false;
                break;

            case 1://departamentos
                int ndepa = ve.cbbuscar.getSelectedIndex();
                buscar = ve.cbbuscar.getItemAt(ndepa);
                buscando = true;
                break;

            case 2://serial
                buscar = ve.txtbuscar.getText();
                buscando = true;
                break;
        }
        if (buscando) {

            if (sql.buscar(selector, buscar, ve.jtdepartamentos)) {
                //llena la segunda barra desplegable con los modelos en la parte de para buscar
                /*int mar = ve.cbbusqueda.getSelectedIndex();
                ve.cbbusModelos.removeAllItems();

                if (mar != 0) {
                    sql.cbModelo(ve.cbbusModelos, mar + 1);
                }*/

            } else {
                JOptionPane.showMessageDialog(ve, "Error en la busqueda");
            }
        }
    }

    private void vaciarCampos() {
        ve.txtncontacto.setText("");
        ve.txtnjefe.setText("");
        ve.txtndepa.setText("");
    }

    private void asignar() {
        String depa = ve.txtdepa.getText();
        String serialEq = ve.txtSerialEq.getText();

        if (!serialEq.equals("") && !depa.equals("")) {//confirma que se llenaron los compos 
            SQLequipos eq = SQLequipos.getInstanceEquipo();

            if (eq.validaPC(serialEq) != 0) {//confirma que el equipo ya exista

                if (sql.validaAsignacion(serialEq) == 0) {//confirma que el equipo no haya sido aginado antes

                    int idDepa = sql.getId(depa);
                    int idEq = eq.getid(serialEq);

                    if (sql.AsignarEquipo(idDepa, idEq)) {
                        seleccionado = false;
                        ve.txtSerialEq.setText("");
                        ve.jfAsignar.setVisible(false);
                        JOptionPane.showMessageDialog(ve.jfAsignar, "Equipo asignado correctamente");

                    } else {
                        JOptionPane.showMessageDialog(ve.jfAsignar, "Error al asignar equipo");
                    }

                } else {//confirma que el equipo no haya sido aginado antes
                    JOptionPane.showMessageDialog(ve.jfAsignar, "El equipo ya a sido asignado");
                }

            } else {//confirma que el equipo ya exista
                JOptionPane.showMessageDialog(ve.jfAsignar, "El equipo no se en cuentra registrado");
            }

        } else {
            JOptionPane.showMessageDialog(ve.jfAsignar, Proyecto.LLENAR_DATOS);
        }

    }

    private void reasignar() {
        int a = ve.cbDepas.getSelectedIndex();
        String depa = ve.cbDepas.getItemAt(a);

        String serialPc = ve.txtSerialEq.getText();

        if (a != inicial && !serialPc.equals("")) {//confirma que se haya cambiado el departemento

            SQLequipos eq = SQLequipos.getInstanceEquipo();

            int idpc = eq.getid(serialPc);
            int iddepa = sql.getId(depa);

            if (sql.ReasignarEquipo(iddepa, idpc)) {
                JOptionPane.showMessageDialog(ve.jfAsignar, "Equipo reasignado exitosamente");
                ve.jfAsignar.setVisible(false);
                cambioTabala(ASIGNACIONES);
            } else {

            }

        } else {//confirma que se haya cambiado el departemento
            JOptionPane.showMessageDialog(ve.jfAsignar, Proyecto.CAMBIAR_DATOS);
        }
    }

    private void verDetalles() {
        if (seleccionado) {
            SQLequipos sqle = SQLequipos.getInstanceEquipo();

            Equipos equipo = sqle.getEquipo(MouseDepa.serial);
            ve.txtdetmarca.setText("Marca: " + equipo.getMarcaP());
            ve.txtdetmodelo.setText("Modelo: " + equipo.getModeloP());
            ve.txtdetserial.setText("Serial: " + equipo.getSerial());
            ve.txtdetestado.setText("Estado: " + equipo.getEstado());
            ve.txtdetususario.setText("Usuario: " + equipo.getUs());

            Departamentos depa = sqle.getdepa(MouseDepa.serial);

            if (depa != null) {
                ve.txtdetdepar.setText("Ubicación: " + depa.getNombre());
            } else {
                ve.txtdetdepar.setText("Ubicación: Sin asignar");
            }
            SQLperifericos peri = SQLperifericos.getInstance();

            peri.tablaDetalles(equipo.getId(), ve.jtperifericos1);

            ve.jfdetalles.setMinimumSize(new Dimension(350, 390));
            ve.jfdetalles.setIconImage(proyecto.Proyecto.ICONO.getImage());
            ve.jfdetalles.setResizable(false);
            ve.jfdetalles.setLocationRelativeTo(ve);
            ve.jfdetalles.setTitle("Detalles");
            ve.jfdetalles.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(ve, "Debe selecionar un reguistro primero");

        }
    }

    private void actualizarDat() {
        String nombre = ve.txtndepa.getText();
        String jefe = ve.txtnjefe.getText();
        String contac = ve.txtncontacto.getText();

        if (!nombre.equals("") || !jefe.equals("") || !contac.equals("")) {//confirma que los campos no esten vacios

            if (!nombre.equals(depa.getNombre()) || !jefe.equals(depa.getJefe()) || !contac.equals(depa.getContacto())) {//confirma que haya algun cambio

                if (nombre.equals(depa.getNombre())) {//confirma que el nombre no se repita

                    modificar(nombre, jefe, contac);

                } else {//confirma que el nombre no se repita

                    if (sql.validaDepa(nombre) == 0) {
                        modificar(nombre, jefe, contac);
                    } else {
                        JOptionPane.showMessageDialog(ve.jfagregar, "Ese departamento ya esta registrado");
                    }
                }
            } else {//confirma que haya algun cambio
                JOptionPane.showMessageDialog(ve.jfagregar, Proyecto.CAMBIAR_DATOS);
            }
        } else {//confirma que los campos no esten vacios
            JOptionPane.showMessageDialog(ve.jfagregar, Proyecto.LLENAR_DATOS);
        }
    }

    private void modificar(String nombre, String jefe, String contac) {
        depa.setNombre(nombre);
        depa.setJefe(jefe);
        depa.setContacto(contac);

        if (sql.ModificarDepa(depa)) {

            vaciarCampos();
            depa = null;
            cambioTabala(DEPAS);
            ve.jfagregar.setVisible(false);
            JOptionPane.showMessageDialog(ve.jfagregar, "Datos actualizados exitosamente");

        } else {
            JOptionPane.showMessageDialog(ve.jfagregar, "Error al actualizar los datos");
        }
    }

    private void traerDepa(Departamentos depa) {
        this.depa = depa;
    }

}
