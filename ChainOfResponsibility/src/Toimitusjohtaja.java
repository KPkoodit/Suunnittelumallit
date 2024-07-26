
public class Toimitusjohtaja extends Palkankorotus{
private final double PALKANKOROTUS = 2.5 * BASE;
	
	public void kasittelePyynto(Pyynto pyynto) {
		if(pyynto.getMaara() >= PALKANKOROTUS) {
			System.out.println("Toimitusjohtaja antaa " + pyynto.getMaara() + " prosentin palkankorotuksen.");
		}
	}
}
