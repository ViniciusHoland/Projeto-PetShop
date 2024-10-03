package controller;


public class ItemCompra {
	
	private Produto produto;
	private int quantity;
	private double subTotal;
	
	
	
	public ItemCompra(Produto produto, int quantity) {
		super();
		this.produto = produto;
		this.quantity = quantity;
	}
	
	public double getSubTotal() {
		return produto.getPriceProduct() * quantity;
	}



	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}



	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
