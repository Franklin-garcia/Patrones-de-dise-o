/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Franklin Garcia
 */
public class Singleton {
     private final String nombre;
    private final String apellido;
    private static Singleton miSingleton;
    
    //Lazy Singleton
    public static Singleton getSingleton(String nombre, String apellido) {

        if (miSingleton == null) {

            miSingleton = new Singleton(nombre, apellido);
        }
        return miSingleton;
    }

    private Singleton(String nombre, String apellido) {

        this.nombre = nombre;
        this.apellido = apellido;

    }

    public static Singleton getMiSingleton() {
        return miSingleton;
    }

    public static void setMiSingleton(Singleton miSingleton) {
        Singleton.miSingleton = miSingleton;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return "Nombre:" + nombre + ", Apellido:" + apellido + "\n";
    }

}
