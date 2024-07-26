
public class Kana extends TayteDecorator implements IPizza{
	private double hinta = 3.90;

	public Kana(IPizza pizzaToBeDecorated) {
		super(pizzaToBeDecorated);
	}

	public double getHinta() {
		return hinta + super.getHinta();
	}
}
