package by.home.task_5.entity;

import java.util.Objects;

public class Food {

	int numberOfMeals;
	String descriptionOfMeal;

	public Food() {
		super();

	}

	public Food(int numberOfMeals, String descriptionOfMeal) {
		super();
		this.numberOfMeals = numberOfMeals;
		this.descriptionOfMeal = descriptionOfMeal;
	}

	public int getNumberOfMeals() {
		return numberOfMeals;
	}

	public void setNumberOfMeals(int numberOfMeals) {
		this.numberOfMeals = numberOfMeals;
	}

	public String getDescriptionOfMeal() {
		return descriptionOfMeal;
	}

	public void setDescriptionOfMeal(String descriptionOfMeal) {
		this.descriptionOfMeal = descriptionOfMeal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descriptionOfMeal, numberOfMeals);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		return Objects.equals(descriptionOfMeal, other.descriptionOfMeal) && numberOfMeals == other.numberOfMeals;
	}

	@Override
	public String toString() {
		return "Питание " + numberOfMeals + " разовое."+ " Описание кухни: " + descriptionOfMeal;
	}

}
