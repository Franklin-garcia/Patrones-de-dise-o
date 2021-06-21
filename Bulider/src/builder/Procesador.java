/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Franklin Garcia
 */
public class Procesador {
    private int nucleos;
    private double Frecuencia;

    public Procesador(int nucleos, double Frecuencia) {
        this.nucleos = nucleos;
        this.Frecuencia = Frecuencia;
    }

    public int getNucleos() {
        return nucleos;
    }

    public double getFrecuencia() {
        return Frecuencia;
    }

    
    
}
