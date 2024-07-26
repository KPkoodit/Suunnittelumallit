
public class Maito {
	
	private String sijainti;
	private String merkki;
	
	public Maito(String sijainti, String merkki) {
		this.sijainti = sijainti;
		this.merkki = merkki;
	}

	public String getSijainti() {
		System.out.println("maito on " + sijainti);
		return sijainti;
	}

	public void setSijainti(String sijainti) {
		this.sijainti = sijainti;
		System.out.println("maito on " + sijainti);
	}

	public String getMerkki() {
		return merkki;
	}
}
