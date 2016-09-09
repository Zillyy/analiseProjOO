package pedidoscliente;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Zilly
 */
public class PedidosCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PessoaFisica eu = new PessoaFisica("1234567890", "Luis Henrique", "Rua Ernesto Nazareth", "123456789", "Santa Maria");
        eu.getDados();
        
        Produto caneta = new Produto(890, "Caneta Bic", 1.25f);
        Produto celular = new Produto(652, "Celular Loco", 895.50f);
        
        ItemPedido canetaItem = new ItemPedido(25, 1.20f, caneta);
        ItemPedido celularItem = new ItemPedido(10, 800.24f, celular);
        
        ArrayList<ItemPedido> itensPedido = new ArrayList();
        
        itensPedido.add(canetaItem);
        itensPedido.add(celularItem);
        
        Pedido pedido = new Pedido(new Date(), "14:30", eu, itensPedido);
        pedido.getDados();
        
    }
    
}
