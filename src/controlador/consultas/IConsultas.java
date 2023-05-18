package controlador.consultas;

import javax.swing.JTable;

/**
 * Agrupa las clases que realizan consultas a la base de datos
 *
 * @since 0.4
 * @author Carlos Masabet
 */
public interface IConsultas {

    /**
     * Decorar un JTable
     *
     * @param tabla JTable a decorar
     * @param num Especifica la tabla
     */
    void decorarTabla(JTable tabla, int num);

    /**
     * Llena una JTable con datos de la base de datos
     *
     * @param tabla Tabla donde se mostrara la información
     * @return boolean: true si la operación se realizo correctamente o false si
     * no
     */
    boolean llenadoTabla(JTable tabla);

    /**
     * Realiza busquedas en la base de datos y carga los resultados en una
     * JTable
     *
     * @param selector Decide cual sera el parametro de busqueda
     * @param busqueda Lo que se quiere buscar
     * @param tabla La tabla donde se cargaran los resultados
     * @return boolean: true si la operación se realizo correctamente o false si
     * no
     */
    boolean buscar(int selector, String busqueda, JTable tabla);
}
