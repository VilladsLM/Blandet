package model;

public class Vagt {

	private int timer;
	private Frivillig frivillig;

	public Vagt(int timer) {
		this.timer = timer;
	}

	public int getTimer() {
		return timer;
	}

	public void setTimer(int timer) {
		this.timer = timer;
	}

	@Override
	public String toString() {
		return "Vagt [timer=" + timer + "]";
	}

	public Frivillig getFrivillig() {
		return frivillig;
	}

	public void setFrivillig(Frivillig frivillig) {
		if (this.frivillig != frivillig) {
			Frivillig oldFrivillig = this.frivillig;
			if (oldFrivillig != null) {
				oldFrivillig.removeVagt(this);
			}
			this.frivillig = frivillig;
			if (frivillig != null) {
				frivillig.addVagt(this);
			}
		}
	}
}
