
public class LamminTee implements IJuotava{
	
	private Maito maito;

	public LamminTee(Maito maito) {
		this.maito = maito;
	}
	
	@Override
	public void otaJaakaapista() {
		maito.getSijainti();
		maito.setSijainti("pyödällä");
		System.out.println("kaadanpa maitoa teehen");
		maito.setSijainti("jääkaapissa");
	}

	@Override
	public boolean onkoJuustoportin() {
		boolean vastaus = false;
		if(maito.getMerkki().toLowerCase().equals("juustoportti")) {
			System.out.println("maito on Juustoportilta");
			vastaus = true;
		}
		
		return vastaus;
	}
}
