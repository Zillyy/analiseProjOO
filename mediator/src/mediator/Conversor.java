package mediator;

/**
 *
 * @author Zilly
 */
public class Conversor extends Colleague {
    
    private static final float razaoEuro = 1.0986f;
    private static final float razaoReal = 0.312047f;

    public Conversor(Mediator m) {
        super(m);
    }
    
    public float converteParaDolar(float quantia, String unidade){
        if(unidade.equals("reais")) return quantia * razaoReal;
        else return quantia * razaoEuro;
    }
    
}
