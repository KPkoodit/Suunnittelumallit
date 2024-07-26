
public class Charmander extends State{
	private static Charmander instanssi;
	private static String nimi = "Charmander";
	private final int level = 9;
	
	private Charmander() {
	}
	
	public static Charmander getInstance() {
		if (instanssi == null){
			instanssi = new Charmander();	
		}
		System.out.println(nimi);
		return instanssi;
	}
	
	public int lepaa() {
		System.out.println(nimi + " lepää. Exp -1.");
		return -1;
	}
	
	public int kaytaHeikkoIsku() {
		System.out.println(nimi + " tekee heikon iskun. Exp +2.");
		return 2;
	}
	
	public int kaytaVahvaIsku() {
		System.out.println(nimi + " tekee vahvan iskun. Exp +4.");
		return 4;
	}
	
	public State evolvaus() {
		System.out.println(nimi + " vaihtaa muotoa.");
		State newState = Charmeleon.getInstance();
		changeState(newState);
		return newState;
	}

	public int getLevel() {
		return level;
	}
}
