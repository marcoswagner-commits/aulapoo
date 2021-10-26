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
public class TrianguloG 
{
    
    //atributos//
    protected double base;
    protected double lado1;
    protected double lado2;
    
    // construtores //
    public TrianguloG(double base, double lado1, double lado2) {
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    // gets//
    public double getBase() {
        return base;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }
        
    // sets//
    
    public void setBase(double base) {
        this.base = base;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    // toString //
    
    @Override
    public String toString() 
    {
        return "Triangulo -" + "base=" + base + ", lado1=" + lado1 + ", lado2=" + lado2 + ", área="+calculaArea();
    }
    
    
    // método específico para calcular a área //

    public double calculaArea()
    {
        if (this instanceof TriangEqu) System.out.println("Equilátero");
        else if (this instanceof TriangIso ) System.out.println("Isósceles");
        else if (this instanceof TriangEsc ) System.out.println("Escaleno");
        
        double sp = (base + lado1 + lado2) / 2.0;
        if (this instanceof TriangEqu)
            return (Math.pow(this.lado1,2)*Math.sqrt(3)/4);
        else if (this instanceof TriangIso)
            return (base * (Math.sqrt(Math.pow(lado1,2)-Math.pow((base/2.0),2)))/2.0 );
        else if (this instanceof TriangEsc)
            return (Math.sqrt(sp * (sp-base)*(sp-lado1)*(sp-lado2)));
        else  return 0;
    }

    

    

    
    
}
