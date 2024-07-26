
public class Hyppy {
	private double pituus;
    private double[] tyylipisteet;

    public Hyppy(double pituus, double[] tyylipisteet) {
        this.pituus = pituus;
        this.tyylipisteet = tyylipisteet;
    }

    public double getPituus() {
        return pituus;
    }

    public double[] getTyylipisteet() {
        return tyylipisteet;
    }

    public void setPituus(double pituus) {
        this.pituus = pituus;
    }

    public void setTyylipisteet(double[] tyylipisteet) {
        this.tyylipisteet = tyylipisteet;
    }
}

