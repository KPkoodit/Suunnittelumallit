
public class ConcreteVisitor implements Visitor{

	@Override
	public void visit(Pokemon p) {
		if(p.getExp() > p.getState().getLevel()) {
			State evolv = p.getState().evolvaus();
			p.setState(evolv);
		}
	}
}
