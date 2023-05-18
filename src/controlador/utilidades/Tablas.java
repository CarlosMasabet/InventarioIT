package controlador.utilidades;

import javax.swing.table.DefaultTableModel;

/**
 * Controla la funcionalidad de las tablas
 *
 * @author Carlos Masabet
 * @since 0.3
 */
public class Tablas extends DefaultTableModel {

    /**
     * Constructor
     *
     * @param os Lista con los tiulos de las columnas
     * @param i
     */
    public Tablas(Object[] os, int i) {
        super(os, i);
    }

    /**
     * Evita que se pueda editar el contenido de las tablas
     *
     * @param row
     * @param column
     * @return
     */
    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

}
