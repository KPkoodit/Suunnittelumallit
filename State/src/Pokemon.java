
public class Pokemon {
	private State state;
	private int exp = 0;
	
	public Pokemon() {
		setState(Charmander.getInstance());
	}

	public void changeState(State s) {
		setState(s);
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void lepaa() {
		exp += state.lepaa();
		System.out.println("Exp nyt " + exp);
		evolvaako();
	}
	
	public void kaytaHeikkoIsku() {
		exp += state.kaytaHeikkoIsku();
		System.out.println("Exp nyt " + exp);
		evolvaako();
	}
	
	public void kaytaVahvaIsku() {
		exp += state.kaytaVahvaIsku();
		System.out.println("Exp nyt " + exp);
		evolvaako();
	}
	
	public void evolvaako() {
		if (exp > state.getLevel()) {
			state = state.evolvaus();
		}
	}
}
