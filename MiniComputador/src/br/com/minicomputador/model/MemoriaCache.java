/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.minicomputador.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Guilherme Lourenço
 */
public class MemoriaCache {
    //Aloca espaço para as linhas da cache  e os blocos de instruções
    private Map<String, Map<String, ArrayList<String>>> linhasMapeamentoDireto;
    private Map<String, Map<String, ArrayList<String>>> linhasMapeamentoAssociativo;
    private ArrayList<String> bloco0 = new ArrayList<>();
    private ArrayList<String> bloco1 = new ArrayList<>();
    private ArrayList<String> bloco2 = new ArrayList<>();
    private ArrayList<String> bloco3 = new ArrayList<>();
    private ArrayList<String> bloco4 = new ArrayList<>();
    private ArrayList<String> bloco5 = new ArrayList<>();
    private ArrayList<String> bloco6 = new ArrayList<>();
    private ArrayList<String> bloco7 = new ArrayList<>();
    private ArrayList<String> bloco8 = new ArrayList<>();
    private Map<String, ArrayList<String>> blocoPorTag;
    
    public MemoriaCache(MemoriaPrincipal mPrincipal){
        
        
        
        bloco0.add(mPrincipal.getValor("0x0000"));
        bloco0.add(mPrincipal.getValor("0x0001"));
        bloco0.add(mPrincipal.getValor("0x0002"));
        
        
        bloco1.add(mPrincipal.getValor("0x0100"));
        bloco1.add(mPrincipal.getValor("0x0101"));
        bloco1.add(mPrincipal.getValor("0x0102"));
        
        
        bloco2.add(mPrincipal.getValor("0x0200"));
        bloco2.add(mPrincipal.getValor("0x0201"));
        bloco2.add(mPrincipal.getValor("0x0202"));
        
        
        bloco3.add(mPrincipal.getValor("0x0300"));
        bloco3.add(mPrincipal.getValor("0x0301"));
        bloco3.add(mPrincipal.getValor("0x0302"));
        
        
        bloco4.add(mPrincipal.getValor("0x0400"));
        bloco4.add(mPrincipal.getValor("0x0401"));
        bloco4.add(mPrincipal.getValor("0x0402"));
        
        
        bloco5.add(mPrincipal.getValor("0x0500"));
        bloco5.add(mPrincipal.getValor("0x0501"));
        bloco5.add(mPrincipal.getValor("0x0502"));
        
        bloco6.add(mPrincipal.getValor("0x0600"));
        bloco6.add(mPrincipal.getValor("0x0601"));
        bloco6.add(mPrincipal.getValor("0x0602"));
        
        bloco7.add(mPrincipal.getValor("0x0700"));
        bloco7.add(mPrincipal.getValor("0x0701"));
        bloco7.add(mPrincipal.getValor("0x0702"));
        
        this.blocoPorTag = new TreeMap<>();
        blocoPorTag.put("00", bloco0);
        blocoPorTag.put("01", bloco1);
        blocoPorTag.put("02", bloco2);
        blocoPorTag.put("03", bloco3);
        blocoPorTag.put("04", bloco4);
        blocoPorTag.put("05", bloco5);
        blocoPorTag.put("06", bloco6);
        blocoPorTag.put("07", bloco7);
        
        Map<String, ArrayList<String>> example = new TreeMap();
        ArrayList<String> teste = new ArrayList<>();
        teste.add("");
        //example.put("teste", teste);
        this.linhasMapeamentoDireto = new TreeMap<>();
        this.linhasMapeamentoDireto.put("0", example);
        this.linhasMapeamentoDireto.put("1", example);
        this.linhasMapeamentoDireto.put("2", example);
        this.linhasMapeamentoDireto.put("3", example);
        
        this.linhasMapeamentoAssociativo = new HashMap<>();
        this.linhasMapeamentoAssociativo.put("0", example);
        this.linhasMapeamentoAssociativo.put("1", example);
        this.linhasMapeamentoAssociativo.put("2", example);
        this.linhasMapeamentoAssociativo.put("3", example);
    }

    public Map<String, Map<String, ArrayList<String>>> getLinhasMapeamentoDireto() {
        return linhasMapeamentoDireto;
    }
    
   
    public Map<String, ArrayList<String>> getBlocoPorTag() {
        return blocoPorTag;
    }

    public Map<String, Map<String, ArrayList<String>>> getLinhasMapeamentoAssociativo() {
        return linhasMapeamentoAssociativo;
    }
    
    
}
