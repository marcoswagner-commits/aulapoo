/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import java.awt.Dimension;
import javax.swing.JLabel;

/**
 *
 * @author marcos_wagner
 */
public class JStatusBar extends JLabel
{
    
    JStatusBar()
    {
        super("Pronto...");
        
        super.setPreferredSize(new Dimension(100,16));
    }
    
    public void setMessage(String msg)
    {
        this.setText(msg);
               
        
    }
    
}
