package by.home.task_5.entity;

public enum TypeTour {
	CRUISE("Круиз"), SHOP("Шопинг"), REST("Отдых"), EXCURSION("Экскурсии"), MEDICAL("Лечение");

	private String typeTour;

	private TypeTour(String typeTour) {
		this.typeTour = typeTour;
	}

	public String getTypeTour() {
		return typeTour;
	}

}
