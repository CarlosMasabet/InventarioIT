package vista;

import controlador.consultas.Reportes;
import controlador.consultas.SQLdepartamentos;
import controlador.consultas.SQLequipos;
import controlador.consultas.SQLperifericos;
import controlador.ventanas.usuarios.Cusuarios;
import controlador.consultas.SQLusuarios;
import controlador.utilidades.Colores;
import controlador.consultas.respaldo.Recuperacion;
import controlador.consultas.respaldo.Respaldos;
import controlador.ventanas.login.Clogin;
import controlador.ventanas.perifericos.Cperifericos;
import controlador.ventanas.departamentos.Cdepartamentos;
import controlador.ventanas.equipo.Cequipos;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import modelo.Usuarios;
import proyecto.Proyecto;

public class Inicial extends javax.swing.JFrame {

    private boolean ventana = false;
    private static Inicial instance;

    private Inicial() {
        //setTitle(Clogin.NomUsuario);
        //txtus.setText(Clogin.NomUsuario);
        setIconImage(proyecto.Proyecto.ICONO.getImage());
        initComponents();
        this.setSize(Proyecto.TAMAÑO);
        this.setLocationRelativeTo(null);
        
        equipos.setVisible(false);
        perifericos.setVisible(false);
        usuarios.setVisible(false);
        departamentos.setVisible(false);

    }

    //singleton
    public static Inicial getInstance() {
        if (instance == null) {
            instance = new Inicial();
        }
        return instance;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        equipos = new javax.swing.JLabel();
        btnequio2 = new javax.swing.JLabel();
        perifericos = new javax.swing.JLabel();
        btnperifericos = new javax.swing.JLabel();
        usuarios = new javax.swing.JLabel();
        btnusuarios2 = new javax.swing.JLabel();
        departamentos = new javax.swing.JLabel();
        btndepartamentos = new javax.swing.JLabel();
        btnsalir2 = new javax.swing.JLabel();
        btnRecuperar = new javax.swing.JLabel();
        btnRespaldo = new javax.swing.JLabel();
        cbTipoPDF = new javax.swing.JComboBox<>();
        cbContenidoPDF = new javax.swing.JComboBox<>();
        btnGenerar = new javax.swing.JLabel();
        txtus = new javax.swing.JLabel();
        fon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        fondo.setBackground(new java.awt.Color(225, 232, 236));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        equipos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        equipos.setForeground(Colores.AZUL);
        equipos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        equipos.setText("Equipos");
        fondo.add(equipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 210, -1));

        btnequio2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnequio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inicial/EQUIPOS.png"))); // NOI18N
        btnequio2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnequio2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnequio2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnequio2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnequio2MouseExited(evt);
            }
        });
        fondo.add(btnequio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 210, 210));

        perifericos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        perifericos.setForeground(Colores.AZUL);
        perifericos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        perifericos.setText("Perifericos");
        fondo.add(perifericos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 210, 20));

        btnperifericos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnperifericos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inicial/PERIFERICOS.png"))); // NOI18N
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
        fondo.add(btnperifericos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 210, 210));

        usuarios.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usuarios.setForeground(Colores.AZUL);
        usuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuarios.setText("Usuarios");
        fondo.add(usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 210, -1));

        btnusuarios2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnusuarios2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inicial/USUARIOS.png"))); // NOI18N
        btnusuarios2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnusuarios2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnusuarios2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnusuarios2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnusuarios2MouseExited(evt);
            }
        });
        fondo.add(btnusuarios2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 210, 210));

        departamentos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        departamentos.setForeground(Colores.AZUL);
        departamentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        departamentos.setText("Departamentos");
        fondo.add(departamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, 210, -1));

        btndepartamentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btndepartamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inicial/DPTO.png"))); // NOI18N
        btndepartamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndepartamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndepartamentosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btndepartamentosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btndepartamentosMouseExited(evt);
            }
        });
        fondo.add(btndepartamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 210, 210));

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
        fondo.add(btnsalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 527, 110, 25));

        btnRecuperar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRecuperar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRecuperar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecuperar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRecuperarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRecuperarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRecuperarMousePressed(evt);
            }
        });
        fondo.add(btnRecuperar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 150, 40));

        btnRespaldo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRespaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRespaldo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRespaldo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRespaldoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRespaldoMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnRespaldoMouseReleased(evt);
            }
        });
        fondo.add(btnRespaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 150, 40));

        cbTipoPDF.setBackground(Colores.ROJO);
        cbTipoPDF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbTipoPDF.setForeground(new java.awt.Color(255, 255, 255));
        cbTipoPDF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Equipos", "Perifericos" }));
        cbTipoPDF.setBorder(null);
        cbTipoPDF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbTipoPDF.setFocusable(false);
        cbTipoPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoPDFActionPerformed(evt);
            }
        });
        fondo.add(cbTipoPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 180, 30));

        cbContenidoPDF.setBackground(Colores.ROJO);
        cbContenidoPDF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbContenidoPDF.setForeground(new java.awt.Color(255, 255, 255));
        cbContenidoPDF.setBorder(null);
        cbContenidoPDF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbContenidoPDF.setFocusable(false);
        fondo.add(cbContenidoPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 355, 180, 30));

        btnGenerar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGenerar.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inicial/GENERAR_R.png"))); // NOI18N
        btnGenerar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGenerarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGenerarMouseExited(evt);
            }
        });
        fondo.add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 442, 140, 30));

        txtus.setForeground(new java.awt.Color(255, 255, 255));
        txtus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fondo.add(txtus, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 120, 20));

        fon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/INICIO.png"))); // NOI18N
        fondo.add(fon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 562));

        getContentPane().add(fondo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void bordes(JLabel a) {
        a.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK));
    }

    public void no_bordes(JLabel b) {
        b.setBorder(javax.swing.BorderFactory.createLineBorder(Colores.GRIS_CLARO));
    }
