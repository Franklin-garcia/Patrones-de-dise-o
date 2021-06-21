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
public class Main {

    public static void main(String[] args) {
        //Diseno de Singleton con nombres y apellido
        int numero = (int)(Math. random()*3+1);
        Singleton Persona1;
        if (numero==1) {
             Persona1 = Singleton.getSingleton("Franklin", "Garcia");
        }else if(numero==2){
             Persona1 = Singleton.getSingleton("Josue", "Garcia");
        }else{
             Persona1 = Singleton.getSingleton("Francisco", "Garcia");
        
        }
        
        
        System.out.println(Persona1.toString());

    }
}
