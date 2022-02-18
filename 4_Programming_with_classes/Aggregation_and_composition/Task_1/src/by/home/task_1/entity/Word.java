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

public class Word {

	private String word;

	public Word() {

	}

	public Word(String string) {
		this.word = string;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public int hashCode() {
		return Objects.hash(word);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		return Objects.equals(word, other.word);
	}

	@Override
	public String toString() {
		return word;
	}

}
