package estacionamento;

import stopwatch.Stopwatch;

/**
 *
 * @author Zilly
 */
public class Cliente {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        Thread.sleep(5000);
        
        //Estacionamento com suas taxas para moto/carro
        Estacionamento estacionamento = new Estacionamento(0.53f, 1.25f);
        
        //Factory de veículos
        VeiculoFactory factory;
        
        //Adicionando motos ao estacionamento
        factory = MotoFactory.getInstance();
        estacionamento.adicionaVeiculo(factory.criaVeiculo());
        estacionamento.adicionaVeiculo(factory.criaVeiculo());
        
        //Adicionando carros ao estacionamento
        factory = CarroFactory.getInstance();
        estacionamento.adicionaVeiculo(factory.criaVeiculo());
        estacionamento.adicionaVeiculo(factory.criaVeiculo());
        
        estacionamento.listaVeiculos();
        
        System.out.println("Saída de um veículo que pagará: " + estacionamento.removeVeiculo(2, 4));
        
        estacionamento.listaVeiculos();
        
        System.out.println("Saída de um veículo que pagará: " + estacionamento.removeVeiculo(0, 3));
        
        System.out.println(stopwatch.stop());
    }
    
}
