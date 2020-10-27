package model;

public class Frivilligforening extends Frivillig{
	
	private String foreningsnavn;
	private int antalPersoner;
	
	public Frivilligforening(String foreningsnavn, int antalPersoner) {
		super(foreningsnavn, foreningsnavn, antalPersoner);
		this.foreningsnavn = foreningsnavn;
		this.antalPersoner = antalPersoner;
	}
	public String getForeningsnavn() {
		return foreningsnavn;
	}
	public void setForeningsnavn(String foreningsnavn) {
		this.foreningsnavn = foreningsnavn;
	}
	public int getAntalPersoner() {
		return antalPersoner;
	}
	public void setAntalPersoner(int antalPersoner) {
		this.antalPersoner = antalPersoner;
	}
	@Override
	public String toString() {
		return "Frivilligforening [foreningsnavn=" + foreningsnavn + ", antalPersoner=" + antalPersoner + "]";
	}
	
	
}
