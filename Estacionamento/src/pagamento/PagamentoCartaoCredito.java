package pagamento;

public class PagamentoCartaoCredito implements PagamentoCommand {

    @Override
    public void processarCompra(NotaFiscal nota) {
        System.out.println("Compra emitida: " + nota.getInfoNota());
    }
}
