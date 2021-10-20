
package poligonos;


public class Retangulo 
{
    private int lado1;
    private int lado2;

     
    Retangulo()
    {
        this(0,0);
    }
    
    Retangulo(int lado1, int lado2)
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public int getLado1()
    {
        return lado1;
    }
    
    public int getLado2()
    {
        return lado2;
    }
    
    public void setLado1(int lado1)
    {
        this.lado1 = lado1;
    }
    
    public void setLado2(int lado2)
    {
        this.lado2 = lado2;
    }
    
    @Override
    public String toString() 
    {
        return ("Retangulo: Lado1="+lado1+" - Lado2="+lado2+" - Área="+calculaArea());
    } 
    
    
    int calculaArea()
    {
        return lado1 * lado2;
    }
    
    
}
