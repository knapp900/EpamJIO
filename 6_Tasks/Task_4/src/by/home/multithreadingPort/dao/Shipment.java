package by.home.multithreadingPort.dao;

import by.home.multithreadingPort.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Shipment {
	/**
	 * В Shipment попадают корабли которые загрузились в порту. 
	 */
	
	private List<Boat> shipment = new ArrayList<>();

	public Shipment() {

	}

	public List<Boat> getShipmentLog() {
		return List.copyOf(shipment);
	}

	public void setShipment(Boat boat) {
		this.shipment.add(boat);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Shipment shipment1 = (Shipment) o;
		return Objects.equals(shipment, shipment1.shipment);
	}

	@Override
	public int hashCode() {
		return Objects.hash(shipment);
	}

	@Override
	public String toString() {
		return "Журнал отгрузок: " + "shipment=" + shipment;
	}
}
