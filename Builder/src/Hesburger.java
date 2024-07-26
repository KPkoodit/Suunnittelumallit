
public class Hesburger implements Builder{
	
	private HeseHamppari heseHamppari;

	@Override
	public void teeUusiHamppari() {
		heseHamppari = new HeseHamppari();
	}

	@Override
	public void rakennaLeipa() {
		heseHamppari.setLeipa("littana leipä");
	}

	@Override
	public void rakennaPihvi() {
		heseHamppari.setPihvi("soijapihvi");
	}

	@Override
	public void rakennaSalaatti() {
		heseHamppari.setSalaatti("pahvisalaatti");
	}

	@Override
	public void rakennaMajoneesi() {
		heseHamppari.setMajoneesi("marmeladimajoneesi");
	}

	@Override
	public void rakennaTomaatti() {
		heseHamppari.setTomaatti("ohuen ohut tomaatti");
	}

	@Override
	public void rakennaKurkku() {
		heseHamppari.setKurkku("suolaton kurkku");
	}

	@Override
	public Object getHamppari() {
		return heseHamppari;
	}
}
