package storage;

import java.util.ArrayList;

import model.Festival;
import model.Frivillig;

public class Storage {
	
	private static ArrayList<Festival> festivaller = new ArrayList<>();
	private static ArrayList<Frivillig> frivillige = new ArrayList<>();
	
	//---------------------------------Festival---------------------------------
	
		public static ArrayList<Festival> getFestivaller() {
			return new ArrayList<Festival>(festivaller);
		}
		
		public static void addFestivaller(Festival festival) {
			festivaller.add(festival);
		}
		
		//---------------------------------Frivillig---------------------------------
		
			public static ArrayList<Frivillig> getFrivillige() {
				return new ArrayList<Frivillig>(frivillige);
			}
			
			public static void addFrivillige(Frivillig frivillig) {
				frivillige.add(frivillig);
			}

}
