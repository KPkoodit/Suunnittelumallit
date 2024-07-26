
public class Porkkanaraaste extends TayteDecorator implements IPizza{
	private double hinta = 2.20;

	public Porkkanaraaste(IPizza pizzaToBeDecorated) {
		super(pizzaToBeDecorated);
	}

	public double getHinta() {
		return hinta + super.getHinta();
	}
}
