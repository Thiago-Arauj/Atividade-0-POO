public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        ContaCorrente c1 = new ContaCorrente(1,1000);

        p1.setNome("Thiago");
        p1.setCpf(123);
        p1.setConta(c1);

        System.out.println(p1);

        c1.depositar(100);
        c1.sacar(200);

        System.out.println(p1);

    }
}
