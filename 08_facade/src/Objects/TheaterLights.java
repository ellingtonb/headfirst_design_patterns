package Objects;

public class TheaterLights {
	protected String description;

	public TheaterLights(String description) {
		this.description = description;
	}

	public void on() {
		System.out.println(this.description + " on");
	}

	public void off() {
		System.out.println(this.description + " off");
	}

	public void dim(int level) {
		System.out.println(this.description + " dimming to " + level  + "%");
	}

	public String toString() {
		return this.description;
	}
}
