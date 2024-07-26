import java.util.List;

public class Strategia3 implements ListConverter{

	@Override
	public void listToString(List<String> lista) {
		for(int i = 0; i < lista.size(); i++) {
			if (i % 3 == 2) {
				System.out.println(lista.get(i) + "\n");
			} else {
				System.out.println(lista.get(i));
			}
		}
	}
}
