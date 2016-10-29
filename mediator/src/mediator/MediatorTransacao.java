package mediator;

import java.util.ArrayList;

/**
 *
 * @author Zilly
 */
public class MediatorTransacao implements Mediator {
    
    private ArrayList<Colleague> contatos;
    private Conversor conversor;

    public MediatorTransacao() {
        contatos = new ArrayList<>();
    }
    
    public void addContato(Colleague colleague){
        contatos.add(colleague);
    }
    
    public void addConversor(Conversor c){
        conversor = c;
    }

    @Override
    public boolean proporOferta(float precoOferta, String unidade) {
        float ofertaEmDolar = conversor.converteParaDolar(precoOferta, unidade);
        
        for (int i = 0; i < contatos.size(); i++) {
            if(contatos.get(i).getClass() == Vendedor.class){
                Vendedor vendedor = (Vendedor) contatos.get(i);
                if(vendedor.aceitaOferta(ofertaEmDolar)) return true;
                else return false;
            }
        }
        return false;
    }

}
