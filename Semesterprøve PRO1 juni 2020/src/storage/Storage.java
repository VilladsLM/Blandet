package storage;

import java.util.ArrayList;

import model.Booking;
import model.KattePension;

public class Storage {
	
	private static ArrayList<KattePension> kattepensioner = new ArrayList<>();
	private static ArrayList<Booking> bookinger = new ArrayList<>();
	
	//---------------------------KattePension------------------------------
	public static ArrayList<KattePension> getKattePensioner() {
		return new ArrayList<KattePension>(kattepensioner);
	}
	
	public static void addKattePensioner(KattePension kattepension) {
		kattepensioner.add(kattepension);
	}
	
	public static void removeKattePensioner(KattePension kattepension) {
		kattepensioner.remove(kattepension);
	}
	
	//--------------------------Booking-------------------------------------
	public static ArrayList<Booking> getBookinger() {
		return new ArrayList<Booking>(bookinger);
	}
	
	public static void addBookinger(Booking booking) {
		bookinger.add(booking);
	}
	
	public static void removeBookinger(Booking booking) {
		bookinger.remove(booking);
	}
	
}
