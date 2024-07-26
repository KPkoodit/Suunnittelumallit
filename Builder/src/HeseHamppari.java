
public class HeseHamppari {
	private String leipa = "";
	private String pihvi = "";
	private String salaatti = "";
	private String majoneesi = "";
	private String tomaatti = "";
	private String kurkku = "";
	
	public void setLeipa(String leipa) {
		this.leipa = leipa;
	}
	public void setPihvi(String pihvi) {
		this.pihvi = pihvi;
	}
	public void setSalaatti(String salaatti) {
		this.salaatti = salaatti;
	}
	public void setMajoneesi(String majoneesi) {
		this.majoneesi = majoneesi;
	}
	public void setTomaatti(String tomaatti) {
		this.tomaatti = tomaatti;
	}
	public void setKurkku(String kurkku) {
		this.kurkku = kurkku;
	}
	@Override
	public String toString() {
		return "HeseHamppari: " + leipa + ", " + pihvi + ", " + salaatti + ", "
				+ majoneesi + ", " + tomaatti + " ja " + kurkku;
	}
}
