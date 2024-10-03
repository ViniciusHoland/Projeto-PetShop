package controller;

import java.util.ArrayList;
import java.util.Date;

public class Venda {
	
	private int idSale;
	private double totalSale;
	private Date dateSale;
	private Funcionario funcionario;
	private Cliente cliente;
	private ArrayList<ItemVenda> itens;
	
	
	public Venda(Funcionario funcionario, Cliente cliente) {
		this.funcionario = funcionario;
		this.cliente = cliente;
		this.itens = new ArrayList<>();
		this.totalSale = 0.0;
	}
	
	public void adicionarItem(ItemVenda item) {
		this.itens.add(item);
		this.totalSale += item.getSubTotal();
		item.getProduct().removeStock(item.getQuantity());
	
	}

	public int getIdSale() {
		return idSale;
	}

	public void setIdSale(int idSale) {
		this.idSale = idSale;
	}

	public double getTotalSale() {
		return totalSale;
	}

	public void setTotalSale(double totalSale) {
		this.totalSale = totalSale;
	}

	public Date getDateSale() {
		return dateSale;
	}

	public void setDateSale(Date dateSale) {
		this.dateSale = dateSale;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<ItemVenda> getItens() {
		return itens;
	}

	public void setItens(ArrayList<ItemVenda> itens) {
		this.itens = itens;
	}
	
	
	
	
	// diminui a quantidade do produto vendido
	// processa pagamento
	
	
	
	
}
