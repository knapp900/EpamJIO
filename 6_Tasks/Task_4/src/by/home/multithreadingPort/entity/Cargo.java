package by.home.multithreadingPort.entity;

import java.util.Objects;

public class Cargo {

	String senderName;
	double weight;

	public Cargo() {
		super();

	}

	public Cargo(String senderName, double weight) {
		super();
		this.senderName = senderName;
		this.weight = weight;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public int hashCode() {
		return Objects.hash(senderName, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cargo other = (Cargo) obj;
		return Objects.equals(senderName, other.senderName)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

	@Override
	public String toString() {
		return "Cargo [senderName=" + senderName + ", weight=" + weight + "]";
	}
	
	

}
