
package vista;

import controlador.utilidades.Colores;
import controlador.utilidades.Imagenes;
import controlador.utilidades.Menu;
import controlador.ventanas.CInicial;
import proyecto.Proyecto;

public class Vdepartamentos extends javax.swing.JFrame {

    boolean derecha = false;
    Menu m = new Menu(Proyecto.img);
    
    public Vdepartamentos() {
        
        initComponents();
        this.setLocationRelativeTo(null);   
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfagregar = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        txtndepa = new javax.swing.JTextField();
        txtnjefe = new javax.swing.JTextField();
        txtncontacto = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnactualizar = new javax.swing.JButton();
        jfmodificar = new javax.swing.JFrame();
        jfsolicitud = new javax.swing.JFrame();
        jfAsignar = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        btnAsignar = new javax.swing.JButton();
        cbDepas = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        txtSerialEq = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnReasignar = new javax.swing.JButton();
        txtdepa = new javax.swing.JLabel();
        jfdetalles = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtdetmarca = new javax.swing.JLabel();
        txtdetmodelo = new javax.swing.JLabel();
        txtdetserial = new javax.swing.JLabel();
        txtdetestado = new javax.swing.JLabel();
        txtdetususario = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtperifericos1 = new javax.swing.JTable();
        txtdetdepar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnAbrirAgregar = new javax.swing.JButton();
        btnAbrirModificar = new javax.swing.JButton();
        btndetalles = new javax.swing.JButton();
        btnAbrirAsignar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtdepartamentos = new javax.swing.JTable();
        us = new javax.swing.JLabel();
        btnAbrirSolicitud = new javax.swing.JButton();
        cbtipobusqueda = new javax.swing.JComboBox<>();
        cbbuscar = new javax.swing.JComboBox<>();
        txtbuscar = new javax.swing.JTextField();
        Separado = new javax.swing.JSeparator();
        cbtabla = new javax.swing.JComboBox<>();
        txtequipo = new javax.swing.JLabel();
        btnequipos = new javax.swing.JLabel();
        txtpersonas = new javax.swing.JLabel();
        btnperifericos = new javax.swing.JLabel();
        txtusuarios = new javax.swing.JLabel();
        btnusuarios = new javax.swing.JLabel();
        txtAtras = new javax.swing.JLabel();
        btnsalir2 = new javax.swing.JLabel();
        fondoIMG = new javax.swing.JLabel();

        jPanel2.setBackground(Colores.GRIS_CLARO);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 150, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 150, 20));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 150, 20));

        txtndepa.setBackground(Colores.GRIS_CLARO);
        txtndepa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtndepa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtndepa.setBorder(null);
        jPanel2.add(txtndepa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 150, -1));

        txtnjefe.setBackground(Colores.GRIS_CLARO);
        txtnjefe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnjefe.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnjefe.setBorder(null);
        jPanel2.add(txtnjefe, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 150, -1));

        txtncontacto.setBackground(Colores.GRIS_CLARO);
        txtncontacto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtncontacto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtncontacto.setBorder(null);
        jPanel2.add(txtncontacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 150, -1));

        btnagregar.setBackground(Colores.AZUL);
        btnagregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnagregar.setForeground(new java.awt.Color(255, 255, 255));
        btnagregar.setText("Agregar");
        btnagregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Departamento:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 150, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Jefe:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 150, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Contacto:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 110, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Agregar nuevo departamento");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 360, -1));

        btnactualizar.setBackground(Colores.AZUL);
        btnactualizar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnactualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnactualizar.setText("Actualizar");
        jPanel2.add(btnactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 220, 120, -1));

        jfagregar.getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(Colores.GRIS_CLARO);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAsignar.setBackground(Colores.ROJO);
        btnAsignar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAsignar.setForeground(new java.awt.Color(255, 255, 255));
        btnAsignar.setText("Asignar");
        jPanel3.add(btnAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        cbDepas.setBackground(Colores.GRIS_CLARO);
        cbDepas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbDepas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(cbDepas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 160, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 160, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 160, 10));

        txtSerialEq.setBackground(Colores.GRIS_CLARO);
        txtSerialEq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSerialEq.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSerialEq.setBorder(null);
        jPanel3.add(txtSerialEq, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 160, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Departemento");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 160, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Serial del Equipo");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 160, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Asignar Equipo");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 10, 400, -1));

        btnReasignar.setBackground(Colores.ROJO);
        btnReasignar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnReasignar.setForeground(new java.awt.Color(255, 255, 255));
        btnReasignar.setText("Reasignar");
        jPanel3.add(btnReasignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        txtdepa.setBackground(new java.awt.Color(225, 232, 236));
        txtdepa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtdepa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdepa.setText("jLabel5");
        jPanel3.add(txtdepa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 160, -1));

        jfAsignar.getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel4.setBackground(Colores.GRIS_CLARO);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Detalles");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 350, 40));

        txtdetmarca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdetmarca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdetmarca.setText("Marca");
        jPanel4.add(txtdetmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 210, -1));

        txtdetmodelo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdetmodelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdetmodelo.setText("modelo");
        jPanel4.add(txtdetmodelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 210, -1));

        txtdetserial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdetserial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdetserial.setText("serial");
        jPanel4.add(txtdetserial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 210, -1));

        txtdetestado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdetestado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdetestado.setText("estado");
        jPanel4.add(txtdetestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 210, -1));

        txtdetususario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdetususario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdetususario.setText("usuario");
        jPanel4.add(txtdetususario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 210, -1));

        jScrollPane2.setBackground(new java.awt.Color(225, 232, 236));

        jtperifericos1.setBackground(new java.awt.Color(225, 232, 236));
        jtperifericos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Periferico", "Serial"
            }
        ));
        jtperifericos1.setShowHorizontalLines(false);
        jScrollPane2.setViewportView(jtperifericos1);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 140, 200));

        txtdetdepar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdetdepar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdetdepar.setText("departamento");
        jPanel4.add(txtdetdepar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 350, -1));

        jfdetalles.getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(225, 232, 236));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAbrirAgregar.setBackground(Colores.AZUL);
        btnAbrirAgregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAbrirAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrirAgregar.setText("Crea ");
        btnAbrirAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbrirAgregar.setFocusable(false);
        jPanel1.add(btnAbrirAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 473, 170, 30));

        btnAbrirModificar.setBackground(Colores.ROJO);
        btnAbrirModificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAbrirModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrirModificar.setText("Cambiar Datos");
        btnAbrirModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbrirModificar.setFocusable(false);
        jPanel1.add(btnAbrirModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 334, 300, 30));

        btndetalles.setBackground(Colores.ROJO);
        btndetalles.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btndetalles.setForeground(new java.awt.Color(255, 255, 255));
        btndetalles.setText("Detalles");
        btndetalles.setToolTipText("");
        btndetalles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btndetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 334, 300, 30));

        btnAbrirAsignar.setBackground(Colores.ROJO);
        btnAbrirAsignar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAbrirAsignar.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrirAsignar.setText("Reasignar");
        btnAbrirAsignar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbrirAsignar.setFocusable(false);
        btnAbrirAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirAsignarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAbrirAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 244, 300, 30));

        jScrollPane1.setBackground(new java.awt.Color(225, 232, 236));

        jtdepartamentos.setBackground(new java.awt.Color(225, 232, 236));
        jtdepartamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Departamento", "Jefe", "Contacto"
            }
        ));
        jtdepartamentos.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(jtdepartamentos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 410, 480));

        us.setForeground(new java.awt.Color(255, 255, 255));
        us.setText("jLabel14");
        jPanel1.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 120, 20));

        btnAbrirSolicitud.setBackground(Colores.ROJO);
        btnAbrirSolicitud.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAbrirSolicitud.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrirSolicitud.setText("Crear Solicitud");
        btnAbrirSolicitud.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnAbrirSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 170, 30));

        cbtipobusqueda.setBackground(Colores.ROJO);
        cbtipobusqueda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbtipobusqueda.setForeground(new java.awt.Color(255, 255, 255));
        cbtipobusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar", "Departamento", "Serial" }));
        cbtipobusqueda.setBorder(null);
        cbtipobusqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbtipobusqueda.setFocusable(false);
        jPanel1.add(cbtipobusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 182, 140, 30));

        cbbuscar.setBackground(Colores.ROJO);
        cbbuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbbuscar.setForeground(new java.awt.Color(255, 255, 255));
        cbbuscar.setBorder(null);
        cbbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbbuscar.setFocusable(false);
        jPanel1.add(cbbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 182, 170, 30));

        txtbuscar.setBackground(Colores.ROJO);
        txtbuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtbuscar.setForeground(new java.awt.Color(255, 255, 255));
        txtbuscar.setBorder(null);
        jPanel1.add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 182, 160, 30));

        Separado.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Separado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 180, 20));

        cbtabla.setBackground(Colores.AZUL);
        cbtabla.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbtabla.setForeground(new java.awt.Color(255, 255, 255));
        cbtabla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Departamentos", "Asignaciones" }));
        cbtabla.setBorder(null);
        cbtabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbtabla.setFocusable(false);
        jPanel1.add(cbtabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 300, 30));

        txtequipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtequipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 50, -1));

        btnequipos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnequipos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnequipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnequiposMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnequiposMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnequiposMouseExited(evt);
            }
        });
        jPanel1.add(btnequipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 135, 175, 50));

        txtpersonas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(txtpersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 70, -1));

        btnperifericos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnperifericos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnperifericos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnperifericosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnperifericosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnperifericosMouseExited(evt);
            }
        });
        jPanel1.add(btnperifericos, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 200, 175, 50));

        txtusuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtusuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 70, -1));

        btnusuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnusuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnusuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnusuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnusuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnusuariosMouseExited(evt);
            }
        });
        jPanel1.add(btnusuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 340, 175, 50));

        txtAtras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 90, -1));

        btnsalir2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnsalir2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsalir2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsalir2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsalir2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsalir2MouseExited(evt);
            }
        });
        jPanel1.add(btnsalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 65, 175, 50));

        fondoIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/DEPAS.png"))); // NOI18N
        jPanel1.add(fondoIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 563));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
