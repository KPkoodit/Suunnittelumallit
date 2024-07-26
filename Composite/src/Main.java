//client
public class Main {

	public static void main(String[] args) {
		Laiteosa kotelo = new Kotelo(100.00);
		Laiteosa emolevy = new Emolevy(100.00);
		Laiteosa muistipiiri = new Muistipiiri(100.00);
		Laiteosa naytonohjain = new Naytonohjain(100.00);
		Laiteosa prosessori = new Prosessori(100.00);
		Laiteosa verkkokortti = new Verkkokortti(100.00);
		Laiteosa virtalahde = new Virtalahde(100.00);
		
		emolevy.addLaiteosa(verkkokortti);
		kotelo.addLaiteosa(emolevy);
		kotelo.addLaiteosa(muistipiiri);
		kotelo.addLaiteosa(naytonohjain);
		kotelo.addLaiteosa(prosessori);
		kotelo.addLaiteosa(virtalahde);
		
		double yhteishinta = kotelo.getHinta();
		System.out.println("Tietokone maksaa: " + yhteishinta);
	}

}
