package com.shop.tester;

import static com.shop.utils.ShopUtils.populateProductList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.shop.core.Product;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> products=populateProductList();

		
//		Collections.sort(products,new Comparator<Product> (){
//			@Override
//			public int compare(Product p1 , Product p2)
//			{
//				return p1.getManufactureDate().compareTo(p2.getManufactureDate());
//			}
//			
//		});
		Collections.sort(products, (p1,p2)-> p1.getManufactureDate().compareTo(p2.getManufactureDate()));
		products.forEach(p-> System.out.println(p));
	}

}
