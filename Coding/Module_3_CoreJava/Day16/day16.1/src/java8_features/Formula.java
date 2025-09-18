package java8_features;

public interface Formula {
	int DATA = 100;

	double calculate(double a, double b);

	default double squareIt(double a) {
		System.out.println("in i/f default method "+getClass());
		return a * a;
	}
	//add static method, public 
	static void show() {
		System.out.println("in i/f static method");
	}

}
