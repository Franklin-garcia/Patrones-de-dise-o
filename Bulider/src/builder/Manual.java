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
public class Manual {
        private TipoComputador tipo;
    private int puertos;
    private Procesador procesador;
    private MemoriaRam ram;
    private DiscoDuro disco;
    private TarjetaGrafica tarjeta;

    public Manual(TipoComputador tipo, int puertos, Procesador procesador, MemoriaRam ram, DiscoDuro disco, TarjetaGrafica tarjeta) {
        this.tipo = tipo;
        this.puertos = puertos;
        this.procesador = procesador;
        this.ram = ram;
        this.disco = disco;
        this.tarjeta = tarjeta;
    }
    public String print() {
        String info = "";
        info += "Tipo de computador: " + tipo + "\n";
        info += "Puertos fisicos: " + puertos + "\n";
        info += "Procesador: nucleos - " + procesador.getNucleos() + ";frecuencia - " + procesador.getFrecuencia() + "\n";
        info += "Espacio de disco: " + disco + "\n";
        return info;
    }
}
