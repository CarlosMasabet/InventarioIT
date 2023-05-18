package modelo;

import java.util.Objects;

/**
 * Almacena todos los datos de las pc
 *
 * @author Carlos Masabet
 * @since 0.1
 */
public class Equipos  {

    private int id;//Id de la pc

    private int marca;//Id de la marca de la pc
    private int modelo;//Id del modelo de la pc

    private String marcaP;//Nombre de la marca de la pc
    private String modeloP;//Nombre del modelo de la pc
    private String serial;//Serial de la pc
    private String estado;//Estado de la pc
    private String us;//Usuario del trabajdor que usa la pc

    /**
     * Constructo que recive los id de la marca y el serial
     *
     * @param marca Id de la marca de la pc
     * @param modelo Id del modelo de la pc
     * @param serial Serial de la pc
     * @param estado Estado de la pc
     * @param us Usuario del trabajdor que usa la pc
     */
    public Equipos(int marca, int modelo, String serial, String estado, String us) {
        this.marca = marca;
        this.modelo = modelo;
        this.serial = serial;
        this.estado = estado;
        this.us = us;
    }

    /**
     * Constructo que recive los nombres de la marca y el serial
     *
     * @param id Id de la pc
     * @param marcaP Nombre de la marca de la pc
     * @param modeloP Nombre del modelo de la pc
     * @param serial Serial de la pc
     * @param estado Estado de la pc
     * @param us Usuario del trabajdor que usa la pc
     */
    public Equipos(int id, String marcaP, String modeloP, String serial, String estado, String us) {
        this.id = id;
        this.marcaP = marcaP;
        this.modeloP = modeloP;
        this.serial = serial;
        this.estado = estado;
        this.us = us;
    }

    /**
     * Constructo que no resive nada
     */
    public Equipos() {

    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.marcaP);
        hash = 43 * hash + Objects.hashCode(this.modeloP);
        hash = 43 * hash + Objects.hashCode(this.serial);
        hash = 43 * hash + Objects.hashCode(this.estado);
        hash = 43 * hash + Objects.hashCode(this.us);
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
        final Equipos other = (Equipos) obj;
        if (!Objects.equals(this.marcaP, other.marcaP)) {
            return false;
        }
        if (!Objects.equals(this.modeloP, other.modeloP)) {
            return false;
        }
        if (!Objects.equals(this.serial, other.serial)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.us, other.us)) {
            return false;
        }
        return true;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getId() {
        return id;
    }

    public int getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    public String getMarcaP() {
        return marcaP;
    }

    public String getModeloP() {
        return modeloP;
    }

    public String getSerial() {
        return serial;
    }

    public String getEstado() {
        return estado;
    }

    public String getUs() {
        return us;
    }

}
