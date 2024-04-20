package ContaBancaria;

public class Teste {
    public static void main(String[] args) {
        // Criando uma conta bancária com saldo inicial de 1000
        Conta conta = new Conta();
        conta.deposito(1000);
        conta.consultaSaldo();

        // Realizando operações na conta corrente
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.deposito(200);
        contaCorrente.cobraTarifa();
        contaCorrente.consultaSaldo();
        contaCorrente.sacar(150);
        contaCorrente.consultaSaldo();
    }
}