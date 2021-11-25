/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficot1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author marcos_wagner
 */
public class Janela extends JFrame implements ActionListener, MouseListener 
{
    
    private JPopupMenu popup;
    private JMenu menuForma;
    private JMenu menuCor;
    
    private JMenuItem menuForma1;
    private JMenuItem menuForma2;
    private JMenuItem menuForma3;
    
    private JMenuItem menuCor1;
    private JMenuItem menuCor2;
    private JMenuItem menuCor3;
    
    private Desenho desenho;
    private int tipoForma=1;
    private int tipoCor=1;
    
    Janela()
    {
        
        popup = new JPopupMenu();
        menuForma = new JMenu("Forma");
        menuCor = new JMenu("Cor");
        
        menuForma1 = new JMenuItem("Retângulo");
        menuForma2 = new JMenuItem("Círculo");
        menuForma3 = new JMenuItem("Triângulo");
        
        menuCor1 = new JMenuItem("Preto");
        menuCor2 = new JMenuItem("Vermelho");
        menuCor3 = new JMenuItem("Azul");
        
        menuForma.add(menuForma1); 
        menuForma.add(menuForma2);
        menuForma.add(menuForma3);
        
        menuCor.add(menuCor1);
        menuCor.add(menuCor2);
        menuCor.add(menuCor3);
        
        popup.add(menuForma);
        popup.add(menuCor);
        
        this.addMouseListener(this);
        menuForma1.addActionListener(this);
        menuForma2.addActionListener(this);
        menuForma3.addActionListener(this);
        menuCor1.addActionListener(this);
        menuCor2.addActionListener(this);
        menuCor3.addActionListener(this);
        
        
        desenho = new Desenho(tipoForma, tipoCor);
        this.add(desenho);
        
        this.setTitle("Desenhando");
        this.setSize(200,200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == menuForma1)
            tipoForma = 1;
        else if (e.getSource() == menuForma2)
            tipoForma = 2;
        else if (e.getSource() == menuForma3)
            tipoForma = 3;
            
        if (e.getSource() == menuCor1)
            tipoCor = 1;
        else if (e.getSource() == menuCor2)
            tipoCor = 2;
        else if (e.getSource() == menuCor3)
            tipoCor = 3;
         
        desenho.setForma(tipoForma);
        desenho.setCor(tipoCor);
    }

    @Override
    public void mouseClicked(MouseEvent e) 
    {
      if (e.getButton() == MouseEvent.BUTTON3)
          popup.show(this, 50,50);
          
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    
    

    
}
