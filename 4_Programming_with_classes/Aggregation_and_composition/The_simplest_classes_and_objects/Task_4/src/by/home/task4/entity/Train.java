package by.home.task4.entity;

import java.time.LocalTime;
/*
Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.

Create a Train class containing fields: destination name, train number, departure time.
Create data into an array of five elements of Train type, add the ability to sort the array elements by
train numbers. Add the ability to display information about the train, the number of which is entered by the user.
Add the ability to sort the array by destination, with trains with the same points
destinations must be ordered by departure time
*/
import java.util.Objects;

public class Train {

	private String destinationName;
	private int trainNumber;
	private LocalTime departureTime;

	public Train(String destinationName, int trainNumber, LocalTime departureTime) {
		this.destinationName = destinationName;
		this.trainNumber = trainNumber;
		this.departureTime = departureTime;
	}
	
	public String getDestinationName() {
		return destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	@Override
	public String toString() {
		return "Train [destinationName=" + destinationName + ", trainNumber=" + trainNumber + ", departureTime="
				+ departureTime + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Train train = (Train) o;
		return trainNumber == train.trainNumber && Objects.equals(destinationName, train.destinationName)
				&& Objects.equals(departureTime, train.departureTime);
	}

	@Override
	public int hashCode() {
		return Objects.hash(destinationName, trainNumber, departureTime);
	}
}
