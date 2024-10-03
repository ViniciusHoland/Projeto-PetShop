package view;

import controllerTeste.EstoqueController;
import controllerTeste.VendaController;
import model.Cliente;
import model.Estoque;
import model.Funcionario;
import model.Produto;
import model.Servico;

public class MainView {

	public static void main(String[] args) {

		Funcionario funcionarioAdm = new Funcionario("Vinicius", 'M');
		Produto racao = new Produto("Ração", 5.00);
		Produto perfume = new Produto("Perfume", 100.00);
		Produto remedio = new Produto("Remedio", 50.00);
		Servico tosa = new Servico("Tosa", 80.00);
		Cliente clienteMaria = new Cliente("Maria", "111.000.222-99", null);
		
		VendaController novaVenda = new VendaController(funcionarioAdm,clienteMaria);
		novaVenda.realizarVenda(perfume, 2);
		novaVenda.realizarVenda(racao, 10);
		novaVenda.realizarVenda(remedio, 2);
		novaVenda.realizarVenda(tosa, 2);
		System.out.println("=================================");
		novaVenda.fecharVenda();

		EstoqueController controleEstoque = new EstoqueController();
		controleEstoque.mostrarProdutosQuantidades();
		
		
	}

}
