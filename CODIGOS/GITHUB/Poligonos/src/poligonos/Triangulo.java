package poligono;


public class Triangulo
{
    
    // atributos -- com encapsulamento
    private int base;
    private int altura;
    
    //métodos
    // == construtores == //
    Triangulo () {this(0,0);}
    Triangulo (int base, int altura) { setBase(base); setAltura(altura); }
      
    // == getters e setters == //
    public void setBase(int base) {this.base = base;}
    public void setAltura(int altura) {this.altura = altura;}
    
    private int getBase() {return base;}
    private int getAltura() {return altura;}
    
    // == toString == //
    @Override
    public String toString()
    {
        return ("Triângulo: Base=" +getBase()+" - Altura="+getAltura()+" - Área="+getArea());
    }
    
    // == métodos específicos == //
    private double getArea()  { return (getBase() * getAltura() / 2.0);  }
    
}
