package estacionamento;

/**
 *
 * @author Zilly
 */
public class CarroFactory implements VeiculoFactory {

    private static CarroFactory instancia;

    private CarroFactory() { }
    
    public static synchronized CarroFactory getInstance(){
        if(instancia == null) {
            instancia = new CarroFactory();
        }
        return instancia;
    }
    
    @Override
    public Veiculo criaVeiculo() {
        return new Carro();
    }
    
}
