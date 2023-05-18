package vista;

import controlador.utilidades.Colores;
import controlador.utilidades.Menu;
import controlador.ventanas.CInicial;
import proyecto.Proyecto;

/**
 *
 * @author Carlos Masabet
 */
public class Vequipos extends javax.swing.JFrame {

    Menu m = new Menu(Proyecto.img);

    public Vequipos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfañadir = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        txtserial = new javax.swing.JTextField();
        cbestado = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnañadir2 = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        cbmarca = new javax.swing.JComboBox<>();
        cbmodelo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbdepartamentos = new javax.swing.JComboBox<>();
        jfdetalles = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtdetmarca = new javax.swing.JLabel();
        txtdetmodelo = new javax.swing.JLabel();
        txtdetserial = new javax.swing.JLabel();
        txtdetestado = new javax.swing.JLabel();
        txtdetususario = new javax.swing.JLabel();
        btnmodificar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtperifericos = new javax.swing.JTable();
        txtdetdepar = new javax.swing.JLabel();
        btnperiferico = new javax.swing.JButton();
        jfmarca = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        txtnewMarca = new javax.swing.JTextField();
        btnnewMarca = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jfmodelo = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        txtnewModelo = new javax.swing.JTextField();
        btnnewModelo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cbnewModelo = new javax.swing.JComboBox<>();
        jfperiferico = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        txtserialperi = new javax.swing.JTextField();
        cbtipoperi = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnnewperi = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        txtserialpc = new javax.swing.JLabel();
        fondo = new javax.swing.JPanel();
        us = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtequipos = new javax.swing.JTable();
        txtbusqueda = new javax.swing.JTextField();
        cbtipobusqueda = new javax.swing.JComboBox<>();
        btnañadir = new javax.swing.JButton();
        btndetalles = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        cbbusqueda = new javax.swing.JComboBox<>();
        btnmarca = new javax.swing.JButton();
        btnmodelo = new javax.swing.JButton();
        cbbusModelos = new javax.swing.JComboBox<>();
        btnperi = new javax.swing.JLabel();
        btnus = new javax.swing.JLabel();
        btndepas = new javax.swing.JLabel();
        lineaBuscar = new javax.swing.JSeparator();
        btnsalir2 = new javax.swing.JLabel();
        imgFondo = new javax.swing.JLabel();

        jfañadir.setMinimumSize(new java.awt.Dimension(378, 371));

        jPanel1.setBackground(Colores.GRIS_CLARO);
        jPanel1.setMinimumSize(new java.awt.Dimension(380, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(380, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtserial.setBackground(Colores.GRIS_CLARO);
        txtserial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtserial.setBorder(null);
        jPanel1.add(txtserial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 160, 20));

        cbestado.setBackground(Colores.GRIS_CLARO);
        cbestado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Activo", "Dañado" }));
        cbestado.setBorder(null);
        cbestado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cbestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 170, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Serial:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 170, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Estado:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 170, -1));

