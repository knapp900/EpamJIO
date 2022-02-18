package by.home.task4.logic;

import by.home.task4.entity.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class TrainLogic {


	public List<Train> sortByNumber(List<Train> trains) {
		List<Train> sortTrains = new ArrayList<Train>();
		sortTrains.addAll(trains);

		Collections.sort(sortTrains, new Comparator<Train>() {

			@Override
			public int compare(Train o1, Train o2) {
				return (o1.getTrainNumber() - o2.getTrainNumber());
			}
		});

		for (int i = 0; i < sortTrains.size(); i++) {

		}

		return sortTrains;
	}
	
	
	public List<Train> sortByDestination(List<Train> trains) {
		List<Train> sortTrains = new ArrayList<Train>();
		sortTrains.addAll(trains);

		Collections.sort(sortTrains, new Comparator<Train>() {

			@Override
			public int compare(Train o1, Train o2) {
				int resultString = o1.getDestinationName().compareTo(o2.getDestinationName());
				if (resultString == 0) {
					return o1.getDepartureTime().compareTo(o2.getDepartureTime());
				}
				return resultString;
				
			}
		});

		for (int i = 0; i < sortTrains.size(); i++) {

		}

		return sortTrains;
	}
	
	public Train findByNumberTrain (int findNumber, List<Train> trains) {
		
		for (Train train : trains) {
			if (train.getTrainNumber() == findNumber) {
				return train;
			}
			
			
		}
		
		
		return null;
	}
	
	
	
	
	

}
