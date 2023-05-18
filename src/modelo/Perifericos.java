package modelo;

import java.util.Objects;

/**
 * Almacena los datos de los perifericos
 *
 * @author Carlos Masabet
 * @since 0.2
 */
public class Perifericos {

    private int id;//Id del periferico
    private int pc;//Id de la pc a la que esta asignado
    private int tipo; //Id del tipo de periferico

    private String pcP;//Serial de la pc
    private String tipoP;//Nombre del tipo de periferico
    private String serial;//Serial del periferico

    /**
     * Constructor que recive el id de la pc y del tipo de periferico
     *
     * @param pc Id de la pc a la que esta asignado
     * @param tipo Id del tipo de periferico
     * @param serial Serial del periferico
     */
    public Perifericos(int pc, int tipo, String serial) {
        this.pc = pc;
        this.tipo = tipo;
        this.serial = serial;
    }

    /**
     * Constructor que recive el serial de la pc y el nombre del tipo de
     * periferico
     *
     * @param id Id del periferico
     * @param pcP Serial de la pc
     * @param tipoP Nombre del tipo de periferico
     * @param serial Serial del periferico
     */
    public Perifericos(int id, String pcP, String tipoP, String serial) {
        this.id = id;
        this.pcP = pcP;
        this.tipoP = tipoP;
        this.serial = serial;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.id;
        hash = 71 * hash + Objects.hashCode(this.pcP);
        hash = 71 * hash + Objects.hashCode(this.tipoP);
        hash = 71 * hash + Objects.hashCode(this.serial);
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
        final Perifericos other = (Perifericos) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.pcP, other.pcP)) {
            return false;
        }
        if (!Objects.equals(this.tipoP, other.tipoP)) {
            return false;
        }
        if (!Objects.equals(this.serial, other.serial)) {
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

    public int getPc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getPcP() {
        return pcP;
    }

    public void setPcP(String pcP) {
        this.pcP = pcP;
    }

    public String getTipoP() {
        return tipoP;
    }

    public void setTipoP(String tipoP) {
        this.tipoP = tipoP;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

}
