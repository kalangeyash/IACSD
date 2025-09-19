package functional_streams;
import static com.shop.utils.ShopUtils.*;

import java.util.Comparator;
import java.util.Map;

import com.shop.core.Category;
import com.shop.core.Product;

public class Test3 {

	public static void main(String[] args) {
		/* 
		 * Get product map
		 * Filter by category
		 * Sort the filtered products as per price 
		 * n display them
		 */
		Category category=Category.FRUITS;
		Comparator<Product> comp=(p1,p2)-> ((Double)p1.getPrice()).compareTo(p2.getPrice());
		Map<Integer, Product> productMap = populateProductMap(populateProductList());
	System.out.println("All products");
	    productMap.forEach((k,v) -> System.out.println(v));
	    System.out.println("Filter sorted products - ");
		productMap.values() //Collection<Product>
		.stream() //Stream<Product>
		.filter(p -> p.getProductCategory()==category)//Filtered Stream<Product>
		.sorted(comp)
		.forEach(p -> System.out.println(p));

	}

}
