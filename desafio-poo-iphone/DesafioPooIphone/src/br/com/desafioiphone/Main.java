package br.com.desafioiphone;

public class Main {
    public static void main(String[] args) {

        iPhone meuIPhone = new iPhone();

        System.out.println("Reprodutor Musical");
        meuIPhone.selecionarMusica("Bohemian Rhapsody");
        meuIPhone.tocar();
        meuIPhone.pausar();

        System.out.println("\nAparelho Telefônico");
        meuIPhone.ligar("(92) 99999-0000");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        System.out.println("\nNavegador na Internet");
        meuIPhone.exibirPagina("https://www.apple.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
