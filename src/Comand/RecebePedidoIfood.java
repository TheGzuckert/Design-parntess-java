package Comand;

public class RecebePedidoIfood implements Pedido {
	private String documento;
	private String localizacao;

	public RecebePedidoIfood(String documento, String localizacao) {
		super();
		this.documento = documento;
		this.localizacao = localizacao;
	}

	public String fazer() {
		return documento.concat("LOCALIZACAO=[" + localizacao + "]");
	}

	public String cancelar() {
		return documento;
	}
}