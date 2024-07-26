
public class HardDrive {
	private char[] data;
	
	
	public HardDrive(int size) {
		data = new char[size];
		data[0] = 'm';
		data[1] = 'o';
		data[2] = 'i';
	}
	
	public char[] read(long lba, int size) {
		char[] palautettavaData = new char[size];
		int indeksi = 0;
		
		for(int i = (int)lba; i < size; i++) {
			palautettavaData[indeksi] = data[i];
			indeksi++;
		}
		
		return palautettavaData;
	}
}
