package model;

public class Opgaver {
	private String opgavenavn;
	private String opgavebeskrivelse;
	private String opgavestatus;
	
	public Opgaver(String opgavenavn, String opgavebeskrivelse, String opgavestatus) {
		this.opgavenavn = opgavenavn;
		this.opgavebeskrivelse = opgavebeskrivelse;
		this.opgavestatus = opgavestatus;
		
	}

	public String getOpgavenavn() {
		return opgavenavn;
	}

	public void setOpgavenavn(String opgavenavn) {
		this.opgavenavn = opgavenavn;
	}

	public String getOpgavebeskrivelse() {
		return opgavebeskrivelse;
	}

	public void setOpgavebeskrivelse(String opgavebeskrivelse) {
		this.opgavebeskrivelse = opgavebeskrivelse;
	}

	public String getOpgavestatus() {
		return opgavestatus;
	}

	public void setOpgavestatus(String opgavestatus) {
		this.opgavestatus = opgavestatus;
	}
	
	public void printOpgave() {
		System.out.println("Opgave: " + getOpgavenavn());
		System.out.println("Opgavebeskrivelse: " + getOpgavebeskrivelse());
		System.out.println("Opgavebestatus: " + getOpgavestatus());
	}
}
