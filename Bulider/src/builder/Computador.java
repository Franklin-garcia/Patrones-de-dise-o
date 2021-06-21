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
public class Computador {
    private TipoComputador tipo;
    private int puertos;
    private Procesador procesador;
    private MemoriaRam ram;
    private DiscoDuro disco;
    private TarjetaGrafica tarjeta;

    public Computador(TipoComputador tipo, int puertos, Procesador procesador, MemoriaRam ram, DiscoDuro disco, TarjetaGrafica tarjeta) {
        this.tipo = tipo;
        this.puertos = puertos;
        this.procesador = procesador;
        this.ram = ram;
        this.disco = disco;
        this.tarjeta = tarjeta;
    }

    public DiscoDuro getDisco() {
        return disco;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public int getPuertos() {
        return puertos;
    }

    public MemoriaRam getRam() {
        return ram;
    }

    public TarjetaGrafica getTarjeta() {
        return tarjeta;
    }

    public TipoComputador getTipo() {
        return tipo;
    }
}
