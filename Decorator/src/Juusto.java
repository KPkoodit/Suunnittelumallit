
public class Juusto extends TayteDecorator implements IPizza{
	private double hinta = 2.60;

	public Juusto(IPizza pizzaToBeDecorated) {
		super(pizzaToBeDecorated);
	}

	public double getHinta() {
		return hinta + super.getHinta();
	}
}
