package controller;

import java.util.ArrayList;
import java.util.Date;

public class Compra {

	private int idBuy;
	private Date dateBuy;
	private Fornecedor providerFornecedor;
	private Funcionario funcionario;
	private ArrayList<ItemCompra> itens;
	private double totalBuy;
	
	
	public Compra(Funcionario funcionario) {
		super();
		//this.dateBuy = dateBuy;
		//this.providerFornecedor = providerFornecedor;
		this.funcionario = funcionario;
		this.itens = new ArrayList<>();
		this.totalBuy = 0.0;
	}
	
	
	public void adicionarItem(ItemCompra item) {
		this.itens.add(item);
		this.totalBuy += item.getSubTotal(); 
	}
	
	
	public int getIdBuy() {
		return idBuy;
	}
	public void setIdBuy(int idBuy) {
		this.idBuy = idBuy;
	}
	public Date getDateBuy() {
		return dateBuy;
	}
	public void setDateBuy(Date dateBuy) {
		this.dateBuy = dateBuy;
	}
	public Fornecedor getProviderFornecedor() {
		return providerFornecedor;
	}
	public void setProviderFornecedor(Fornecedor providerFornecedor) {
		this.providerFornecedor = providerFornecedor;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public ArrayList<ItemCompra> getItens() {
		return itens;
	}
	public void setItens(ArrayList<ItemCompra> itens) {
		this.itens = itens;
	}
	public double getTotalBuy() {
		return totalBuy;
	}
	public void setTotalBuy(double totalBuy) {
		this.totalBuy = totalBuy;
	}

	
	
	
	//registra compra e atualiza o estoque aumentando a quantidade do produto comprado;
	
	
}
