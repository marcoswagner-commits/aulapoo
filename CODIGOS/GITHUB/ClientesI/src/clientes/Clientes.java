/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import javax.swing.JOptionPane;

/**
 *
 * @author marcos_wagner
 */
public class Clientes {

    static List<Cadastro> clientes = new ArrayList<Cadastro>();
    
    static void inserirClientes(String nome)
    {
        Cadastro c = new Cadastro(nome);
        clientes.add(c);
    }
    
    public static int tamanho(Supplier<Integer> s) 
    {
    return s.get();
    }   
    
    public static void main(String[] args) throws IOException 
    {
             
//        int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Clientes:"));
//        for (int i=0; i<qtd; i++) inserirClientes(JOptionPane.showInputDialog("Cliente "+Cadastro.codigoStatic));
//        
//        int opt = 1;
//        
//  
//        
//        for (Cadastro cliente : clientes) 
//                JOptionPane.showMessageDialog(null, cliente);
        
//        Cadastro c1 = new Cadastro("Marcos");
//        Cadastro c2 = new Cadastro("Wagner");
//       
//        
//        System.out.println(c1);
//        System.out.println(c2);
        
        new Interface();
        
        
      


        
                         
//          
         
        
        
    }
    
}
