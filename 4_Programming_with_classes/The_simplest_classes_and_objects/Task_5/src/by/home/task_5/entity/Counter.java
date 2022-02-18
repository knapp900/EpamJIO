package by.home.task_5.entity;

public class Counter {
	private int value;
	private int maxRange;
	private int minRange;

	public Counter() {
		this.value = 0;
		this.maxRange = 100;
		this.minRange = -100;

	}

	public Counter(int value, int maxRange, int minRange) {
		this.value = value;
		this.maxRange = maxRange;
		this.minRange = minRange;

	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getMaxRange() {
		return maxRange;
	}

	public void setMaxRange(int maxRange) {
		this.maxRange = maxRange;
	}

	public int getMinRange() {
		return minRange;
	}

	public void setMinRange(int minRange) {
		this.minRange = minRange;
	}

}
