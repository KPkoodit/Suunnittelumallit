
public class NopanHeitto extends Game{
	private int[] tulokset;
	private int heitot;
	
	@Override
	void initializeGame() {
		tulokset = new int[super.playersCount];
		System.out.println("Peli alkaa");
	}

	@Override
	void makePlay(int player) {
		int score = (int)(Math.random() * 6 + 1);
		tulokset[player] = score;
		heitot++;
		System.out.println("Pelaaja " + (player + 1) + " heittää " + score + ".");
	}

	@Override
	boolean endOfGame() {
		if(super.playersCount == heitot) {
			System.out.println("Peli loppuu.");
			return true;
		}
		return false;
	}

	@Override
	void printWinner() {
		int voittaja = -1;
		int suurinLuku = 0;
		for (int i = 0; i < tulokset.length; i++) {
			if(tulokset[i] > suurinLuku) {
				voittaja = i + 1;
				suurinLuku = tulokset[i];
			}
		}
		System.out.println("Voittaja on pelaaja " + voittaja + " tuloksella " + suurinLuku + ".\n");
	}

}
