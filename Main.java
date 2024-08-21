import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int test;
        Login pass1 = new Login();

        do {
            test = pass1.validaSenha(input.nextLine());
        } while (test == 0);

        pass1.novaSenha(input.nextLine());

        do {
            test = pass1.validaSenha(input.nextLine());
        } while (test == 0);

    }
}
