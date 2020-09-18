package lab.pkg8_noelmartinez;

import java.util.ArrayList;

/**
 *
 * @author noelg
 */
public class Persona {
    private String ID;
    private String Nombre;
    private int Edad;
    private String Sexo;
    private String EstadoCivil;
    private double Altura;
    private double Peso;
    private ArrayList Mensajes;

    public Persona() {
    }

    public Persona(String ID, String Nombre, int Edad, String Sexo, String EstadoCivil, double Altura, double Peso) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.EstadoCivil = EstadoCivil;
        this.Altura = Altura;
        this.Peso = Peso;
        this.Mensajes = Mensajes;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    @Override
    public String toString() {
        return "Persona " + "ID " + ID + ", Nombre " + Nombre + ", Edad " + Edad + ", Sexo " + Sexo + ", EstadoCivil " + EstadoCivil + ", Altura " + Altura + ", Peso " + Peso;
    }
    
}