//boton de equipos
    private void btnequio2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnequio2MouseEntered
        bordes(btnequio2);
        equipos.setVisible(true);
        Proyecto.img.cambio_img(btnequio2, "imagenes/inicial/EQUIPOS_P.png");
    }//GEN-LAST:event_btnequio2MouseEntered

    private void btnequio2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnequio2MouseExited
        no_bordes(btnequio2);
        equipos.setVisible(false);
        Proyecto.img.cambio_img(btnequio2, "imagenes/inicial/EQUIPOS.png");
    }//GEN-LAST:event_btnequio2MouseExited

    private void btnequio2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnequio2MouseClicked
        if (!ventana) {
            ventana = true;
            SQLequipos sql = SQLequipos.getInstanceEquipo();
            Vequipos ve = new Vequipos();

            Cequipos ce = new Cequipos(sql, ve);
            this.setVisible(false);
            ventana = false;
        }

    }//GEN-LAST:event_btnequio2MouseClicked
//boton perosnas
    private void btnperifericosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnperifericosMouseEntered
        bordes(btnperifericos);
        perifericos.setVisible(true);
        Proyecto.img.cambio_img(btnperifericos, "imagenes/inicial/PERIFERICOS_P.png");
    }//GEN-LAST:event_btnperifericosMouseEntered

    private void btnperifericosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnperifericosMouseExited
        no_bordes(btnperifericos);
        perifericos.setVisible(false);
        Proyecto.img.cambio_img(btnperifericos, "imagenes/inicial/PERIFERICOS.png");
    }//GEN-LAST:event_btnperifericosMouseExited

    private void btnperifericosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnperifericosMouseClicked
        if (!ventana) {
            ventana = true;
            Vperifericos a = new Vperifericos();
            SQLperifericos sql = SQLperifericos.getInstance();

            Cperifericos cp = new Cperifericos(sql, a);
            this.setVisible(false);
            ventana = false;
        }

    }//GEN-LAST:event_btnperifericosMouseClicked
//boton de usuarios
    private void btnusuarios2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnusuarios2MouseEntered
        bordes(btnusuarios2);
        usuarios.setVisible(true);
        Proyecto.img.cambio_img(btnusuarios2, "imagenes/inicial/USUARIOS_P.png");
    }//GEN-LAST:event_btnusuarios2MouseEntered

    private void btnusuarios2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnusuarios2MouseExited
        no_bordes(btnusuarios2);
        usuarios.setVisible(false);
        Proyecto.img.cambio_img(btnusuarios2, "imagenes/inicial/USUARIOS.png");
    }//GEN-LAST:event_btnusuarios2MouseExited

    private void btnusuarios2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnusuarios2MouseClicked
        if (!ventana) {
            ventana = true;
            SQLusuarios sql = SQLusuarios.getInstance();
            Vusuarios a = new Vusuarios();

            Cusuarios cus = new Cusuarios(sql, a);
            this.setVisible(false);
            ventana = false;
        }

    }//GEN-LAST:event_btnusuarios2MouseClicked
//boton de grafica
    private void btndepartamentosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndepartamentosMouseEntered
        bordes(btndepartamentos);
        departamentos.setVisible(true);
        Proyecto.img.cambio_img(btndepartamentos, "imagenes/inicial/DPTO_P.png");
    }//GEN-LAST:event_btndepartamentosMouseEntered

    private void btndepartamentosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndepartamentosMouseExited
        no_bordes(btndepartamentos);
        departamentos.setVisible(false);
        Proyecto.img.cambio_img(btndepartamentos, "imagenes/inicial/DPTO.png");
    }//GEN-LAST:event_btndepartamentosMouseExited

    private void btndepartamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndepartamentosMouseClicked
        if (!ventana) {
            ventana = true;
            Vdepartamentos a = new Vdepartamentos();
            SQLdepartamentos dep = SQLdepartamentos.getInstanceDerpartamentos();

            Cdepartamentos cd = new Cdepartamentos(dep, a);
            this.setVisible(false);
            ventana = false;
        }

    }//GEN-LAST:event_btndepartamentosMouseClicked
