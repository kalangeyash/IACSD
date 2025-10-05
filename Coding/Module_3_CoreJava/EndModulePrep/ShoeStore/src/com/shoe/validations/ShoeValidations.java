package com.shoe.validations;

import java.time.LocalDate;

import com.shoe.core.Shoe;
import com.shoe.core.ShoeType;
import com.shoe.exception.MyShoeStoreException;

/**1) Add required parsing / validation methods and custom exceptions
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

public class ShoeValidations {
		public static Shoe validateInputs(String name, String brand, String mfgDate, int rating, double price,boolean availableInGallery, String shoe_type) throws MyShoeStoreException
		{
			ShoeType st = parseShoeType(shoe_type);
			LocalDate dt = parseDate(mfgDate);
			
			String vName = validateName(name);
			int vRating  = validateRating(rating);
			
			
			return new Shoe(vName, brand, dt, vRating, price, availableInGallery, st);
			
		}
		
		public static LocalDate parseDate(String mfgDate) throws MyShoeStoreException
		{
			try {
				return LocalDate.parse(mfgDate);
			}catch(Exception e)
			{
				throw new MyShoeStoreException("Please Enter valid DATE  : [ "+ mfgDate +" ]");
			}
		}
	
	
	public static ShoeType parseShoeType(String shoe_type)throws MyShoeStoreException
	{
			try {
				shoe_type.toUpperCase();
				return ShoeType.valueOf(shoe_type);
				
			}catch(Exception e)
			{
				throw new MyShoeStoreException("Please Enter valid SHOE_TYPE  : [ "+ shoe_type +" ]");
			}
	}
	
	public static int validateRating(int rating) throws MyShoeStoreException
	{
				if(rating <= 0 || rating >= 10 )
				{
					throw new MyShoeStoreException("Please enter a valid RATING between 1 and 10: [ " + rating + " ]");
				}
				return rating;
	}
	
	public static String validateName(String name) throws MyShoeStoreException
	{
		if(name.length()<3 || name.length()>=20)
		{
			throw new MyShoeStoreException("Please enter a valid NAME between 3 and 20 words : [ " + name + " ]");
		}
		return name;
		
	}


}
