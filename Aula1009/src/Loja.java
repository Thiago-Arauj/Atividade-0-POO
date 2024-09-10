import java.util.ArrayList;

public class Loja {
    private String nome;
    private ArrayList<Produto> produtos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adiciona(Produto p) {
        produtos.add(p);
    }

    public void remove(String p){
        if(!produtos.isEmpty()){
            for (Produto prod: produtos){
                if(prod.getDescricao().equals(p)){
                    produtos.remove(p);
                }
            }
        } else {
            System.out.println("Você não tem estoque");
        }

    }

    public void busca(Produto p){
        if (produtos.contains(p)){
            System.out.println(p);
        } else {
            System.out.println("Não temos esse produto!");
        }
    }

    public void showProdutos() {
        for (Produto p: this.produtos){
            System.out.println(p);
        }
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    @Override
    public String toString() {
        return "Loja{" +
                "nome='" + nome + '\'' +
                ", produtos=" + produtos +
                '}';
    }
}
