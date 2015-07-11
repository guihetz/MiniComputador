/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.minicomputador.model;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import javax.swing.JTextArea;

/**
 *
 * @author Guilherme Lourenço
 */
public class Processador {
    private String PC;
    private String IR;
    private String MAR;
    private String MBR;
    private String registradorA;
    private String registradorB;
    private String registradorC;
    private String registradorD;
    public String opcode, op1, op2;
    public JTextArea saidaDoSistema;
    public String instru;
    public String tagAux;
    
    
    public Processador(JTextArea saidaDoSistema){
        this.saidaDoSistema = saidaDoSistema;
        this.PC = "0x0000";
        this.registradorA = "0";
        this.registradorB = "0";
        this.registradorC = "0";
        this.registradorD = "0";
        this.tagAux = "";
    }
    
    public void buscaInstrucao(MemoriaCache mCache, MemoriaPrincipal mPrincipal, String endereco){
        this.PC = endereco;
        this.MAR = this.PC;
        Map<String, ArrayList<String>> linha0 = mCache.getLinhasMapeamentoDireto().get("0");
        Map<String, ArrayList<String>> linha1 = mCache.getLinhasMapeamentoDireto().get("1");
        Map<String, ArrayList<String>> linha2 = mCache.getLinhasMapeamentoDireto().get("2");
        Map<String, ArrayList<String>> linha3 = mCache.getLinhasMapeamentoDireto().get("3");
        String tag = endereco.substring(2, 4);
        if(tag.equals("00")){
            if(linha0 == null){
                linha0 = new TreeMap<>();
                linha0.put("0", mCache.getBlocoPorTag().get("00"));
            }else{
                linha0.put("0", mCache.getBlocoPorTag().get("00"));
            }
            int index = Integer.valueOf(endereco.substring(5));
            System.out.println(index);
            String instrucao = mCache.getBlocoPorTag().get("00").get(index);
            System.out.println(mCache.getBlocoPorTag().get("00"));
            System.out.println(instrucao);
            this.MBR = instrucao;
            this.IR = this.MBR;
            
        }else if(tag.equals("01")){
            if(linha1 == null){
                linha1 = new TreeMap<>();
                linha1.put("1", mCache.getBlocoPorTag().get("01"));
            }else{
                linha1.put("1", mCache.getBlocoPorTag().get("01"));
            }
            int index = Integer.valueOf(endereco.substring(5));
            String instrucao = mCache.getBlocoPorTag().get("01").get(index);
            this.MBR = instrucao;
            this.IR = this.MBR;
            
        }else if(tag.equals("02")){
            if(linha2 == null){
                linha2 = new TreeMap<>();
                linha2.put("2", mCache.getBlocoPorTag().get("02"));
            }else{
                linha2.put("2", mCache.getBlocoPorTag().get("02"));
            }
            int index = Integer.valueOf(endereco.substring(5));
            String instrucao = mCache.getBlocoPorTag().get("02").get(index);
            this.MBR = instrucao;
            this.IR = this.MBR;
            
        }else if(tag.equals("03")){
            if(linha3 == null){
                linha3 = new TreeMap<>();
                linha3.put("3", mCache.getBlocoPorTag().get("03"));
            }else{
                linha3.put("3", mCache.getBlocoPorTag().get("03"));
            }
            int index = Integer.valueOf(endereco.substring(5));
            String instrucao = mCache.getBlocoPorTag().get("03").get(index);
            this.MBR = instrucao;
            this.IR = this.MBR;
            
        }else if(tag.equals("04")){
            if(linha0 == null){
                linha0 = new TreeMap<>();
                linha0.put("0", mCache.getBlocoPorTag().get("04"));
            }else{
                linha0.put("0", mCache.getBlocoPorTag().get("04"));
            }
            int index = Integer.valueOf(endereco.substring(5));
            String instrucao = mCache.getBlocoPorTag().get("04").get(index);
            this.MBR = instrucao;
            this.IR = this.MBR;
            
        }else if(tag.equals("05")){
            if(linha1 == null){
                linha1 = new TreeMap<>();
                linha1.put("1", mCache.getBlocoPorTag().get("05"));
            }else{
                linha1.put("1", mCache.getBlocoPorTag().get("05"));
            }
            int index = Integer.valueOf(endereco.substring(5));
            String instrucao = mCache.getBlocoPorTag().get("05").get(index);
            
            this.MBR = instrucao;
            this.IR = this.MBR;
            
        }else if(tag.equals("06")){
            if(linha2 == null){
                linha2 = new TreeMap<>();
                linha2.put("2", mCache.getBlocoPorTag().get("06"));
            }else{
                linha2.put("2", mCache.getBlocoPorTag().get("06"));
            }
            int index = Integer.valueOf(endereco.substring(5));
            String instrucao = mCache.getBlocoPorTag().get("06").get(index);
            
            this.MBR = instrucao;
            this.IR = this.MBR;
            
        }else if(tag.equals("07")){
            if(linha3 == null){
                linha3 = new TreeMap<>();
                linha3.put("3", mCache.getBlocoPorTag().get("07"));
            }else{
                linha3.put("3", mCache.getBlocoPorTag().get("07"));
            }
            int index = Integer.valueOf(endereco.substring(5));
            String instrucao = mCache.getBlocoPorTag().get("07").get(index);
            
            this.MBR = instrucao;
            this.IR = this.MBR;
            
        }
        
        
        ArrayList<String> chaves = new ArrayList<>();
        for(String chave: mPrincipal.getEnderecos().keySet()){
            chaves.add(chave);
        }
        for(int i = 0; i < chaves.size(); i++){
            if(chaves.get(i).equals(endereco)){
                if(!(i == chaves.size()-1)){
                    this.PC = chaves.get(i+1);
                }
            }
        }
    
    }
    
