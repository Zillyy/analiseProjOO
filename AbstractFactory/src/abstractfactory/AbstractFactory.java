package abstractfactory;

public class AbstractFactory {
    
    public static void main(String[] args) {
        //Fábrica Fiat
        FabricaCarro fabrica = new FabricaFiat();
        CarroSedan sedan = fabrica.criarCarroSedan();
        CarroHatch hatch = fabrica.criarCarroHatch();
        
        //Carros Fiat
        sedan.exibirInfoSedan();
        hatch.exibirInfoHatch();
        
        //Fábrica Ford
        fabrica = new FabricaFord();
        sedan = fabrica.criarCarroSedan();
        hatch = fabrica.criarCarroHatch();
        
        //Carros Ford
        sedan.exibirInfoSedan();
        hatch.exibirInfoHatch();
    }
}
