import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Loja l1 = new Loja();
        l1.setNome("Atacadao");

        int choice = 1;

        do{
            switch(choice){
                case 1:
                    System.out.println("Qual id do produto?");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.println("Quantos dele tem em estoque?");
                    int quant = Integer.parseInt(sc.nextLine());

                    System.out.println("Qual o nome do produto?");
                    String nome = sc.nextLine();

                    System.out.println("Qual o valor dele?");
                    double valor = Double.parseDouble(sc.nextLine());

                    Produto produto = new Produto(id, quant, nome, valor);

                    l1.adiciona(produto);
                break;

                case 2:
                    System.out.println("Qual o nome do produto?");
                    String desc = sc.nextLine();

                    l1.remove(desc);
                break;
            }
            System.out.println("O que deseja fazer como loja?\n[1]Adicionar produto\n[2]Remover produto\n[3]Nada e sair");
            choice = Integer.parseInt(sc.nextLine());
        } while (choice < 3);


    }
}
