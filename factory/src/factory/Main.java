/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;
import factory.Aplication;
import factory.FactoryMoto;
import factory.Factory_motoDeportiva;
import factory.Factory_motoMontaña;
import java.util.Scanner;

/**
 *
 * @author Franklin Garcia
 */
public class Main {
        private static Aplication configureApplication() {
        Aplication app;
        FactoryMoto factory;
        System.out.println("Escriba tipo de moto a crear \n"
                + "deportiva \n"
                + "montañesa \n");
        Scanner sc=new Scanner(System.in);
        String mName = sc.nextLine().toLowerCase();
        if (mName.contains("deportiva")) {
            factory = new Factory_motoDeportiva();
            app = new Aplication(factory);
        } else {
            factory = new Factory_motoMontaña();
            app = new Aplication(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Aplication app = configureApplication();
        app.paint();
    }
}