    public void buscaInstrucaoAssociativo(MemoriaCache mCache, MemoriaPrincipal mPrincipal, String endereco){
        this.PC = endereco;
        this.MAR = this.PC;
        Map<String, ArrayList<String>> linha0 = mCache.getLinhasMapeamentoAssociativo().get("0");
        Map<String, ArrayList<String>> linha1 = mCache.getLinhasMapeamentoAssociativo().get("1");
        Map<String, ArrayList<String>> linha2 = mCache.getLinhasMapeamentoAssociativo().get("2");
        Map<String, ArrayList<String>> linha3 = mCache.getLinhasMapeamentoAssociativo().get("3");
        String tag = endereco.substring(2, 4);
        ArrayList<String> bloco = mCache.getBlocoPorTag().get(tag);
        

        this.tagAux = tag;
        
        if(linha0.containsValue(bloco)==false && linha1.containsValue(bloco)==false && linha2.containsValue(bloco)==false && linha3.containsValue(bloco)==false){
            
            
            int linhaEscolhida;
            Random sorteio = new Random();
            linhaEscolhida = sorteio.nextInt(4);
            System.out.println("linha escolhida: " + linhaEscolhida);
            if(linhaEscolhida==0){
                linha0.put("0", bloco);
            }if(linhaEscolhida==1){
                linha1.put("1", bloco);
            }if(linhaEscolhida==2){
                linha2.put("2", bloco);
            }if(linhaEscolhida==3){
                linha3.put("3", bloco);
            }
        }
        
        int index = Integer.valueOf(endereco.substring(5));
        System.out.println(index);
        String instrucao = mCache.getBlocoPorTag().get(tag).get(index);
        this.MBR = instrucao;
        this.IR = this.MBR;
        
        ArrayList<String> chaves = new ArrayList<>();
        for(String chave: mPrincipal.getEnderecos().keySet()){
            chaves.add(chave);
        }
        for(int i = 0; i < chaves.size(); i++){
            if(chaves.get(i).equals(endereco)){
                if(!(i == chaves.size()-1)){
                    this.PC = chaves.get(i+1);
                }
            }
        }
        
        
    }
    
