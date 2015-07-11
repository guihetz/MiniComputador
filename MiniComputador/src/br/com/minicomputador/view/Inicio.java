/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.minicomputador.view;

/**
 *
 * @author guilherme
 */
public class Inicio {
    public static void main(String[] args) {
        //Inicia a tela principal sem usar o tema padrão do swing
        TelaPrincipal tela = new TelaPrincipal();
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }
}
