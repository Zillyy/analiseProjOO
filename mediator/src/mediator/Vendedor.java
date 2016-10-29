package mediator;

/**
 *
 * @author Zilly
 */
public class Vendedor extends Colleague {
    
    private float precoVenda;

    public Vendedor(Mediator m, float precoVenda) {
        super(m);
        this.precoVenda = precoVenda;
    }
    
    public boolean aceitaOferta(float oferta){
        return oferta >= precoVenda;
    }
    
}
