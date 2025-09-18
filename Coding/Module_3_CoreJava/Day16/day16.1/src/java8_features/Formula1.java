package java8_features;

public class Formula1 implements Formula {

	@Override
	public double calculate(double a, double b) {
		System.out.println(getClass() +" implements method");
		Formula.show();
		
		return a+b;
	}

}
