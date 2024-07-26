import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		Esimies esimies = new Esimies();
		Paallikko paallikko = new Paallikko();
		Toimitusjohtaja toimitusjohtaja = new Toimitusjohtaja();
		
		esimies.setSeuraava(paallikko);
		paallikko.setSeuraava(toimitusjohtaja);
		
		//syötä kirjain lopettaaksesi
		try {
			while(true) {
				System.out.println("Anna palkankorotusprosentti niin näet, kuka hoitaa käsittelyn.");
				double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
				esimies.kasittelePyynto(new Pyynto(d));
			}
		} catch (Exception e) {
			System.out.println("Ohjelma lopettaa.");
			System.exit(1);
		}
	}
}
