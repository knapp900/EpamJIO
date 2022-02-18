package by.home.task_1.entity;

import java.util.Objects;

/**
 * Создать объект класса Текст, используя классы Предложение, Слово. Методы:
 * дополнить текст, вывести на консоль текст, заголовок текста.
 * 
 *             Use aggregation and composition!
 * 
 * Create an object of the Text class using the Sentence, Word classes. Methods:
 * add text, output text to the console, text title.
 *
 * @author knapp
 */

public class Sentence {

	private String sentences;

	public Sentence() {

	}

	public Sentence(String sentence) {
		this.sentences = sentence;

	}

	public String getSentences() {
		return sentences;
	}

	public void setSentences(String sentence) {
		this.sentences = sentence;
	}

	@Override
	public int hashCode() {
		return Objects.hash(sentences);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sentence other = (Sentence) obj;
		return Objects.equals(sentences, other.sentences);
	}

	@Override
	public String toString() {
		return sentences;
	}

}
