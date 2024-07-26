import java.util.Iterator;
import java.util.List;

public class Strategia1 implements ListConverter{

	@Override
	public void listToString(List<String> lista) {
		Iterator<String> iteraattori = lista.iterator();
		while (iteraattori.hasNext()){
			System.out.println(iteraattori.next()+ "\n");
		}
	}
}
