/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author marcos_wagner
 */
public class Usuario {
    
    // atributos
    private String nome;
    private String email;
    

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   

 

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", email=" + email + '}';
    }
    
    
    
}
