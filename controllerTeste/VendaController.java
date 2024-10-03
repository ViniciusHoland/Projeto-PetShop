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
	
	public VendaController(Funcionario funcionario, Cliente cliente) {
		this.venda = new Venda(funcionario, cliente);
		this.estoqueController = new EstoqueController();
	}
	
	public void realizarVenda(Produto produto, int quantidade) {
		this.venda.adicionarProdutoVenda(produto, quantidade);
		this.estoqueController.removerProdutoEstoque(produto, quantidade);
	}
	
	public void realizarVenda(Servico servico, int quantidade) {
		this.venda.adicionarServicoVenda(servico, quantidade);
	}
	
	
	public void detalharVenda() {
		this.venda.detalharVenda();
	}
	
	public void fecharVenda() {
		this.venda.fecharVenda();
	}
	
}
