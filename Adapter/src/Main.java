
public class Main {

	public static void main(String[] args) {
		Henkilo henkilo = new Henkilo();
		Maito maito = new Maito("jaakaapissa", "Juustoportti");
		IJuotava lamminTee = new LamminTee(maito);
		
		henkilo.setJuoma(lamminTee);
		lamminTee.otaJaakaapista();
		lamminTee.onkoJuustoportin();
		henkilo.getJuoma();
	}
}
