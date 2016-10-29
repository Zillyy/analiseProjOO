package mediator;

/**
 *
 * @author Zilly
 */
public class Comprador extends Colleague {
    
    private float precoOferta;
    private String unidade;

    public Comprador(Mediator m, float precoOferta, String unidade) {
        super(m);
        this.precoOferta = precoOferta;
        this.unidade = unidade;
    }
    
    public void proporOferta() {
        System.out.println("Oferta inicial de " + precoOferta + " " + unidade);
        while(!mediator.proporOferta(precoOferta, unidade)){
            System.out.println("Oferta de " + precoOferta + " " + unidade + " recusada!");
            
            if(unidade.equals("reais")) precoOferta += 3f;
            else precoOferta += 1.5f;
        }
        System.out.println("Oferta de " + precoOferta + " " + unidade + " aceita!");
    }
    
}
