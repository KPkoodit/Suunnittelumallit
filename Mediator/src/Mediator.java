import java.util.ArrayList;
import java.util.List;

public class Mediator {
	private List<Hyppaaja> hyppaajat;
	private List<Arvostelutuomari> tuomarit;
	private Mittaaja mittaaja;
	private Kisasihteeri sihteeri;
	private Tulostaulu tulostaulu;
	
	public Mediator() {
		hyppaajat = new ArrayList<Hyppaaja>();
		tuomarit = new ArrayList<Arvostelutuomari>();
		mittaaja = new Mittaaja();
		sihteeri = new Kisasihteeri();
		tulostaulu = new Tulostaulu();
	}
	
	public void kisaAlkaa() {
		for(int i = 0; i < 5; i++ ) {
			hyppaajat.add(new Hyppaaja("Hyppääjä " + (i+1)));
		}
		for(int i = 0; i < 5; i++ ) {
			tuomarit.add(new Arvostelutuomari());
		}
	}
	
	public void hyppaaYksiKierros() {
		for(int i = 0; i < hyppaajat.size(); i++) {
			double pituus = mittaaja.mittaaPituus();
			double [] pisteet = new double[tuomarit.size()];
			for(int j = 0; j < tuomarit.size(); j++) {
				pisteet[j] = tuomarit.get(j).arvosteleTyyli();
			}
			hyppaajat.get(i).addHyppy(new Hyppy(pituus, pisteet));
		}
	}

	public void laskePisteet() {
		for(int i = 0; i < hyppaajat.size(); i++) {
			double ekaHyppy = sihteeri.laskePisteet(hyppaajat.get(i).getHypyt().get(0));
			double tokaHyppy = sihteeri.laskePisteet(hyppaajat.get(i).getHypyt().get(1));
			tulostaulu.lisaaTulosrivi(new Tulosrivi(hyppaajat.get(i), hyppaajat.get(i).getHyppy(0).getPituus(), hyppaajat.get(i).getHyppy(1).getPituus(), ekaHyppy+tokaHyppy));
		}
	}
	
	public void naytaTulokset() {
		tulostaulu.tulosta();
	}
}
