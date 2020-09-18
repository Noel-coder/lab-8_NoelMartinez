package lab.pkg8_noelmartinez;


import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class guarda implements Runnable{
   private JProgressBar barra;
   private JLabel hora;

    public guarda(JProgressBar barra, JLabel hora) {
        this.barra = barra;
        this.hora = hora;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public JLabel getHora() {
        return hora;
    }

    public void setHora(JLabel hora) {
        this.hora = hora;
    }
   
    
    @Override
    public void run() {         
        
        }
    
    
}