    public void buscaInstrucaoAssociativoPorConjuntos(MemoriaCache mCache, MemoriaPrincipal mPrincipal, String endereco){
        this.PC = endereco;
        this.MAR = this.PC;
        Map<String, ArrayList<String>> linha0 = mCache.getLinhasMapeamentoDireto().get("0");
        Map<String, ArrayList<String>> linha1 = mCache.getLinhasMapeamentoDireto().get("1");
        Map<String, ArrayList<String>> linha2 = mCache.getLinhasMapeamentoDireto().get("2");
        Map<String, ArrayList<String>> linha3 = mCache.getLinhasMapeamentoDireto().get("3");
        String tag = endereco.substring(2, 4);
        if(!tagAux.equals(tag)){
            if(tag.equals("00") || tag.equals("02") || tag.equals("04") || tag.equals("06")){
                ArrayList<String> bloco = mCache.getBlocoPorTag().get(tag);
                Random sorteio = new Random();
                int linhaSorteada = sorteio.nextInt(2);
                if(linhaSorteada==0){
                    linha0.put("0", bloco);
                }else{
                    linha1.put("1", bloco);
                }


            }else if(tag.equals("01") || tag.equals("03") || tag.equals("05") || tag.equals("07")){
                ArrayList<String> bloco = mCache.getBlocoPorTag().get(tag);
                Random sorteio = new Random();
                int linhaSorteada = sorteio.nextInt(2);
                if(linhaSorteada==0){
                    linha2.put("2", bloco);
                }else{
                    linha3.put("3", bloco);
                }

            }
        }
            int index = Integer.valueOf(endereco.substring(5));
            System.out.println(index);
            String instrucao = mCache.getBlocoPorTag().get(tag).get(index);
            this.MBR = instrucao;
            this.IR = this.MBR;

            ArrayList<String> chaves = new ArrayList<>();
            for(String chave: mPrincipal.getEnderecos().keySet()){
                chaves.add(chave);
            }
            for(int i = 0; i < chaves.size(); i++){
                if(chaves.get(i).equals(endereco)){
                    if(!(i == chaves.size()-1)){
                        this.PC = chaves.get(i+1);
                    }
                }
            }
            
        
        tagAux = tag;
    }
    
    public void decodificaInstrucao(String instrucao){
        instru = instrucao;
        this.opcode = instrucao.substring(0, 3);
        this.op1 = instrucao.substring(4, instrucao.indexOf(","));
        this.op2 = instrucao.substring(instrucao.indexOf(",")+2);
        
        System.out.println(opcode);
        System.out.println(op1);
        System.out.println(op2);
        
        
    }
    
    public void executaInstrucao(){
        switch(opcode){
            case "MOV": {
                if(op1.equals("A")){
                    this.registradorA = op2;
                }else if(op1.equals("B")){
                    this.registradorB = op2;
                }
            }break;
            case "ADD": {
                this.registradorA = String.valueOf(Double.valueOf(registradorA) + Double.valueOf(registradorB));

            }break;
            case "SUB": {
                this.registradorA = String.valueOf(Double.valueOf(registradorA) - Double.valueOf(registradorB));  

            }break;
            case "MUL": {
                this.registradorA = String.valueOf(Double.valueOf(registradorA) * Double.valueOf(registradorB));

            }break;
            case "DIV": {
                this.registradorA = String.valueOf(Double.valueOf(registradorA) / Double.valueOf(registradorB));

            }break;
            case "OUT":{
                this.saidaDoSistema.append(this.registradorA + "\n");
            }break;
            default:{
                this.registradorA = "0";
                this.registradorB = "0";
                this.registradorC = "0";
                this.registradorD = "0";
                this.PC = "0x0000";
                this.MAR = "";
                this.MBR = "";
                this.IR = "";
            }    
        }
        
    }

    public String getPC() {
        return PC;
    }

    public void setPC(String PC) {
        this.PC = PC;
    }

    public String getIR() {
        return IR;
    }

    public void setIR(String IR) {
        this.IR = IR;
    }

    public String getMAR() {
        return MAR;
    }

    public void setMAR(String MAR) {
        this.MAR = MAR;
    }

    public String getMBR() {
        return MBR;
    }

    public void setMBR(String MBR) {
        this.MBR = MBR;
    }

    public String getRegistradorA() {
        return registradorA;
    }

    public void setRegistradorA(String registradorA) {
        this.registradorA = registradorA;
    }

    public String getRegistradorB() {
        return registradorB;
    }

    public void setRegistradorB(String registradorB) {
        this.registradorB = registradorB;
    }

    public String getRegistradorC() {
        return registradorC;
    }

    public void setRegistradorC(String registradorC) {
        this.registradorC = registradorC;
    }

    public String getRegistradorD() {
        return registradorD;
    }

    public void setRegistradorD(String registradorD) {
        this.registradorD = registradorD;
    }
    
    public void  restart(){
        this.registradorA = "0";
        this.registradorB = "0";
        this.registradorC = "0";
        this.registradorD = "0";
        this.PC = "0x0000";
        this.MAR = "";
        this.MBR = "";
        this.IR = "";
    }
    
}
