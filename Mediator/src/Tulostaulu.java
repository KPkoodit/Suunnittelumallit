import java.util.ArrayList;
import java.util.List;

public class Tulostaulu {

	private List<Tulosrivi> tulosrivit;
    
    public Tulostaulu() {
        tulosrivit = new ArrayList<>();
    }
    
    public void lisaaTulosrivi(Tulosrivi rivi) {
        tulosrivit.add(rivi);
    }
    
    public void tulosta() {
        System.out.println("Tulostaulu:");
        System.out.println("Nimi\t\tHyppy 1\tHyppy 2\tPisteet");
        for (int i = 0; i < tulosrivit.size(); i++) {
            Tulosrivi rivi = tulosrivit.get(i);
            System.out.printf("%s\t%.1f m\t%.1f m\t%.1f\n", 
                    rivi.getHyppaaja().getNimi(), 
                    rivi.getHyppy1(), rivi.getHyppy2(), 
                    rivi.getPisteet());
        }
    }
}
