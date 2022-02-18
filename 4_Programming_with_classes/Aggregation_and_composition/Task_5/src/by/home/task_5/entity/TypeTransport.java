package by.home.task_5.entity;

public enum TypeTransport {
	
	 NONE("Без транспорта"),BUS("Автобус"), AIRPLANE("Самолет"),TRAIN("Поезд"),CAR("Автомобиль");
	
	private String typeTransport;
	
	private TypeTransport(String typeTransport) {
		this.typeTransport = typeTransport;
	}

	public String getTypeTransport() {
		return typeTransport;
	}
	
	
	

}
