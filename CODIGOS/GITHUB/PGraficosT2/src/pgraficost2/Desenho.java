/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgraficost2;

import java.awt.Font;
import java.awt.Graphics;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;

/**
 *
 * @author marcos_wagner
 */
public class Desenho extends JComponent implements Runnable
{
    
    private Calendar hora; 
    
    Desenho()
    {
        new Thread(this).start();
    }
    
    public void paint(Graphics g)
    {
        g.setFont(new Font("Arial",Font.BOLD,16));
        g.drawString(horas(),5,20);
    }
    
    
    private String horas()
    {
        hora = Calendar.getInstance();
        int hh = hora.get(Calendar.HOUR_OF_DAY);
        int mm = hora.get(Calendar.MINUTE);
        int ss = hora.get(Calendar.SECOND);
        
        return ((hh < 10) ? "0" : "") + hh + ":" +
                  ((mm < 10) ? "0" :  "") + mm + ":" +
                  ((ss < 10) ? "0" :  "") + ss;
    }

    @Override
    public void run() 
    {
        while(true)
        {
            try {
                Thread.sleep(1000);
                repaint();
            } catch (InterruptedException ex) {
                Logger.getLogger(Desenho.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
    }
    
}
