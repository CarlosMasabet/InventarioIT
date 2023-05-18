package vista;

import controlador.utilidades.Imagenes;
import controlador.utilidades.Menu;
import controlador.ventanas.CInicial;
import proyecto.Proyecto;

public class Vreportes extends javax.swing.JFrame {

    Menu m = new Menu(Proyecto.img);

    public Vreportes() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondobotones = new javax.swing.JPanel();
        txtequipo = new javax.swing.JLabel();
        btnequipos = new javax.swing.JLabel();
        txtpersonas = new javax.swing.JLabel();
        btnpersonas = new javax.swing.JLabel();
        txtusuarios = new javax.swing.JLabel();
        btnusuarios = new javax.swing.JLabel();
        txtsolicitudes = new javax.swing.JLabel();
        btnsolicitudes = new javax.swing.JLabel();
        txtAtras = new javax.swing.JLabel();
        btnmenu = new javax.swing.JLabel();
        btnsalir2 = new javax.swing.JLabel();
        fondo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondobotones.setBackground(new java.awt.Color(225, 232, 236));
        fondobotones.setBorder(new javax.swing.border.MatteBorder(null));
        fondobotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtequipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondobotones.add(txtequipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 50, -1));

        btnequipos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnequipos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/computadora1.png"))); // NOI18N
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
        fondobotones.add(btnequipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 50, 50));

        txtpersonas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fondobotones.add(txtpersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 60, -1));

        btnpersonas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnpersonas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/carne-de-identidad1.png"))); // NOI18N
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
        fondobotones.add(btnpersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 50, 50));

        txtusuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondobotones.add(txtusuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 70, -1));

        btnusuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnusuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/usuario1.png"))); // NOI18N
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
        fondobotones.add(btnusuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 50, 50));

        txtsolicitudes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondobotones.add(txtsolicitudes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 70, -1));

        btnsolicitudes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnsolicitudes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/documento1.png"))); // NOI18N
        btnsolicitudes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsolicitudes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsolicitudesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsolicitudesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsolicitudesMouseExited(evt);
            }
        });
        fondobotones.add(btnsolicitudes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 50, 50));

        txtAtras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondobotones.add(txtAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 90, -1));

        btnmenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/izquierda.png"))); // NOI18N
        btnmenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnmenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnmenuMouseExited(evt);
            }
        });
        fondobotones.add(btnmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 70));

        btnsalir2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnsalir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha-izquierda.png"))); // NOI18N
        btnsalir2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsalir2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsalir2MouseClicked(evt);
            }
        });
        fondobotones.add(btnsalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 90, 80));

        getContentPane().add(fondobotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 500));

        fondo.setBackground(new java.awt.Color(225, 232, 236));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 710, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//equipos
    private void btnequiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnequiposMouseClicked
        m.equipos_click(this);
    }//GEN-LAST:event_btnequiposMouseClicked

    private void btnequiposMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnequiposMouseEntered
        m.equipos_entra(btnequipos, txtequipo);
    }//GEN-LAST:event_btnequiposMouseEntered

    private void btnequiposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnequiposMouseExited
        m.equipos_sale(btnequipos, txtequipo);
    }//GEN-LAST:event_btnequiposMouseExited
//personas
    private void btnpersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpersonasMouseClicked
        m.perifericos_click(this);
    }//GEN-LAST:event_btnpersonasMouseClicked

    private void btnpersonasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpersonasMouseEntered
        m.perifericos_entra(btnpersonas, txtpersonas);
    }//GEN-LAST:event_btnpersonasMouseEntered

    private void btnpersonasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpersonasMouseExited
        m.perifericos_sale(btnpersonas, txtpersonas);
    }//GEN-LAST:event_btnpersonasMouseExited
//usuarios
    private void btnusuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnusuariosMouseClicked
        m.usuarios_click(this);
    }//GEN-LAST:event_btnusuariosMouseClicked

    private void btnusuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnusuariosMouseEntered
        m.usuarios_entra(btnusuarios, txtusuarios);
    }//GEN-LAST:event_btnusuariosMouseEntered

    private void btnusuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnusuariosMouseExited
        m.usuarios_sale(btnusuarios, txtusuarios);
    }//GEN-LAST:event_btnusuariosMouseExited
//solicitudes
    private void btnsolicitudesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsolicitudesMouseClicked
        m.reportes_click(this);
    }//GEN-LAST:event_btnsolicitudesMouseClicked

    private void btnsolicitudesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsolicitudesMouseEntered
        m.reportes_entra(btnsolicitudes, txtsolicitudes);
    }//GEN-LAST:event_btnsolicitudesMouseEntered

    private void btnsolicitudesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsolicitudesMouseExited
        m.reportes_sale(btnsolicitudes, txtsolicitudes);
    }//GEN-LAST:event_btnsolicitudesMouseExited
//menu
    private void btnmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenuMouseClicked
        //m.menu_accion(btnmenu, btnequipos, btnpersonas, btnusuarios, btnsolicitudes);
    }//GEN-LAST:event_btnmenuMouseClicked

    private void btnmenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenuMouseEntered
        Imagenes flechaD = new Imagenes();
        flechaD.bordes(btnmenu);
    }//GEN-LAST:event_btnmenuMouseEntered

    private void btnmenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenuMouseExited
        Imagenes flechaD = new Imagenes();
        flechaD.no_bordes(btnmenu);
    }//GEN-LAST:event_btnmenuMouseExited

    private void btnsalir2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalir2MouseClicked
        Inicial atras = Inicial.getInstance();
        CInicial ci = new CInicial(atras);
        this.setVisible(false);
    }//GEN-LAST:event_btnsalir2MouseClicked

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
            java.util.logging.Logger.getLogger(Vreportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vreportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vreportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vreportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vreportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnequipos;
    private javax.swing.JLabel btnmenu;
    private javax.swing.JLabel btnpersonas;
    private javax.swing.JLabel btnsalir2;
    private javax.swing.JLabel btnsolicitudes;
    private javax.swing.JLabel btnusuarios;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel fondobotones;
    private javax.swing.JLabel txtAtras;
    private javax.swing.JLabel txtequipo;
    private javax.swing.JLabel txtpersonas;
    private javax.swing.JLabel txtsolicitudes;
    private javax.swing.JLabel txtusuarios;
    // End of variables declaration//GEN-END:variables
}
