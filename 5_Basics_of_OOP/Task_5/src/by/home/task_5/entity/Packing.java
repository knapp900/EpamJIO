package by.home.task_5.entity;

import java.util.Objects;

public class Packing {
	boolean cardboard;
	boolean plasticBag;

	public Packing() {
		super();
	}

	public Packing(boolean cardboard, boolean plasticBag) {
		this.cardboard = cardboard;
		this.plasticBag = plasticBag;
	}

	public boolean isCardboard() {
		return cardboard;
	}

	public void setCardboard(boolean cardboard) {
		this.cardboard = cardboard;
	}

	public boolean isPlasticBag() {
		return plasticBag;
	}

	public void setPlasticBag(boolean plasticBag) {
		this.plasticBag = plasticBag;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cardboard, plasticBag);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Packing other = (Packing) obj;
		return cardboard == other.cardboard && plasticBag == other.plasticBag;
	}

	@Override
	public String toString() {

		if (cardboard) {

			return "\nУпаковано в картонную коробку";

		}
		return "\nУпаковано в целофановый пакет";
	}

}
