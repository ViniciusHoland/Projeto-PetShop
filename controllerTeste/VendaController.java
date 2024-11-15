package controllerTeste;

import model.Cliente;
import model.Funcionario;
import model.ItemVenda;
import model.Produto;
import model.Servico;
import model.Venda;

public class VendaController {

	private Venda venda;
	private EstoqueController estoqueController;
	
	
	
	public VendaController(EstoqueController estoqueController) {
		this.venda = new Venda(estoqueController);
		this.estoqueController = estoqueController;
	}

	public VendaController(Funcionario funcionario, Cliente cliente) {
		this.venda = new Venda(funcionario, cliente);
		this.estoqueController = new EstoqueController();
	}
	
	public void realizarVenda(Produto produto, int quantidade) {
		this.venda.adicionarProdutoVenda(produto, quantidade);
	}
	
	public void realizarVenda(Servico servico, int quantidade) {
		this.venda.adicionarServicoVenda(servico, quantidade);
	}
	
	
	public void detalharVenda() {
		this.venda.detalharVenda();
	}
	
	public void fecharVenda() {
		
		for(ItemVenda  itensDaVenda : this.venda.getItensVenda() ) {
			this.estoqueController.removerProdutoEstoque(itensDaVenda.getProduto().getNomeProduto(), itensDaVenda.getQuantidade());
		}
	
		this.venda.fecharVenda();
	}
	
}
