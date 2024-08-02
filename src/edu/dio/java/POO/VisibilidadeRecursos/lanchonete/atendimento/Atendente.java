package edu.dio.java.POO.VisibilidadeRecursos.lanchonete.atendimento;

public class Atendente {
	public void servindoMesa() {
		
		pegarPedidoBalcao();
		System.out.println("SERVINDO A MESA");
	}
	private void pegarLancheCozinha() {
		System.out.println("PEGANDO O LANCHE NA COZINHA");
	}
	public void receberPagamento() {
		System.out.println("RECEBENDO PAGAMENTO");
	}
	void trocarGas() {
		System.out.println("ATENDENTE TROCANDO O GÁS");
	}
	private void pegarPedidoBalcao() {
		pegarLancheCozinha();
		System.out.println("PEGANDO O PEDIDO NO BALCÃO");
	}
}
