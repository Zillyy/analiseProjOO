package pagamento;

public interface PagamentoCommand {
    
    void processarCompra(NotaFiscal nota);
}
