package by.home.task_3.entity;

import java.util.Objects;

public class Region {

	private String nameRegion;
	private double squareOfRegion;

	public Region(String nameRegion, double squareOfRegion) {
		super();
		this.nameRegion = nameRegion;
		this.squareOfRegion = squareOfRegion;
	}

	public String getNameRegion() {
		return nameRegion;
	}

	public void setNameRegion(String nameRegion) {
		this.nameRegion = nameRegion;
	}

	public double getSquareOfRegion() {
		return squareOfRegion;
	}

	public void setSquareOfRegion(double squareOfRegion) {
		this.squareOfRegion = squareOfRegion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nameRegion, squareOfRegion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Region other = (Region) obj;
		return Objects.equals(nameRegion, other.nameRegion)
				&& Double.doubleToLongBits(squareOfRegion) == Double.doubleToLongBits(other.squareOfRegion);
	}

	@Override
	public String toString() {
		return "Region [nameRegion=" + nameRegion + ", squareOfRegion=" + squareOfRegion + "]";
	}

}
