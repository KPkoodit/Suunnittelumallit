
public class Main {

	public static void main(String[] args) {
		Lista lista = new Lista();
		lista.lisaa("koira");
		lista.lisaa("kissa");
		lista.lisaa("kani");
		lista.lisaa("gerbiili");
		lista.lisaa("marsu");
		lista.lisaa("sammakko");
		lista.lisaa("kanarialintu");
		lista.lisaa("papukaija");

		System.out.println("Eka tulostus alkaa");
		lista.lisaaStrategy(new Strategia1());
		lista.tulostaLista();
		System.out.println("Eka tulostus loppuu");
		
		System.out.println("Toka tulostus alkaa");
		lista.lisaaStrategy(new Strategia2());
		lista.tulostaLista();
		System.out.println("Toka tulostus loppuu");
		
		System.out.println("Kolmas tulostus alkaa");
		lista.lisaaStrategy(new Strategia3());
		lista.tulostaLista();
		System.out.println("Kolmas tulostus loppuu");
	}

}
