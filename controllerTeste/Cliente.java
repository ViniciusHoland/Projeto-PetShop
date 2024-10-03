package controller;

public class Cliente {
	
	private int idCostumer;
	private String nameCostumer;
	private String cpfCostumer;
	private String telefoneCostumer;
	private Animal animalCostumer;
	private static int nextId=1;
	
	
	
	
	
	public Cliente(String nameCostumer, String cpfCostumer, String telefoneCostumer,
			Animal animalCostumer) {
		super();
		this.idCostumer = nextId++;
		this.nameCostumer = nameCostumer;
		this.cpfCostumer = cpfCostumer;
		this.telefoneCostumer = telefoneCostumer;
		this.animalCostumer = animalCostumer;
	}
	public int getIdCostumer() {
		return idCostumer;
	}
	public void setIdCostumer(int idCostumer) {
		this.idCostumer = idCostumer;
	}
	public String getNameCostumer() {
		return nameCostumer;
	}
	public void setNameCostumer(String nameCostumer) {
		this.nameCostumer = nameCostumer;
	}
	public String getCpfCostumer() {
		return cpfCostumer;
	}
	public void setCpfCostumer(String cpfCostumer) {
		this.cpfCostumer = cpfCostumer;
	}
	public String getTelefoneCostumer() {
		return telefoneCostumer;
	}
	public void setTelefoneCostumer(String telefoneCostumer) {
		this.telefoneCostumer = telefoneCostumer;
	}
	public Animal getAnimalCostumer() {
		return animalCostumer;
	}
	public void setAnimalCostumer(Animal animalCostumer) {
		this.animalCostumer = animalCostumer;
	}
	
	
	
	// consulta produto
	// faz pedido
	// agenda/realiza serviço
	// ver historico
	
	
	
}
