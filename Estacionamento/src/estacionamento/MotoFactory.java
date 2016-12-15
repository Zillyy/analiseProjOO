package estacionamento;

/**
 *
 * @author Zilly
 */
public class MotoFactory implements VeiculoFactory {

    private static MotoFactory instancia;

    private MotoFactory() { }
    
    public static synchronized MotoFactory getInstance(){
        if(instancia == null) {
            instancia = new MotoFactory();
        }
        return instancia;
    }
    
    @Override
    public Veiculo criaVeiculo() {
        return new Moto();
    }
    
}
