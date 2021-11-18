
package clientes;

public class Principal {

    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Marcos Wagner","123.456.789-10","Rua dos Ribeiro");
        System.out.println(cliente1);
        Cliente cliente2 = new Cliente("Carlos Henrique","123.456.789-10","Rua Vai e Volta");
        System.out.println(cliente2);
        Cliente cliente3 = new Cliente("Daniel de Almeida","123.456.789-10","Rua Sobe e Desce");
        System.out.println(cliente3);
        Cliente cliente4 = new Cliente("Davi Arthur","123.456.789-10","Rua Antenor");
        System.out.println(cliente4);
        
        
        System.out.println(cliente1);
    }
    
}
