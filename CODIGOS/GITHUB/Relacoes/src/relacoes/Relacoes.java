package relacoes;

import relacoes.vendas.Comprador;
import relacoes.vendas.Venda;
import relacoes.vendas.Vendedor;

public class Relacoes {

    public static void main(String[] args) {
        
//        Carro carro = new Carro("Branco",
//                new Pneu(225,60,18,32),
//                new Pneu(225,60,18,32),
//                new Pneu(225,60,18,32),
//                new Pneu(225,60,18,32));
//        System.out.println(carro);
        
   
//        ContaCorrente contas[] = new ContaCorrente[2];
//        contas[0] = new ContaCorrente("001",1050,1500); 
//        contas[1] = new ContaCorrente("002",1051,2500);
//        
//        Poupanca poupancas[] = new Poupanca[2];
//        poupancas[0] = new Poupanca("001",10501,15000); 
//        poupancas[1] = new Poupanca("001",10502,17000);
//        
//        Banco banco = new Banco("CEF",contas, poupancas);
//        System.out.println(banco);

          Vendedor vendedor = new Vendedor();
          Comprador comprador = new Comprador();
          Venda venda = new Venda();
          System.out.println(venda);
        
    }
    
}
