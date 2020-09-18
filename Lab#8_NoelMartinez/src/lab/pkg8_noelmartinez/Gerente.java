package lab.pkg8_noelmartinez;

import java.util.ArrayList;

/**
 *
 * @author noelg
 */
public class Gerente extends Persona {
    private String Usuario;
    private String Contraseña;
    private String Cargo;

    public Gerente() {
        super();
    }

    public Gerente(String Usuario, String Contraseña, String Cargo) {
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.Cargo = Cargo;
    }

    public Gerente(String Usuario, String Contraseña, String Cargo, String ID, String Nombre, int Edad, String Sexo, String EstadoCivil, double Altura, double Peso) {
        super(ID, Nombre, Edad, Sexo, EstadoCivil, Altura, Peso);
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.Cargo = Cargo;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    @Override
    public String toString() {
        return "Usuario=" + Usuario + ", Contrase\u00f1a=" + Contraseña + ", Cargo=" + Cargo + '}';
    }
    
    
}
