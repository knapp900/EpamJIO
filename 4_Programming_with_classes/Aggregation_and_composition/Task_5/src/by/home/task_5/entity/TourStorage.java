package by.home.task_5.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TourStorage {
	/**
	 * Лист хранит в себе все путевки
	 */
	private List<Tour> tours = new ArrayList<Tour>();

	public TourStorage() {
		super();

	}

	public TourStorage(List<Tour> tours) {
		super();
		this.tours = tours;
	}

	public List<Tour> getTours() {
		return tours;
	}

	public void AddTours(Tour tour) {
		tours.add(tour);
	}

	@Override
	public int hashCode() {
		return Objects.hash(tours);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TourStorage other = (TourStorage) obj;
		return Objects.equals(tours, other.tours);
	}

	@Override
	public String toString() {
		return "TourStorage [tours=" + tours + "]";
	}

}
