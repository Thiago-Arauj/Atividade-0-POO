import java.util.Scanner;

public class Pessoa {

    Scanner input = new Scanner(System.in);

    String nome;
    int idade;

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome + "\nIdade: " + idade);
    }

    public int alterarIdade(){
        int change = input.nextInt();

        return idade += change;
    }
}
