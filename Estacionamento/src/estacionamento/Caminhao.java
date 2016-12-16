package estacionamento;

import imposto.*;

/**
 *
 * @author Zilly
 */
public class Caminhao implements Veiculo {
    
    private int numEixos;
    private int pesoTon;
    private CalculaImposto imposto;

    public int getNumEixos() {
        return numEixos;
    }

    public void setNumEixos(int numEixos) {
        this.numEixos = numEixos;
    }

    public int getPesoTon() {
        return pesoTon;
    }

    public void setPesoTon(int pesoTon) {
        this.pesoTon = pesoTon;
    }

    public void setImposto() {
        if(numEixos > 4) imposto = new CalculoImpostoVinteOuQuinze();
        else imposto = new CalculoImpostoQuinzeOuDez();
    }
    
    public float calculaTaxaComImposto(Estacionamento e){
        return imposto.calculaTaxaComImposto(this, e);
    }
    
    @Override
    public void getInfo() {
        System.out.println("Este objeto é um caminhão.");
    }
}
