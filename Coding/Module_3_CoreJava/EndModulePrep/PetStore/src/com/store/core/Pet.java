package com.store.core;
//Pet ( petId, name, category, unitPrice, stocks)
//Category is an enum with values like (CAT, DOG, RABBIT, FISH)
//Example:
//  petId = 101, name=” Bull Dog”, category= DOG, unitPrice= 1000, stocks=50


public class Pet extends PetEntity {
//	private int petId;
	private static int petIdCounter;
	private String name ;
	private Category category;
	private double unitPrice ;
	private int stocks;
	
	static {
		petIdCounter = 101;
	}
	
	public Pet( String name, Category category, double unitPrice, int stocks) {
		super(petIdCounter++);
//		this.petId = petIdCounter++;
		this.name = name;
		this.category = category;
		this.unitPrice = unitPrice;
		this.stocks = stocks;
	}
	@Override
	public int getPetId() {
		return super.getPetId();
	}

	@Override
	public void setPetId(int petId) {
		super.setPetId(petId);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getStocks() {
		return stocks;
	}

	public void setStocks(int stocks) {
		this.stocks = stocks;
	}


	
	
}
