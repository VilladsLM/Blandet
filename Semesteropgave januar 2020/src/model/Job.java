package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Job {
	
	private String kode;
	private String beskrivelse;
	private LocalDate dato;
	private int timeHonorar;
	private int antalTimer;
	private ArrayList<Vagt> vagter = new ArrayList<>();
	
	public Job(String kode, String beskrivelse, LocalDate dato, int timeHonorar, int antalTimer) {
		this.kode = kode;
		this.beskrivelse = beskrivelse;
		this.dato = dato;
		this.timeHonorar = timeHonorar;
		this.antalTimer = antalTimer;
	}

	public String getKode() {
		return kode;
	}

	public void setKode(String kode) {
		this.kode = kode;
	}

	public String getBeskrivelse() {
		return beskrivelse;
	}

	public void setBeskrivelse(String beskrivelse) {
		this.beskrivelse = beskrivelse;
	}

	public LocalDate getDato() {
		return dato;
	}

	public void setDato(LocalDate dato) {
		this.dato = dato;
	}

	public int getTimeHonorar() {
		return timeHonorar;
	}

	public void setTimeHonorar(int timeHonorar) {
		this.timeHonorar = timeHonorar;
	}

	public int getAntalTimer() {
		return antalTimer;
	}

	public void setAntalTimer(int antalTimer) {
		this.antalTimer = antalTimer;
	}

	@Override
	public String toString() {
		return "Job [kode=" + kode + ", beskrivelse=" + beskrivelse + ", dato=" + dato + ", timeHonorar=" + timeHonorar
				+ ", antalTimer=" + antalTimer + "]";
	}
	
	public ArrayList<Vagt> getVagter(){
		return new ArrayList<>(vagter);
	}
	
	public Vagt createVagt(int timer, Frivillig frivillig) {
		Vagt vagt = new Vagt(timer, frivillig, this);
		vagter.add(vagt);
		return vagt;
	}
}
