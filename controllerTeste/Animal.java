package controller;

public class Animal {
	
	private String nameAnimal;
	private String raceAnimal;
	private double weightAnimal;
	
	
	
	
	public Animal(String nameAnimal, String raceAnimal, double weightAnimal) {
		super();
		this.nameAnimal = nameAnimal;
		this.raceAnimal = raceAnimal;
		this.weightAnimal = weightAnimal;
	}
	public String getNameAnimal() {
		return nameAnimal;
	}
	public void setNameAnimal(String nameAnimal) {
		this.nameAnimal = nameAnimal;
	}
	public String getRaceAnimal() {
		return raceAnimal;
	}
	public void setRaceAnimal(String raceAnimal) {
		this.raceAnimal = raceAnimal;
	}
	public double getWeightAnimal() {
		return weightAnimal;
	}
	public void setWeightAnimal(double weightAnimal) {
		this.weightAnimal = weightAnimal;
	}
	
	
	
}
