import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Image> album = new ArrayList<Image>();
		Image image1 = new ProxyImage("CatPhoto1");
        Image image2 = new ProxyImage("CatPhoto2");
        Image image3 = new ProxyImage("CatPhoto3");
        Image image4 = new ProxyImage("CatPhoto4");
        
        album.add(image1);
        album.add(image2);
        album.add(image3);
        album.add(image4);
        
        for(Image i : album) {
        	i.showData();
        }
        
        //selataan
        image1.displayImage(); // loading necessary
        image1.displayImage(); // loading unnecessary
        image2.displayImage(); // loading necessary
        image2.displayImage(); // loading unnecessary
        image1.displayImage(); // loading unnecessary
        image3.displayImage(); // loading necessary
        image4.displayImage(); // loading necessary
        image4.displayImage(); // loading unnecessary
	}

}
