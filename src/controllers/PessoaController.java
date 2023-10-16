package controllers;

import java.util.Scanner;
import java.util.UUID;

import entities.Pessoa;
import repositories.PessoaRepository;

public class PessoaController {
	public void cadastrarPessoa() {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("\nCADASTRO DE PESSOA:\n");
			Pessoa pessoa = new Pessoa();
			pessoa.setId(UUID.randomUUID());
			System.out.print("INFORME O NOME....: ");
			pessoa.setNome(scanner.nextLine());
			System.out.print("INFORME O CPF.....: ");
			pessoa.setCpf(scanner.nextLine());
			PessoaRepository pessoaRepository = new PessoaRepository();
			pessoaRepository.create(pessoa);
			System.out.println("\nPessoa cadastrada com sucesso!");

		} catch (Exception e) {
			System.out.println("\nFalha ao cadastrar: " + e.getMessage());

		} finally {
			scanner.close();
		}
	}
}