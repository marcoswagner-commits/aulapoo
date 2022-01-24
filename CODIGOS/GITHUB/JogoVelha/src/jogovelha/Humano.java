/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogovelha;

import java.util.Scanner;

/**
 *
 * @author marcos_wagner
 */
public class Humano extends Jogador {
    
    
    public Humano(int jogador){
        super(jogador);
        this.jogador = jogador;
     }
    
    @Override
    public void jogar(int pos, Tabuleiro tabuleiro, int simbolo){
        
        tabuleiro.marcaTabuleiro(pos,1,simbolo);
         
    }
    
    
    
}
