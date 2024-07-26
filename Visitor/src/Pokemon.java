
public class Pokemon {
	private State state;
	private int exp = 0;
	private Visitor visitor;
	
	public Pokemon() {
		setState(Charmander.getInstance());
		visitor = new ConcreteVisitor();
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
	
	public int getExp() {
		return exp;
	}
	
	public void lepaa() {
		exp += state.lepaa();
		System.out.println("Exp nyt " + exp);
		visitor.visit(this);
	}
	
	public void kaytaHeikkoIsku() {
		exp += state.kaytaHeikkoIsku();
		System.out.println("Exp nyt " + exp);
		visitor.visit(this);
	}
	
	public void kaytaVahvaIsku() {
		exp += state.kaytaVahvaIsku();
		System.out.println("Exp nyt " + exp);
		visitor.visit(this);
	}
}
