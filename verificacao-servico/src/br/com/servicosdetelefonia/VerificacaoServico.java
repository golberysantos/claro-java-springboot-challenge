package br.com.servicosdetelefonia;

import java.util.Scanner;

public class VerificacaoServico {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Entrada do serviço a ser verificado
		String servico = scanner.nextLine().trim();

		// Entrada do nome do cliente e os serviços contratados
		String entradaCliente = scanner.nextLine().trim();

		// Separando o nome do cliente e os serviços contratados
		String[] partes = entradaCliente.split(",");
		String nomeCliente = partes[0];
		boolean contratado = false;


		scanner.close();
	}
}
