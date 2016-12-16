package memento;

import estacionamento.Veiculo;
import java.util.ArrayList;

public class EstacionamentoMemento {

    private float estadoTaxaMoto;
    private float estadoTaxaCarro;
    private float estadoTaxaCaminhao;
    
    private ArrayList<Veiculo> estadoVeiculos;

    public EstacionamentoMemento(float estadoTaxaMoto, float estadoTaxaCarro, float estadoTaxaCaminhao, ArrayList<Veiculo> estadoVeiculos) {
        this.estadoTaxaMoto = estadoTaxaMoto;
        this.estadoTaxaCarro = estadoTaxaCarro;
        this.estadoTaxaCaminhao = estadoTaxaCaminhao;
        this.estadoVeiculos = new ArrayList<>();
        this.estadoVeiculos = estadoVeiculos;
    }

    public float getEstadoTaxaMoto() {
        return estadoTaxaMoto;
    }

    public float getEstadoTaxaCarro() {
        return estadoTaxaCarro;
    }

    public float getEstadoTaxaCaminhao() {
        return estadoTaxaCaminhao;
    }

    public ArrayList<Veiculo> getEstadoVeiculos() {
        return estadoVeiculos;
    }
}
