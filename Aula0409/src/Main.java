import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Catalog catalog = new Catalog();
        int choice;

        do{
            System.out.println("Digite 1 para adiconar uma série\nDigite 2 para adicionar um filme");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Qual o nome da série e quantas temporadas ela tem?");
                    String nome = sc.nextLine();
                    int temporadas = Integer.parseInt(sc.nextLine());

                    Series serie = new Series(nome, temporadas);

                    catalog.setSeriesCatalog(serie);
                break;

                case 2:
                    System.out.println("Qual o nome do filme e seu ano de lançamento?");
                    String name = sc.nextLine();
                    int ano = Integer.parseInt(sc.nextLine());

                    Movie movie = new Movie(name, ano);

                    catalog.setMovieCatalog(movie);
                break;

            }

            System.out.println("Se deseja sair digite 0");
            choice = Integer.parseInt(sc.nextLine());

        } while (choice != 0);

        catalog.getMovieCatalog();
        catalog.getSeriesCatalog();

    }
}
