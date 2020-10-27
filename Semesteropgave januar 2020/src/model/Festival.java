package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Festival {
	
	private String navn;
	private LocalDate fraDato;
	private LocalDate tilDato;
	private ArrayList<Job> jobs = new ArrayList<>();
	public Festival(String navn, LocalDate fraDato, LocalDate tilDato) {
		this.navn = navn;
		this.fraDato = fraDato;
		this.tilDato = tilDato;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public LocalDate getFraDato() {
		return fraDato;
	}

	public void setFraDato(LocalDate fraDato) {
		this.fraDato = fraDato;
	}

	public LocalDate getTilDato() {
		return tilDato;
	}

	public void setTilDato(LocalDate tilDato) {
		this.tilDato = tilDato;
	}
	
	public ArrayList<Job> getJobs() {
	return new ArrayList<>(jobs);
	}
	
	public Job createJob(String kode) {
		Job job = new Job(kode, kode, fraDato, 0, 0);
		jobs.add(job);
		return job;
	}
	
	@Override
	public String toString() {
		return "Festival [navn=" + navn + ", fraDato=" + fraDato + ", tilDato=" + tilDato + "]";
	}
	
	public int budgetteretJobUdgift() {
		int samletUdgift = 0;
		for (Job job : jobs) {
			
		}
	}
	
	public int realiseretJobUdgift() {
		int samletUdgift = 0;
		for (Job job : jobs) {
			int antalTimerUdført = 0;
			for (Vagt vagt : job.getVagter()) {
				antalTimerUdført += vagt.getTimer();
			}
			samletUdgift += job.getTimeHonorar() * antalTimerUdført;
		}
		return samletUdgift;
	}
}
