package com.shop.tester;
import static com.shop.utils.ShopUtils.*;

import java.util.Iterator;
import java.util.List;

import com.shop.core.Product;

public class Test3 {

	public static void main(String[] args) {
		//get product list
		System.out.println("all products ");
		List<Product> products=populateProductList();
		//display all products - FP
		products.forEach(p -> System.out.println(p));//internal iteration
		/*
		 * solve - remove all the products , whose price > 100
		 * display the list after removal
		 */
//		Iterator<Product> itr=products.iterator();
//		while(itr.hasNext())
//		{
//			if(itr.next().getPrice()>100)
//				itr.remove();
//		}
		/*
		 * Collection<E> i/f method
		 * default boolean removeIf(Predicate<? super E> filter)
		 * Removes the elements from the Collection , 
		 * if filter condition returns true 
		 * Returns - true , if any element is removed.
		 * Predicate<E> - functional interface
		 * SAM - boolean test(E element)
		 */
		System.out.println("Removed -  "+
		products.removeIf(p -> p.getPrice()>100));
		System.out.println("after remove -");
		products.forEach(p -> System.out.println(p));
	}

}
