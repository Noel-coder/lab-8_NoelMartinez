package lab.pkg8_noelmartinez;

import java.awt.Color;

/**
 *
 * @author noelg
 */
public class Juegos extends Articulo {
    private int edicion;
    private String CasaElaboracion;
    private String pais;

    public Juegos() {
    }

    public Juegos(int edicion, String CasaElaboracion, String pais) {
        this.edicion = edicion;
        this.CasaElaboracion = CasaElaboracion;
        this.pais = pais;
    }

    public Juegos(int edicion, String CasaElaboracion, String pais, String Titulo, Color color, String desc, String editorial, double tamaño, int puntuacion, Persona persona) {
        super(Titulo, color, desc, editorial, tamaño, puntuacion, persona);
        this.edicion = edicion;
        this.CasaElaboracion = CasaElaboracion;
        this.pais = pais;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getCasaElaboracion() {
        return CasaElaboracion;
    }

    public void setCasaElaboracion(String CasaElaboracion) {
        this.CasaElaboracion = CasaElaboracion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Juegos{" + "edicion=" + edicion + ", CasaElaboracion=" + CasaElaboracion + ", pais=" + pais + '}';
    }
    
}
