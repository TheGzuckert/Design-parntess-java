package Comand;

public class DigitarPedido implements Pedido {
	private String pedido;
	private String adiciona;


	public DigitarPedido(String pedido, String adiciona) {
		super();
		this.pedido = pedido;
		this.adiciona = adiciona;
	}

	public String fazer() {
		return pedido.concat(adiciona);
	}

	public String cancelar() {
		return pedido;
	}

}