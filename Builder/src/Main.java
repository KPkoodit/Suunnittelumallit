
public class Main {

	public static void main(String[] args) {
		//hesburger
		Director director = new Director();
		
		Builder builder = new Hesburger();
		
		director.setBuilder(builder);
		director.teeHamppari();
		
		HeseHamppari heseHamppari = (HeseHamppari)builder.getHamppari();
		System.out.println(heseHamppari);
		
		//McDonalds
		Director director2 = new Director();
		
		McDonalds builder2 = new McDonalds();
		
		director2.setBuilder(builder2);
		director2.teeHamppari();
		
		MakkiHamppari makkiHamppari = (MakkiHamppari) builder2.getHamppari();
		System.out.println(makkiHamppari);
	}
}
