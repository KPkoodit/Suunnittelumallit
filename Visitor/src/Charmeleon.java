
public class Charmeleon extends State{
	private static Charmeleon instanssi;
	private static String nimi = "Charmeleon";
	private final int level = 21;
	
	private Charmeleon() {
	}
	
	public static Charmeleon getInstance() {
		if (instanssi == null){
			instanssi = new Charmeleon();	
		}
		System.out.println(nimi);
		return instanssi;
	}
	
	public int lepaa() {
		System.out.println(nimi + " lepää. Exp -2.");
		return -2;
	}
	
	public int kaytaHeikkoIsku() {
		System.out.println(nimi + " tekee heikon iskun. Exp +3.");
		return 3;
	}
	
	public int kaytaVahvaIsku() {
		System.out.println(nimi + " tekee vahvan iskun. Exp +6.");
		return 6;
	}
	
	public State evolvaus() {
		System.out.println(nimi + " vaihtaa muotoa.");
		State newState = Charizard.getInstance();
		changeState(newState);
		return newState;
	}

	public int getLevel() {
		return level;
	}
}
