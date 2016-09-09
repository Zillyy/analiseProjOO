package pedidoscliente;

/**
 *
 * @author Zilly
 */
public abstract class Cliente {
    protected String endereco;
    protected String fone;
    protected String cidade;

    public Cliente(String endereco, String fone, String cidade) {
        this.endereco = endereco;
        this.fone = fone;
        this.cidade = cidade;
    }
    
    public abstract void getDados();
}
