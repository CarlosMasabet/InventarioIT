package vista;

import controlador.utilidades.Colores;
import controlador.utilidades.Menu;
import controlador.ventanas.CInicial;
import proyecto.Proyecto;

public class Vusuarios extends javax.swing.JFrame {

    Menu m = new Menu(Proyecto.img);

    public Vusuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfañadir_us = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        txtnom_us = new javax.swing.JTextField();
        txtpass1 = new javax.swing.JPasswordField();
        txtpass2 = new javax.swing.JPasswordField();
        btnagregar_us = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Separator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        txtcod = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbtipoUs = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        Separator2 = new javax.swing.JSeparator();
        btnmodDatos = new javax.swing.JButton();
        jfmodificar = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        txtCpass = new javax.swing.JPasswordField();
        txtCpass2 = new javax.swing.JPasswordField();
        btnguardar = new javax.swing.JButton();
        txtCusuario = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        us = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtusuarios = new javax.swing.JTable();
        btnabrirAñadir = new javax.swing.JButton();
        btnabrirMod = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnabrirModDat = new javax.swing.JButton();
        txtequipo = new javax.swing.JLabel();
        btnequipos = new javax.swing.JLabel();
        txtpersonas = new javax.swing.JLabel();
        btnpersonas = new javax.swing.JLabel();
        txtgraficas = new javax.swing.JLabel();
        btngraficas = new javax.swing.JLabel();
        txtAtras = new javax.swing.JLabel();
        btnsalir = new javax.swing.JLabel();
        fonoIMG = new javax.swing.JLabel();

        jPanel2.setBackground(Colores.GRIS_CLARO);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtnom_us.setBackground(Colores.GRIS_CLARO);
        txtnom_us.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnom_us.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnom_us.setBorder(null);
        txtnom_us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnom_usActionPerformed(evt);
            }
        });
        jPanel2.add(txtnom_us, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 190, 20));

        txtpass1.setBackground(Colores.GRIS_CLARO);
        txtpass1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtpass1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpass1.setBorder(null);
        txtpass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpass1ActionPerformed(evt);
            }
        });
        jPanel2.add(txtpass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 190, 20));

        txtpass2.setBackground(Colores.GRIS_CLARO);
        txtpass2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtpass2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpass2.setBorder(null);
        jPanel2.add(txtpass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 190, 20));

        btnagregar_us.setBackground(Colores.ROJO);
        btnagregar_us.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnagregar_us.setForeground(new java.awt.Color(255, 255, 255));
        btnagregar_us.setText("Guardar usuario");
        btnagregar_us.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnagregar_us, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre de usuario:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 210, -1));

        txt1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt1.setText("Contraseña:");
        jPanel2.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 210, 20));

        txt2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt2.setText("Confirmar Contraseña:");
        jPanel2.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 210, 20));

        titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Agregar Usuario");
        jPanel2.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 480, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 210, 10));

        Separator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(Separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 210, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 210, 10));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 210, 10));

        txtcod.setBackground(Colores.GRIS_CLARO);
        txtcod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcod.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcod.setBorder(null);
        txtcod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodActionPerformed(evt);
            }
        });
        jPanel2.add(txtcod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 190, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Codigo del usuario");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 210, -1));

        cbtipoUs.setBackground(Colores.GRIS_CLARO);
        cbtipoUs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbtipoUs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Regular", "Sin permisos" }));
        cbtipoUs.setBorder(null);
        cbtipoUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtipoUsActionPerformed(evt);
            }
        });
        jPanel2.add(cbtipoUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 150, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Tipo de usuario:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        Separator2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(Separator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 210, 10));

        btnmodDatos.setBackground(Colores.ROJO);
        btnmodDatos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnmodDatos.setForeground(new java.awt.Color(255, 255, 255));
        btnmodDatos.setText("Guardar cambios");
        btnmodDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnmodDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, 30));

        jfañadir_us.getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(Colores.GRIS_CLARO);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCpass.setBackground(Colores.GRIS_CLARO);
        txtCpass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCpass.setBorder(null);
        txtCpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpassActionPerformed(evt);
            }
        });
        jPanel3.add(txtCpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 190, 20));

        txtCpass2.setBackground(Colores.GRIS_CLARO);
        txtCpass2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCpass2.setBorder(null);
        jPanel3.add(txtCpass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 190, 20));

        btnguardar.setBackground(Colores.AZUL);
        btnguardar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnguardar.setForeground(new java.awt.Color(255, 255, 255));
        btnguardar.setText("Guardar");
        jPanel3.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, 30));

        txtCusuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCusuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCusuario.setText("Nombre de usuario:");
        jPanel3.add(txtCusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 350, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Contraseña:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 210, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Confirmar Contraseña:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 210, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cambiar Contraseña");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 20, 360, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 210, 10));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 210, 10));

        jfmodificar.getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(225, 232, 236));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        us.setForeground(new java.awt.Color(255, 255, 255));
        us.setText("jLabel14");
        jPanel1.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 120, 20));

        jScrollPane1.setBackground(new java.awt.Color(225, 232, 236));

        jtusuarios.setBackground(new java.awt.Color(225, 232, 236));
        jtusuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Ultima secion ", "Tipo de usuario"
            }
        ));
        jtusuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtusuarios.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(jtusuarios);
        jtusuarios.getAccessibleContext().setAccessibleName("");
        jtusuarios.getAccessibleContext().setAccessibleDescription("");

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 510, 490));

        btnabrirAñadir.setBackground(Colores.AZUL);
        btnabrirAñadir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnabrirAñadir.setForeground(new java.awt.Color(255, 255, 255));
        btnabrirAñadir.setText("Añadir Usuario");
        btnabrirAñadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnabrirAñadir.setFocusable(false);
        btnabrirAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnabrirAñadirActionPerformed(evt);
            }
        });
        jPanel1.add(btnabrirAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 145, 210, 30));

        btnabrirMod.setBackground(Colores.AZUL);
        btnabrirMod.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnabrirMod.setForeground(new java.awt.Color(255, 255, 255));
        btnabrirMod.setText("Cambiar Contraseña");
        btnabrirMod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnabrirMod.setFocusable(false);
        jPanel1.add(btnabrirMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 344, 210, 30));

        btneliminar.setBackground(Colores.AZUL);
        btneliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btneliminar.setForeground(new java.awt.Color(255, 255, 255));
        btneliminar.setText("Eliminar Usuario");
        btneliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btneliminar.setFocusable(false);
        jPanel1.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 243, 210, 30));

        btnabrirModDat.setBackground(Colores.AZUL);
        btnabrirModDat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnabrirModDat.setForeground(new java.awt.Color(255, 255, 255));
        btnabrirModDat.setText("Modificar Datos");
        btnabrirModDat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnabrirModDat.setFocusable(false);
        jPanel1.add(btnabrirModDat, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 449, 210, 30));

        txtequipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtequipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 50, -1));

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
        jPanel1.add(txtpersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 60, -1));

        btnpersonas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnpersonas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnpersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnpersonasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnpersonasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnpersonasMouseExited(evt);
            }
        });
        jPanel1.add(btnpersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 200, 175, 50));

        txtgraficas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtgraficas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 70, -1));

        btngraficas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btngraficas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btngraficas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btngraficasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btngraficasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btngraficasMouseExited(evt);
            }
        });
        jPanel1.add(btngraficas, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 270, 175, 50));

        txtAtras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txtAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 90, -1));

        btnsalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsalirMouseExited(evt);
            }
        });
        jPanel1.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 65, 175, 50));

        fonoIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/USUARIOS.png"))); // NOI18N
        jPanel1.add(fonoIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 563));

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
    private void btnpersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpersonasMouseClicked
        m.perifericos_click(this);
    }//GEN-LAST:event_btnpersonasMouseClicked

    private void btnpersonasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpersonasMouseEntered
        Proyecto.img.bordes(btnpersonas);
    }//GEN-LAST:event_btnpersonasMouseEntered

    private void btnpersonasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpersonasMouseExited
        Proyecto.img.no_bordes(btnpersonas);
    }//GEN-LAST:event_btnpersonasMouseExited
