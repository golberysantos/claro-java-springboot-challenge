package br.com.desafiocontrolefluxo;

public class ParametrosInvalidosException extends Exception {
	private static final long serialVersionUID = 1L;
    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}
