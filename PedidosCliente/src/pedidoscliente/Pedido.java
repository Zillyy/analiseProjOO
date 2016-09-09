package pedidoscliente;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Zilly
 */
public class Pedido {
    private Date data;
    private String hora;
    private Cliente cliente;
    private ArrayList<ItemPedido> itensPedido;

    public Pedido(Date data, String hora, Cliente cliente, ArrayList<ItemPedido> itensPedido) {
        this.data = data;
        this.hora = hora;
        this.cliente = cliente;
        this.itensPedido = itensPedido;
    }
    
    public void getDados(){
        System.out.println("Data:" + this.data + "\nHora: " + this.hora + "\nItens do pedido: ");
        for (ItemPedido itensPedido1 : this.itensPedido) {
            itensPedido1.getQuantidade();
        }
    }
    
}
