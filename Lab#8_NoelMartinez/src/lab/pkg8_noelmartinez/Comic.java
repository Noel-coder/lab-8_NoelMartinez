package lab.pkg8_noelmartinez;

import java.awt.Color;

/**
 *
 * @author noelg
 */
public class Comic extends Articulo {
    private int volumen_desc;
    private int estado;

    public Comic() {
    }

    public Comic(int volumen_desc, int estado) {
        this.volumen_desc = volumen_desc;
        this.estado = estado;
    }

    public Comic(int volumen_desc, int estado, String Titulo, Color color, String desc, String editorial, double tamaño, int puntuacion, Persona persona) {
        super(Titulo, color, desc, editorial, tamaño, puntuacion, persona);
        this.volumen_desc = volumen_desc;
        this.estado = estado;
    }

    public int getVolumen_desc() {
        return volumen_desc;
    }

    public void setVolumen_desc(int volumen_desc) {
        this.volumen_desc = volumen_desc;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Comic{" + "volumen_desc=" + volumen_desc + ", estado=" + estado + '}';
    }
    
}
