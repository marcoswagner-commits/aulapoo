/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogovelha;

import java.util.Random;

/**
 *
 * @author marcos_wagner
 */
public class Computador extends Jogador {
    
    public Computador(int jogador){
        super(jogador);
        
    }
    
    @Override
    public void jogar(int pos, Tabuleiro tabuleiro, int simbolo){
        tabuleiro.marcaTabuleiro(pos,2, simbolo);
    }
    
    
}
