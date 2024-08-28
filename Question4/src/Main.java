import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vet[] = new int[10];
        int cont = 0;

        while (cont < 10){
            System.out.println("Qual número deseja adicionar ao vetor?");
            vet[cont] = sc.nextInt();
            cont++;
        }

        int maior = 0;
        int menor = 999999;

        for (int i = 0; i < vet.length; i++){
            if (vet[i] > maior){
                maior = vet[i];
            }

            if (vet[i] < menor){
                menor = vet[i];
            }
        }

        System.out.println("Maior: " + maior + "\nMenor: " + menor);

    }


}
