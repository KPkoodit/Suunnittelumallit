
public class Virtalahde implements Laiteosa{
	private double hinta;

	public Virtalahde(double hinta) {
		this.hinta = hinta;
	}

	@Override
	public double getHinta() {
		return hinta;
	}

	@Override
	public void addLaiteosa(Laiteosa osa) {
		throw new RuntimeException
		("Laiteosaa ei voi lisätä yksittäisiin laitteisiin");
	}

}
