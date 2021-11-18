
package relacoes;


public class Banco {
    //atributos
    String nome;
    ContaCorrente contas[];
    Poupanca poupancas[];

    public Banco(String nome, ContaCorrente[] contas, Poupanca[] poupancas) {
        this.nome = nome;
        this.contas = contas;
        this.poupancas = poupancas;
        
        
    }

    @Override
    public String toString() {
        String contasStr = "";
        for(int i=0;i<contas.length;i++) {
            contasStr = contasStr +" "+contas[i].toString();
        }
        return "Banco{" + "nome=" + nome + ", contas=" + contasStr + ", poupancas=" + poupancas + '}';
    }
    
    
    
    
}

class Conta {
    //atributos
    String agencia;
    int numero;
    double saldo;

    public Conta(String agencia, int numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }
    
    

    @Override
    public String toString() {
        return "Conta{" + "agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + '}';
    }
    
    
    
}
class ContaCorrente extends Conta {
    
    public ContaCorrente(String agencia, int numero, double saldo) {
        super(agencia, numero, saldo);
    }
    
      
}

class Poupanca extends Conta {
    
    public Poupanca(String agencia, int numero, double saldo) {
        super(agencia, numero, saldo);
    }
    
    
}