
public class TayteDecorator implements IPizza{
	protected IPizza pizzaToBeDecorated;

	public TayteDecorator(IPizza pizzaToBeDecorated) {
		this.pizzaToBeDecorated = pizzaToBeDecorated;
	}

	@Override
	public double getHinta() {
		return pizzaToBeDecorated.getHinta();
	}

}
