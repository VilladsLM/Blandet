package model;

public class KontoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Konto k1 = new Konto("Madkonto", 12341234);
		
		k1.indsætBeløb(5000);
		System.out.println(k1.getSaldo());
		k1.hævBeløb(500);
		System.out.println(k1.getSaldo());
		k1.lukKonto();
		k1.hævBeløb(250);
		System.out.println(k1.getSaldo());
		System.out.println(k1.getStatus());
		

		
	}

}
