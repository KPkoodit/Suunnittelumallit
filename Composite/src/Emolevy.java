import java.util.ArrayList;
import java.util.List;

//composite
public class Emolevy implements Laiteosa{
	private List<Laiteosa> osaList = new ArrayList<Laiteosa>();
	private double yhteishinta = 0;
	
	public Emolevy(double hinta) {
		yhteishinta = hinta;
	}

	@Override
	public double getHinta() {
		for(Laiteosa lo : osaList) {
			yhteishinta += lo.getHinta();
		}	
		return yhteishinta;
	}

	@Override
	public void addLaiteosa(Laiteosa osa) {
		osaList.add(osa);
	}
}
