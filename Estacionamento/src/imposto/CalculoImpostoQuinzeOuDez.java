package imposto;

import estacionamento.Caminhao;
import estacionamento.Estacionamento;

public class CalculoImpostoQuinzeOuDez implements CalculaImposto {

    @Override
    public float calculaTaxaComImposto(Caminhao c, Estacionamento e) {
         if (c.getPesoTon() > 10) {
            return e.getTaxaCaminhao() * 1.15f;
        }
        return e.getTaxaCaminhao()* 1.10f;
    }
}
