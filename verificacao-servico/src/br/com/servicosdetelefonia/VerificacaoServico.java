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
		boolean contratado = false;

		// TODO: Verifique se o serviço está na lista de serviços contratados
		servico = servico.toLowerCase();
		
		
		for (int i = 1; i < partes.length; i++) {
			
			if (partes[i].toLowerCase().equals(servico)) {
		        contratado = true;
		        break;
			}
		}

		System.out.println(contratado ? "Sim" : "Nao");

		scanner.close();
	}

}
