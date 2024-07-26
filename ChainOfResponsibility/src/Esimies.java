
public class Esimies extends Palkankorotus {
	private final double PALKANKOROTUS = BASE;
	
	public void kasittelePyynto(Pyynto pyynto) {
		if(pyynto.getMaara() <= PALKANKOROTUS) {
			System.out.println("Esimies antaa " + pyynto.getMaara() + " prosentin palkankorotuksen.");
		} else {
			super.kasittelePyynto(pyynto);
		}
	}
}
