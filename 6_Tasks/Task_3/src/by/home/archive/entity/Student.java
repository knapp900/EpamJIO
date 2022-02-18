package by.home.archive.entity;

import java.io.Serializable;
import java.util.Objects;

public class Student extends Case implements Serializable{

	private static final long serialVersionUID = 3264958278560784649L;
	
	private String faculty;
	private int course;

	public Student() {
		super();
	}

	public Student(String faculty, int course) {
		super();
		this.faculty = faculty;
		this.course = course;
	}

	public Student( String firstName, String lastName, int age, String faculty, int course) {
		super(firstName, lastName, age);
		this.faculty = faculty;
		this.course = course;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(course, faculty);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return course == other.course && Objects.equals(faculty, other.faculty);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n*******************");
		sb.append("\nИдентификатор " + super.getId());
		sb.append("\nИмя: " + super.getFirstName());
		sb.append("\nФамилия: " + super.getLastName());
		sb.append("\nВозраст: " + super.getAge());
		sb.append("\nФакультет: " + faculty);
		sb.append("\nKурс: " + course);

		return sb.toString();
	}

}
