package model;

import java.util.ArrayList;

public class KattePension {
	
	private String navn;
	private final ArrayList<Bur> bure = new ArrayList<>();
	
	public KattePension(String navn) {
		this.navn = navn;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}
	
	public ArrayList<Bur> getBure(){
		return new ArrayList<>(bure);
	}
	
	public Bur createBur(String id) {
		Bur bur = new Bur(id);
		bure.add(bur);
		return bur;
	}
	
	public StortBur createStortBur(String id, int maksAntal) {
		StortBur stortBur = new StortBur(id, maksAntal);
		bure.add(stortBur);
		return stortBur;
	}
	
	public int getAntalBureUdenBooking() {
		int bureUdenBooking = 0;
		for (Bur bur : bure) {
			if (bur.getBookinger() == null) {
				bureUdenBooking++;
			}
		}
		return bureUdenBooking;
	}
	
	
	@Override
	public String toString() {
		return "KattePension [navn=" + navn + "]";
	}
	
	
}
