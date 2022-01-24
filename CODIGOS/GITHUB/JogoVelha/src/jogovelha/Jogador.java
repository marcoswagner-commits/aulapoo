/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogovelha;

/**
 *
 * @author marcos_wagner
 */
public abstract class Jogador {
    
    protected int jogador;
    
    public Jogador(int jogador){
        this.jogador = jogador;
    }
    
    public abstract void jogar(int pos, Tabuleiro tabuleiro, int simbolo);
     
}
