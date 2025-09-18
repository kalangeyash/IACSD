package java8_features;

public interface AnotherFormula {
	int DATA = 200;

	double calculate(double a, double b);

	default double squareIt(double a) {
		System.out.println("in i/f default method "+getClass());
		return (a-1) * (a-1);
	}

}
