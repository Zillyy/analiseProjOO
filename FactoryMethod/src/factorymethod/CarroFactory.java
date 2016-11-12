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
public class CarroFactory implements VeiculoFactory {

    @Override
    public Veiculo criaVeiculo() {
        return new Carro();
    }
    
}
