/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8_noelmartinez;

import java.awt.Color;

/**
 *
 * @author noelg
 */
public class Figura extends Articulo {
    private String descFigura;
    private String instrucciones;
    private String tiempoGarantia;

    public Figura() {
    }

    public Figura(String descFigura, String instrucciones, String tiempoGarantia) {
        this.descFigura = descFigura;
        this.instrucciones = instrucciones;
        this.tiempoGarantia = tiempoGarantia;
    }

    public Figura(String descFigura, String instrucciones, String tiempoGarantia, String Titulo, Color color, String desc, String editorial, double tamaño, int puntuacion, Persona persona) {
        super(Titulo, color, desc, editorial, tamaño, puntuacion, persona);
        this.descFigura = descFigura;
        this.instrucciones = instrucciones;
        this.tiempoGarantia = tiempoGarantia;
    }

    public String getDescFigura() {
        return descFigura;
    }

    public void setDescFigura(String descFigura) {
        this.descFigura = descFigura;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public String getTiempoGarantia() {
        return tiempoGarantia;
    }

    public void setTiempoGarantia(String tiempoGarantia) {
        this.tiempoGarantia = tiempoGarantia;
    }

    @Override
    public String toString() {
        return "Figura{" + "descFigura=" + descFigura + ", instrucciones=" + instrucciones + ", tiempoGarantia=" + tiempoGarantia + '}';
    }
    
   
    
}
