package pedidoscliente;

/**
 *
 * @author Zilly
 */
public class Produto {
    private int cod;
    private String descricao;
    private float precoUnit;

    public Produto(int cod, String descricao, float precoUnit) {
        this.cod = cod;
        this.descricao = descricao;
        this.precoUnit = precoUnit;
    }

    public float getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(float precoUnit) {
        this.precoUnit = precoUnit;
    }
}
