package fruits;

public class Orange extends Fruit {
	@Override 
	public void taste() {
		System.out.println("sour in taste!");
	}

	public void juice() {
		System.out.println("extracting Orange Juice");
	}
}
