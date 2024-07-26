
public class Henkilo {
	private IJuotava juoma;

	public Henkilo() {
	}

	public IJuotava getJuoma() {
		System.out.println("nyt teeni on valmista");
		return juoma;
	}

	public void setJuoma(IJuotava juoma) {
		System.out.println("valmistanpa teetä");
		this.juoma = juoma;
	}
}
