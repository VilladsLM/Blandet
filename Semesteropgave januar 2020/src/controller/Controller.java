package controller;

import java.time.LocalDate;
import java.util.ArrayList;

import model.Festival;
import model.Frivillig;
import storage.Storage;

public class Controller {
	
	public static Festival createFestival(String navn, LocalDate fraDato, LocalDate tilDato) {
		Festival festival = new Festival(navn, fraDato, tilDato);
		Storage.addFestivaller(festival);
		return festival;
	}
	
	
	public static void updateFestivaller(Festival festival, String navn, LocalDate fraDato, LocalDate tilDato) {
		festival.setNavn(navn);
		festival.setFraDato(fraDato);
		festival.setTilDato(tilDato);
	}
	
	public static ArrayList<Festival> getFestivaller() {
		return Storage.getFestivaller();
	}
	
	public static Frivillig createFrivillig(String navn, String mobil, int maksAntalTimer) {
		Frivillig frivillig = new Frivillig(navn, mobil, maksAntalTimer);
		Storage.addFrivillige(frivillig);
		return frivillig;
	}
	
	public static void updateFrivillige(Frivillig frivillig, String navn, String mobil, int maksAntalTimer) {
		frivillig.setMaksAntalTimer(maksAntalTimer);
		frivillig.setMobil(mobil);
		frivillig.setNavn(navn);
	}
	
	public static ArrayList<Frivillig> getFrivillige(){
		return Storage.getFrivillige();
	}
	
	
}
