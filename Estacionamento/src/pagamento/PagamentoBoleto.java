package pagamento;

public class PagamentoBoleto implements PagamentoCommand {

    @Override
    public void processarCompra(NotaFiscal nota) {
        System.out.println("Boleto criado: " + nota.getInfoNota());
    }
}
