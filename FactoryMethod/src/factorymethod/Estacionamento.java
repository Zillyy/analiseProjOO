/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

import java.util.ArrayList;

/**
 *
 * @author Zilly
 */
public class Estacionamento {
    
    private float taxaMoto;
    private float taxaCarro;
    private float taxaCaminhao;
    
    private ArrayList<Veiculo> veiculos;
    
    public Estacionamento(float taxaMoto, float taxaCarro, float taxaCaminhao) {
        this.taxaMoto = taxaMoto;
        this.taxaCarro = taxaCarro;
        this.taxaCaminhao = taxaCaminhao;
        veiculos = new ArrayList<>();
    }
    
    public void adicionaVeiculo(Veiculo v){
        veiculos.add(v);
    }
    
    public float removeVeiculo(int id, float numHoras){
        Veiculo v = veiculos.get(id);
        veiculos.remove(id);
        
        if(v instanceof Moto){
            return taxaMoto * numHoras;
        } else if(v instanceof Carro){
            return taxaCarro * numHoras;
        } else if(v instanceof Caminhao){
            return taxaCaminhao * numHoras;
        }
        return 0;
        
    }
    
    public void listaVeiculos(){
        for(Veiculo v : veiculos){
            v.getInfo();
        }
    }
    
}
