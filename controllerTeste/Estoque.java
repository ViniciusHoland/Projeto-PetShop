package controller;

import java.util.HashMap;

public class Estoque {
	
	private int idStock;
	private Produto product;
	private int quantity;
	
	private HashMap<Produto, Integer> produtos; // chave e valor
	
	public Estoque() {
		this.produtos = new HashMap<>();
	}
	
	public void adicionarProduct(Produto product, int quantity) {
		if(produtos.containsKey(product)) {
			produtos.put(product, produtos.get(product) + quantity);
		} else {
			produtos.put(product, quantity);
		}
	}
	
	public void removerProduto(Produto pruduto, int quantity) {
		if(produtos.containsKey(pruduto)) {
			int novaQuantidade = produtos.get(pruduto) - quantity;
			if(novaQuantidade <= 0) {
				produtos.remove(pruduto);
			} else {
				produtos.put(pruduto, novaQuantidade);
			}
		}
	}
	
	
	public void imprimirListaProdutos() {
		for(Produto key : produtos.keySet()) {
			int value = produtos.get(key);
			System.out.println("Produto: "+key.getNameProduct() + ", Quantidade: " + value);
		}
	}
	
	
	//atualiza estoque
}
