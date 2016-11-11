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
public class CarroFactory extends VeiculoFactory {

    @Override
    public Veiculo criaVeiculo(int numeroRodas, int numeroEixos, int ano, String marca, String modelo, String cor, String placa, String chassi, float peso) {
        return new Carro(ano, marca, modelo, cor, placa, chassi);
    }
    
}
