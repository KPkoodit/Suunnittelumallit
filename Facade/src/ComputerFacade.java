
public class ComputerFacade implements CPU{
	private Memory memory;
	private HardDrive hardDrive;
	
	private int kBootAddress = 0;
	private long kBootSector = 0;
	private int kSectorSize = 3;
	
	public ComputerFacade() {
		memory = new Memory();
		hardDrive = new HardDrive(kSectorSize);
	}
	
	public void start() {
		freeze();
		memory.load(kBootAddress, hardDrive.read(kBootSector, kSectorSize));
		jump(kBootAddress);
		execute();
	}

	@Override
	public void freeze() {
		System.out.println("Freeze");
	}

	@Override
	public void jump(long position) {
		System.out.println("Jumping to " + position);
		
	}

	@Override
	public void execute() {
		memory.print();
	}
}
