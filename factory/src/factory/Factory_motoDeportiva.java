/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;
import factory.Moto_deportiva;
/**
 *
 * @author Franklin Garcia
 */
public class Factory_motoDeportiva implements FactoryMoto{

    @Override
    public Motocicleta crearMoto() {
        return new Moto_deportiva();
    }
    
}
