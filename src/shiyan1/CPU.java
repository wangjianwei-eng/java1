package shiyan1;

public class CPU {
	int speed;
	String band;

	public CPU() {

	}

	public CPU(int speed, String band) {
		this.speed = speed;
		this.band = band;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getBand() {
		return band;
	}

	public void setBand(String band) {
		this.band = band;
	}

}