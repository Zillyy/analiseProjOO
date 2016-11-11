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
public class Carro extends Veiculo {

    public Carro(int ano, String marca, String modelo, String cor, String placa, String chassi) {
        super(4, 2, ano, marca, modelo, cor, placa, chassi);
    }
    
}
