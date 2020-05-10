package Objects;

public class Screen {
	protected String description;

	public Screen(String description) {
		this.description = description;
	}

	public void up() {
		System.out.println(this.description + " going up");
	}

	public void down() {
		System.out.println(this.description + " going down");
	}

	public String toString() {
		return this.description;
	}
}
