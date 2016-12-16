package memento;

import java.util.ArrayList;

public class EstacionamentoCareTaker {

    private ArrayList<EstacionamentoMemento> estados;

    public EstacionamentoCareTaker() {
        estados = new ArrayList<>();
    }

    public void adicionarMemento(EstacionamentoMemento memento) {
        estados.add(memento);
    }

    public EstacionamentoMemento getUltimoEstadoSalvo() {
        if (estados.size() <= 0) {
            throw new RuntimeException("Não é possível retornar a estados anteriores de Estacionamento!");
        }
        EstacionamentoMemento estadoSalvo = estados.get(estados.size() - 1);
        estados.remove(estados.size() - 1);
        return estadoSalvo;
    }
}
