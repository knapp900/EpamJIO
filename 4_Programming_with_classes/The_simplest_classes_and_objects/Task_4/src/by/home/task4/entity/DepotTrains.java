package by.home.task4.entity;



import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DepotTrains {

	private List<Train> trains = new ArrayList<Train>();

	public DepotTrains() {

	}

	public List<Train> getTrains() {
		return trains;
	}

	public void addTrain(Train train) {
		trains.add(train);
	}

	@Override
	public int hashCode() {
		return Objects.hash(trains);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DepotTrains other = (DepotTrains) obj;
		return Objects.equals(trains, other.trains);
	}

	@Override
	public String toString() {
		return "DepotTrains [trains=" + trains + "]";
	}

}