//graficas
    private void btngraficasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngraficasMouseEntered
        Proyecto.img.bordes(btngraficas);
    }//GEN-LAST:event_btngraficasMouseEntered

    private void btngraficasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngraficasMouseExited
        Proyecto.img.no_bordes(btngraficas);
    }//GEN-LAST:event_btngraficasMouseExited

    private void btnsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalirMouseClicked
        Inicial atras = Inicial.getInstance();
        CInicial ci = new CInicial(atras);
        this.setVisible(false);
    }//GEN-LAST:event_btnsalirMouseClicked
//grafica click
    private void btngraficasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngraficasMouseClicked
        m.departamento_click(this);
    }//GEN-LAST:event_btngraficasMouseClicked

    private void txtpass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpass1ActionPerformed

    private void txtnom_usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnom_usActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnom_usActionPerformed

    private void btnabrirAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnabrirAñadirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnabrirAñadirActionPerformed

    private void txtCpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpassActionPerformed

    private void txtcodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodActionPerformed

    private void cbtipoUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtipoUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbtipoUsActionPerformed

    private void btnsalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalirMouseEntered
        Proyecto.img.bordes(btnsalir);
    }//GEN-LAST:event_btnsalirMouseEntered

    private void btnsalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalirMouseExited
        Proyecto.img.no_bordes(btnsalir);
    }//GEN-LAST:event_btnsalirMouseExited

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
            java.util.logging.Logger.getLogger(Vusuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vusuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vusuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vusuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vusuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JSeparator Separator1;
    public javax.swing.JSeparator Separator2;
    public javax.swing.JButton btnabrirAñadir;
    public javax.swing.JButton btnabrirMod;
    public javax.swing.JButton btnabrirModDat;
    public javax.swing.JButton btnagregar_us;
    public javax.swing.JButton btneliminar;
    private javax.swing.JLabel btnequipos;
    private javax.swing.JLabel btngraficas;
    public javax.swing.JButton btnguardar;
    public javax.swing.JButton btnmodDatos;
    private javax.swing.JLabel btnpersonas;
    private javax.swing.JLabel btnsalir;
    public javax.swing.JComboBox<String> cbtipoUs;
    private javax.swing.JLabel fonoIMG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    public javax.swing.JFrame jfañadir_us;
    public javax.swing.JFrame jfmodificar;
    public javax.swing.JTable jtusuarios;
    public javax.swing.JLabel titulo;
    public javax.swing.JLabel txt1;
    public javax.swing.JLabel txt2;
    private javax.swing.JLabel txtAtras;
    public javax.swing.JPasswordField txtCpass;
    public javax.swing.JPasswordField txtCpass2;
    public javax.swing.JLabel txtCusuario;
    public javax.swing.JTextField txtcod;
    private javax.swing.JLabel txtequipo;
    private javax.swing.JLabel txtgraficas;
    public javax.swing.JTextField txtnom_us;
    public javax.swing.JPasswordField txtpass1;
    public javax.swing.JPasswordField txtpass2;
    private javax.swing.JLabel txtpersonas;
    public javax.swing.JLabel us;
    // End of variables declaration//GEN-END:variables
}
