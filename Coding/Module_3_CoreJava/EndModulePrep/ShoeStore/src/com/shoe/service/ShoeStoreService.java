package com.shoe.service;

import com.shoe.core.ShoeType;
import com.shoe.exception.MyShoeStoreException;

//1) Add required parsing / validation methods and custom exceptions
//1.1) Throws an exception if ratings are not between 1 and 10.
//1.2) Validates that the Name has a length between 3 and 20 characters.
//1.3) Validates that the Shoe type is one of the predefined type.
//2) Solve below
//2.1) Add a new Shoe record to the collection. (Add at least 4 new record in Collection)
//2.2) Display all Shoe details.
//2.3) Display all Shoe details sorted by Shoe id.
//2.4) Search Shoe which is most expensive in Gallery.

//2.5) Remove Shoe that are not available in the Gallery.
//2.6) Update Shoe price based on brand.
//2.7) Sort Shoe data as per price in descending order.
//-- sort shoe as per date
//2.8) Exit from application.*/
public interface ShoeStoreService {
	String addShoe(String name, String brand,String mfgDate, int rating, double price, boolean availableInGallery,String shoe_type) throws MyShoeStoreException;
	
	void displayAll();
	
	void sortById();
	
	void showExpensive();
	
	String removeNotAvailable()throws MyShoeStoreException;
	
	String 	updateShoePrice(String brand) throws MyShoeStoreException;
	
	void sortByPriceDesc();
	
	void sortByMFGDate();
	
	
	
	
	
}
