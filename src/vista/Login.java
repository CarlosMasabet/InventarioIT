
package vista;

import controlador.utilidades.Colores;


public class Login extends javax.swing.JFrame {

    public Login() {
        
        initComponents();
        this.setLocationRelativeTo(null);

    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfrecuperar = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fondo = new java.awt.Panel();
        btnRecuperarBD = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        txtcontraseña = new javax.swing.JPasswordField();
        contraseña = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        usuario = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        btnentrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setText("jTextField1");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        jPasswordField1.setText("jPasswordField1");
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jButton1.setText("jButton1");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jfrecuperar.getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        fondo.setBackground(new java.awt.Color(225, 232, 236));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRecuperarBD.setForeground(new java.awt.Color(255, 255, 255));
        btnRecuperarBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inicial/btnRecuperarBD.png"))); // NOI18N
        btnRecuperarBD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecuperarBD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRecuperarBDMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRecuperarBDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRecuperarBDMouseExited(evt);
            }
        });
        fondo.add(btnRecuperarBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 150, 40));

        txtusuario.setBackground(Colores.GRIS_CLARO);
        txtusuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtusuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtusuario.setBorder(null);
        txtusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtusuarioMousePressed(evt);
            }
        });
        txtusuario.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtusuarioInputMethodTextChanged(evt);
            }
        });
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        txtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtusuarioKeyPressed(evt);
            }
        });
        fondo.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 270, 40));

        txtcontraseña.setBackground(Colores.GRIS_CLARO);
        txtcontraseña.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtcontraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcontraseña.setBorder(null);
        txtcontraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcontraseñaMousePressed(evt);
            }
        });
        txtcontraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcontraseñaKeyPressed(evt);
            }
        });
        fondo.add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 270, 40));

        contraseña.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        contraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contraseña.setText("Contraseña:");
        fondo.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 270, -1));

        jSeparator1.setBackground(new java.awt.Color(225, 232, 236));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        fondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 270, 10));

        usuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuario.setText("Codigo:");
        fondo.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 270, -1));

        jSeparator2.setBackground(new java.awt.Color(225, 232, 236));
        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        fondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 270, 10));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("INICIAR SESIÓN");
        fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 270, -1));

        btnentrar.setBackground(Colores.ROJO);
        btnentrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnentrar.setForeground(new java.awt.Color(255, 255, 255));
        btnentrar.setText("Entrar");
        btnentrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondo.add(btnentrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 140, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/LOGIN.png"))); // NOI18N
        fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1005, 590));

        getContentPane().add(fondo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusuarioMousePressed

    }//GEN-LAST:event_txtusuarioMousePressed
    
    
    private void txtcontraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcontraseñaMousePressed

       
    }//GEN-LAST:event_txtcontraseñaMousePressed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void txtusuarioInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtusuarioInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioInputMethodTextChanged
//borra el texto de los cuadros de texto cuando se ponga un boton
    private void txtusuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyPressed

    }//GEN-LAST:event_txtusuarioKeyPressed

    private void txtcontraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontraseñaKeyPressed
        
    }//GEN-LAST:event_txtcontraseñaKeyPressed

    private void btnRecuperarBDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecuperarBDMouseClicked
        jfrecuperar.setSize(450, 200);
        jfrecuperar.setTitle("Recuperar base de datos");
        jfrecuperar.setLocationRelativeTo(null);
        jfrecuperar.setResizable(false);
        jfrecuperar.setIconImage(proyecto.Proyecto.ICONO.getImage());
        jfrecuperar.setVisible(true);
    }//GEN-LAST:event_btnRecuperarBDMouseClicked

    private void btnRecuperarBDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecuperarBDMouseEntered
        proyecto.Proyecto.img.bordes(btnRecuperarBD);
    }//GEN-LAST:event_btnRecuperarBDMouseEntered

    private void btnRecuperarBDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecuperarBDMouseExited
        proyecto.Proyecto.img.no_bordes(btnRecuperarBD);
    }//GEN-LAST:event_btnRecuperarBDMouseExited

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel btnRecuperarBD;
    public javax.swing.JButton btnentrar;
    private javax.swing.JLabel contraseña;
    private java.awt.Panel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JFrame jfrecuperar;
    public javax.swing.JPasswordField txtcontraseña;
    public javax.swing.JTextField txtusuario;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}