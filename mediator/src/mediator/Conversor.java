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
        float convertido = 0f;
        if(unidade.equals("reais")){
            convertido = quantia * razaoReal;
        }
        else {
            convertido = quantia * razaoEuro;
        }
        System.out.println("Convertendo " + quantia + " " + unidade + " para " + convertido + " dolares");
        return convertido;
    }
    
}
