/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import builder.Computador;
import builder.TipoComputador;
import builder.Procesador;
import builder.MemoriaRam;
import builder.DiscoDuro;
import builder.TarjetaGrafica;

/**
 *
 * @author Franklin Garcia
 */
public class ComputadorBuilder implements Builder {

    private TipoComputador tipo;
    private int puertos;
    private Procesador procesador;
    private MemoriaRam ram;
    private DiscoDuro disco;
    private TarjetaGrafica tarjeta;

    public void setTipoComputador(TipoComputador tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setPuertosFisicos(int puertos) {
        this.puertos = puertos;
    }

    @Override
    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    @Override
    public void setMemoriaRam(MemoriaRam memoria) {
        this.ram = memoria;
    }

    @Override
    public void setDiscoDuro(DiscoDuro disco) {
        this.disco = disco;
    }

    @Override
    public void setTarjetGrafica(TarjetaGrafica tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Computador getResult() {
        return new Computador(tipo, puertos, procesador, ram, disco, tarjeta);
    }

}
