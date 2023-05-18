package modelo;

import java.util.Objects;

/**
 * Almacea la informción de los usuarios
 *
 * @author Carlos Masabet
 * @since 0.1
 */
public class Usuarios {

    private int id;//Id del usuario

    private String codigo;//Codigo del usuario
    private String nombre;//Nombre del usuario
    private String contraseña;//Contraseña del usuario
    private int tipo_us;//Id del tipo de usuario
    private String tipoNom;//Nombre del usuario
    private String ulima_secion;//Fecha de la ultima vez que el usuario inicio seción

    /**
     * Constructor que recive todos los parametros
     *
     * @param id Id del usuario
     * @param codigo Codigo del usuario
     * @param nombre Nombre del usuario
     * @param tipoNom Nombre del tipo de usuario
     */
    public Usuarios(int id, String codigo, String nombre, String tipoNom) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipoNom = tipoNom;
    }

    /**
     * Constructor que no recive nada
     */
    public Usuarios() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.codigo);
        hash = 89 * hash + Objects.hashCode(this.nombre);
        hash = 89 * hash + Objects.hashCode(this.contraseña);
        hash = 89 * hash + Objects.hashCode(this.tipoNom);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuarios other = (Usuarios) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.tipoNom, other.tipoNom)) {
            return false;
        }
        return true;
    }


    public String getTipoNom() {
        return tipoNom;
    }

    public void setTipoNom(String tipoNom) {
        this.tipoNom = tipoNom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getTipo_us() {
        return tipo_us;
    }

    public void setTipo_us(int tipo_us) {
        this.tipo_us = tipo_us;
    }

    public String getUlima_secion() {
        return ulima_secion;
    }

    public void setUlima_secion(String ulima_secion) {
        this.ulima_secion = ulima_secion;
    }

}
