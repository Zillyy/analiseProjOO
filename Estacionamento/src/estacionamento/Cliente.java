package estacionamento;

import pagamento.*;

/**
 *
 * @author Zilly
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Estacionamento com suas taxas para moto/carro/caminhão
        Estacionamento estacionamento = new Estacionamento(0.53f, 1.25f, 2.67f);
        
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
        
        //Salvando Memento do Estacionamento
        estacionamento.salvarEstado();
        
        //Adicionando caminhões ao estacionamento
        factory = CaminhaoFactory.getInstance();
        estacionamento.adicionaVeiculo(factory.criaVeiculo());
        
        Caminhao c = (Caminhao) factory.criaVeiculo();
        c.setNumEixos(8);
        c.setPesoTon(10);
        c.setImposto();
        estacionamento.adicionaVeiculo(c);
        
        estacionamento.listaVeiculos();
        
        //Salvando Memento do Estacionamento
        estacionamento.salvarEstado();
        
        //Removendo veículos
        estacionamento.removeVeiculo(2, 4f, new PagamentoBoleto());
        
        estacionamento.listaVeiculos();
        
        estacionamento.removeVeiculo(0, 3f, new PagamentoCartaoCredito());
        
        estacionamento.listaVeiculos();
        
        estacionamento.removeVeiculo(3, 6f, new PagamentoCartaoDebito());
        
        //Restaurando Memento do Estacionamento
        System.out.println("Restaurando estado do estacionamento -----");
        estacionamento.voltarEstado();
        estacionamento.listaVeiculos();
        
        //Restaurando Memento do Estacionamento
        System.out.println("Restaurando estado do estacionamento -----");
        estacionamento.voltarEstado();
        estacionamento.listaVeiculos();
        
    }
    
}
