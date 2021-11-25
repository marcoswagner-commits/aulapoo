/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgraficost2;

import javax.swing.JFrame;

/**
 *
 * @author marcos_wagner
 */
public class Janela extends JFrame
{
    
    Janela()
    {
       
       this.add(new Desenho()); 
        
       this.setUndecorated(true);
       
       this.setSize(80,30);
       this.setLocationRelativeTo(null);
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    
}
