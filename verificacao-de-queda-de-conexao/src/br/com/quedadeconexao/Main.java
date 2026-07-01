package br.com.quedadeconexao;

import java.util.Scanner;

public class Main {

    // TODO: Preencha a função para verificar queda de conexão
    public static String verificarQuedaConexao(String[] velocidades) {
    	for (String v : velocidades) {
			if (Integer.parseInt(v.trim()) == 0 ) {
				return "Queda de Conexao";
			}
		}
        return "Sem Quedas";
    }
    
    private static boolean validarEntrada(String[] velocidades) {
		for (String velocidade : velocidades) {
			try {
				Integer.parseInt(velocidade.trim());
			} catch (NumberFormatException e) {
				return false;
			}
		}

		return true;
	}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        String resultado="";
        if (validarEntrada(velocidades)) {
            resultado = verificarQuedaConexao(velocidades);
        } else {
            resultado = "Entrada inválida";
        }

        // Exibindo o resultado da verificação
        System.out.println(resultado);

        scanner.close();
    }
}
