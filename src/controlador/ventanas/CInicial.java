
package controlador.ventanas;

import controlador.consultas.SQLdepartamentos;
import controlador.consultas.SQLperifericos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import proyecto.Proyecto;
import vista.Inicial;

public class CInicial implements ActionListener{
    
    private Inicial ve;

    public CInicial(Inicial ve) {
        this.ve = ve;
        
        ve.setTitle(Proyecto.TITULO);
        
        ve.cbTipoPDF.setSelectedIndex(0);
        
        ve.cbTipoPDF.addActionListener(this);
        //ve.btnGenerar.addActionListener(this);
        
        this.ve.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(ve.cbTipoPDF)){
            seleccionPDF();
        }
        
    }

    private void seleccionPDF() {
        int op = ve.cbTipoPDF.getSelectedIndex();

         switch (op){
             case 0: //nada,opcion selecionada por defecto
                 ve.cbContenidoPDF.removeAllItems();
                 break;
                 
             case 1://equipos
                 ve.cbContenidoPDF.removeAllItems();
                 SQLdepartamentos dep = SQLdepartamentos.getInstanceDerpartamentos();
                 ve.cbContenidoPDF.addItem("Seleccionar");
                 ve.cbContenidoPDF.addItem("General");
                 dep.cbDepa(ve.cbContenidoPDF);
                 break;
                 
             case 2://perifericos
                 ve.cbContenidoPDF.removeAllItems();
                 
                 SQLperifericos per = SQLperifericos.getInstance();
                 ve.cbContenidoPDF.addItem("Seleccionar");
                 per.cbPerifericos(ve.cbContenidoPDF);
                 break;
         }
    }
    
}
