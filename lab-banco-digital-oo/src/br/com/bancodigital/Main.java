package br.com.bancodigital;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco("Banco Digital DIO");

        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Cliente maria = new Cliente();
        maria.setNome("Maria");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);
        Conta ccMaria = new ContaCorrente(maria);

        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);
        banco.adicionarConta(ccMaria);

        // operações
        cc.depositar(1000);
        cc.transferir(300, poupanca);
        cc.transferir(200, ccMaria);

        // tentativa de saque com saldo insuficiente
        ccMaria.sacar(500);

        // extratos individuais
        cc.imprimirExtrato();
        System.out.println();
        poupanca.imprimirExtrato();
        System.out.println();
        ccMaria.imprimirExtrato();

        // extrato geral pelo banco
        banco.imprimirTodasAsContas();
    }
}
