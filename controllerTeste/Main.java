package controller;

public class Main {

	public static void main(String[] args) {
		
		Fabricante fabricanteA= new Fabricante("FabricanteA");
		Categoria categoria1 = new Categoria("Comida");
		
		Produto produto1 = new Produto("Ração", 10.00, fabricanteA, categoria1, 0);
		
		Estoque estoque = new Estoque();
		estoque.adicionarProduct(produto1, 100);

		Funcionario funcionario1 = new Funcionario("Jose","00111844403","Adm");
		
		Animal animal1 = new Animal("BOB", "PitBull", 35.6);
		Cliente cliente1 = new Cliente("Maria","00011122244","84991919191",animal1);
		
		Venda venda = new Venda(funcionario1,cliente1);
		venda.adicionarItem(new ItemVenda(produto1, 5));
		
		
		System.out.println("Venda Realizada por: " + funcionario1.getNameEmployee());
		System.out.println("Valor total: " + venda.getTotalSale());
		System.out.println("Estoque apos a venda:" );
		estoque.imprimirListaProdutos();
		
		
		Compra compra = new Compra(funcionario1);
		compra.adicionarItem(new ItemCompra(produto1, 50));
		
		estoque.imprimirListaProdutos();
	}

}
