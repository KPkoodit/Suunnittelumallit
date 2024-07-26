//originator
public class Arvuuttaja {
	
	public Object liityPeliin() {
		int luku = (int)(Math.random()* 6 + 1);
		return new Memento(luku);
	}
	
	public boolean arvaus(Object o, int arvaus, Luku lukuOlio) {
		synchronized(lukuOlio) {
			Memento m = (Memento) o;
			int luku =  m.getLuku();
			if(luku == arvaus) {
				System.out.println("Arvaus oikein");
				System.out.println("Säie valmis.");
				return true;
			} else {
				System.out.println("Arvaa uusiksi");
				return false;
			}
		}
	}
	
	private class Memento {
		private int luku;
		
		public Memento(int luku) {
			this.luku = luku;
		}

		public int getLuku() {
			return luku;
		}
	}
}
