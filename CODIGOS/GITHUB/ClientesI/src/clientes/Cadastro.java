/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import java.io.Serializable;

/**
 *
 * @author marcos_wagner
 */
public class Cadastro implements Serializable
{
    //atributos do objeto
    private int codigo;
    private String nome;
    //private Cadastro[] amigos;
    
    
    // atributos da classe
    public static int codigoStatic = 1;

   
    
    public Cadastro()
    {
        this("");
    }
    public Cadastro(String nome) {
        this.codigo = codigoStatic++;
        this.nome = nome;
        
    }
    
    public Cadastro(String nome, Cadastro[] amigos)
    {
       this.codigo = codigoStatic++;
        this.nome = nome;
        //this.amigos = amigos;
    }

//    public void setAmigos(Cadastro amigo) 
//    {
//        for (int i=0; i<this.amigos.length;i++)
//        {
//            if (amigos[i] == null) amigos[i] = amigo;
//        }
//    
//        
//    }

    
    
    

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
    
    public int getCodigoStatic() { return codigoStatic;}

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        //String relAmigos = "";
        //for (int i=0; i<amigos.length; i++) relAmigos = relAmigos +"- "+amigos[i].getNome();
        return "Cadastro - codigo=" + codigo + ", nome=" + nome; //+ " amigos: "+ relAmigos;
    }
    
    
    public boolean equals(final Cadastro outro)
    {
        if (this.nome == outro.nome) return true;
        else return false;
    }
    
    
    
    
    
    
    
}
