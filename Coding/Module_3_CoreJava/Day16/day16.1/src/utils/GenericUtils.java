package utils;

import java.util.Collection;

public class GenericUtils {
/*
 * Write a static method in a non generic Utils class 
 - to display elements of any Set | List
 */
	 public static void displayElements(Collection<?> anyCollection)
	 {
		 for(Object o : anyCollection)
			 System.out.println(o);
	 }
}
