package model;

import java.time.LocalDate;

public class Booking implements Comparable<Booking>{
	
	private String mobil;
	private LocalDate startDato;
	private int antalDage;
	private static int antalKatte;
	private Bur bur;
	
	public Booking(String mobil, LocalDate startDato, int antalDage, Bur bur) {
		this.mobil = mobil;
		this.startDato = startDato;
		this.antalDage = antalDage;
		
	}
	
	public Booking(String mobil, LocalDate startDato, int antalDage, StortBur stortBur, int antalKatte) {
		this.mobil = mobil;
		this.startDato = startDato;
		this.antalDage = antalDage;
		this.antalKatte = antalKatte;
	}

	public String getMobil() {
		return mobil;
	}

	public void setMobil(String mobil) {
		this.mobil = mobil;
	}

	public LocalDate getStartDato() {
		return startDato;
	}

	public void setStartDato(LocalDate startDato) {
		this.startDato = startDato;
	}

	public int getAntalDage() {
		return antalDage;
	}

	public void setAntalDage(int antalDage) {
		this.antalDage = antalDage;
	}

	public static int getAntalKatte() {
		return antalKatte;
	}

	public void setAntalKatte(int antalKatte) {
		this.antalKatte = antalKatte;
	}
	
	public Bur getBur() {
		return bur;
	}
	
	public void setBur(Bur bur) {
		if(this.bur != bur) {
			Bur oldBur = this.bur;
			if (oldBur != null) {
				oldBur.removeBooking(this);
			}
			this.bur = bur;
			if (bur != null) {
				bur.addBooking(this);
			}
		}
	}
	
	public boolean omfatter(LocalDate dato) {
		boolean sammeDato = false;
		if (startDato.getDayOfMonth() == dato.getDayOfMonth()) {
			sammeDato = true;
		}
		return sammeDato;
	}
	
	public int getSamletBetaling() {
		int pris = 0;
		return pris;
			
	}
	
	@Override
	public String toString() {
		return "Booking [mobil=" + mobil + ", startDato=" + startDato + ", antalDage=" + antalDage + ", antalKatte="
				+ antalKatte + "]";
	}


	@Override
	public int compareTo(Booking b) {
		// TODO Auto-generated method stub
		int comp = this.antalDage.compareTo(b.getAntalDage());
		if (comp == 0) {
			comp = this.startDato.compareTo(b.getStartDato());
		}
		return 0;
	}
	
	
}
