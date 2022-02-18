package by.home.task_5.entity;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

/**
 * Туристические путевки. Сформировать набор предложений клиенту по
 * выборутуристической путевки различного типа (отдых, экскурсии, лечение,
 * шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора
 * транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 * 
 * @author Knapp Arthur
 *
 */

public class Tour {
	int number;
	String countru;
	String typeTour;
	LocalDate dateOfEntry;
	LocalDate dateOfDeport;
	Transport transport;
	Food food;
	String descriptionOfTour;
	long numbersOfDay;
	double price;

	public Tour() {
		super();

	}

	public Tour(int number, String countru, TypeTour typeTour, LocalDate dateOfEntry, LocalDate dateOfDeport,
			TypeTransport transport, String typeTransport, int numberOfMeals, String descriptionOfMeal,
			String descriptionOfTour, double price) {
		super();
		this.number = number;
		this.countru = countru;
		this.typeTour = typeTour.getTypeTour();
		this.dateOfEntry = dateOfEntry;
		this.dateOfDeport = dateOfDeport;
		this.transport = new Transport(transport, typeTransport);
		this.food = new Food(numberOfMeals, descriptionOfMeal);
		this.descriptionOfTour = descriptionOfTour;
		this.numbersOfDay = ChronoUnit.DAYS.between(dateOfEntry, dateOfDeport);
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public String getCountru() {
		return countru;
	}

	public void setCountru(String countru) {
		this.countru = countru;
	}

	public LocalDate getDateOfEntry() {
		return dateOfEntry;
	}

	public void setDateOfEntry(LocalDate dateOfEntry) {
		this.dateOfEntry = dateOfEntry;
	}

	public LocalDate getDateOfDeport() {
		return dateOfDeport;
	}

	public void setDateOfDeport(LocalDate dateOfDeport) {
		this.dateOfDeport = dateOfDeport;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public String getDescriptionOfTour() {
		return descriptionOfTour;
	}

	public void setDescriptionOfTour(String descriptionOfTour) {
		this.descriptionOfTour = descriptionOfTour;
	}

	public long getNumbersOfDay() {
		return numbersOfDay;
	}

	public void setNumbersOfDay(int numbersOfDay) {
		this.numbersOfDay = numbersOfDay;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(countru, dateOfDeport, dateOfEntry, descriptionOfTour, food, number, numbersOfDay, price,
				transport, typeTour);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tour other = (Tour) obj;
		return Objects.equals(countru, other.countru) && Objects.equals(dateOfDeport, other.dateOfDeport)
				&& Objects.equals(dateOfEntry, other.dateOfEntry)
				&& Objects.equals(descriptionOfTour, other.descriptionOfTour) && Objects.equals(food, other.food)
				&& number == other.number && numbersOfDay == other.numbersOfDay
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(transport, other.transport) && Objects.equals(typeTour, other.typeTour);
	}

	@Override
	public String toString() {
		return "---------------------------------------------------------------------------------------------------------"
				+ '\n' + "Тур №: |" + number + "| .Cтрана " + countru + ".Дата начала: " + dateOfEntry
				+ ".Дата окончания: " + dateOfDeport + ", Количество дней: |" + numbersOfDay + "| " + transport + ", "
				+ food + ", Описатие тура: " + descriptionOfTour + ", Стоимость: " + price + '\n'
				+ "---------------------------------------------------------------------------------------------------------";
	}

}
