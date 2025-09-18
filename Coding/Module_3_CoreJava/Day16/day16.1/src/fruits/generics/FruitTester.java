package fruits.generics;
import fruits.*;
import static fruits.generics.FruitsInterface.*;

import java.util.*;
import java.util.ArrayList;

import com.app.core.Emp;

public class FruitTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Apple> apples = new ArrayList<>(List.of(new Apple(), new Apple()));
		
		
		displayTastes(apples);
		
		HashSet<Integer> numberList = new HashSet<>(Arrays.asList(10,20,40,60));
		
		System.out.println(sumOfNumber(numberList));
		
		List<Mango> mangoList = new ArrayList<>();
		
	}

}

