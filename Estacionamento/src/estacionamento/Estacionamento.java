package estacionamento;

import java.util.ArrayList;
import memento.*;
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
    
    //Memento
    private EstacionamentoCareTaker caretaker;
    
    public Estacionamento(float taxaMoto, float taxaCarro, float taxaCaminhao) {
        this.taxaMoto = taxaMoto;
        this.taxaCarro = taxaCarro;
        this.taxaCaminhao = taxaCaminhao;
        veiculos = new ArrayList<>();
        caretaker = new EstacionamentoCareTaker();
    }
    
    public float getTaxaMoto() {
        return taxaMoto;
    }

    public float getTaxaCarro() {
        return taxaCarro;
    }

    public float getTaxaCaminhao() {
        return taxaCaminhao;
    }
    
    public void adicionaVeiculo(Veiculo v){
        veiculos.add(v);
    }
    
    public Veiculo retornaVeiculo(int id){
        return veiculos.get(id);
    }
    
    public void removeVeiculo(int id, float numHoras, PagamentoCommand formaDePagamento){
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
            //Cálculo do novo valor da taxa com base em numEixos e pesoTon
            Caminhao c = (Caminhao) v;
            valor = (float) c.calculaTaxaComImposto(this) * numHoras;
            System.out.println("Caminhão saindo -----");
        } else {
            throw new RuntimeException("Classe não existente!");
        }
        
        //Emissão de nota fiscal
        NotaFiscal nota = new NotaFiscal();
        nota.setValor(valor);
        formaDePagamento.processarCompra(nota);
    }
    
    //Lista veículos
    public void listaVeiculos(){
        int i = 0;
        System.out.println("Veículos no estacionamento:");
        for(Veiculo v : veiculos){
            System.out.print(++i + ": ");
            v.getInfo();
            
        }
    }
    
    //Métodos de Memento de Estacionamento
    public void salvarEstado() {
        ArrayList<Veiculo> a = (ArrayList<Veiculo>) veiculos.clone();
        caretaker.adicionarMemento(new EstacionamentoMemento(taxaMoto, taxaCarro, taxaCaminhao, a));
    }

    public void voltarEstado() {
        EstacionamentoMemento em = caretaker.getUltimoEstadoSalvo();
        this.taxaMoto = em.getEstadoTaxaMoto();
        this.taxaCarro = em.getEstadoTaxaCarro();
        this.taxaCaminhao = em.getEstadoTaxaCaminhao();
        this.veiculos = em.getEstadoVeiculos();
    }
}
