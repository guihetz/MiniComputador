/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.minicomputador.model;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Guilherme Lourenço
 */
public class MemoriaPrincipal {
    private Map<String, String> enderecos;
    
    public MemoriaPrincipal(){
        //Aloca os 24 endereços da memória
        this.enderecos = new TreeMap<>();
        this.enderecos.put("0x0000", null);
        this.enderecos.put("0x0001", null);
        this.enderecos.put("0x0002", null);
        this.enderecos.put("0x0100", null);
        this.enderecos.put("0x0101", null);
        this.enderecos.put("0x0102", null);
        this.enderecos.put("0x0200", null);
        this.enderecos.put("0x0201", null);
        this.enderecos.put("0x0202", null);
        this.enderecos.put("0x0300", null);
        this.enderecos.put("0x0301", null);
        this.enderecos.put("0x0302", null);
        this.enderecos.put("0x0400", null);
        this.enderecos.put("0x0401", null);
        this.enderecos.put("0x0402", null);
        this.enderecos.put("0x0500", null);
        this.enderecos.put("0x0501", null);
        this.enderecos.put("0x0502", null);
        this.enderecos.put("0x0600", null);
        this.enderecos.put("0x0601", null);
        this.enderecos.put("0x0602", null);
        this.enderecos.put("0x0700", null);
        this.enderecos.put("0x0701", null);
        this.enderecos.put("0x0702", null);
        
        
    }
    
    public Map<String, String> getEnderecos(){
        return this.enderecos;
    }
    
    public String getValor(String endereco){
        return this.enderecos.get(endereco);
    }
    
    public void setValor(String endereco, String valor){
        this.enderecos.put(endereco, valor);
    }
}
