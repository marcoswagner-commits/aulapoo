/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligono;

/**
 *
 * @author marcos_wagner
 */
public class Quadrado extends Retangulo
{

    Quadrado()
    {
        this(0);
    }
    
    Quadrado(int lado) 
    {
         super(lado,lado);
    }
    
    public void setLado(int lado)
    {
        super.setLado1(lado);
        super.setLado2(lado);
    }
    
    @Override
    public String toString()
    {
        return "Quadrado: Lado = "+super.getLado1()+" - Área = "+super.calculaArea();
    }
}
