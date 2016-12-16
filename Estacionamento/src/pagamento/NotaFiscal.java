package pagamento;

public class NotaFiscal {
    
    private static int CONTADOR_ID;
    private int idNotaFiscal;
    private float valorTotal;

    public NotaFiscal() {
        idNotaFiscal = ++CONTADOR_ID;
    }

    public void setValor(float valor) {
        this.valorTotal = valor;
    }

    public String getInfoNota() {
        return "Nota fiscal nº: " + idNotaFiscal + " Valor: " + valorTotal;
    }
}
