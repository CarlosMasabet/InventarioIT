package modelo;

import java.util.Objects;

/**
 * Almacena todos los datos de los departamentos
 *
 * @author Carlos Masabet
 * @since 0.2
 */
public class Departamentos {

    private int id;//Id del departamento

    private String nombre;//Nombre del departamento
    private String jefe;//Nombre del jefe deldepartamento
    private String contacto;//Número de contacto del jefe del departamento

    /**
     * Constructor
     *
     * @param id Id del departamento
     * @param nombre Nombre del departamento
     * @param jefe Nombre del jefe deldepartamento
     * @param contacto Número de contacto del jefe del departamento
     */
    public Departamentos(int id, String nombre, String jefe, String contacto) {
        this.id = id;
        this.nombre = nombre;
        this.jefe = jefe;
        this.contacto = contacto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + Objects.hashCode(this.jefe);
        hash = 79 * hash + Objects.hashCode(this.contacto);
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
        final Departamentos other = (Departamentos) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.jefe, other.jefe)) {
            return false;
        }
        if (!Objects.equals(this.contacto, other.contacto)) {
            return false;
        }
        return true;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

}
