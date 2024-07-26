import java.util.List;

public class Strategia2 implements ListConverter{

	@Override
	public void listToString(List<String> lista) {
		String[] taulukko = new String[lista.size()];
		lista.toArray(taulukko);
		
		for(int i = 0; i < lista.size(); i++) {
			if(i % 2 == 1) {
				System.out.println(taulukko[i] + "\n");
			} else {
				System.out.println(taulukko[i]);
			}
		}
	}

	

}
