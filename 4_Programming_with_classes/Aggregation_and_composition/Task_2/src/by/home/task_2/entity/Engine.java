package by.home.task_2.entity;

import java.util.Objects;

public class Engine {

	private String typeFuel;
	private String modelEngien;
	private double engineVolume;

	public Engine() {
		super();
	}

	public Engine(String typeFuel, String modelEngien, double engineVolume) {
		super();
		this.typeFuel = typeFuel;
		this.modelEngien = modelEngien;
		this.engineVolume = engineVolume;
	}

	public String getTypeFuel() {
		return typeFuel;
	}

	public void setTypeFuel(String typeFuel) {
		this.typeFuel = typeFuel;
	}

	public String getModelEngien() {
		return modelEngien;
	}

	public void setModelEngien(String modelEngien) {
		this.modelEngien = modelEngien;
	}

	public double getEngineVolume() {
		return engineVolume;
	}

	public void setEngineVolume(double engineVolume) {
		this.engineVolume = engineVolume;
	}

	@Override
	public int hashCode() {
		return Objects.hash(engineVolume, modelEngien, typeFuel);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Engine other = (Engine) obj;
		return Double.doubleToLongBits(engineVolume) == Double.doubleToLongBits(other.engineVolume)
				&& Objects.equals(modelEngien, other.modelEngien) && Objects.equals(typeFuel, other.typeFuel);
	}

	@Override
	public String toString() {
		return "Engine [typeFuel=" + typeFuel + ", modelEngien=" + modelEngien + ", engineVolume=" + engineVolume + "]";
	}

}
