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
public class Cilindro
{
    
    //atributos
    private Circulo circulo;
    private double altura;

    // construtor
    public Cilindro(double raio, double altura) 
    {
        this.circulo = new Circulo(raio);
        this.altura = altura;
    }

   // gets
    public Circulo getCirculo() {
        return circulo;
    }

    public double getAltura() {
        return altura;
    }
   
    // sets
    public void setCirculo(Circulo circulo) {
        this.circulo = circulo;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Cilindro - raio=" + circulo.getRaioCirc() + ", altura=" + altura + " volume: "+ getVolume() ;
    }
    

    // método específico
    private double getVolume()
    {
        
        return (circulo.areaCirc() * altura);
    }
    
    
    
    
    
    
    
    
    
    
    
}
