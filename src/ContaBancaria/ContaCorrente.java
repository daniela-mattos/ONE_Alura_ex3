package ContaBancaria;

public class ContaCorrente extends Conta {
    private double tarifaMensal;

    public void cobraTarifa() {
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de " + tarifaMensal + " cobrada. Saldo atual: " + saldo);
    }
}
