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
public class MemoriaRam {
        private String tam;

    public MemoriaRam() {
        this.tam = "4 GB";
    }

    public MemoriaRam (String manualTam) {
        this.tam = manualTam;
    }
    public String getTam() {
        return tam;
    }
   
        
}
