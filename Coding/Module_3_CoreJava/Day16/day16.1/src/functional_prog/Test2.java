package functional_prog;

import java.util.List;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * Method of Iterable<T> i/f
		 * default void forEach(Consumer<? super T> action)
		 * java.util.function - Consumer : functional i/f
		 * SAM - void accept(T element)
		 * 
		 */
		List<Integer> list=List.of(1,2,3,4,5,67,10,-10);
		//Iterate over the list to display the elements : using lambda expression
		list.forEach(t -> System.out.print(t+" "));
		Set<Double> set=Set.of(10.0, 56.8, 3.8, 56.0, 44.67);
		//display elems from the set - using lambda expression
		set.forEach(d -> System.out.println(d));

	}

}
