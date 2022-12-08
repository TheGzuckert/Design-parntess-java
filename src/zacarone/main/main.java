package zacarone.main;

import Comand.DigitarPedido;
import Comand.FazedorDePedidos;
import Comand.RecebePedidoIfood;
import Facade.Cargos;
import Facade.Funcionarios;
import ProxyDecorator.Cliente;
import ProxyDecorator.ClienteDAOInterface;
import ProxyDecorator.ClienteException;
import ProxyDecorator.ClienteDAODecorator;

public class main {

	public static void main(String[] args) {

		/*
		 * Command String doc = "";
		 * 
		 * FazedorDePedidos exec = new FazedorDePedidos();
		 * 
		 * doc = exec.fazer(new DigitarPedido(doc, "O pedido chegou pelo ifood"));
		 * System.out.println("1 - " + doc);
		 * 
		 * doc = exec.fazer(new DigitarPedido(doc, "1 - Pizza de Marguerita"));
		 * System.out.println("2 - " + doc);
		 * 
		 * doc = exec.desfazer(); System.out.println("3 - " + doc);
		 * 
		 * System.out.println("4 -  !!!!!!!!!! -  Pedido refeito pelo cliente");
		 * 
		 * doc = exec.refazer(); System.out.println("5 - " + doc);
		 * 
		 * doc = exec.fazer(new RecebePedidoIfood(doc, "Avenida Perseu 2730"));
		 * System.out.println("6 - " + doc); }
		 */

		/*
		 * Proxy e Decorator ClienteDAOInterface usuarioDAO = new ClienteDAODecorator();
		 * 
		 * try { usuarioDAO.addUsuario(""); } catch (ClienteException e) {
		 * System.err.println("Não foi possivel adicionar o cliente);
		 * System.err.println(e.getMessage()); }
		 * 
		 * try { usuarioDAO.addUsuario("Teste"); } catch (ClienteException e) {
		 * System.err.println("Não consegui adicionar o cliente.");
		 * System.err.println(e.getMessage()); }
		 * 
		 * try { Cliente c = usuarioDAO.getUsuario("Teste");
		 * System.out.println(c.getNome()); } catch (ClienteException e) {
		 * System.err.println("Não foi possivel recuperar o cliente.");
		 * System.err.println(e.getMessage()); }
		 * 
		 * 
		 */

		Funcionarios chefe = new Funcionarios().isNome("Pa");
		Funcionarios pizzaiolo = new Funcionarios().isNome("Erick").isEndereco("Avenida Perseu 1240");
		Funcionarios atentende = new Funcionarios().isNome("Pamela").isEndereco("Avenida ademar de barros 123");

	}

}
