package abstractfactory;

public class FabricaFord implements FabricaCarro {

    @Override
    public CarroSedan criarCarroSedan() {
        return new Fusion();
    }

    @Override
    public CarroHatch criarCarroHatch() {
        return new Fiesta();
    }
}
