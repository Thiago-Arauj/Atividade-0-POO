import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        int choice;
        int num1;
        int num2;

        System.out.println("Quais dois números deseja usar?");
        num1 = input.nextInt();
        num2 = input.nextInt();

        if (num2 == 0){
            System.out.println("Divisão por zero não é aceita.");
        } else {
            System.out.println("Que operação deseja realizar? \n[1]Multiplicação \n[2]Divisão \n[3]Subtração \n[4]Soma");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    calculadora.multiplicacao(num1, num2);
                break;

                case 2:
                    calculadora.divisao(num1, num2);
                break;

                case 3:
                    calculadora.subtracao(num1, num2);
                break;

                case 4:
                    calculadora.soma(num1, num2);
                break;
            }
        }

        do {
            System.out.println("Deseja ver a tabuada de qual número? \n Pode digitar 0 para sair");
            num1 = input.nextInt();
            if (num1 == 0){
                break;
            } else {
                calculadora.tabuada(num1);
            }
        } while (true);

    }
}
