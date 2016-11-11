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
public class Caminhao extends Veiculo {
    
    private float peso;
    
    public Caminhao(int numeroRodas, int numeroEixos, int ano, String marca, String modelo, String cor, String placa, String chassi, float peso) {
        super(numeroRodas, numeroEixos, ano, marca, modelo, cor, placa, chassi);
        this.peso = peso;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Possuo peso: " + this.peso + " toneladas.");
    }

    public float getPeso() {
        return peso;
    }
    
}
