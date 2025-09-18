package fruits;

public class Mango extends Fruit {
	@Override 
	public void taste() {
		System.out.println("sweet in taste!");
	}

	public void pulp() {
		System.out.println("extrating Mango pulp...");
	}
}
