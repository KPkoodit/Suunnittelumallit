
public abstract class Palkankorotus {
	
	protected static final double BASE = 2;
	private Palkankorotus seuraava;
	
	public void setSeuraava(Palkankorotus seuraava) {
		this.seuraava = seuraava;
	}
	
	public void kasittelePyynto(Pyynto pyynto) {
		if(seuraava != null) {
			seuraava.kasittelePyynto(pyynto);
		}
	}
}
