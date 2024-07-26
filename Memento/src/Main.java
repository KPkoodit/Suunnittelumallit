import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		int kierrokset = 0;
		Luku[] luvut;
		
		System.out.println("Anna pelattavien kierrosten määrä");
		try {
			kierrokset = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		} catch (NumberFormatException e) {
			System.out.println("Väärä formaatti.");
		} catch (IOException e) {
			System.out.println("IO ongelma.");
		}
		
		luvut = new Luku[kierrokset];
		
		for(int i = 0; i < kierrokset; i++) {
			luvut[i] = new Luku();
			luvut[i].start();
			try {
				luvut[i].join();
			} catch (InterruptedException e) {
				System.out.println("Wirhe");
			}
		}
		
		System.out.println("Peli loppui!");
	}
}
