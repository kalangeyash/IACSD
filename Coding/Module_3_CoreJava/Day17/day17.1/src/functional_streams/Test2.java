package functional_streams;

import static com.shop.utils.ShopUtils.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.shop.core.Category;
import com.shop.core.Product;

public class Test2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			/*
			 * get product list. 
			 * Accept manufacture date from user 
			 * Display all the products
			 * produced after this date
			 */
			List<Product> productList = populateProductList();
			System.out.println("All products");
			productList.forEach(p -> System.out.println(p));
			System.out.println("Enter Date - yr-mon-day");
			LocalDate date=LocalDate.parse(sc.next());
			System.out.println("Enter Category");
			Category category=Category.valueOf(sc.next().toUpperCase());
			System.out.println("Filtered products by category n date - ");
			productList.stream() //Stream<Product>
			.filter(p -> p.getManufactureDate().isAfter(date)) 
			//Stream<Product> : filtered by date
			.filter(p -> p.getProductCategory()==category)
			//Stream<Product> : category
			.forEach(p -> System.out.println(p));
			
			
			
			
			
			
			
		}

	}

}
