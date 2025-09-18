package fruits.generics;
import fruits.*;
import java.util.*;
/*
3. Write a static method in a non generic Utils class 
 - to display taste of all fruits from the fruit basket , represented by a List
Test Case - ArrayList<Apple>  , LinkedList<Orange> , Vector<Mango>
Refer - <fruits> package in day16.1 project.\

*/

/**
3. Write a static method in a non generic Utils class 
- to get sum of all numbers(integer | double | float | byte ..), stored in the Set .
Test cases - HashSet<Integer> , LinkedHashSet<Double> , TreeSet<Long>
OR
*/
public interface FruitsInterface {
	
	static double sumOfNumber(Set<? extends Number > numberSet )
	{
		double sum = 0;
//		numberSet.forEach((t,s) -> {
//			s = 0;
//			t +=s;
//			return t;
//		} );
		
		for(Number n : numberSet)
		{
			sum += n.doubleValue(); 
		}
		return sum;
	}

	static void displayTastes(List<? extends Fruit> basket) {
		basket.forEach(t -> t.taste()); 
	}
	
	static void addMango(List<?super Mango> mangoList,Mango ... mangoes)
	{
		for(Collection m: mangoList)
		{
			mangoList.add(m);
		}
	}
}
