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

/**
 *
 * @author Franklin Garcia
 */
public interface Builder {

    void setTipoComputador(TipoComputador type);

    void setPuertosFisicos(int puertos);

    void setProcesador(Procesador procesador);

    void setMemoriaRam(MemoriaRam memoria);

    void setDiscoDuro(DiscoDuro disco);

    void setTarjetGrafica(TarjetaGrafica tarjeta);
}
