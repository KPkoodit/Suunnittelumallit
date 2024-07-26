import java.util.ArrayList;
import java.util.List;

public class Hyppaaja {
	private String nimi;
    private List<Hyppy> hypyt;

    public Hyppaaja(String nimi) {
        this.nimi = nimi;
        this.hypyt = new ArrayList<>();
    }

    public String getNimi() {
        return nimi;
    }

    public List<Hyppy> getHypyt() {
        return hypyt;
    }

    public void addHyppy(Hyppy hyppy) {
        hypyt.add(hyppy);
    }

    public Hyppy getHyppy(int index) {
        return hypyt.get(index);
    }
}
