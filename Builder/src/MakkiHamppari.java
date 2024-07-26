
public class MakkiHamppari {
	private Leipa leipa;
	private Pihvi pihvi;
	private Salaatti salaatti;
	private Majoneesi majoneesi;
	private Tomaatti tomaatti;
	private Kurkku kurkku;
	
	public void setLeipa(Leipa leipa) {
		this.leipa = leipa;
	}
	public void setPihvi(Pihvi pihvi) {
		this.pihvi = pihvi;
	}
	public void setSalaatti(Salaatti salaatti) {
		this.salaatti = salaatti;
	}
	public void setMajoneesi(Majoneesi majoneesi) {
		this.majoneesi = majoneesi;
	}
	public void setTomaatti(Tomaatti tomaatti) {
		this.tomaatti = tomaatti;
	}
	public void setKurkku(Kurkku kurkku) {
		this.kurkku = kurkku;
	}
	@Override
	public String toString() {
		return "MakkiHamppari: " + leipa.getNimi() + ", " + pihvi.getNimi() + ", " + salaatti.getNimi()
		+ ", " + majoneesi.getNimi() + ", " + tomaatti.getNimi() + " ja " + kurkku.getNimi();
	}
}
