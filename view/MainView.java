package view;

import controllerTeste.EstoqueController;
import controllerTeste.ProdutoController;
import controllerTeste.VendaController;
import model.Cliente;
import model.Estoque;
import model.Funcionario;
import model.Produto;
import model.Servico;

public class MainView {

	public static void main(String[] args) {
		
		
		EstoqueController estoqueController = new EstoqueController();
		ProdutoController produtoController = new ProdutoController(estoqueController);
		
		produtoController.cadastrarProduto("Perfume", 5.00, 20);
		produtoController.cadastrarProduto("Ração", 10.00, 100);
		
		estoqueController.mostrarProdutosQuantidades();
		
		VendaController novaVenda = new VendaController(estoqueController);
	
		novaVenda.realizarVenda(estoqueController.bucarProdutoNoEstoque("perfume"), 5);
		novaVenda.fecharVenda();
		
		estoqueController.mostrarProdutosQuantidades();
		
	
	}

}
