package imposto;

import estacionamento.Caminhao;
import estacionamento.Estacionamento;

public class CalculoImpostoVinteOuQuinze implements CalculaImposto {
    
    @Override
    public float calculaTaxaComImposto(Caminhao c, Estacionamento e) {
        if (c.getPesoTon() > 15) {
            return e.getTaxaCaminhao() * 1.2f;
        }
        return e.getTaxaCaminhao()* 1.15f;
    }
}
