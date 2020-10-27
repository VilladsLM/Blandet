package model;

import java.time.LocalDate;

public class StortBur extends Bur{
	
	private static int maksAntal;
	
	public StortBur(String id, int maksAntal) {
		super(id);
		this.maksAntal = maksAntal;
	}


	public static int getMaksAntal() {
		return maksAntal;
	}

	public void setMaksAntal(int maksAntal) {
		this.maksAntal = maksAntal;
	}
	
	@Override
	public String toString() {
		return "StortBur [maksAntal=" + maksAntal + "]";
	}


	@Override
	public int getBetaling(LocalDate dato) {
		// TODO Auto-generated method stub
		int sum = 0;
		if (Booking.getAntalKatte() == 1) {
			sum = super.getBetaling(dato) + 30;
		}
		if (Booking.getAntalKatte() > 1) {
			for (Booking booking : bookinger) {
				sum = super.getBetaling(dato) + 70;
			}
		}
		else {
			sum = 0;
		}
		return sum;
	}
	
	
}
