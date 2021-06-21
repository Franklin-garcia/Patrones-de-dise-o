/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import builder.TipoComputador;
import builder.Procesador;
import builder.MemoriaRam;
import builder.DiscoDuro;
import builder.TarjetaGrafica;
import builder.Builder;

/**
 *
 * @author Franklin Garcia
 */
public class Director {

    public void constructorEscritorio(Builder builder) {
        builder.setTipoComputador(TipoComputador.Escritorio);
        builder.setPuertosFisicos(6);
        builder.setProcesador(new Procesador(2, 2.4));
        builder.setDiscoDuro(DiscoDuro.SATA);
        builder.setTarjetGrafica(new TarjetaGrafica());
        builder.setMemoriaRam(new MemoriaRam());
    }

    public void constructorPortatil(Builder builder) {
        builder.setTipoComputador(TipoComputador.Portatil);
        builder.setPuertosFisicos(8);
        builder.setProcesador(new Procesador(3, 2.6));
        builder.setDiscoDuro(DiscoDuro.SATA2);
        builder.setTarjetGrafica(new TarjetaGrafica());
        builder.setMemoriaRam(new MemoriaRam());
    }

}
