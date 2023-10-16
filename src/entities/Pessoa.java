package entities;

import java.util.UUID;

public class Pessoa {
	private UUID id;
	private String nome;
	private String cpf;

	public Pessoa() {
// TODO Auto-generated constructor stub
	}

	public Pessoa(UUID id, String nome, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}