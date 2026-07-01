package br.com.conexao;

import java.util.Scanner;

public class Main {

	// Função para calcular a velocidade média de conexão de internet
	public static double calcularVelocidadeMedia(String[] velocidades) {
		double total = 0;

		// TODO: Some todas as velocidades registradas e calcule a média
		for (String string : velocidades) {
			total = total + Double.parseDouble(string);
		}
		return total;
	}

	private static boolean validarEntrada(String[] velocidades) {
		for (String velocidade : velocidades) {
			try {
				double valor = Double.parseDouble(velocidade.trim());

				if (!Double.isFinite(valor)) {
					return false;
				}
			} catch (NumberFormatException e) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Solicitando ao usuário a lista de velocidades de conexão registradas a cada
		// hora
		String input = scanner.nextLine();

		// Convertendo a entrada em uma lista de strings
		String[] velocidades = input.split(",");

		double velocidadeMedia = 0;
		
		if (validarEntrada(velocidades)) {
			// Calculando a velocidade média de conexão
			velocidadeMedia = calcularVelocidadeMedia(velocidades);
		}

		// Exibindo a velocidade média de conexão
		System.out.println((int) velocidadeMedia + " Mbps");

		scanner.close();
	}

}