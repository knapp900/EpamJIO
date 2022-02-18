package by.home.task_2.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Note implements Serializable, Comparable<Note> {

	private static final long serialVersionUID = -4523222209290776277L;

	private String topic;
	private String dateOfCreation;
	private String e_mail;
	private String message;

	public Note() {
		super();

	}

	public Note(String topic, String e_mail, String message) {
		super();
		this.topic = topic;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		this.dateOfCreation = LocalDateTime.now().format(formatter);
		this.e_mail = e_mail;
		this.message = message;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getDateOfCreation() {
		return dateOfCreation;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public int compareTo(Note o) {
		return 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateOfCreation, e_mail, message, topic);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Note other = (Note) obj;
		return Objects.equals(dateOfCreation, other.dateOfCreation) && Objects.equals(e_mail, other.e_mail)
				&& Objects.equals(message, other.message) && Objects.equals(topic, other.topic);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nТема: " + topic + "\n");
		sb.append("Дата: " + dateOfCreation + "\n");
		sb.append("Email: " + e_mail + "\n");
		sb.append("Сообщение: " + message + "\n");
		sb.append("******************************");

		return sb.toString();
	}

}
