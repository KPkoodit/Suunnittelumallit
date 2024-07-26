
public class Herkkusieni extends TayteDecorator implements IPizza{
	private double hinta = 2.50;

	public Herkkusieni(IPizza pizzaToBeDecorated) {
		super(pizzaToBeDecorated);
	}

	public double getHinta() {
		return hinta + super.getHinta();
	}
}
