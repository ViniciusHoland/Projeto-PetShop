package controller;

public class ItemVenda {
	
	private Produto product;
	private int quantity;
	private double subTotal;
	
	public ItemVenda(Produto product, int quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}
	
	public Produto getProduct() {
		return product;
	}
	public void setProduct(Produto product) {
		this.product = product;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getSubTotal() {
		return product.getPriceProduct() * quantity;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	
	
	
}
