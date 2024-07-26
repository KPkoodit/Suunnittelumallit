
public class Tomaattikastike extends TayteDecorator implements IPizza{
	private double hinta = 2.60;

	public Tomaattikastike(IPizza pizzaToBeDecorated) {
		super(pizzaToBeDecorated);
	}

	public double getHinta() {
		return hinta + super.getHinta();
	}
}
