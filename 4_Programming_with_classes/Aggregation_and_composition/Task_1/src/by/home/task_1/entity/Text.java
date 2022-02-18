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
 * @author Knapp Arthur
 */

public class Text {

	private Sentence sentence;
	private Word titleWord;

	public Text(Sentence sentence, Word titleWord) {
		super();
		this.sentence = new Sentence(sentence.getSentences());
		this.titleWord = new Word(titleWord.getWord());
	}

	public Sentence getSentence() {
		return sentence;
	}

	public void setSentence(Sentence sentence) {
		this.sentence = sentence;
	}

	public Word getTitleWord() {
		return titleWord;
	}

	public void setTitleWord(Word titleWord) {
		this.titleWord = titleWord;
	}

	@Override
	public int hashCode() {
		return Objects.hash(sentence, titleWord);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Text other = (Text) obj;
		return Objects.equals(sentence, other.sentence) && Objects.equals(titleWord, other.titleWord);
	}

	@Override
	public String toString() {
		return "Text title: " + titleWord + '\n' + "Output text to the console: " + sentence;
	}

}
