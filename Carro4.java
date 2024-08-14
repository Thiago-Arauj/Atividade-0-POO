import java.util.Scanner;

public class Carro4 {

    Scanner input = new Scanner(System.in);

    String marca;
    String modelo;
    int ano;
    double preco;
    String cor;

    public void  exibirDetalhes(){
        System.out.println("Marca: " + modelo +
                "\nModelo: " + marca +
                "\nAno: " + ano +
                "\nPreço: R$ " + preco +
                "\nCor: " + cor
        );
    }

    public void desconto(){
        System.out.println("Qual a porcentagem de desconto que deseja simular? ");
        double off = input.nextInt();

        off = off / 100;

        double discount = preco * off;

        System.out.println("Antes: " + preco + "\nDepois: " + (preco-discount) + "\n");
    }
}
