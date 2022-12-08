package ProxyDecorator;

public interface ClienteDAOInterface {
	
	public void addUsuario(String nome) throws ClienteException;

	public Cliente getUsuario(String nome) throws ClienteException;

}
