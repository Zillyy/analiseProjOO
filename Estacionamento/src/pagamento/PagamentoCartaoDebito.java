package pagamento;

public class PagamentoCartaoDebito implements PagamentoCommand {

    @Override
    public void processarCompra(NotaFiscal nota) {
        System.out.println("Compra debitada: " + nota.getInfoNota());
    }
}
