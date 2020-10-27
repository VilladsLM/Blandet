package model;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Bur {
	
	private String id;
	protected final ArrayList<Booking> bookinger = new ArrayList<>();
	
	public Bur(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public ArrayList<Booking> getBookinger() {
		return new ArrayList<>(bookinger);
	}
	
	public void addBooking(Booking booking) {
		if(!bookinger.contains(booking)) {
			bookinger.add(booking);
			booking.setBur(this);
		}
	}
	
	public void removeBooking(Booking booking) {
		if(bookinger.contains(booking)) {
			bookinger.remove(booking);
			booking.setBur(null);
		}
	}
	
	public Booking findBooking(LocalDate dato) {
		
	}
	
	public int getBetaling(LocalDate dato) {
		int pris = 0;
		int dage = (int) (ChronoUnit.DAYS.between(Booking.getStartDato(), dato)+1);
		pris = dage * 100;
		if (dato.getMonth() == Month.JULY|| dato.getMonth() == Month.AUGUST) {
			pris = dage * 130;
		}
		return pris;
	}
	
	@Override
	public String toString() {
		return "Bur [id=" + id + "]";
	}
	
	
}
