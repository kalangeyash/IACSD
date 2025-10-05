package com.shoe.core;
/*Shoe Gallery Details: Shoe_Id (int) (unique should be generate automatically),
 * Name (String), Brand (String), ratings (int) (scale between 1 to 10), Price (double), availablelnGallery(boolean: True/False),
Shoe_type: (enum)[FORMAL, CASUAL,SPORTS]
All CRUD operations MUST happen in constant time performance. (Use any collection)
1) Add required parsing / validation methods and custom exceptions
1.1) Throws an exception if ratings are not between 1 and 10.
1.2) Validates that the Name has a length between 3 and 20 characters.
1.3) Validates that the Shoe type is one of the predefined type.
2) Solve below
2.1) Add a new Shoe record to the collection. (Add at least 4 new record in Collection)
2.2) Display all Shoe details.
2.3) Display all Shoe details sorted by Shoe id.
2.4) Search Shoe which is most expensive in Gallery.
2.5) Remove Shoe that are not available in the Gallery.
2.6) Update Shoe price based on brand.
2.7) Sort Shoe data as per price in descending order.
2.8) Exit from application.*/

import java.time.LocalDate;

public class Shoe {
	private int shoeId;
	private static int shoeIdCounter;
	private String name;
	private String brand;
	private LocalDate mfgDate;
	private int rating;
	private double price;
	private boolean availableInGallery;
	private ShoeType shoe_type;
	
	static {
		shoeIdCounter = 101;
	}
	
	@Override
	public String toString() {
		return "Shoe [shoeId=" + shoeId + ", name=" + name + ", brand=" + brand + ", mfgDate=" + mfgDate + ", rating="
				+ rating + ", price=" + price + ", availableInGallery=" + availableInGallery + ", shoe_type="
				+ shoe_type + "]";
	}

	public int getShoeId() {
		return shoeId;
	}

	public void setShoeId(int shoeId) {
		this.shoeId = shoeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public LocalDate getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(LocalDate mfgDate) {
		this.mfgDate = mfgDate;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isAvailableInGallery() {
		return availableInGallery;
	}

	public void setAvailableInGallery(boolean availableInGallery) {
		this.availableInGallery = availableInGallery;
	}

	public ShoeType getShoe_type() {
		return shoe_type;
	}

	public void setShoe_type(ShoeType shoe_type) {
		this.shoe_type = shoe_type;
	}

	public Shoe(String name, String brand, LocalDate mfgDate, int rating, double price, boolean availableInGallery,
			ShoeType shoe_type) {
		super();
		this.shoeId = shoeIdCounter++;
		this.name = name;
		this.brand = brand;
		this.mfgDate = mfgDate;
		this.rating = rating;
		this.price = price;
		this.availableInGallery = availableInGallery;
		this.shoe_type = shoe_type;
	}
	
}
