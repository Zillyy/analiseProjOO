package estacionamento;

import java.util.ArrayList;

/**
 *
 * @author Zilly
 */
public class Estacionamento {
    
    private float taxaMoto;
    private float taxaCarro;
    
    private ArrayList<Veiculo> veiculos;
    
    public Estacionamento(float taxaMoto, float taxaCarro) {
        this.taxaMoto = taxaMoto;
        this.taxaCarro = taxaCarro;
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
        }
        return 0;
        
    }
    
    public void listaVeiculos(){
        for(Veiculo v : veiculos){
            v.getInfo();
        }
    }
    
}
