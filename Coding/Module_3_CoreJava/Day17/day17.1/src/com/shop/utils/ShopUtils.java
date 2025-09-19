package com.shop.utils;

import static com.shop.core.Category.BISCUITS;
import static com.shop.core.Category.BREAD;
import static com.shop.core.Category.FRUITS;
import static com.shop.core.Category.OIL;
import static java.time.LocalDate.now;
import static java.time.LocalDate.parse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.shop.core.Product;

public interface ShopUtils {
//add a static method to return List of some products'
	static List<Product> populateProductList() {
		// create empty ArrayList
		List<Product> list = new ArrayList<>();// size=0, init capa=0 : up casting
		// int productId, String name, String desc, int quantity, double price, Category
		// productCategory,
		// LocalDate manufactureDate
		list.add(new Product(10, "Brown_Bread", "Healthy Bread", 100, 40, BREAD, now()));
		list.add(new Product(100, "White_Bread", "Tasty Bread", 70, 35, BREAD, parse("2024-05-09")));
		list.add(new Product(50, "Marie", "Healthy Biscuits", 80, 10, BISCUITS, parse("2025-05-01")));
		list.add(new Product(40, "Monaco", "Salty Biscuits", 75, 15, BISCUITS, parse("2023-04-21")));
		list.add(new Product(60, "Sunflower_Oil", "Healthy Oil", 50, 240, OIL, parse("2024-01-20")));
		list.add(new Product(70, "Gemini_Oil", "Vegetable Oil", 80, 220, OIL, parse("2025-05-30")));
		list.add(new Product(80, "Mango", "Seasonal Fruit", 45, 800, FRUITS, parse("2024-05-16")));
		list.add(new Product(15, "Watermelon", "Great Fruit", 60, 70, FRUITS, parse("2025-05-04")));
		list.add(new Product(54, "Orange", "Citrus Fruit", 100, 300, FRUITS, parse("2025-05-06")));
		list.add(new Product(18, "Apple", "Good Fruit", 50, 150, FRUITS, parse("2025-04-24")));

		return list;
	}

	// add a static method to return Map of products from populated list of products
	static Map<Integer, Product> populateProductMap(List<Product> productList) {
		Map<Integer, Product> map = new HashMap<>();// size=0, init capa=16 , load factor=.75
//		for (Product p : productList)
//			System.out.println("Put rets " + map.put(p.getProductId(), p)); //imperative style of programming - WHAT , HOW
		productList.forEach(p -> map.put(p.getProductId(), p));
		//FP - WHAT : programmer , HOW - forEach
		System.out.println("size of the map " + map.size());
		return map;
	}

}
