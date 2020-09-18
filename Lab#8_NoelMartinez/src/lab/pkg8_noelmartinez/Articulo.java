package lab.pkg8_noelmartinez;

import java.awt.Color;

/**
 *
 * @author noelg
 */
public class Articulo {
    private String Titulo;
    private Color color;
    private String desc;
    private String editorial;
    private double tamaño;
    private int puntuacion;
    private Persona persona;

    public Articulo() {
    }

    public Articulo(String Titulo, Color color, String desc, String editorial, double tamaño, int puntuacion, Persona persona) {
        this.Titulo = Titulo;
        this.color = color;
        this.desc = desc;
        this.editorial = editorial;
        this.tamaño = tamaño;
        this.puntuacion = puntuacion;
        this.persona = persona;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Articulo " + "Titulo " + Titulo + ", color " + color + ", descripcion " + desc + ", editorial " + editorial + ", tama\u00f1o=" + tamaño + ", puntuacion " + puntuacion + ", persona " + persona;
    }
    
}
