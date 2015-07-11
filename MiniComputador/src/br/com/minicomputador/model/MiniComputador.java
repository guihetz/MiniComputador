/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.minicomputador.model;

import java.util.Map;
import javax.swing.JTextArea;

/**
 *
 * @author Guilherme Lourenço
 */
public class MiniComputador {
    private Processador processador;
    private MemoriaPrincipal memoriaPrincipal;
    private MemoriaCache memoriaCache;
    
    public MiniComputador(JTextArea saidaDoSistema){
        this.processador = new Processador(saidaDoSistema);
        this.memoriaPrincipal = new MemoriaPrincipal();
        this.memoriaCache = new MemoriaCache(this.memoriaPrincipal);
    }
    
    public Map<String, String> getEnderecosMemoriaPrincipal(){
        return this.memoriaPrincipal.getEnderecos();
    }
    
    public MemoriaPrincipal getMemoriaPrincipal(){
        return this.memoriaPrincipal;
    }
    
    public Processador getProcessador(){
        return this.processador;
    }
    
    public MemoriaCache getMemoriaCache(){
        return this.memoriaCache;
    }

    public void setMemoriaCache(MemoriaCache memoriaCache) {
        this.memoriaCache = memoriaCache;
    }
    
}
