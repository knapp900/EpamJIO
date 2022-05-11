package by.home.multithreadingPort.dao;

import by.home.multithreadingPort.entity.*;
import java.util.ArrayList;
import java.util.List;

public class BoatStorage {
	
	/**
	 * В boatStorage хранится лист ожидания кораблей. 
	 */

	private List<Boat> boatList = new ArrayList<>();

	public synchronized Boat getBoatFromList() {

		if (!boatList.isEmpty()) {
			Boat boat = boatList.iterator().next();
			boatList.remove(boat);
			return boat;
		}

		return null;
	}

	public synchronized void removeBoatFromList(Boat boat) {
		boatList.remove(boat);

	}

	public void setBoatList(List<Boat> boatList) {
		this.boatList = boatList;
	}

}
