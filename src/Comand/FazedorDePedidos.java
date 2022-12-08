package Comand;

import java.util.Stack;

public class FazedorDePedidos {
	private Stack<Pedido> finalizado;
	private Stack<Pedido> cancelado;

	public FazedorDePedidos() {
		super();
		this.finalizado = new Stack<Pedido>();
		this.cancelado = new Stack<Pedido>();
	}

	public String fazer(Pedido P) {
		finalizado.push(P);
		cancelado.clear();
		return P.fazer();
	}

	public String desfazer() {
		if (finalizado.isEmpty())
			return "";

		Pedido p = finalizado.pop();
		cancelado.push(p);
		return p.cancelar();
	}

	public String refazer() {
		if (cancelado.isEmpty())
			return "";

		Pedido p = cancelado.pop();
		finalizado.push(p);
		return p.fazer();
	}
}
