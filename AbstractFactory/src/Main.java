
public class Main {

	public static void main(String[] args) {
		Jasper jasperKoulussa = new Jasper(new AdidasFactory());
		System.out.println("Jasper koulussa:");
		System.out.print(jasperKoulussa.mitaMullaOnPaalla());
		System.out.print("\n");
		
		Jasper jasperValmistunut = new Jasper(new BossFactory());
		System.out.println("Jasper valmistunut:");
		System.out.print(jasperValmistunut.mitaMullaOnPaalla());
	}

}
