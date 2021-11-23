
package clientes;


public class Cliente {
    
    // atributos
    static int codigo = 0;
    
    private String nome;
    private String cpf;
    private String endereco;
    
    
    // métodos

    public Cliente(String nome, String cpf, String endereco) {
        codigo++;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente código="+codigo+" nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco;
    }
    
    
}
