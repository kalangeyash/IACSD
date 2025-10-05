package com.shoe.service;

import java.util.HashMap;
import java.util.Map;

import com.shoe.core.Shoe;
import com.shoe.exception.MyShoeStoreException;
import static com.shoe.validations.ShoeValidations.*;

public class ShoeStoreServiceImplementation implements ShoeStoreService{
	
	Map<Integer,Shoe> map;
	
	public  ShoeStoreServiceImplementation() {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
	}

	@Override
	public String addShoe(String name, String brand, String mfgDate, int rating, double price,
			boolean availableInGallery, String shoe_type) throws MyShoeStoreException {
		// TODO Auto-generated method stub
		Shoe s = validateInputs(name, brand, mfgDate, rating, price, availableInGallery, shoe_type);
		map.put(s.getShoeId(), s);
		
		return "\t\tShoe added successfully";
	}

	@Override
	public void displayAll() {
		// TODO Auto-generated method stub
		for(Shoe x : map.values())
		{
			System.out.println(x);
		}
	}

	@Override
	public void sortById() {
		// TODO Auto-generated method stub
		map.values().stream()
		.sorted((x1,x2) -> Integer.compare(x1.getShoeId(),x2.getShoeId()));
	}

	@Override
	public void showExpensive() {
		// TODO Auto-generated method stub
//		map.values().stream().sorted((x1,x2) -> Double.compare(x1.getPrice(),x2.getPrice()))
//		.limit(1)				This works
//		.forEach(x -> System.out.println(x));
		
		map.values().stream()
		.max((x1,x2) -> Double.compare(x1.getPrice(),x2.getPrice())).ifPresent(x -> System.out.println("Most Expensive Shoe is : [ "+x+" ]"));

		
	}

//	@Override
//	public String removeNotAvailable() throws MyShoeStoreException {
//		// if availableInGallery is false remove it from map
//		for(Shoe x : map.values())
//		{
//			if(x.isAvailableInGallery() == false)
//			{
//				map.remove(x);
//			}																		WILL throw ConcurrentModificationException

//		}
//		return null;
//	}
	
//	@Override
//	public String removeNotAvailable() throws MyShoeStoreException {
//	    Iterator<Map.Entry<Integer, Shoe>> itr = map.entrySet().iterator();
//
//	    while (itr.hasNext()) {
//	        Map.Entry<Integer, Shoe> entry = itr.next();
//	        if (!entry.getValue().isAvailableInGallery()) {
//	            itr.remove(); // safe removal during iteration
//	        }
//	    }
//
//	    return "Removed all shoes not available in gallery.";
//	}
	
	@Override 
	public String removeNotAvailable() throws MyShoeStoreException{
			map.values().removeIf(x-> x.isAvailableInGallery() == false);
			return "Removed all shoes not available in gallery.";					
//			A Stream in Java is not a collection — it’s a one-time, read-only pipeline for processing elements.
//			So once you create a Stream, you can:
//				•	Filter
//				•	Map
//				•	Sort
//				•	Collect
//			…but you cannot modify the source data (no removeIf, add, etc.).
//
//			That’s why .stream().removeIf() gives a compile-time error — Stream has no removeIf() method.
	}	

	@Override
	public String updateShoePrice(String brand) throws MyShoeStoreException {
		
		boolean found = false;
		for(Shoe x: map.values())
		{
			found = true;
			
			double oldPrice = x.getPrice();
			double newPrice = oldPrice * 1.10; //increase by 10%
			
			x.setPrice(newPrice);
			System.out.println("Updated price for " + x.getName() + ": " + oldPrice + " → " + newPrice);
        
		}
		
		if(!found)
		{
			throw new MyShoeStoreException("No shoe found with given bank");
		}
		
		return "Done";
	}

	@Override
	public void sortByPriceDesc() {
		// TODO Auto-generated method stub
		System.out.println("\t\t Sorting using Price Descending");
		map.values().stream()
		.sorted((x1,x2) -> Double.compare(x2.getPrice(),x1.getPrice()))
		.forEach(x-> System.out.println(x));
		
	}

	@Override
	public void sortByMFGDate() {
		// TODO Auto-generated method stub
		System.out.println("\t\t Sorting using MFG DATE Ascending");
		map.values().stream()
		.sorted((x1,x2) -> x1.getMfgDate().compareTo(x2.getMfgDate()))
		.forEach(x -> System.out.println(x));
		
	}

}
