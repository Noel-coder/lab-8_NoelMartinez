package lab.pkg8_noelmartinez;


import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;
import javax.swing.UIManager;

public class administrarBarra extends Thread {

    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    private int spinner;

    public administrarBarra(JProgressBar barra,int spinner) {
        this.barra = barra;
        vive = true;
        avanzar = true;
        this.spinner = spinner;
    }


    public int getSpinner() {
        return spinner;
    }

    public void setSpinner(int spinner) {
        this.spinner = spinner;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                barra.setMaximum(9);
                barra.setValue(barra.getValue() + 1);
                if (barra.getValue() < spinner) {
                    vive = false;
                } //FIN IF

                try {
                    Thread.sleep(0);
                } catch (InterruptedException ex) {
                }
            }

        }

    }
}
