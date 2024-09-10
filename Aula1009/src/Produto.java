public class Produto {
    private int id;
    private Estoque estoque;
    private String descricao;
    private double preco;

    public Produto(int id, int quantidade, String descricao, double preco) {
        this.id = id;
        this.estoque = new Estoque(quantidade);
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean disponivel(){
        if (this.estoque.getQuantidade() > 0){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id +
                ", Estoque=" + estoque +
                ", Descricao='" + descricao + '\'' +
                ", reco=" + preco +
                '}';
    }
}
