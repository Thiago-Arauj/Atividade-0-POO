public class ContaPoupanca extends Conta{
    private double taxa = 0.1;

    public ContaPoupanca(int num, double saldo) {
        super(num, saldo);
    }

    public void sacar(double valor){

    }

    public void depositar(double valor){
        super.saldo = valor + (valor * this.taxa);
    }

}
