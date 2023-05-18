package controlador.ventanas.login;

import controlador.utilidades.Hash;
import controlador.consultas.SQLusuarios;
import controlador.ventanas.CInicial;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Usuarios;
import proyecto.Proyecto;
import vista.Inicial;
import vista.Login;

public class Clogin implements ActionListener, KeyListener {
//valiarbles

    private SQLusuarios sql;
    protected Login ve;
    private Usuarios us;
    private MouseLogin ml;

    protected Boolean ventana = false;

    public static Boolean Admin = false;
    public static Boolean Regular = false;
    public static String NomUsuario;
    

    public Clogin(SQLusuarios sql, Login ve, Usuarios us) {
        this.sql = sql;
        this.ve = ve;
        this.us = us;
        
        ml = new MouseLogin(ve, Proyecto.color);

        ve.btnentrar.addActionListener(this);
        ve.btnentrar.addKeyListener(this);
        
        ve.txtcontraseña.addKeyListener(this);       
       

        Iniciar();
    }

    private void Iniciar() {
        ve.btnRecuperarBD.setVisible(false);
        
        ve.setSize(Proyecto.TAMAÑO);
        ve.setResizable(false);
        ve.setTitle(Proyecto.TITULO);
        ve.setLocationRelativeTo(null);
        ve.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(ve.btnentrar)) {
            Entrar();
        }
    }

    protected void Entrar() {
        String pass = Arrays.toString(ve.txtcontraseña.getPassword());
        Date date = new Date();
        DateFormat fecha = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String usuario = ve.txtusuario.getText();

        if (usuario.equals("") || pass.equals("")) {//confirma que haya texto
            JOptionPane.showMessageDialog(ve, "Debe completar los datos");

        } else {//confirma que haya texto
            String cifrado = Hash.sha1(pass);
            us.setCodigo(ve.txtusuario.getText());
            us.setContraseña(cifrado);
            us.setUlima_secion(fecha.format(date));
            //us.setUlima_secion(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date));
            

            if (ventana == false) {//confirma que no exista una ventana

                ve.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

                switch (sql.InicioSesion(us)) {

                    case 0: // 0 = entrar
                        Inicial i = Inicial.getInstance();
                        CInicial ci = new CInicial(i);
                        ventana = true;
                        ve.setVisible(false);

                        NomUsuario = us.getNombre();
                        i.txtus.setText(NomUsuario);
                        break;

                    case 1: // 1 = error de contraseña
                        JOptionPane.showMessageDialog(ve, "Contraseña incorrecta");
                        ve.txtcontraseña.setText("");
                        ve.setCursor(Cursor.DEFAULT_CURSOR);
                        break;

                    case 2: // 2 = error de usuario
                        JOptionPane.showMessageDialog(ve, "Usuario incorrecto");
                        ve.txtcontraseña.setText("");
                        ve.setCursor(Cursor.DEFAULT_CURSOR);
                        break;

                    case 3: // 3 = probelmas de connecion
                        JOptionPane.showMessageDialog(ve, "Error: Contacte a su administrador \n" + "Codigo: " + sql.error);
                        ve.txtcontraseña.setText("");
                        ve.setCursor(Cursor.DEFAULT_CURSOR);
                        break;
                }

                switch (us.getTipo_us()) {

                    case 1:
                        Admin = true;
                        Regular = false;
                        break;

                    case 2:
                        Regular = true;
                        Admin = false;
                        break;

                    case 3:
                        Regular = false;
                        Admin = false;
                        break;
                }
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            Entrar();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
