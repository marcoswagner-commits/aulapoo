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
public class Tabuleiro {
   
    public int[] tabJogador= new int[9];
    public int[] tabSimbolo = new int[9];
    
    public Tabuleiro(){
        zerarTabuleiro();
    }
    
    public void zerarTabuleiro()
    {
        for (int i=0;i<9;i++) { tabJogador[i]=0; tabSimbolo[i]=-1;}
        
    }
    
    public void marcaTabuleiro(int pos, int jogador, int simbolo)
    {
        this.tabJogador[pos] = jogador;
        this.tabSimbolo[pos] = simbolo;
    }
    
    public boolean posicaoLivreTabuleiro(int pos)
    {
        if (tabJogador[pos] == 0) return true;
        return false;
    }
    
    public boolean verificaVencedor()
    {
        if ((checaLinhas()) || (checaColunas()) || (checaDiagonais())) return true;
        return false;
    }
    
    private boolean checaLinhas() {
        return checaConjunto(0,1,2,3,4,5,6,7,8);
    }
    
    private boolean checaColunas() {
         return checaConjunto(0,3,6,1,4,7,2,5,8);
                
    }
    
    private boolean checaDiagonais() {
            return checaConjunto(0,4,8,2,4,6,0,4,8);
    }

    private boolean checaConjunto(int i1, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9)
    {
         if ((tabJogador[i1])==1 && (tabJogador[i2])==1 && (tabJogador[i3]) == 1)
            return  true;
        else if ((tabJogador[i1])==2 && (tabJogador[i2])==2 && (tabJogador[i3]) == 2)
            return  true;
        else if ((tabJogador[i4])==1 && (tabJogador[i5])==1 && (tabJogador[i6]) == 1)
            return  true;
        else if ((tabJogador[i4])==2 && (tabJogador[i5])==2 && (tabJogador[i6]) == 2)
             return  true;
        else if ((tabJogador[i7])==1 && (tabJogador[i8])==1 && (tabJogador[i9]) == 1)
            return  true;
        else if ((tabJogador[i7])==2 && (tabJogador[i8])==2 && (tabJogador[i9]) == 2)
            return  true; 
        
         return false;
     }
    
    public boolean tabuleiroCompleto()
    {
        for (int i=0; i<9; i++)
            if (tabJogador[i]==0) return false;
        return true;
    }
    
}
