package by.home.task_10.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AirlineStorage {
	
	private List<Airline> airlines = new ArrayList<Airline>();
	
	public AirlineStorage() {
		
	}

	public List<Airline> getAirlines() {
		return airlines;
	}

	public void addAirlines(Airline airline) {
		airlines.add(airline);
	}

	@Override
	public int hashCode() {
		return Objects.hash(airlines);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AirlineStorage other = (AirlineStorage) obj;
		return Objects.equals(airlines, other.airlines);
	}

	@Override
	public String toString() {
		return "AirlineStorage [airlines=" + airlines + "]";
	}
	
	
	
	

}
