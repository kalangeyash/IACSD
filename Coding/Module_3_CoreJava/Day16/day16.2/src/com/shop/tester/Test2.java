package com.shop.tester;

import static com.shop.utils.ShopUtils.*;

import java.util.Map;

import com.shop.core.Product;

public class Test2 {

	public static void main(String[] args) {
		// get populated Map of products
		Map<Integer, Product> productMap = populateProductMap(populateProductList());
		/*
		 * New default method added in Map i/f public default void forEach(BiConsumer<?
		 * super K,? super V> action) BiConsumer<T,U> - functional i/f SAM - public void
		 * accept(T t,U u)
		 */
		// solve - display entries from the map.
		productMap.forEach((key, value) -> System.out.println("Key " + key + " Value " + value));

	}

}
