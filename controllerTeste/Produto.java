package controller;

public class Produto {

	private int idProduct;
	private String nameProduct;
	private double priceProduct;
	private Fabricante manufacturer;
	private Categoria categoryProduct;
	private int quantityStock;

	// atualiza estoque tanto na compra como na venda

	public Produto(String nameProduct, double priceProduct, Fabricante manufacturer, Categoria categoryProduct,
			int quantityStock) {
		super();
		this.nameProduct = nameProduct;
		this.priceProduct = priceProduct;
		this.manufacturer = manufacturer;
		this.categoryProduct = categoryProduct;
		this.quantityStock = quantityStock;
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public double getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(double priceProduct) {
		this.priceProduct = priceProduct;
	}

	public Fabricante getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Fabricante manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Categoria getCategoryProduct() {
		return categoryProduct;
	}

	public void setCategoryProduct(Categoria categoryProduct) {
		this.categoryProduct = categoryProduct;
	}

	public int getQuantityStock() {
		return quantityStock;
	}

	public void setQuantityStock(int quantityStock) {
		this.quantityStock = quantityStock;
	}

	public void updateStock(int quantity) {
		this.setQuantityStock(this.getQuantityStock() + quantity);
	}

	public void removeStock(int quantity) {
		this.setQuantityStock(this.getQuantityStock() - quantity);
	}

	public int quantityStock() {
		return this.getQuantityStock();
	}
	
	

}
