package com.shop.tester;
import com.shop.core.Category;
import com.shop.core.Product;
import static com.shop.utils.ShopUtils.populateProductList;
import static com.shop.utils.ShopUtils.populateProductMap;

import java.util.Collection;
import java.util.Map;

import com.shop.core.Product;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Product> productMap = populateProductMap(populateProductList());
		productMap.forEach((k,v) -> System.out.println(v));
		Category categoryB  = Category.BISCUITS;
		
		 productMap.values().removeIf( p -> p.getProductCategory() == categoryB);
		 System.out.println("\tAfter removale");
		 productMap.forEach((k,v) -> System.out.println(v));
		
	}

}
