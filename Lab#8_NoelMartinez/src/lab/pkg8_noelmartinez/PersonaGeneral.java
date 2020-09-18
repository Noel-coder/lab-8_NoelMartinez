package lab.pkg8_noelmartinez;

import java.util.ArrayList;

/**
 *
 * @author noelg
 */
public class PersonaGeneral extends Persona {
    private String Ocupacion;
    private String Horario;
    private int SemanaTrabajando;
    private double Sueldo;

    public PersonaGeneral() {
    }

    public PersonaGeneral(String Ocupacion, String Horario, int SemanaTrabajando, double Sueldo) {
        this.Ocupacion = Ocupacion;
        this.Horario = Horario;
        this.SemanaTrabajando = SemanaTrabajando;
        this.Sueldo = Sueldo;
    }

    public PersonaGeneral(String Ocupacion, String Horario, int SemanaTrabajando, double Sueldo, String ID, String Nombre, int Edad, String Sexo, String EstadoCivil, double Altura, double Peso) {
        super(ID, Nombre, Edad, Sexo, EstadoCivil, Altura, Peso);
        this.Ocupacion = Ocupacion;
        this.Horario = Horario;
        this.SemanaTrabajando = SemanaTrabajando;
        this.Sueldo = Sueldo;
    }

    public String getOcupacion() {
        return Ocupacion;
    }

    public void setOcupacion(String Ocupacion) {
        this.Ocupacion = Ocupacion;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public int getSemanaTrabajando() {
        return SemanaTrabajando;
    }

    public void setSemanaTrabajando(int SemanaTrabajando) {
        this.SemanaTrabajando = SemanaTrabajando;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    @Override
    public String toString() {
        return "PersonaGeneral{" + "Ocupacion=" + Ocupacion + ", Horario=" + Horario + ", SemanaTrabajando=" + SemanaTrabajando + ", Sueldo=" + Sueldo + '}';
    }
    
}
