package ProxyDecorator;

import java.util.HashMap;
import java.util.Map;

public class ClienteDAOProxy {
	
	private Map<String, Cliente> usuarios;

	public ClienteDAOProxy() {
		super();
		this.usuarios = new HashMap<>();
	}

	public void addUsuario(String nome) {
		this.usuarios.put(nome, new Cliente(nome));
	}

	public Cliente getUsuario(String nome) {
		return usuarios.get(nome);
	}
}
