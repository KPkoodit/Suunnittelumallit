
public class Main {

	public static void main(String[] args) {
		
		Valkokangas vk = new Valkokangas();
		Command vkYlos = new YlosCommand(vk);
		Command vkAlas = new AlasCommand(vk);
		
		WallButton buttonYlos = new WallButton(vkYlos);
		WallButton buttonAlas = new WallButton(vkAlas);
		
		buttonYlos.push();
		buttonAlas.push();
	}
}