//boton salir
    private void btnsalir2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalir2MouseEntered
        Proyecto.img.bordes(btnsalir2);
    }//GEN-LAST:event_btnsalir2MouseEntered

    private void btnsalir2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalir2MouseExited
        Proyecto.img.no_bordes(btnsalir2);
    }//GEN-LAST:event_btnsalir2MouseExited

    private void btnsalir2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalir2MouseClicked
        int salir = JOptionPane.showConfirmDialog(this, "¿Quieres cerrar sesion?");
        System.out.println(salir);
        if (salir == 0) {
            SQLusuarios sql = SQLusuarios.getInstance();
            Usuarios us = new Usuarios();
            Login ve = new Login();
            ve.setIconImage(proyecto.Proyecto.ICONO.getImage());

            Clogin cl = new Clogin(sql, ve, us);
            this.setVisible(false);
            ventana = false;
        }

    }//GEN-LAST:event_btnsalir2MouseClicked

    private void btnRespaldoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRespaldoMouseReleased
        if (Clogin.Admin) {
            Respaldos res = new Respaldos();

            res.respaldar();
        } else {
            JOptionPane.showMessageDialog(this, Proyecto.SIN_PERMISO);
        }
    }//GEN-LAST:event_btnRespaldoMouseReleased

    private void btnRecuperarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecuperarMousePressed
        if (Clogin.Admin) {
            int num = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea recuperar la base de datos?\nLas información que no se encuentre en el archivo\nde respaldo se perdera\n");

            if (num == 0) {
                Recuperacion rec = new Recuperacion();
                rec.recuperacion();
            }

        } else {
            JOptionPane.showMessageDialog(this, Proyecto.SIN_PERMISO);
        }
    }//GEN-LAST:event_btnRecuperarMousePressed

    private void btnGenerarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarMouseClicked

        Reportes rep = Reportes.getInstance();
        
        int tipoPDF = cbTipoPDF.getSelectedIndex();
        int contenidoPDF = cbContenidoPDF.getSelectedIndex();

        switch (tipoPDF) {
            case 0:// no pasa nada
                JOptionPane.showMessageDialog(this, "Debe seleccionar el tipo de reporte a generar");
                break;

            case 1://reporte de equipos
                if (contenidoPDF == 0) {
                    
                    JOptionPane.showMessageDialog(this, "Debe seleccionar el contenido del reporte");
                    
                } else {
                    
                    if (contenidoPDF == 1){
                        
                        rep.reporteGeneral();
                        
                        System.out.println("reporte general de equipos"); 
                    } else {
                        String depa = cbContenidoPDF.getItemAt(contenidoPDF);
                        rep.reporteDepartamentos(depa);
                        System.out.println("reporte de equipos del departamento " + depa);
                    }
                    
                }
                break;

            case 2://reporte segun perifericos
                if (contenidoPDF == 0){
                    
                    JOptionPane.showMessageDialog(this, "Debe seleccionar el contenido del reporte");
                    
                } else {
                    String peri = cbContenidoPDF.getItemAt(contenidoPDF);
                    rep.reportePerifericos(peri);
                    System.out.println("reporte de los " + peri);
                }
                
                break;
        }
    }//GEN-LAST:event_btnGenerarMouseClicked

    private void cbTipoPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoPDFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoPDFActionPerformed

    private void btnRespaldoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRespaldoMouseEntered
        Proyecto.img.bordes(btnRespaldo);
    }//GEN-LAST:event_btnRespaldoMouseEntered

    private void btnRespaldoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRespaldoMouseExited
        Proyecto.img.no_bordes(btnRespaldo);
    }//GEN-LAST:event_btnRespaldoMouseExited

    private void btnRecuperarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecuperarMouseEntered
        Proyecto.img.bordes(btnRecuperar);
    }//GEN-LAST:event_btnRecuperarMouseEntered

    private void btnRecuperarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecuperarMouseExited
        Proyecto.img.no_bordes(btnRecuperar);
    }//GEN-LAST:event_btnRecuperarMouseExited

    private void btnGenerarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarMouseEntered
        Proyecto.img.cambio_img(btnGenerar, "imagenes/inicial/GENERAR_A.png");
    }//GEN-LAST:event_btnGenerarMouseEntered

    private void btnGenerarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarMouseExited
        Proyecto.img.cambio_img(btnGenerar, "imagenes/inicial/GENERAR_R.png");
    }//GEN-LAST:event_btnGenerarMouseExited

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
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel btnGenerar;
    private javax.swing.JLabel btnRecuperar;
    private javax.swing.JLabel btnRespaldo;
    private javax.swing.JLabel btndepartamentos;
    private javax.swing.JLabel btnequio2;
    private javax.swing.JLabel btnperifericos;
    private javax.swing.JLabel btnsalir2;
    private javax.swing.JLabel btnusuarios2;
    public javax.swing.JComboBox<String> cbContenidoPDF;
    public javax.swing.JComboBox<String> cbTipoPDF;
    private javax.swing.JLabel departamentos;
    private javax.swing.JLabel equipos;
    private javax.swing.JLabel fon;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel perifericos;
    public javax.swing.JLabel txtus;
    private javax.swing.JLabel usuarios;
    // End of variables declaration//GEN-END:variables
}
