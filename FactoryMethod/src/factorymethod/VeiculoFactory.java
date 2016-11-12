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
public class VeiculoFactory {
    
    public Veiculo criaVeiculo(String tipoVeiculo){
        if(tipoVeiculo.equalsIgnoreCase("carro")){
            return new Carro();
        } else if(tipoVeiculo.equalsIgnoreCase("moto")){
            return new Moto();
        } else if(tipoVeiculo.equalsIgnoreCase("caminhao")){
            return new Caminhao();
        } else {
            return null;
        }
    }
}
