package Facade;

public class Funcionarios {
	private String nome;
	private String endereco;
	private Funcionarios funcionario;

	public Funcionarios isNome(String nome) {
		this.nome = nome;
		return this;
	}

	public Funcionarios isEndereco(String endereco) {
		this.endereco = endereco;
		return this;
	}

	public Funcionarios is(Funcionarios funcionario) {
		this.funcionario = funcionario;
		return this;
	}

	public String nome() {
		return nome;
	}

	public Funcionarios getFuncionarios() {
		return funcionario;
	}

}
