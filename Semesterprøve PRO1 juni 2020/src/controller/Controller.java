package controller;

import java.time.LocalDate;
import java.util.ArrayList;

import model.Booking;
import model.Bur;
import model.KattePension;
import model.StortBur;
import storage.Storage;

public class Controller {
	
	//-------------------KattePension------------------------------
	public static KattePension createKattePension(String navn) {
		KattePension kp = new KattePension(navn);
		Storage.addKattePensioner(kp);
		return kp;
	}
	
	public static void updateKattePensioner(KattePension kattePension, String navn) {
		kattePension.setNavn(navn);
	}
	
	public static ArrayList<KattePension> getKattePensioner(){
		return Storage.getKattePensioner();
	}
	
	//-------------------Bur--------------------------------------
	
	public static void updateBure(Bur bur, String id) {
		bur.setId(id);
	}
	
	public static Bur createBur(String id, KattePension kattePension) {
		Bur bur = KattePension.createBur(id);
		return bur;
	}
	
	public static void throwRunTimeException() {
		if (Booking.getAntalKatte() > StortBur.getMaksAntal()) {
			throw new RunTimeException("Der flere katte end der er plads");
		}
	}
	
	//------------------StortBur----------------------------------
	
	public static StortBur createStortBur(String id, int maksAntal, KattePension kattePension) {
		StortBur stortBur = KattePension.createStortBur(id, maksAntal);
		return stortBur;
	}
	
	//-----------------Booking------------------------------------
	
	public static Booking createBooking(String mobil, LocalDate startDato, int antalDage, Bur bur) {
		Booking booking = new Booking(mobil, startDato, antalDage, bur);
		Storage.addBookinger(booking);
		return booking;
	}
	
	public static Booking createBooking(String mobil, LocalDate startDato, int antalDage, StortBur stortBur, int antalKatte) {
		Booking booking = new Booking(mobil, startDato, antalDage, stortBur, antalKatte);
		Storage.addBookinger(booking);
		return booking;
	}
	
	public static void updateBookinger(Booking booking, String mobil, LocalDate startDato, int antalDage, Bur bur) {
		booking.setAntalDage(antalDage);
		booking.setMobil(mobil);
		booking.setStartDato(startDato);
		booking.setBur(bur);
	}
	
	public static void updateBookinger(Booking booking, String mobil, LocalDate startDato, int antalDage, StortBur stortBur, int antalKatte) {
		booking.setAntalDage(antalDage);
		booking.setMobil(mobil);
		booking.setStartDato(startDato);
		booking.setAntalKatte(antalKatte);
	}
	
	public static ArrayList<Booking> getBookinger(){
		return Storage.getBookinger();
	}
	
	public static void initStorage() {
		KattePension KP1 = Controller.createKattePension("Catinn");
		KattePension KP2 = Controller.createKattePension("Mistake");
		
		Bur b1 = Controller.createBur("B1", KP1);
		Bur b2 = Controller.createBur("B2", KP1);
		Bur b3 = Controller.createBur("B3", KP1);
		
		StortBur s1 = Controller.createStortBur("S1", 4, KP1);
		StortBur s2 = Controller.createStortBur("S2", 2, KP1);
		
		Booking book1 = Controller.createBooking("87654321", LocalDate.of(2020, 7, 30), 2, b1);
		Booking book2 = Controller.createBooking("12345678", LocalDate.of(2020, 6, 26), 3, b1);
		Booking book3 = Controller.createBooking("87654321", LocalDate.of(2020, 6, 26), 5, b2);
		Booking book4 = Controller.createBooking("12345678", LocalDate.of(2020, 6, 27), 5, s1, 3);
		
		Bur b4 = Controller.createBur("B1", KP2);
		Bur b5 = Controller.createBur("B2", KP2);
	}
}
