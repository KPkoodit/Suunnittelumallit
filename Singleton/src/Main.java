
public class Main {

	public static void main(String[] args) {
		PaivanTee tee = PaivanTee.getInstance();
		tee.setTee("sencha kura");
		System.out.println("5.2.2023: " + tee.getTee());
		
		PaivanTee tee2 = PaivanTee.getInstance();
		tee2.setTee("gyokuro hiki");
		System.out.println("6.2.2023: " + tee2.getTee());
		System.out.println("6.2.2023: " + tee.getTee()); // tulisi näyttää tee2 arvo
	}

}
