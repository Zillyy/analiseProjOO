package pedidoscliente;

/**
 *
 * @author Zilly
 */
public class ItemPedido {
    private int quantidade;
    private float valor;
    private Produto produto;

    public ItemPedido(int quantidade, float valor, Produto produto) {
        this.quantidade = quantidade;
        this.valor = valor;
        this.produto = produto;
    }

    public void getQuantidade() {
        System.out.println("Quantidade: " + this.quantidade);
    }
}