//equipos
    private void btnequiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnequiposMouseClicked
        m.equipos_click(this);
    }//GEN-LAST:event_btnequiposMouseClicked

    private void btnequiposMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnequiposMouseEntered
        Proyecto.img.bordes(btnequipos);
    }//GEN-LAST:event_btnequiposMouseEntered

    private void btnequiposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnequiposMouseExited
        Proyecto.img.no_bordes(btnequipos);
    }//GEN-LAST:event_btnequiposMouseExited
//personas
    private void btnperifericosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnperifericosMouseClicked
        m.perifericos_click(this);
    }//GEN-LAST:event_btnperifericosMouseClicked

    private void btnperifericosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnperifericosMouseEntered
        Proyecto.img.bordes(btnperifericos);
    }//GEN-LAST:event_btnperifericosMouseEntered

    private void btnperifericosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnperifericosMouseExited
        Proyecto.img.no_bordes(btnperifericos);
    }//GEN-LAST:event_btnperifericosMouseExited
//usuarios
    private void btnusuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnusuariosMouseClicked
        m.usuarios_click(this);
    }//GEN-LAST:event_btnusuariosMouseClicked

    private void btnusuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnusuariosMouseEntered
        Proyecto.img.bordes(btnusuarios);
    }//GEN-LAST:event_btnusuariosMouseEntered

    private void btnusuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnusuariosMouseExited
        Proyecto.img.no_bordes(btnusuarios);
    }//GEN-LAST:event_btnusuariosMouseExited

    private void btnsalir2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalir2MouseClicked
        Inicial atras = Inicial.getInstance();
        CInicial ci = new CInicial(atras);
        this.setVisible(false);
    }//GEN-LAST:event_btnsalir2MouseClicked

    private void btnAbrirAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirAsignarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAbrirAsignarActionPerformed

    private void btnsalir2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalir2MouseEntered
        Proyecto.img.bordes(btnsalir2);
    }//GEN-LAST:event_btnsalir2MouseEntered

    private void btnsalir2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalir2MouseExited
        Proyecto.img.no_bordes(btnsalir2);
    }//GEN-LAST:event_btnsalir2MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vdepartamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vdepartamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vdepartamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vdepartamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vdepartamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JSeparator Separado;
    public javax.swing.JButton btnAbrirAgregar;
    public javax.swing.JButton btnAbrirAsignar;
    public javax.swing.JButton btnAbrirModificar;
    public javax.swing.JButton btnAbrirSolicitud;
    public javax.swing.JButton btnAsignar;
    public javax.swing.JButton btnReasignar;
    public javax.swing.JButton btnactualizar;
    public javax.swing.JButton btnagregar;
    public javax.swing.JButton btndetalles;
    private javax.swing.JLabel btnequipos;
    private javax.swing.JLabel btnperifericos;
    private javax.swing.JLabel btnsalir2;
    private javax.swing.JLabel btnusuarios;
    public javax.swing.JComboBox<String> cbDepas;
    public javax.swing.JComboBox<String> cbbuscar;
    public javax.swing.JComboBox<String> cbtabla;
    public javax.swing.JComboBox<String> cbtipobusqueda;
    public javax.swing.JLabel fondoIMG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    public javax.swing.JFrame jfAsignar;
    public javax.swing.JFrame jfagregar;
    public javax.swing.JFrame jfdetalles;
    public javax.swing.JFrame jfmodificar;
    public javax.swing.JFrame jfsolicitud;
    public javax.swing.JTable jtdepartamentos;
    public javax.swing.JTable jtperifericos1;
    private javax.swing.JLabel txtAtras;
    public javax.swing.JTextField txtSerialEq;
    public javax.swing.JTextField txtbuscar;
    public javax.swing.JLabel txtdepa;
    public javax.swing.JLabel txtdetdepar;
    public javax.swing.JLabel txtdetestado;
    public javax.swing.JLabel txtdetmarca;
    public javax.swing.JLabel txtdetmodelo;
    public javax.swing.JLabel txtdetserial;
    public javax.swing.JLabel txtdetususario;
    private javax.swing.JLabel txtequipo;
    public javax.swing.JTextField txtncontacto;
    public javax.swing.JTextField txtndepa;
    public javax.swing.JTextField txtnjefe;
    private javax.swing.JLabel txtpersonas;
    private javax.swing.JLabel txtusuarios;
    public javax.swing.JLabel us;
    // End of variables declaration//GEN-END:variables
}
