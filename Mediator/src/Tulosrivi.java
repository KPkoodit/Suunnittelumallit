
public class Tulosrivi {
	 private Hyppaaja hyppaaja;
     private double hyppy1pituus;
     private double hyppy2pituus;
     private double pisteet;
     
     public Tulosrivi(Hyppaaja hyppaaja, double hyppy1, double hyppy2, double pisteet) {
         this.hyppaaja = hyppaaja;
         this.hyppy1pituus = hyppy1;
         this.hyppy2pituus = hyppy2;
         this.pisteet = pisteet;
     }
     
     public Hyppaaja getHyppaaja() {
         return hyppaaja;
     }
     
     public double getHyppy1() {
         return hyppy1pituus;
     }
     
     public double getHyppy2() {
         return hyppy2pituus;
     }
     
     public double getPisteet() {
         return pisteet;
     }
}
