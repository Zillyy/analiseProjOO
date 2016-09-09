package pedidoscliente;

/**
 *
 * @author Zilly
 */
public class PessoaFisica extends Cliente {
    private String cpf;
    private String nome;

    public PessoaFisica(String cpf, String nome, String endereco, String fone, String cidade) {
        super(endereco, fone, cidade);
        this.cpf = cpf;
        this.nome = nome;
    }
    
    @Override
    public void getDados() {
        System.out.println("Endereço: " + this.endereco + "\nFone: " + this.fone + "\nCidade: " + this.cidade + "\nCPF: " + this.cpf + "\nNome: " + this.nome + "\n"); 
    }
}
