public class ContaCorrente extends Conta{
    private double juros = 0.1;

    public ContaCorrente(int num, double saldo) {
        super(num, saldo);
    }

    public void sacar(double valor){
        super.saldo -= valor + (valor * this.juros);
    }

    public void depositar(double valor){
        super.saldo += valor;
    }

}
