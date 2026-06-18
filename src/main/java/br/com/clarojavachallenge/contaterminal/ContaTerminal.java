package br.com.clarojavachallenge.contaterminal;

import java.util.Scanner;
import java.util.Locale;

/**
 * Desafio - Trilha Java Basico (DIO). Professor Gleyson Sampaio. Projeto
 * ContaBanco Programa que simula a abertura de uma conta bancaria via terminal.
 * 
 * @author Golbery Santos
 */
public class ContaTerminal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numero;
		String agencia;
		String nomeCliente;
		double saldo;

		System.out.println("\n Locale padrão: " + Locale.getDefault());

		System.out.println("Por favor, digite o numero da conta:");
		numero = scanner.nextInt();

		System.out.println("Por favor, digite o numero da Agencia!");
		agencia = scanner.next();

		System.out.println("Por favor, digite o nome do Cliente:");
		scanner.nextLine(); // limpa o buffer deixado pelo next() anterior
		nomeCliente = scanner.nextLine();

		System.out.println("Por favor, digite o saldo da conta:");
		saldo = scanner.nextDouble();

		scanner.close();

		String mensagem = "Ola ".concat(nomeCliente)
				.concat(", obrigado por criar uma conta em nosso banco, sua agencia e ").concat(agencia)
				.concat(", conta ").concat(String.valueOf(numero)).concat(" e seu saldo ").concat(String.valueOf(saldo))
				.concat(" ja esta disponivel para saque.");

		System.out.println(mensagem);
	}
}