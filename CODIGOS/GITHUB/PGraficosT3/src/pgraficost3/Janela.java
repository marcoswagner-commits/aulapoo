/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgraficost3;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author marcos_wagner
 */
public class Janela extends JFrame implements KeyListener
{
    private Desenho desenho;
     
    Janela()
    {
        desenho = new Desenho(1, Color.red);
        
        this.add(desenho);
        
        this.addKeyListener(this);
        
        this.setTitle("Desenhos...");
        this.setSize(300,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) 
    {
        if (e.getKeyCode() == KeyEvent.VK_UP)
            desenho.setForma(2);
        else if (e.getKeyCode() == KeyEvent.VK_DOWN)
            desenho.setForma(1);
        
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            desenho.setCor(Color.blue);
        else if (e.getKeyCode() == KeyEvent.VK_LEFT)
            desenho.setCor(Color.red);
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}
