import java.util.ArrayList;
import java.util.Scanner;

public class Carrinho {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Produto> carrinho;
    private double total;
    private int dif;

    public ArrayList<Produto> getCarrinho() {
        return carrinho;
    }

    public void recebeProduto(Produto p) {
        if (p.disponivel()) {

            int quantidade;
            do {
                System.out.println(p.getEstoque());
                System.out.println("Quantos vai querer?");
                quantidade = Integer.parseInt(sc.nextLine());

                if (quantidade <= p.getEstoque().getQuantidade()) {
                    break;
                }

            } while (true);

            dif = p.getEstoque().getQuantidade() - quantidade;

            p.getEstoque().setQuantidade(dif);

            carrinho.add(p);
        }

    }

    public void retiraProduto(Produto p) {
        if (!carrinho.contains(p)) {
            int estoque = p.getEstoque().getQuantidade();
            p.getEstoque().setQuantidade(estoque + dif);
            carrinho.remove(p);
        } else {
            System.out.println("Você não tem esse produto no carrinho.");
        }

    }

    public void calculaTotal(Loja l){
        for (Produto p : carrinho) {
            total += p.getPreco();

        }

        System.out.println(total);
    }
}
