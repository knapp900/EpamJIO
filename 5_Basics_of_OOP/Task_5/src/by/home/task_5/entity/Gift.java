package by.home.task_5.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Gift {

	List<Candy> candies = new ArrayList<Candy>();
	Packing packing;

	public Gift() {
		super();

	}

	public Gift(List<Candy> candies, Packing packing) {
		super();
		this.candies = candies;
		this.packing = packing;
	}

	public Packing getPacking() {
		return packing;
	}

	public void setPacking(Packing packing) {
		this.packing = packing;
	}

	public List<Candy> getCandies() {
		return candies;
	}

	public void addCandies(Candy candy) {
		candies.add(candy);
	}

	@Override
	public int hashCode() {
		return Objects.hash(candies, packing);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gift other = (Gift) obj;
		return Objects.equals(candies, other.candies) && Objects.equals(packing, other.packing);
	}

	@Override
	public String toString() {
		return "Подарок содержит: \n" + candies + packing ;
	}

}
