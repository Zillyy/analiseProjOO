package estacionamento;

import java.util.ArrayList;
import pagamento.*;

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
    
    public float removeVeiculo(int id, float numHoras, PagamentoCommand formaDePagamento){
        Veiculo v = veiculos.get(id);
        veiculos.remove(id);
        
        float valor = 0f;
        
        if(v instanceof Moto){
            valor = (float) taxaMoto * numHoras;
            System.out.println("Moto saindo -----");
        } else if(v instanceof Carro){
            valor = (float) taxaCarro * numHoras;
            System.out.println("Carro saindo -----");
        } else if(v instanceof Caminhao){
            valor = (float) taxaCaminhao * numHoras;
            System.out.println("Caminhão saindo -----");
        }
        
        NotaFiscal nota = new NotaFiscal();
        nota.setValor(valor);
        formaDePagamento.processarCompra(nota);
        
        return valor;
    }
    
    
    public void listaVeiculos(){
        int i = 0;
        System.out.println("Veículos no estacionamento:");
        for(Veiculo v : veiculos){
            System.out.print(++i + ": ");
            v.getInfo();
            
        }
    } 
}
