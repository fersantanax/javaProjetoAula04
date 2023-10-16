package main;

import controllers.PessoaController;

public class Main {
	public static void main(String[] args) {
		PessoaController pessoaController = new PessoaController();
		pessoaController.cadastrarPessoa();
	}
}