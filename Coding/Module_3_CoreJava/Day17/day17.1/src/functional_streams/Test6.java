package functional_streams;
import static com.shop.utils.ShopUtils.populateProductList;
import static com.shop.utils.ShopUtils.populateProductMap;

import java.util.Map;

import com.shop.core.Category;
import com.shop.core.Product;
import com.shop.custom_exceptions.ProductHandlingException;

public class Test6 {

	public static void main(String[] args) throws ProductHandlingException{
		/* 
		 *  
		 * display average of prices of the products from specified
		 * category, from the map
		 * 
		 */
		Category category=Category.SPICES;
		Map<Integer, Product> productMap =
				populateProductMap(populateProductList());
	System.out.println("All products");
	    productMap.forEach((k,v) -> System.out.println(v));
	  
	    double avg=productMap.values() //Collection<Product>
	    .stream() //Steam<Product>
	    .filter(p -> p.getProductCategory()==category) //filtered Stream<Product>
	    .mapToDouble(p -> p.getPrice()) //DoubleStream
	    .average()
	    .orElseThrow(() -> new ProductHandlingException("No products under specified category"));//either rets a value if preset , o.w throws - 
	    //NoSuchElementException  -> replace by it custom exception
	    System.out.println("Avg of prices of fruits - "+avg);
	    
	    
	
	}

}
