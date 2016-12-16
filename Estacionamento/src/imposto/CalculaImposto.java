package imposto;

import estacionamento.Caminhao;
import estacionamento.Estacionamento;

public interface CalculaImposto {
    
    public float calculaTaxaComImposto(Caminhao c, Estacionamento e);
}
