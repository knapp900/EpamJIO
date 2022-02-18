package by.home.task_2.entity;

import java.util.Objects;

public class Wheel {

	private int radius;
	private String brend;

	public Wheel() {
		super();
	}

	public Wheel(int radius, String brend) {
		super();
		this.radius = radius;
		this.brend = brend;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getBrend() {
		return brend;
	}

	public void setBrend(String brend) {
		this.brend = brend;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brend, radius);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wheel other = (Wheel) obj;
		return Objects.equals(brend, other.brend) && radius == other.radius;
	}

	@Override
	public String toString() {
		return "Wheel [radius=" + radius + ", brend=" + brend + "]";
	}

}
