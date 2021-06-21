/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import builder.ComputadorBuilder;
import builder.ComputadorManualBuilder;
import builder.Computador;
import builder.Manual;
import builder.Director;

/**
 *
 * @author Franklin Garcia
 */
public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        ComputadorBuilder builder = new ComputadorBuilder();
        int numero = (int) (Math.random() * 10 + 1);
        if (numero % 2 == 0) {
            director.constructorEscritorio(builder);
        } else {
            director.constructorPortatil(builder);
        }

        Computador compu = builder.getResult();

        System.out.println("Computador built:\n" + compu.getTipo());

        ComputadorManualBuilder manualBuilder = new ComputadorManualBuilder();

        director.constructorPortatil(manualBuilder);
        Manual computadorManual = manualBuilder.getResult();

        System.out.println("\nComputador manual built:\n" + computadorManual.print());
    }
}
