import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Luku extends Thread {
	private Arvuuttaja a;
	private Object object;
	
	public Luku() {
		a = new Arvuuttaja();
	}
	
	public void run() {
		System.out.println("Tervetuloa mukaan peliin. Arvaa nopan silmäluku.");
		object = a.liityPeliin();
		arvaa();
	}
	
	public void arvaa() {
		try {
			boolean osuikoArvaus = false;
			while(!osuikoArvaus) {
				int arvaus = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
				osuikoArvaus = a.arvaus(object, arvaus, this);
			}
		} catch (Exception e) {
			System.out.println("Väärä syöte.");
		}
	}
}
