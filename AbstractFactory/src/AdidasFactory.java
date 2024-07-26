
public class AdidasFactory implements AsuFactory {

	@Override
	public AdidasLippis munLippis() {
		return new AdidasLippis();
	}

	@Override
	public AdidasPaita munPaita() {
		return new AdidasPaita();
	}

	@Override
	public AdidasHousut munHousut() {
		return new AdidasHousut();
	}

	@Override
	public AdidasKengat munKengat() {
		return new AdidasKengat();
	}

}
