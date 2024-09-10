import java.util.Scanner;

public class Cliente {
    private Scanner sc = new Scanner(System.in);
    private String nome;
    private String cpf;
    private Carrinho carrinho;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public void escolheProduto(Loja l){
        l.showProdutos();

        int list = 1;
        Produto choice;
        int read;

        for (Produto p : l.getProdutos()){
            System.out.println("[" + list + "] " + p.getDescricao());
        }

        System.out.println("Qual deseja adicionar?");
        read = Integer.parseInt(sc.nextLine());

        choice = l.getProdutos().get(read - 1);

        carrinho.recebeProduto(choice);

        System.out.println("Produto adicionada com sucesso!");
    }

    public void retiraProduto(){
        System.out.println("Qual deseja retirar?");
        for (Produto p: carrinho.getCarrinho()){
            System.out.println(p);
        }

        String chosen = sc.nextLine();

        for (Produto p: carrinho.getCarrinho()){
            if (p.getDescricao().equals(chosen)){
                carrinho.recebeProduto(p);
            }
        }
    }
}
