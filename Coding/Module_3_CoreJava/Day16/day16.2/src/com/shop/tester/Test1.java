package com.shop.tester;
import static com.shop.utils.ShopUtils.*;

import java.util.List;

import com.shop.core.Product;

public class Test1 {

	public static void main(String[] args) {
		//get product list
		List<Product> products=populateProductList();
		//display all products - FP
		products.forEach(p -> System.out.println(p));//internal iteration
		//increase all product prices by 10 - FP
		products.forEach(p -> p.setPrice(p.getPrice()+10));
		System.out.println("Updated list");
		products.forEach(p -> System.out.println(p));

	}

}
