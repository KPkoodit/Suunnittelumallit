
public class PaivanTee {
	private String tee;
	private static PaivanTee instanssi;
	
	private PaivanTee() {
	}
	
	public static PaivanTee getInstance() {
		if (instanssi == null){
			instanssi = new PaivanTee();	
		}
		return instanssi;
	}
	
	public void setTee(String tee) {
		this.tee = tee;
	}
	
	public String getTee() {
		return tee;
	}
}
