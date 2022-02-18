package by.home.task_2.entity;


import java.util.Objects;

public class Car {

	private String carModel;
	private double levelFuelTank;
	private Wheel wheel;
	private Engine engine;

	public Car(String carModel, double levelFuelTank, int wheelRadius, String WheelBrend, String typeFuel,
			String modelEngien, double engineVolume) {
		super();
		this.carModel = carModel;
		this.levelFuelTank = levelFuelTank;
		this.wheel = new Wheel(wheelRadius, WheelBrend);
		this.engine = new Engine(typeFuel, modelEngien, engineVolume);
	}

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public double getLevelFuelTank() {
		return levelFuelTank;
	}

	public void setLevelFuelTank(double levelFuelTank) {
		this.levelFuelTank = levelFuelTank;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public int hashCode() {
		return Objects.hash(carModel, engine, levelFuelTank, wheel);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(carModel, other.carModel) && Objects.equals(engine, other.engine)
				&& Double.doubleToLongBits(levelFuelTank) == Double.doubleToLongBits(other.levelFuelTank)
				&& Objects.equals(wheel, other.wheel);
	}

	@Override
	public String toString() {
		return "Car [carModel=" + carModel + ", levelFuelTank=" + levelFuelTank + ", wheel=" + wheel + ", engine="
				+ engine + "]";
	}

}