        btnañadir2.setBackground(Colores.AZUL);
        btnañadir2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnañadir2.setForeground(new java.awt.Color(255, 255, 255));
        btnañadir2.setText("Añadir");
        btnañadir2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnañadir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 140, -1));

        btnguardar.setBackground(Colores.AZUL);
        btnguardar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnguardar.setForeground(new java.awt.Color(255, 255, 255));
        btnguardar.setText("Guardar");
        btnguardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 140, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Marca");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 160, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Modelo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 160, -1));

        txtusuario.setBackground(Colores.GRIS_CLARO);
        txtusuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtusuario.setToolTipText("");
        txtusuario.setBorder(null);
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 160, 20));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 170, 10));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 170, 10));

        cbmarca.setBackground(Colores.GRIS_CLARO);
        cbmarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbmarca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cbmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 170, -1));

        cbmodelo.setBackground(Colores.GRIS_CLARO);
        cbmodelo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbmodelo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbmodelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmodeloActionPerformed(evt);
            }
        });
        jPanel1.add(cbmodelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 170, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Usuarios:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 160, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Departamento: ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 180, 160, -1));

        cbdepartamentos.setBackground(Colores.GRIS_CLARO);
        cbdepartamentos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbdepartamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cbdepartamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 170, -1));

        jfañadir.getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(Colores.GRIS_CLARO);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Detalles");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 350, 40));

        txtdetmarca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdetmarca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdetmarca.setText("Marca");
        jPanel2.add(txtdetmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 210, -1));

        txtdetmodelo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdetmodelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdetmodelo.setText("modelo");
        jPanel2.add(txtdetmodelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 210, -1));

        txtdetserial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdetserial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdetserial.setText("serial");
        jPanel2.add(txtdetserial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 210, -1));

        txtdetestado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdetestado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdetestado.setText("estado");
        jPanel2.add(txtdetestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 210, -1));

        txtdetususario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdetususario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdetususario.setText("usuario");
        jPanel2.add(txtdetususario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 210, -1));

        btnmodificar.setBackground(Colores.ROJO);
        btnmodificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnmodificar.setForeground(new java.awt.Color(255, 255, 255));
        btnmodificar.setText("Modificar");
        btnmodificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jtperifericos.setBackground(new java.awt.Color(225, 232, 236));
        jtperifericos.setModel(new javax.swing.table.DefaultTableModel(
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
        jtperifericos.setShowHorizontalLines(false);
        jScrollPane2.setViewportView(jtperifericos);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 140, 200));

        txtdetdepar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdetdepar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdetdepar.setText("departamento");
        jPanel2.add(txtdetdepar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 350, -1));

        btnperiferico.setBackground(Colores.ROJO);
        btnperiferico.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnperiferico.setForeground(new java.awt.Color(255, 255, 255));
        btnperiferico.setText("Agregar periferico");
        btnperiferico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnperiferico, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        jfdetalles.getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(Colores.GRIS_CLARO);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 130, 20));

        txtnewMarca.setBackground(Colores.GRIS_CLARO);
        txtnewMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnewMarca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnewMarca.setBorder(null);
        jPanel3.add(txtnewMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 130, -1));

        btnnewMarca.setBackground(Colores.ROJO);
        btnnewMarca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnnewMarca.setForeground(new java.awt.Color(255, 255, 255));
        btnnewMarca.setText("Agregar");
        btnnewMarca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(btnnewMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Agregar Marca de Pc");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 200, -1));

        jfmarca.getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel4.setBackground(Colores.GRIS_CLARO);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 110, 20));

        txtnewModelo.setBackground(Colores.GRIS_CLARO);
        txtnewModelo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnewModelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnewModelo.setBorder(null);
        jPanel4.add(txtnewModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 110, -1));

        btnnewModelo.setBackground(Colores.ROJO);
        btnnewModelo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnnewModelo.setForeground(new java.awt.Color(255, 255, 255));
        btnnewModelo.setText("Agregar");
        btnnewModelo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(btnnewModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 110, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Agregar Modelo");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 30, 240, -1));

        cbnewModelo.setBackground(Colores.GRIS_CLARO);
        cbnewModelo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbnewModelo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbnewModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnewModeloActionPerformed(evt);
            }
        });
        jPanel4.add(cbnewModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 110, -1));

        jfmodelo.getContentPane().add(jPanel4, java.awt.BorderLayout.LINE_START);

        jPanel5.setBackground(Colores.GRIS_CLARO);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtserialperi.setBackground(Colores.GRIS_CLARO);
        txtserialperi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtserialperi.setBorder(null);
        jPanel5.add(txtserialperi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 140, -1));

        cbtipoperi.setBackground(Colores.GRIS_CLARO);
        cbtipoperi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbtipoperi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbtipoperi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtipoperiActionPerformed(evt);
            }
        });
        jPanel5.add(cbtipoperi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 150, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Serial de la PC:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 150, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Tipo de periferico:");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 180, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Serial del periferico:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 180, -1));

        btnnewperi.setBackground(Colores.AZUL);
        btnnewperi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnnewperi.setForeground(new java.awt.Color(255, 255, 255));
        btnnewperi.setText("Guardar");
        btnnewperi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(btnnewperi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 150, 20));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 150, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Agregra Periferico");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 10, 350, -1));

        txtserialpc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtserialpc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtserialpc.setText("Serial de la pc");
        jPanel5.add(txtserialpc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 150, -1));

        jfperiferico.getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(225, 232, 236));
        fondo.setToolTipText("");
        fondo.setMinimumSize(new java.awt.Dimension(800, 500));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        us.setForeground(new java.awt.Color(255, 255, 255));
        us.setText("jLabel14");
        fondo.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 120, 20));

        jScrollPane1.setBackground(new java.awt.Color(225, 232, 236));

        jtequipos.setBackground(new java.awt.Color(225, 232, 236));
        jtequipos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtequipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Marca", "Modelo", "Serial", "Estado"
            }
        ));
        jtequipos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtequipos.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jtequipos.setName(""); // NOI18N
        jtequipos.setRequestFocusEnabled(false);
        jtequipos.setRowHeight(15);
        jtequipos.setSelectionBackground(new java.awt.Color(0, 134, 190));
        jtequipos.setSelectionForeground(new java.awt.Color(255, 51, 51));
        jtequipos.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(jtequipos);

        fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 770, 370));

        txtbusqueda.setBackground(Colores.AZUL);
        txtbusqueda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtbusqueda.setForeground(new java.awt.Color(255, 255, 255));
        txtbusqueda.setBorder(null);
        txtbusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbusquedaActionPerformed(evt);
            }
        });
        fondo.add(txtbusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 150, 30));

        cbtipobusqueda.setBackground(Colores.AZUL);
        cbtipobusqueda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbtipobusqueda.setForeground(new java.awt.Color(255, 255, 255));
        cbtipobusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar", "Marca", "Serial" }));
        cbtipobusqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbtipobusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtipobusquedaActionPerformed(evt);
            }
        });
        fondo.add(cbtipobusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 140, -1));

        btnañadir.setBackground(Colores.ROJO);
        btnañadir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnañadir.setForeground(new java.awt.Color(255, 255, 255));
        btnañadir.setText("Añadir");
        btnañadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondo.add(btnañadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 123, 175, 30));

        btndetalles.setBackground(Colores.ROJO);
        btndetalles.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btndetalles.setForeground(new java.awt.Color(255, 255, 255));
        btndetalles.setText("Detalles");
        btndetalles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondo.add(btndetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 123, 175, 30));

        btneliminar.setBackground(Colores.ROJO);
        btneliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btneliminar.setForeground(new java.awt.Color(255, 255, 255));
        btneliminar.setText("Eliminar");
        btneliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        fondo.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 123, 175, 30));

        cbbusqueda.setBackground(Colores.AZUL);
        cbbusqueda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbbusqueda.setForeground(new java.awt.Color(255, 255, 255));
        cbbusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbusqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondo.add(cbbusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 160, -1));

        btnmarca.setBackground(Colores.AZUL);
        btnmarca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnmarca.setForeground(new java.awt.Color(255, 255, 255));
        btnmarca.setText("Marca");
        btnmarca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondo.add(btnmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(778, 123, 95, 30));

        btnmodelo.setBackground(Colores.AZUL);
        btnmodelo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnmodelo.setForeground(new java.awt.Color(255, 255, 255));
        btnmodelo.setText("Modelo");
        btnmodelo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmodelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodeloActionPerformed(evt);
            }
        });
        fondo.add(btnmodelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(869, 123, 95, 30));

        cbbusModelos.setBackground(Colores.AZUL);
        cbbusModelos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbbusModelos.setForeground(new java.awt.Color(255, 255, 255));
        fondo.add(cbbusModelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 160, -1));

        btnperi.setBackground(Colores.AZUL);
        btnperi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnperi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnperi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnperiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnperiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnperiMouseExited(evt);
            }
        });
        fondo.add(btnperi, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 200, 175, 50));

        btnus.setBackground(Colores.AZUL);
        btnus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnusMouseExited(evt);
            }
        });
        fondo.add(btnus, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 340, 175, 50));

        btndepas.setBackground(Colores.AZUL);
        btndepas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btndepas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndepas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndepasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btndepasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btndepasMouseExited(evt);
            }
        });
        fondo.add(btndepas, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 270, 175, 50));

        lineaBuscar.setForeground(new java.awt.Color(255, 255, 255));
        fondo.add(lineaBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 160, 20));

        btnsalir2.setBackground(Colores.AZUL);
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
        fondo.add(btnsalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 65, 175, 50));

        imgFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/EQUIPOS.png"))); // NOI18N
        fondo.add(imgFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 565));

        getContentPane().add(fondo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnperiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnperiMouseClicked
        m.perifericos_click(this);
    }//GEN-LAST:event_btnperiMouseClicked

    private void btnperiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnperiMouseEntered
        Proyecto.img.bordes(btnperi);
    }//GEN-LAST:event_btnperiMouseEntered

    private void btnperiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnperiMouseExited
        Proyecto.img.no_bordes(btnperi);
    }//GEN-LAST:event_btnperiMouseExited

    private void btnusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnusMouseClicked
        m.usuarios_click(this);
    }//GEN-LAST:event_btnusMouseClicked

    private void btnusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnusMouseEntered
        Proyecto.img.bordes(btnus);
    }//GEN-LAST:event_btnusMouseEntered

    private void btnusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnusMouseExited
        Proyecto.img.no_bordes(btnus);
    }//GEN-LAST:event_btnusMouseExited

    private void btndepasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndepasMouseClicked
        m.departamento_click(this);
    }//GEN-LAST:event_btndepasMouseClicked

    private void btndepasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndepasMouseEntered
        Proyecto.img.bordes(btndepas);
    }//GEN-LAST:event_btndepasMouseEntered

    private void btndepasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndepasMouseExited
        Proyecto.img.no_bordes(btndepas);
    }//GEN-LAST:event_btndepasMouseExited

    private void btnsalir2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalir2MouseClicked
        Inicial atras = Inicial.getInstance();
        CInicial ci = new CInicial(atras);
        this.setVisible(false);
    }//GEN-LAST:event_btnsalir2MouseClicked

    private void txtbusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbusquedaActionPerformed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void cbmodeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmodeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbmodeloActionPerformed

    private void cbtipobusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtipobusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbtipobusquedaActionPerformed

    private void cbnewModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnewModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbnewModeloActionPerformed

    private void cbtipoperiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtipoperiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbtipoperiActionPerformed

    private void btnsalir2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalir2MouseEntered
        Proyecto.img.bordes(btnsalir2);
    }//GEN-LAST:event_btnsalir2MouseEntered

    private void btnsalir2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalir2MouseExited
        Proyecto.img.no_bordes(btnsalir2);
    }//GEN-LAST:event_btnsalir2MouseExited

    private void btnmodeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmodeloActionPerformed

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
            java.util.logging.Logger.getLogger(Vequipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vequipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vequipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vequipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vequipos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnañadir;
    public javax.swing.JButton btnañadir2;
    private javax.swing.JLabel btndepas;
    public javax.swing.JButton btndetalles;
    public javax.swing.JButton btneliminar;
    public javax.swing.JButton btnguardar;
    public javax.swing.JButton btnmarca;
    public javax.swing.JButton btnmodelo;
    public javax.swing.JButton btnmodificar;
    public javax.swing.JButton btnnewMarca;
    public javax.swing.JButton btnnewModelo;
    public javax.swing.JButton btnnewperi;
    private javax.swing.JLabel btnperi;
    public javax.swing.JButton btnperiferico;
    private javax.swing.JLabel btnsalir2;
    private javax.swing.JLabel btnus;
    public javax.swing.JComboBox<String> cbbusModelos;
    public javax.swing.JComboBox<String> cbbusqueda;
    public javax.swing.JComboBox<String> cbdepartamentos;
    public javax.swing.JComboBox<String> cbestado;
    public javax.swing.JComboBox<String> cbmarca;
    public javax.swing.JComboBox<String> cbmodelo;
    public javax.swing.JComboBox<String> cbnewModelo;
    public javax.swing.JComboBox<String> cbtipobusqueda;
    public javax.swing.JComboBox<String> cbtipoperi;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel imgFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    public javax.swing.JFrame jfañadir;
    public javax.swing.JFrame jfdetalles;
    public javax.swing.JFrame jfmarca;
    public javax.swing.JFrame jfmodelo;
    public javax.swing.JFrame jfperiferico;
    public javax.swing.JTable jtequipos;
    public javax.swing.JTable jtperifericos;
    public javax.swing.JSeparator lineaBuscar;
    public javax.swing.JTextField txtbusqueda;
    public javax.swing.JLabel txtdetdepar;
    public javax.swing.JLabel txtdetestado;
    public javax.swing.JLabel txtdetmarca;
    public javax.swing.JLabel txtdetmodelo;
    public javax.swing.JLabel txtdetserial;
    public javax.swing.JLabel txtdetususario;
    public javax.swing.JTextField txtnewMarca;
    public javax.swing.JTextField txtnewModelo;
    public javax.swing.JTextField txtserial;
    public javax.swing.JLabel txtserialpc;
    public javax.swing.JTextField txtserialperi;
    public javax.swing.JTextField txtusuario;
    public javax.swing.JLabel us;
    // End of variables declaration//GEN-END:variables
}
