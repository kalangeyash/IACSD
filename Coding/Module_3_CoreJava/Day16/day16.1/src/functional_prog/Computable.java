package functional_prog;

/*
 * add functional interface -
 *  -to compute ANY arithmetic operation on 2 double operands
 */
@FunctionalInterface
public interface Computable {
	double compute(double a, double b);
	
}
