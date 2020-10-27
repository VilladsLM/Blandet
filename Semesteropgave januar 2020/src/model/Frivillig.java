package model;

import java.util.ArrayList;

public class Frivillig {
	
	private String navn;
	private String mobil;
	private int maksAntalTimer;
	private final ArrayList<Vagt> vagter = new ArrayList<>();
	public Frivillig(String navn, String mobil, int maksAntalTimer) {
		this.navn = navn;
		this.mobil = mobil;
		this.maksAntalTimer = maksAntalTimer;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public String getMobil() {
		return mobil;
	}

	public void setMobil(String mobil) {
		this.mobil = mobil;
	}

	public int getMaksAntalTimer() {
		return maksAntalTimer;
	}

	public void setMaksAntalTimer(int maksAntalTimer) {
		this.maksAntalTimer = maksAntalTimer;
	}

	@Override
	public String toString() {
		return "Frivillig [navn=" + navn + ", mobil=" + mobil + ", maksAntalTimer=" + maksAntalTimer + "]";
	}
	
	public ArrayList<Vagt> getVagter(){
		return new ArrayList<>(vagter);
	}
	
	public void addVagt(Vagt vagt) {
		if(!vagter.contains(vagt)) {
			vagter.add(vagt);
			vagt.setFrivillig(this);
		}
	}
	
	public void removeVagt(Vagt vagt) {
		if(vagter.contains(vagt)) {
			vagter.remove(vagt);
			vagt.setFrivillig(null);
		}
	}
}
