
public class Kirsikkatomaatti extends TayteDecorator implements IPizza{
	private double hinta = 1.80;

	public Kirsikkatomaatti(IPizza pizzaToBeDecorated) {
		super(pizzaToBeDecorated);
	}

	public double getHinta() {
		return hinta + super.getHinta();
	}
}
