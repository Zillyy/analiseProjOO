package pedidoscliente;

/**
 *
 * @author Zilly
 */
public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String razaoSocial;

    public PessoaJuridica(String cnpj, String razaoSocial, String endereco, String fone, String cidade) {
        super(endereco, fone, cidade);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }
    
    @Override
    public void getDados(){
        System.out.println("Endereço: " + this.endereco + "\nFone: " + this.fone + "\nCidade: " + this.cidade + "\nCNPJ: " + this.cnpj + "\nRazão Social: " + this.razaoSocial); 
    }
}
