
public class Memory {
	char[] data;
	long position;
	
	public void load(long position, char[] data) {
		this.data = data;
		this.position = position;
	}
	
	public void print() {
		for(int i = (int)position; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
