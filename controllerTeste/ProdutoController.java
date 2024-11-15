package controllerTeste;

import model.Produto;

public class ProdutoController {
	
	private EstoqueController estoqueController;
	
	public ProdutoController(EstoqueController estoqueController) {
		this.estoqueController = estoqueController;
	}
	
	public boolean cadastrarProduto(String nomeProduto, double precoProduto, int quantidade) {
		Produto produto = new Produto(nomeProduto, precoProduto);
		produto.cadastrarProduto(produto);
		
		this.estoqueController.adicionarProdutoAoEstoque(produto, quantidade);
		
		return true;
	}
	
	//public Produto buscarProduto(String nome) {}
	
	
}
