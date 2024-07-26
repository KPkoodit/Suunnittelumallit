
public class Main {

	public static void main(String[] args) {
		IPizza hyvaPizza = new Juusto(new Kana(new Tomaattikastike(new Pizzapohja())));
		IPizza pahaPizza = new Porkkanaraaste(new Herkkusieni(new Tomaattikastike(new Pizzapohja())));
		IPizza pelkistettyPizza = new Juusto(new Tomaattikastike(new Pizzapohja()));
		
		System.out.println("Hyvän pizzan hinta on: " + hyvaPizza.getHinta());
		System.out.println("Pahan pizzan hinta on: " + pahaPizza.getHinta());
		System.out.println("Pelkistetyn pizzan hinta on: " + pelkistettyPizza.getHinta());
	}

}
