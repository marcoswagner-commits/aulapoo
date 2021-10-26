package poligono;


public class Circulo 
{
    //atributos
    public double raioCirc;
    

    
    
    //métodos

    Circulo() {this(0);}
    
    Circulo(double raioCirc) {this.setRaioCirc(raioCirc);} 
    
    public double getRaioCirc() {return raioCirc;}
    
    public void setRaioCirc(double raioCirc) {this.raioCirc = raioCirc;}
    
    @Override
    public String toString()
    {
        return ("Círculo - raio: "+raioCirc+" - área: "+areaCirc());
    }

    
    
    
    public double areaCirc()
    {
        return  (Math.PI * Math.pow(raioCirc, 2));
    }
    
}
