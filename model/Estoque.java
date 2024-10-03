package model;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
	
	private Produto produto;
	private int quantidade;
	private HashMap<Produto,Integer> produtosHashMap;
	
	
	public Estoque() {
		produtosHashMap = new HashMap<Produto, Integer>();
	}
	
	// cadastra produtos
	public void cadastraEstoqueProduto(Produto produto, Integer quantidade) {
		produtosHashMap.put(produto, quantidade);
	}
	
	public void listarProdutosEstoque() {
		for(Map.Entry<Produto, Integer> produtoKeyValue : produtosHashMap.entrySet()) {
			System.out.println("Produto " + produtoKeyValue.getKey().getNomeProduto() + " Quant " + produtoKeyValue.getValue());
		}
	}
	
	public void removeProduto(Produto produto, Integer quantidade) {
		
		if(produtosHashMap.isEmpty()) {
			System.out.println("Nenhum produto cadastrado");
		} else {
			int quantidadeAtual =  produtosHashMap.get(produto);
			
			if(quantidade > 0 ) {
				produtosHashMap.put(produto, quantidadeAtual - quantidade);
			}
		}
		
		
		
	}

	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	
	
	
	
	
}
