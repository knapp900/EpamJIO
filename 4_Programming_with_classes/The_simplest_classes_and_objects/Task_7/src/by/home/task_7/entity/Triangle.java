package by.home.task_7.entity;

import java.util.Objects;

public class Triangle {
	private double sideA;
	private double sideB;
	private double sideC;

	public Triangle(double sideA, double sideB, double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	@Override
	public int hashCode() {
		return Objects.hash(sideA, sideB, sideC);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		return Double.doubleToLongBits(sideA) == Double.doubleToLongBits(other.sideA)
				&& Double.doubleToLongBits(sideB) == Double.doubleToLongBits(other.sideB)
				&& Double.doubleToLongBits(sideC) == Double.doubleToLongBits(other.sideC);
	}

	@Override
	public String toString() {
		return "Triangle side A=" + sideA + ", side B=" + sideB + ", side C=" + sideC;
	}

}
