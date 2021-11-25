/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficot1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JComponent;

/**
 *
 * @author marcos_wagner
 */
public class Desenho extends JComponent
{
    
    private int tipoForma;
    private int tipoCor;

    public Desenho(int tipoForma, int tipoCor) {
        this.tipoForma = tipoForma;
        this.tipoCor = tipoCor;
    }

    public void setForma(int tipoForma) {
        this.tipoForma = tipoForma;
        repaint();
    }

    public void setCor(int tipoCor) {
        this.tipoCor = tipoCor;
        repaint();
    }
    
    
    
    @Override
    public void paint(Graphics g)
    {
        switch (this.tipoCor) {
            case 1:
                g.setColor(Color.black);
                break;
            case 2:
                g.setColor(Color.red);
                break;
            case 3:
                g.setColor(Color.blue);
                break;
            default:
                break;
        }
        
        switch (this.tipoForma) {
            case 1:
                g.fillRect(10,10,30,30);
                break;
            case 2:
                g.fillOval(10,10,30,30);
                break;
            case 3:
                Polygon p = new Polygon();
                p.addPoint(20,10);p.addPoint(10, 30); p.addPoint(30,30);
                g.fillPolygon(p);
                break;
            default:
                break;
        }
        
        
    }
}
