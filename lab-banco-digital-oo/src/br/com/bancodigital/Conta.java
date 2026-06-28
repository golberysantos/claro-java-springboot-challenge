package br.com.bancodigital;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque deve ser maior que zero.");
            return;
        }
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente. Saldo atual: R$ %.2f".formatted(this.saldo));
            return;
        }
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito deve ser maior que zero.");
            return;
        }
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println("Titular: %s".formatted(this.cliente.getNome()));
        System.out.println("Agência: %d".formatted(this.agencia));
        System.out.println("Número: %d".formatted(this.numero));
        System.out.println("Saldo: R$ %.2f".formatted(this.saldo));
    }
}
