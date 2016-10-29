package mediator;

/**
 *
 * @author Zilly
 */
public class Aplicativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MediatorTransacao mediatorTransacao = new MediatorTransacao();
        
        Conversor conversorDolar = new Conversor(mediatorTransacao);
        
        Comprador compradorBrasil = new Comprador(mediatorTransacao, 12f, "reais");
        Comprador compradorFranca = new Comprador(mediatorTransacao, 3f, "euros");
        Vendedor vendedorEua = new Vendedor(mediatorTransacao, 10f);
        
        mediatorTransacao.addContato(compradorBrasil);
        mediatorTransacao.addContato(compradorFranca);
        mediatorTransacao.addContato(vendedorEua);
        
        mediatorTransacao.addConversor(conversorDolar);
        
        compradorBrasil.proporOferta();
        System.out.println("----------");
        compradorFranca.proporOferta();
    }
    
}
