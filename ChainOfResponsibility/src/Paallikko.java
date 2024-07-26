
public class Paallikko extends Palkankorotus{
	private final double PALKANKOROTUS = 2.5 * BASE;
	
	public void kasittelePyynto(Pyynto pyynto) {
		if(pyynto.getMaara() < PALKANKOROTUS && pyynto.getMaara() > BASE) {
			System.out.println("Paallikko antaa " + pyynto.getMaara() + " prosentin palkankorotuksen.");
		} else {
			super.kasittelePyynto(pyynto);
		}
	}
}
