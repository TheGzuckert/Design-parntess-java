package ProxyDecorator;

public class Cliente {
	
	private String nome;


	protected Cliente(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

}
