
public class YlosCommand implements Command{
	private Valkokangas vk;
	
	public YlosCommand(Valkokangas vk) {
		this.vk = vk;
	}

	@Override
	public void execute() {
		vk.valkokangasYlos();
	}
}
