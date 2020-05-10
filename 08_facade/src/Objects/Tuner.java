package Objects;

public class Tuner {
	protected String description;
	protected Amplifier amplifier;
	protected double frequency;

	public Tuner(String description, Amplifier amplifier) {
		this.description = description;
	}

	public void on() {
		System.out.println(this.description + " on");
	}

	public void off() {
		System.out.println(this.description + " off");
	}

	public void setFrequency(double frequency) {
		System.out.println(this.description + " setting frequency to " + frequency);
		this.frequency = frequency;
	}

	public void setAm() {
		System.out.println(this.description + " setting AM mode");
	}

	public void setFm() {
		System.out.println(this.description + " setting FM mode");
	}

	public String toString() {
		return this.description;
	}
}
