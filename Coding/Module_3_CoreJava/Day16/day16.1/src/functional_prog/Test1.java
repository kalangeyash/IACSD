package functional_prog;

public class Test1 {

	public static void main(String[] args) {
		// add 2 nos & display result
		Adder adder = new Adder();
		System.out.println(adder.compute(10, 20));
		Computable subtracter = new Computable() {

			@Override
			public double compute(double a, double b) {
				// TODO Auto-generated method stub
				return a - b;
			}
		};
		System.out.println(subtracter.compute(12, 13));
		/*
		 * Any functional interface reference can be substituted by labmda expression
		 */
		//function literal - assigning entire function definition to a variable
		Computable multiplier = (a,  b) -> a * b;
//		String s="hello";
//		int data=100;
		System.out.println(multiplier.compute(10, 20));
		

	}

}
