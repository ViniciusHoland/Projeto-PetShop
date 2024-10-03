package controllerTeste;

import model.Estoque;
import model.Produto;

public class EstoqueController {
	
	private Estoque estoque;
	
	public EstoqueController() {
		this.estoque = new Estoque();
	}
	
	public void adicionarProdutoEstoque(Produto produto, Integer quantidade) {
		this.estoque.cadastraEstoqueProduto(produto, quantidade);
	}
	
	public void removerProdutoEstoque(Produto produto, Integer quantidade) {
		this.estoque.removeProduto(produto, quantidade);
	}
	
	public void mostrarProdutosQuantidades() {
		this.estoque.listarProdutosEstoque();
	}
	
}
