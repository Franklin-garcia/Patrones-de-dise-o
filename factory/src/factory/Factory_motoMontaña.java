/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;
import factory.Moto_montañesa;
/**
 *
 * @author Franklin Garcia
 */
public class Factory_motoMontaña implements FactoryMoto{

    @Override
    public Motocicleta crearMoto() {
        return new Moto_montañesa();
    }
    
}
