package functional_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import com.shop.core.Product;

import static com.shop.utils.ShopUtils.*;

public class Test1 {

	public static void main(String[] args) {
		//Create int[] ---> IntStream & display its contents.
		int[] data= {1,2,45,67,-100,56,45,10};
		Arrays.stream(data) //IntStream - src
		.forEach(i -> System.out.println(i));
		System.out.println("IntStream's range");
		IntStream.rangeClosed(10, 100) //IntStream - 10 -100
		.forEach(i -> System.out.print(i+" "));
		System.out.println("IntStream's of");
		IntStream.of(10,20,34,56,78)
		.forEach(i -> System.out.print(i+" "));
		/*
		 * get list of products -attach sequential access stream - display the products
		 */
		System.out.println("All products accessed in seq manner- ");
		List<Product> products = populateProductList();
		products.stream()  //Stream<Product>
		.forEach(p -> System.out.println(p));//terminal operation
		
		System.out.println("All products accessed in parallel manner- ");
		products.parallelStream() //Stream<Product>
		.forEach(p -> System.out.println(p));
		/*
		 * 3. Create stream of ints between 1-100 & display all even elements.

		 */
		System.out.println("Even nos from 1-100");
		IntStream.rangeClosed(1, 100) //IntStream 1-100
		.filter(i -> i % 2 == 0) //IntStream - even nos
		.forEach(i -> System.out.println(i));

	}

}
