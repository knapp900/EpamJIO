package by.home.task_6.logic;

import by.home.task_6.entity.*;

public class TimeLogic extends Time {

	private Time time;

	public TimeLogic(Time time) {
		this.time = time;

	}

	public void setTime(int hour, int minute, int second) {
		if (time.getHours() + hour >= 0 && time.getHours() + hour < 24) {
			time.setHours(time.getHours() + hour);
		} else
			time.setHours(0);

		if (time.getMinute() + minute >= 0 && time.getMinute() + minute < 24) {
			time.setMinute(time.getMinute() + minute);
		} else
			time.setMinute(0);

		if (time.getSecond() + second >= 0 && time.getSecond() + second < 24) {
			time.setSecond(time.getSecond() + second);
		} else
			time.setSecond(0);

	}

	public void getTime() {

	}

	public void resetTime() {

	}

}
