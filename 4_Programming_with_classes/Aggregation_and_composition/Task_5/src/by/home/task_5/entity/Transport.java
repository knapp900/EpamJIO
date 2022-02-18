package by.home.task_5.entity;

import java.util.Objects;

public class Transport {

	String transport;
	String descriptionOfTransport;

	public Transport() {
		super();

	}

	public Transport(TypeTransport transport, String typeTransport) {
		super();
		this.transport = transport.getTypeTransport();
		this.descriptionOfTransport = typeTransport;
	}

	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public String getDescriptionOfTransport() {
		return descriptionOfTransport;
	}

	public void setDescriptionOfTransport(String descriptionOfTransport) {
		this.descriptionOfTransport = descriptionOfTransport;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descriptionOfTransport, transport);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transport other = (Transport) obj;
		return Objects.equals(descriptionOfTransport, other.descriptionOfTransport)
				&& Objects.equals(transport, other.transport);
	}

	@Override
	public String toString() {
		return "Тип транспорта: " + transport + ".Описание: " + descriptionOfTransport;
	}

}
