package by.home.multithreadingPort.dao;

import by.home.multithreadingPort.entity.*;

import java.util.ArrayList;
import java.util.List;

public class PortStorage {
	
	/**
	 * Портовый склад.Общий для всех причалов.
	 */

	private List<Boat> cargoList = new ArrayList<>();

	public synchronized int getCargoFromList() {

		if (!cargoList.isEmpty()) {
			Boat boat = cargoList.iterator().next();
			cargoList.remove(boat);
			return boat.getCargo();
		}

		return 0;
	}

	public synchronized boolean addCargo(Boat boat) {

		cargoList.add(boat);
		return true;
	}

	public synchronized boolean removeCargo(Boat boat) {

		cargoList.remove(boat);
		return true;
	}

	public synchronized int listSize() {
		int value = 0;
		for (Boat boat : cargoList) {
			value += boat.getCargo();
		}

		System.out.println("Размер склада : " + value);
		return value;
	}

	public List<Boat> getCargoList() {
		return List.copyOf(cargoList);
	}
}
