package java8_features;

import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		Formula f1 = new Formula1();
		System.out.println(f1.calculate(10, 20));
		System.out.println(f1.squareIt(11));
		f1 = new Formula2();
		System.out.println(f1.calculate(10, 20));
		System.out.println(f1.squareIt(11));
		// create immutable List of integers - 10,20,30,40,50
		List<Integer> list = List.of(10, 20, 30, 40, 50);
		List<Double> doubelList = List.of(10.0, 20.34, 30.12, 40.55, 50.78);

	}

}
