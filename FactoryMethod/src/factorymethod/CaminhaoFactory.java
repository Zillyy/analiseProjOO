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
public class CaminhaoFactory extends VeiculoFactory {

    @Override
    public Veiculo criaVeiculo(int numeroRodas, int numeroEixos, int ano, String marca, String modelo, String cor, String placa, String chassi, float peso) {
        return new Caminhao(numeroRodas, numeroEixos, ano, marca, modelo, cor, placa, chassi, peso);
    }
    
}
