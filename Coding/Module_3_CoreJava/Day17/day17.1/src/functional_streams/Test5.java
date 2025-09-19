package functional_streams;
import static com.shop.utils.ShopUtils.*;

import java.util.Comparator;
import java.util.Map;

import com.shop.core.Category;
import com.shop.core.Product;

public class Test5 {

	public static void main(String[] args) {
		/* 
		 *  
		 * display sum of prices of the products from specified
		 * category, from the map
		 * 
		 */
		Category category=Category.OIL;
		Map<Integer, Product> productMap =
				populateProductMap(populateProductList());
	System.out.println("All products");
	    productMap.forEach((k,v) -> System.out.println(v));
	  
	    double sum=productMap.values() //Collection<Product>
	    .stream() //Steam<Product>
	    .filter(p -> p.getProductCategory()==category) //filtered Stream<Product>
	    .mapToDouble(p -> p.getPrice()) //DoubleStream
	    .sum();//special case of reduction
	    System.out.println("Sum of prices of fruits - "+sum);
	    
	    
	
	}

}
