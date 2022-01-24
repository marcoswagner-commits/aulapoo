/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogovelha;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author marcos_wagner
 */
public class LogicaJogo {
           
     private Tabuleiro tabuleiro;
     private int rodadaJogo;
     private Jogador jogadorVez, jogador1, jogador2;
     private boolean iniciado;
     private int simbolo;
     
     
     LogicaJogo(Jogador jogador1, Jogador jogador2) {
         tabuleiro = new Tabuleiro();
         this.jogador1 = jogador1;
         this.jogador2 = jogador2;
         
         this.rodadaJogo = 1;
         this.iniciado = true;
        
         this.simbolo = new Random().nextInt(2);
         
         jogadorVez = jogador1;
         if (jogadorVez instanceof Computador)
            acionaComputador();
         
    }
     
     /// inicio dos getters ////

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    public int getRodadaJogo() {
        return rodadaJogo;
    }

    public Jogador getJogadorVez() {
        return jogadorVez;
    }

    public Jogador getJogador1() {
        return jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }

    public boolean isIniciado() {
        return iniciado;
    }
     
     ///// fim dos getters ///////
     
    public void geraRodada(int i) {
        marcaPosicao(i);
        if (this.iniciado) {
           this.rodadaJogo++;
           jogadorVez = ((jogadorVez == jogador2) ? jogador1 : jogador2);
            verificaVez();
        }
    } 
    
    public void verificaVez()
     {
         
         if (jogadorVez instanceof Computador)
            acionaComputador();
     }
    
     public void acionaComputador()
    {
         if (this.iniciado) {
            int pos = new Random().nextInt(9);
            while (!tabuleiro.posicaoLivreTabuleiro(pos))
                  pos = new Random().nextInt(9);
            marcaPosicao(pos);
            jogadorVez = ((jogadorVez == jogador2) ? jogador1 : jogador2);
            rodadaJogo++;
            verificaVez();
         }
    }
     
       
    public void marcaPosicao(int pos)
    {
        if (jogadorVez instanceof Humano) 
            jogadorVez.jogar(pos,tabuleiro,simbolo);
        else if (jogadorVez instanceof Computador) 
            jogadorVez.jogar(pos,tabuleiro,simbolo);
        
       simbolo = Math.abs(simbolo -1);
       
       if ((verificaVencedor()) || (verificaEmpate())) {
           this.iniciado = false;
       }
           
    }
  
    
    public boolean  verificaVencedor()
    {
      if(tabuleiro.verificaVencedor())
          if (jogadorVez == jogador1) {
                JOptionPane.showMessageDialog(null,"Jogador 1 ganhou!");
                return true;
                
          }
          else {
                JOptionPane.showMessageDialog(null,"Jogador 2 ganhou!");
                return true;
          }
      return false;
    }
    
    public boolean verificaEmpate()
    {
        if(tabuleiro.tabuleiroCompleto()){
                JOptionPane.showMessageDialog(null,"Tabuleiro Completo. Jogo empatado");
                 return true;
        }
        return false;
    }
    
  
    
}
