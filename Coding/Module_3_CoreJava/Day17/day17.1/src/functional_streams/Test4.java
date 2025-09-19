package functional_streams;
import static com.shop.utils.ShopUtils.*;

import java.util.List;

import com.shop.core.Category;
import com.shop.core.Product;
/*
 * 4.5 Prompt user for category n discount.
Apply that discount on all products of specified category n print it.


 */
public class Test4 {

	public static void main(String[] args) {
		List<Product> productList = populateProductList();
		System.out.println("All products");
		productList.forEach(p -> System.out.println(p));
		double discount=20;
		Category category=Category.FRUITS;
		System.out.println("-----------------------");
		productList.stream()
		.filter(p -> p.getProductCategory()==category)
		.peek(p -> p.setPrice(p.getPrice()-discount))
		.forEach(p -> System.out.println(p));
		System.out.println("----------------------");
		System.out.println("All products again - ");
		productList.forEach(p -> System.out.println(p));

	}

}
