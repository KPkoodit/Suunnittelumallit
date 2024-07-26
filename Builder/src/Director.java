
public class Director {
	private Builder hamppariBuilder;
	
	public void setBuilder(Builder builder) {
		hamppariBuilder = builder;
	}
	
	public void teeHamppari() {
		hamppariBuilder.teeUusiHamppari();
		hamppariBuilder.rakennaLeipa();
		hamppariBuilder.rakennaPihvi();
		hamppariBuilder.rakennaSalaatti();
		hamppariBuilder.rakennaMajoneesi();
		hamppariBuilder.rakennaTomaatti();
		hamppariBuilder.rakennaKurkku();
	}
}
