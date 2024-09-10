public class Estoque {
    private int quantidade;

    public Estoque(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Temos " + quantidade + " em estoque";
    }
}
