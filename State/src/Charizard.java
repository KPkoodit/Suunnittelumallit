
public class Charizard extends State{
	private static Charizard instanssi;
	private static String nimi = "Charizard";
	private final int level = 123456789;
	
	private Charizard() {
	}
	
	public static Charizard getInstance() {
		if (instanssi == null){
			instanssi = new Charizard();	
		}
		System.out.println(nimi);
		return instanssi;
	}
	
	public int lepaa() {
		System.out.println(nimi + " lepää. Voima vähenee -3.");
		return -3;
	}
	
	public int kaytaHeikkoIsku() {
		System.out.println(nimi + " tekee heikon iskun.  Voima lisääntyy 7.");
		return 7;
	}
	
	public int kaytaVahvaIsku() {
		System.out.println(nimi + " tekee vahvan iskun. Voima lisääntyy 13.");
		return 13;
	}

	public int getLevel() {
		return level;
	}
}
