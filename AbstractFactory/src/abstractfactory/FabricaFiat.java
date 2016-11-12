package abstractfactory;

public class FabricaFiat implements FabricaCarro {

    @Override
    public CarroSedan criarCarroSedan() {
        return new Siena();
    }

    @Override
    public CarroHatch criarCarroHatch() {
        return new Palio();
    }
}
