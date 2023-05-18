package controlador.ventanas.perifericos;

import controlador.consultas.SQLequipos;
import controlador.consultas.SQLperifericos;
import controlador.ventanas.login.Clogin;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Departamentos;
import modelo.Equipos;
import modelo.Perifericos;
import proyecto.Proyecto;
import vista.Vperifericos;

public class Cperifericos implements ActionListener {

    private SQLperifericos sql;
    private Vperifericos ve;
    private TecladoPerifericos tp;
    private MousePerifericos mp;

    private String SERIAL, PERIFERICO, PC;
    private Boolean seleccionado = false;

    public Cperifericos(SQLperifericos sql, Vperifericos ve) {
        this.sql = sql;
        this.ve = ve;
        
        tp = new TecladoPerifericos(this);
        mp = new MousePerifericos(ve, Proyecto.color);

        ve.btnabriragregar.addActionListener(this);
        ve.btndetalles.addActionListener(this);
        ve.btneliminar.addActionListener(this);
        ve.btnabrirReasignar.addActionListener(this);
        ve.btntipo.addActionListener(this);
        ve.btnagregar.addActionListener(this);
        ve.btnnuevoperi.addActionListener(this);
        ve.btnreasignar.addActionListener(this);

        ve.cbtipobusqueda.addActionListener(this);
        ve.cbbuscar.addActionListener(this);
        ve.txtbuscar.addKeyListener(tp);

        ve.jtperifericos.addMouseListener(new MouseAdapter() {
            DefaultTableModel modelo = new DefaultTableModel();

            @Override
            public void mouseClicked(MouseEvent e) {
                int i = ve.jtperifericos.getSelectedRow();
                SERIAL = ve.jtperifericos.getValueAt(i, 0).toString();
                PERIFERICO = ve.jtperifericos.getValueAt(i, 1).toString();
                PC = ve.jtperifericos.getValueAt(i, 2).toString();
                seleccionado = true;
            }
        });

        Inicio();
    }

    private void Inicio() {
        ve.cbbuscar.setVisible(false);
        ve.txtbuscar.setVisible(false);
        ve.Separador.setVisible(false);

        //ve.btntipo.setVisible(Clogin.Admin);

        llenadoTabla();
        
        ve.txtus.setText(Clogin.NomUsuario);
        ve.setSize(Proyecto.TAMAÑO);
        ve.setResizable(false);
        ve.setTitle(Proyecto.TITULO+ "-Perifericos");
        ve.setIconImage(proyecto.Proyecto.ICONO.getImage());
        ve.setLocationRelativeTo(null);
        ve.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(ve.btnabriragregar)) {
            abrirAgregar();
        }
        if (e.getSource().equals(ve.btndetalles)) {
            abrirdetalles();
        }
        if (e.getSource().equals(ve.btneliminar)) {
            eliminar();
        }
        if (e.getSource().equals(ve.btnabrirReasignar)) {
            abrirReasignar();
        }
        if (e.getSource().equals(ve.btntipo)) {
            abrirTipo();
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
        if (e.getSource().equals(ve.btnnuevoperi)) {
            nuevoPeriferico();
        }
        if (e.getSource().equals(ve.btnreasignar)){
            reaisgnar();
        }
    }

    //Abrir sub-ventanas
    private void abrirAgregar() {
        if (Clogin.Regular || Clogin.Admin) {

            vaciarCampos();
            sql.cbPerifericos(ve.cbtipoperi);

            ve.cbtipoperi.setVisible(true);
            ve.txtserialperi.setVisible(true);
            ve.btnagregar.setVisible(true);

            ve.txtreasigperi.setVisible(false);
            ve.txtreasigserial.setVisible(false);
            ve.btnreasignar.setVisible(false);

            ve.jfañadir.setResizable(false);
            ve.jfañadir.setIconImage(proyecto.Proyecto.ICONO.getImage());
            ve.jfañadir.setSize(355, 300);
            ve.jfañadir.setLocationRelativeTo(ve);
            ve.jfañadir.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(ve, Proyecto.SIN_PERMISO);
        }
    }

