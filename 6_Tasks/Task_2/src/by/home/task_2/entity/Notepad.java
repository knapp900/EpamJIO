package by.home.task_2.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Notepad implements Serializable {

	private static final long serialVersionUID = -2625336613755185462L;

	private List<Note> list;

	public Notepad() {
		super();
	}

	public Notepad(List<Note> list) {
		super();
		this.list = list;
	}

	public List<Note> getList() {
		return list;
	}

	public void setList(List<Note> list) {
		this.list = list;
	}

	@Override
	public int hashCode() {
		return Objects.hash(list);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Notepad other = (Notepad) obj;
		return Objects.equals(list, other.list);
	}

	@Override
	public String toString() {

		if (list.isEmpty()) {
			return "Блокнот:\nУ вас нет заметок!";
		} else {

			StringBuilder sb = new StringBuilder();

			sb.append("Блокнот:");
			sb.append(list.toString());

			return sb.toString();
		}
	}

}
