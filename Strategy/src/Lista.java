import java.util.ArrayList;
import java.util.List;

public class Lista {
	private List<String> lista = new ArrayList<String>();
	private ListConverter converter;

	public void tulostaLista() {
		converter.listToString(lista);
	}
	
	public void lisaa(String objekti) {
		lista.add(objekti);
	}
	
	public void lisaaStrategy(ListConverter lc) {
		converter = lc;
	}
}
