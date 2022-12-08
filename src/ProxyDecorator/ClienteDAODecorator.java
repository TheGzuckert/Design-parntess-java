package ProxyDecorator;

public class ClienteDAODecorator  implements ClienteDAOInterface{
	
	private static ClienteDAOInterface clienteDAO;
	
	private ClienteDAOInterface getDAO() {
		if (clienteDAO == null)
			clienteDAO = (ClienteDAOInterface) new ClienteDAOProxy();
		return clienteDAO;
	}
	

	public void addUsuario(String nome) throws ClienteException {
		if (nome.isBlank())
			throw new ClienteException("Insira o nome de um cliente cadastrado no sistema");
		getDAO().addUsuario(nome);
		
	}

	public Cliente getUsuario(String nome) throws ClienteException {
		if (nome.isBlank())
			throw new ClienteException("Digite um nome de cliente disponivel");
		Cliente c = getDAO().getUsuario(nome);
		if (c == null)
			throw new ClienteException("Digite um nome de cliente disponivel");
		return c;
	}

}
