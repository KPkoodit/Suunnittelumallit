
public class AlasCommand implements Command{
	private Valkokangas vk;
	
	public AlasCommand(Valkokangas vk) {
		this.vk = vk;
	}

	@Override
	public void execute() {
		vk.valkokangasAlas();
	}
}
