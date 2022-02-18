package by.home.task_9.entity;



import java.util.Objects;

public class Book {
	private int id;
	private String title;
	private String author;
	private String publishingHouse;
	private int yearOfPublishing;
	private int numberOfPages;
	private double price;
	private String StringbindingType;

	public Book() {

	}

	public Book(int id, String title, String author, String publishingHouse, int yearOfPublishing, int numberOfPages,
			double price, String stringbindingType) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.publishingHouse = publishingHouse;
		this.yearOfPublishing = yearOfPublishing;
		this.numberOfPages = numberOfPages;
		this.price = price;
		StringbindingType = stringbindingType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public int getYearOfPublishing() {
		return yearOfPublishing;
	}

	public void setYearOfPublishing(int yearOfPublishing) {
		this.yearOfPublishing = yearOfPublishing;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getStringbindingType() {
		return StringbindingType;
	}

	public void setStringbindingType(String stringbindingType) {
		StringbindingType = stringbindingType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(StringbindingType, author, id, numberOfPages, price, publishingHouse, title,
				yearOfPublishing);
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
		return Objects.equals(StringbindingType, other.StringbindingType) && Objects.equals(author, other.author)
				&& id == other.id && numberOfPages == other.numberOfPages && price == other.price
				&& Objects.equals(publishingHouse, other.publishingHouse) && Objects.equals(title, other.title)
				&& yearOfPublishing == other.yearOfPublishing;
	}

	@Override
	public String toString() {
		return "id=" + id + " " + title + " " + author + " издательство " + publishingHouse
				+ " год " + yearOfPublishing + " кол-во страниц " + numberOfPages + " цена " + price
				+ " переплет " + StringbindingType + '\n';
	}

}
