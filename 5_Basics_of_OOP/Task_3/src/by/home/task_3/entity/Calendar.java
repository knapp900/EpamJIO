package by.home.task_3.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * Задача 3. Создать класс Календарь с внутренним классом, с помощью объектов
 * которого можно хранить информацию о выходных и праздничных днях. *
 * 
 * @author Knapp Arthur
 *
 */

public class Calendar implements Serializable {

	private static final long serialVersionUID = 5962541138685840580L;

	private int day;
	private int month;
	private int year;

	public Calendar() {
		super();

	}

	public Calendar(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static class WeekendsAndHolidays {

		private List<Calendar> dayOff = new ArrayList<Calendar>();

		public WeekendsAndHolidays() {
			super();
		}

		public WeekendsAndHolidays(List<Calendar> dayOff) {
			super();
			this.dayOff = dayOff;
		}

		public List<Calendar> getDayOff() {
			return dayOff;
		}

		public void addDayOff(Calendar calendar) {
			dayOff.add(calendar);
		}

		@Override
		public int hashCode() {
			return Objects.hash(dayOff);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			WeekendsAndHolidays other = (WeekendsAndHolidays) obj;
			return Objects.equals(dayOff, other.dayOff);
		}

		@Override
		public String toString() {
			return "WeekendsAndHolidays [dayOff=" + dayOff + "]";
		}

	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calendar other = (Calendar) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	@Override
	public String toString() {
		return "Calendar [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
}
