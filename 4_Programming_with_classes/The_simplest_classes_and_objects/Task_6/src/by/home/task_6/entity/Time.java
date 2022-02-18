package by.home.task_6.entity;

import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;

	}

	public int getHours() {
		return hour;
	}

	public void setHours(int hours) {
		if (hours < 0 || hours > 23) {
			hours = 0;
		}

		this.hour = hours;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 59) {
			minute = 0;
		}
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 0 || second > 59) {
			second = 0;
		}
		this.second = second;
	}

	@Override
	public String toString() {
		return "Time [" + hour + ":" + minute + ":" + second + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute, second);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute && second == other.second;
	}
}
