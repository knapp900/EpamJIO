package by.home.task_10.entity;


import java.util.Objects;
import java.time.*;

public class Airline {

	private String destination;
	private String flightNumber;
	private String aircraftType;
	private LocalTime departureTime1;
	private DayOfWeek daysOfWeek;

	public Airline() {

	}

	public Airline(String destination, String flightNumber, String aircraftType, LocalTime departureTime1,
			DayOfWeek daysOfWeek) {
		super();
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.aircraftType = aircraftType;
		this.departureTime1 = departureTime1;
		this.daysOfWeek = daysOfWeek;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public LocalTime getDepartureTime1() {
		return departureTime1;
	}

	public void setDepartureTime1(LocalTime departureTime1) {
		this.departureTime1 = departureTime1;
	}

	public DayOfWeek getDaysOfWeek() {
		return daysOfWeek;
	}

	public void setDaysOfWeek(DayOfWeek daysOfWeek) {
		this.daysOfWeek = daysOfWeek;
	}

	@Override
	public int hashCode() {
		return Objects.hash(aircraftType, daysOfWeek, departureTime1, destination, flightNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		return Objects.equals(aircraftType, other.aircraftType) && Objects.equals(daysOfWeek, other.daysOfWeek)
				&& Objects.equals(departureTime1, other.departureTime1)
				&& Objects.equals(destination, other.destination) && Objects.equals(flightNumber, other.flightNumber);
	}

	@Override
	public String toString() {
		return "Пункт назначения: " + destination + " номер рейса:  " + flightNumber + " тип самолета " + aircraftType
				+ " время вылета " + departureTime1 + " день недли " + daysOfWeek + '\n';
	}

}
