package estacionamento;

/**
 *
 * @author Zilly
 */
public class CaminhaoFactory implements VeiculoFactory {

    private static CaminhaoFactory instancia;

    private CaminhaoFactory() { }
    
    public static synchronized CaminhaoFactory getInstance(){
        if(instancia == null) {
            instancia = new CaminhaoFactory();
        }
        return instancia;
    }
    
    @Override
    public Veiculo criaVeiculo() {
        return new Caminhao();
    }
    
}