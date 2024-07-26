
public class Kisasihteeri {
	public double laskePisteet(Hyppy hyppy) {
        double[] tyylipisteTaulukko = hyppy.getTyylipisteet();
        double tyylipisteet = 0;
        
        for(int i = 0; i < tyylipisteTaulukko.length; i++) {
        	tyylipisteet += tyylipisteTaulukko[i];
        }
        
        double pituusPisteet = hyppy.getPituus();
        double pisteet = pituusPisteet + tyylipisteet;
        return pisteet;
    }
}
