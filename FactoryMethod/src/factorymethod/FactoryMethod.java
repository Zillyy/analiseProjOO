/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author Zilly
 */
public class FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Estacionamento com suas taxas para moto/carro/caminhão
        Estacionamento estacionamento = new Estacionamento(0.53f, 1.25f, 3.65f);
        
        //Factory de veículos
        VeiculoFactory factory = new VeiculoFactory();
        
        //Adicionando veículos ao estacionamento
        estacionamento.adicionaVeiculo(factory.criaVeiculo("moto"));
        estacionamento.adicionaVeiculo(factory.criaVeiculo("moto"));
        estacionamento.adicionaVeiculo(factory.criaVeiculo("caminhao"));
        estacionamento.adicionaVeiculo(factory.criaVeiculo("moto"));
        estacionamento.adicionaVeiculo(factory.criaVeiculo("carro"));
        estacionamento.adicionaVeiculo(factory.criaVeiculo("moto"));
        
        estacionamento.listaVeiculos();
        
        System.out.println("Saída de um veículo que pagará: " + estacionamento.removeVeiculo(2, 4));
        
        estacionamento.listaVeiculos();
        
        System.out.println("Saída de um veículo que pagará: " + estacionamento.removeVeiculo(0, 3.25f));
        
    }
    
}