    private void abrirdetalles() {
        if (seleccionado) {
            SQLequipos sqle = SQLequipos.getInstanceEquipo();

            Equipos equipo = sqle.getEquipo(PC);
            ve.txtdetmarca.setText("Marca: " + equipo.getMarcaP());
            ve.txtdetmodelo.setText("Modelo: " + equipo.getModeloP());
            ve.txtdetserial.setText("Serial: " + equipo.getSerial());
            ve.txtdetestado.setText("Estado: " + equipo.getEstado());
            ve.txtdetususario.setText("Usuario: " + equipo.getUs());

            Departamentos depa = sqle.getdepa(PC);

            if (depa != null) {
                ve.txtdetdepar.setText("Ubicación: " + depa.getNombre());
            } else {
                ve.txtdetdepar.setText("Ubicación: Sin asignar");
            }
            sql.tablaDetalles(equipo.getId(), ve.jtperifericos1);

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

    private void abrirReasignar() {
        if (Clogin.Regular || Clogin.Admin) {

            if (seleccionado) {
                
                Perifericos re = new Perifericos(sql.getId(SERIAL), PC, PERIFERICO, SERIAL);

                ve.txtreasigperi.setText(re.getTipoP());
                ve.txtreasigserial.setText(re.getSerial());
                ve.txtserialpc.setText("");

                ve.cbtipoperi.setVisible(false);
                ve.txtserialperi.setVisible(false);
                ve.btnagregar.setVisible(false);

                ve.txtreasigperi.setVisible(true);
                ve.txtreasigserial.setVisible(true);
                ve.btnreasignar.setVisible(true);

                ve.jfañadir.setResizable(false);
                ve.jfañadir.setIconImage(proyecto.Proyecto.ICONO.getImage());
                ve.jfañadir.setSize(355, 300);
                ve.jfañadir.setLocationRelativeTo(ve);
                ve.jfañadir.setVisible(true);
                
            } else {
                JOptionPane.showMessageDialog(ve, "Debe seleccionar un periferico");
            }
        } else {
            JOptionPane.showMessageDialog(ve, Proyecto.SIN_PERMISO);
        }

    }

    private void abrirTipo() {
        
        if (Clogin.Admin){
            ve.txtnuevoperi.setText("");
            ve.jftipo.setSize(new Dimension(215, 175));
            ve.jftipo.setResizable(false);
            ve.jftipo.setIconImage(proyecto.Proyecto.ICONO.getImage());
            ve.jftipo.setLocationRelativeTo(ve);
            ve.jftipo.setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(ve, Proyecto.SIN_PERMISO);
        }
        
    }

    //CRUD
    private void llenadoTabla() {
        if (sql.llenadoTabla(ve.jtperifericos)) {

        } else {
            JOptionPane.showMessageDialog(ve, "Error al cargar la tabla");
        }
    }

    private void agregar() {
        String serial = ve.txtserialperi.getText();
        String serialPc = ve.txtserialpc.getText();

        int num = ve.cbtipoperi.getSelectedIndex();
        String periferico = ve.cbtipoperi.getItemAt(num);

        if (!serial.equals("") && !serialPc.equals("")) {//valida que los campos no esten vaios

            SQLequipos eq = SQLequipos.getInstanceEquipo();
            int pc = eq.getid(serialPc);
            int tipo = sql.getIdLista(periferico);

            if (sql.validarPeriferico(serial) == 0) {//valida no exista otro periferico con ese serial

                if (sql.validaPC(pc) != 0) {//valida que la pc exista

                    if (sql.validaRepeticion(tipo, pc) == 0) {//valida que un equipo no tengo 2 veces el mismo periferico

                        Perifericos nuevo = new Perifericos(pc, tipo, serial);

                        if (sql.añadir(nuevo)) {
                            llenadoTabla();
                            vaciarCampos();
                            ve.jfañadir.setVisible(false);
                            JOptionPane.showMessageDialog(ve.jfañadir, "Registro guardado");

                        } else {
                            JOptionPane.showMessageDialog(ve.jfañadir, "Error al guardar reguistro");
                        }

                    } else {
                        ve.txtserialperi.setText("");
                        JOptionPane.showMessageDialog(ve.jfañadir, "Este equipo ya tiene reguistrado un " + periferico);
                    }

                } else {
                    ve.txtserialpc.setText("");
                    JOptionPane.showMessageDialog(ve.jfañadir, "No existe ninguna PC con ese serial");
                }

            } else {
                ve.txtserialperi.setText("");
                JOptionPane.showMessageDialog(ve.jfañadir, "Ese periferico ya esta registrado");
            }

        } else {
            JOptionPane.showMessageDialog(ve.jfañadir, "Debe llenar todos los campos");
        }
    }
    
    private void reaisgnar() {
        String serial = ve.txtreasigserial.getText();
        String serialPc = ve.txtserialpc.getText();

        String periferico = ve.txtreasigperi.getText();

        if (!serialPc.equals("")) {//valida que los campos no esten vaios

            SQLequipos eq = SQLequipos.getInstanceEquipo();
            int pc = eq.getid(serialPc);
            int tipo = sql.getIdLista(periferico);
            
                if (sql.validaPC(pc) != 0) {//valida que la pc exista

                    if (sql.validaRepeticion(tipo, pc) == 0) {//valida que un equipo no tengo 2 veces el mismo periferico

                        Perifericos nuevo = new Perifericos(pc, tipo, serial);

                        if (sql.reasignar(nuevo, sql.getId(serial))) {
                            llenadoTabla();
                            ve.jfañadir.setVisible(false);
                            JOptionPane.showMessageDialog(ve.jfañadir, "Periferico reasignado");

                        } else {
                            JOptionPane.showMessageDialog(ve.jfañadir, "Error al reasignar periferico");
                        }

                    } else {
                        ve.txtserialperi.setText("");
                        JOptionPane.showMessageDialog(ve.jfañadir, "Este equipo ya tiene reguistrado un " + periferico);
                    }

                } else {
                    ve.txtserialpc.setText("");
                    JOptionPane.showMessageDialog(ve.jfañadir, "No existe ninguna PC con ese serial");
                }



        } else {
            JOptionPane.showMessageDialog(ve.jfañadir, "Debe llenar todos los campos");
        }
    }

    private void eliminar() {
        if (Clogin.Admin) {
            if (seleccionado){
                if(sql.Eliminar(SERIAL)){
                    sql.llenadoTabla(ve.jtperifericos);
                    JOptionPane.showMessageDialog(ve, "Registro eliminado");
                    
                } else {
                    JOptionPane.showMessageDialog(ve, "Error al eliminar registro");
                }
            } else {
                JOptionPane.showMessageDialog(ve, "Debe seleccionar un periferico");
            }
        } else {
            JOptionPane.showMessageDialog(ve, Proyecto.SIN_PERMISO);
        }
    }

    //otros
    private void tipoBusqueda() {
        int tipo = ve.cbtipobusqueda.getSelectedIndex();

        switch (tipo) {
            case 0://nada por defecto
                llenadoTabla();
                ve.cbbuscar.setVisible(false);
                ve.cbbuscar.removeAllItems();
                ve.txtbuscar.setVisible(false);
                ve.Separador.setVisible(false);
                ve.txtbuscar.setText("");
                break;

            case 1://buscar por serial de los perifericos
                ve.txtbuscar.setText("");
                ve.txtbuscar.setVisible(true);
                ve.Separador.setVisible(true);
                ve.cbbuscar.setVisible(false);
                break;

            case 2://busca por tipo de periferico
                ve.cbbuscar.removeAllItems();
                sql.cbPerifericos(ve.cbbuscar);
                ve.cbbuscar.setVisible(true);
                ve.txtbuscar.setVisible(false);
                ve.Separador.setVisible(false);
                break;

            case 3:// busca por el deserial de la pc
                ve.txtbuscar.setText("");
                ve.txtbuscar.setVisible(true);
                ve.Separador.setVisible(true);
                ve.cbbuscar.setVisible(false);
                break;
        }
    }

    protected void buscar() {
        int  selector = ve.cbtipobusqueda.getSelectedIndex();
        String buscar = null;
        Boolean buscando = false;
        switch(selector){
            case 0://nada, por defecto
                buscando = false;
                break;
                
            case 1://serial
                buscar = ve.txtbuscar.getText();
                buscando = true;
                break;
                
            case 2://periferico
                int bperifericos = ve.cbbuscar.getSelectedIndex();
                buscar = ve.cbbuscar.getItemAt(bperifericos);
                buscando = true;
                break;
                
            case 3://pc
                buscar = ve.txtbuscar.getText();
                buscando = true;
                break;
        }
        if (buscando){
            if(sql.buscar(selector, buscar, ve.jtperifericos)){
                
            } else {
                JOptionPane.showMessageDialog(ve, "Error al buscar");
            }
        }
    }

    private void nuevoPeriferico() {
        String nuevo = ve.txtnuevoperi.getText();

        if (!nuevo.equals("")) {

            if (sql.nuevoLista(nuevo)) {
                ve.jftipo.setVisible(false);
                JOptionPane.showMessageDialog(ve.jftipo, "Registro guardado");

            } else {
                JOptionPane.showMessageDialog(ve.jftipo, "Error al guardar registro");
            }
        }
    }

    private void vaciarCampos() {
        ve.txtserialpc.setText("");
        ve.txtserialperi.setText("");
        ve.cbtipoperi.removeAllItems();
    }

}
