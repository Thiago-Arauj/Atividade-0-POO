import java.util.*;

public class Atividade_0_Question2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        if (num > 0){
            System.out.println("O número é positivo");
            int even_odd = num % 2;
            if (even_odd == 0) {
                System.out.println("E é par!");
            } else {
                System.out.println("E é impar!");
            }
        } else if (num == 0) {
            System.out.println("O número é zero");
        } else {
            System.out.println("O número é negativo");
        }
    }
}
