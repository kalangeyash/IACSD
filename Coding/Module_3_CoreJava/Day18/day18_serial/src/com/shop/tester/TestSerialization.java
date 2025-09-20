package com.shop.tester;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Scanner;

import com.shop.core.Product;

import static com.shop.utils.ShopUtils.*;

public class TestSerialization {

	public static void main(String[] args) {
		/*
		 * Store product details (map) in bin file using serialization
		 */
		System.out.println("Enter binary file name");
		try(Scanner sc=new Scanner(System.in);
				ObjectOutputStream out=
						new ObjectOutputStream(new 
								FileOutputStream(sc.nextLine()))) 
		{
			//get product map from utils
			Map<Integer, Product> productMap 
			= populateProductMap(populateProductList());
			out.writeObject(productMap);
			System.out.println("data stored !");			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");

	}

}
