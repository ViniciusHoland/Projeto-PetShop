package controller;


public class Funcionario {

	private int idEmployee;
	private String nameEmployee;
	private String cpfEmployee;
	private String cargoEmployee;
	private static int nextId=1;
	
	
	public Funcionario(String nameEmployee, String cpfEmployee, String cargoEmployee) {
		super();
		this.idEmployee = nextId++;
		this.nameEmployee = nameEmployee;
		this.cpfEmployee = cpfEmployee;
		this.cargoEmployee = cargoEmployee;
		
	}
	public int getIdEmployee() {
		return idEmployee;
	}
	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}
	
	public String getNameEmployee() {
		return nameEmployee;
	}
	public void setNameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee;
	}
	public String getCpfEmployee() {
		return cpfEmployee;
	}
	public void setCpfEmployee(String cpfEmployee) {
		this.cpfEmployee = cpfEmployee;
	}
	public String getCargoEmployee() {
		return cargoEmployee;
	}
	public void setCargoEmployee(String cargoEmployee) {
		this.cargoEmployee = cargoEmployee;
	}
	
	
	
	// faz venda
	// gerencia estoque 
	// faz pedidos de compra para fornecedores
	// 
}
