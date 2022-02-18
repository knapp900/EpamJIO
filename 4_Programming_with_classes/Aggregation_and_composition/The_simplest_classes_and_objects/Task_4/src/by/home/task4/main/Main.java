package by.home.task4.main;

import by.home.task4.view.*;
import by.home.task4.logic.*;
import by.home.task4.entity.*;

import java.time.LocalTime;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		TrainLogic logic = new TrainLogic();
		DepotTrains depot = new DepotTrains();
		TrainView view = new TrainView();

		depot.addTrain(new Train("Kyriat Mozkin", 103, LocalTime.of(14, 35)));
		depot.addTrain(new Train("Hifa", 101, LocalTime.of(13, 55)));
		depot.addTrain(new Train("Acko", 104, LocalTime.of(14, 55)));
		depot.addTrain(new Train("Kyriat Bialik", 102, LocalTime.of(14, 20)));
		depot.addTrain(new Train("Nesher", 100, LocalTime.of(15, 25)));

		List<Train> sortedByNumber;
		sortedByNumber = logic.sortByNumber(depot.getTrains());
		view.print("Sort by number: ", sortedByNumber);

		List<Train> sortedByDestination;
		sortedByDestination = logic.sortByDestination(depot.getTrains());
		view.print("Sort by destination: ", sortedByDestination);

		Train train;
		train = logic.findByNumberTrain(100, depot.getTrains());
		view.print("Find by number: " + train, null);

	}

}
