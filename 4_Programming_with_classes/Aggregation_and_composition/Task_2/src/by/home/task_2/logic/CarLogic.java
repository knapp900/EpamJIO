package by.home.task_2.logic;

import by.home.task_2.entity.*;


public class CarLogic {

	Car car;
	WheelLogic wheelLogic;
	EngineLogic engineLogic;

	public void infoCar(Car car) {
		
		System.out.println(car.getCarModel());

	}
	/**
	 * Метод для замены колес.
	 * @param car
	 * @param radius
	 * @param brand
	 */

	public void changeWheel(Car car, int radius, String brand) {

		car.setWheel(new Wheel(radius, brand));
	}
	/**
	 * Метод начала движения.
	 * @param car
	 */

	public void startMoving(Car car) {
		EngineLogic engineLogic = new EngineLogic();
		WheelLogic logic = new WheelLogic();
		engineLogic.start();
		logic.wheelsSpinning();
		System.out.println("The car is moving!");

	}
	/**
	 * Метод остановки движения.
	 * @param car
	 */

	public void stopMoving(Car car) {
		EngineLogic engineLogic = new EngineLogic();
		WheelLogic logic = new WheelLogic();
		logic.wheelsStopped();
		engineLogic.stop();
		System.out.println("The car is stopped!");

	}
	/**
	 * Метод заправки авто.
	 * @param car
	 * @param fuel
	 */

	public void fillTank(Car car, double fuel) {

		double tmp = car.getLevelFuelTank() + fuel;

		System.out.println("Fuel level is " + tmp);

	}

}
