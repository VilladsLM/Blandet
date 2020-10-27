package model;

public class Konto {


		private int nr;
		private int saldo;
		private String kontoType;
		private String status;
		
		public Konto(String kontoType, int nr) {
			this.kontoType = kontoType;
			this.nr = nr;
			this.status = "Åben";
		}
		
		public void indsætBeløb(int beløb) {
			if(status.equals("Åben")) {
				saldo = saldo + beløb;
			}
		}
		
		public void hævBeløb(int beløb) {
			if(status.equals("Åben")) {
				saldo = saldo - beløb;
			}
			if(status.equals("Lukket")) {
				System.out.println("Kontoen er lukket, kontakt banken hvis du har spørgsmål");
			}
			
		}
		
		public void lukKonto() {
			this.status = "Lukket";
		}
		
		public int getNr() {
			return nr;
		}
		
		public int getSaldo() {
			return saldo;
		}
		
		public String getkontoType() {
			return kontoType;
		}
		
		public String getStatus() {
			return status;
		}
		
		public void setStatus(String status) {
			this.status = status;
		}
		

	}
