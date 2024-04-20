package ContaBancaria;

public class Conta {
    protected double saldo;

    public void deposito(double valor) {
        System.out.println("Deposito: " + valor);
        this.saldo += valor;
    }
    public void sacar(double valor) {
        System.out.println("Saque: " + valor);
        if (this.saldo >= valor) {
            this.saldo -= valor;
        }
    }
    public void consultaSaldo() {
        System.out.println("Seu saldo é: " + this.saldo);
    }
}
