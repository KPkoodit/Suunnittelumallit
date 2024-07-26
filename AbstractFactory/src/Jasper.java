
public class Jasper{
	private Vaate lippis;
	private Vaate paita;
	private Vaate housut;
	private Vaate kengat;
	
	public Jasper(AsuFactory factory) {
		lippis = factory.munLippis();
		paita = factory.munPaita();
		housut = factory.munHousut();
		kengat = factory.munKengat();
	}
	
	public String mitaMullaOnPaalla() {
		return lippis.toString() + paita.toString() + housut.toString() + kengat.toString();
	}
	
}
