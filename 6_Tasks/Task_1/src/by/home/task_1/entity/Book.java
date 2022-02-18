package by.home.task_1.entity;

import java.io.Serializable;
import java.util.Objects;

public class Book implements Serializable {

	private static final long serialVersionUID = -1385775402071653863L;

	private String title;
	
	private boolean eBook;
	
	public Book() {
		super();
	}
	
	public Book(String title, String description,boolean eBook) {
		super();
		this.title = title;
		this.description = description;
		this.eBook = eBook;
	}
	
	public boolean iseBook() {
		return eBook;
	}

	public void seteBook(boolean eBook) {
		this.eBook = eBook;
	}

	private String description;
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public int hashCode() {
		return Objects.hash(description, eBook, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(description, other.description) && eBook == other.eBook
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		
		return "title=" + title + " description=" + description + " eBook=" + eBook;
	}

	
	

}
