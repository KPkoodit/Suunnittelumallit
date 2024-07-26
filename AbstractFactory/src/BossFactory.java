
public class BossFactory implements AsuFactory{

	@Override
	public BossLippis munLippis() {
		return new BossLippis();
	}

	@Override
	public BossPaita munPaita() {
		return new BossPaita();
	}

	@Override
	public BossHousut munHousut() {
		return new BossHousut();
	}

	@Override
	public BossKengat munKengat() {
		return new BossKengat();
	}

}
