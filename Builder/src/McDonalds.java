
public class McDonalds implements Builder{

	private MakkiHamppari makkiHamppari;

	@Override
	public void teeUusiHamppari() {
		makkiHamppari = new MakkiHamppari();
	}

	@Override
	public void rakennaLeipa() {
		makkiHamppari.setLeipa(new Leipa("palanut leipä"));
	}

	@Override
	public void rakennaPihvi() {
		makkiHamppari.setPihvi(new Pihvi("pahvipihvi"));
	}

	@Override
	public void rakennaSalaatti() {
		makkiHamppari.setSalaatti(new Salaatti("nahistunut salaatti"));
	}

	@Override
	public void rakennaMajoneesi() {
		makkiHamppari.setMajoneesi(new Majoneesi("toffeemajoneesi"));
	}

	@Override
	public void rakennaTomaatti() {
		makkiHamppari.setTomaatti(new Tomaatti("toissapäiväinen tomaatti"));
	}

	@Override
	public void rakennaKurkku() {
		makkiHamppari.setKurkku(new Kurkku("suolaa ilman kurkkua"));
	}

	@Override
	public Object getHamppari() {
		return makkiHamppari;
	}
}
