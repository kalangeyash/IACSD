package java8_features;

public class Formula2 implements Formula,AnotherFormula {

	@Override
	public double calculate(double a, double b) {
		System.out.println(getClass() + " implements method");
		return a - b;
	}

	@Override
	public double squareIt(double a) {
		System.out.println(getClass() + " overriding def method "+Formula.DATA+" "+AnotherFormula.DATA);
		//how to refer to def method from i/f - super
		Formula.super.squareIt(34);
		AnotherFormula.super.squareIt(55);
		return (a + 1) * (a + 1);
	}

}
