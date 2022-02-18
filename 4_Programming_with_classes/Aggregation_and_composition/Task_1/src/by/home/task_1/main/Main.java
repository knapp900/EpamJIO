package by.home.task_1.main;

import by.home.task_1.entity.*;

import by.home.task_1.view.*;

/**
 * Создать объект класса Текст, используя классы Предложение, Слово. Методы:
 * дополнить текст, вывести на консоль текст, заголовок текста.
 * 
 * Use aggregation and composition!
 * 
 * Create an object of the Text class using the Sentence, Word classes. Methods:
 * add text, output text to the console, text title.
 *
 * @author Knapp
 */

public class Main {

	public static void main(String[] args) {
		Sentence sentence = new Sentence();
		View view = new View();
		Word word = new Word();
		Text text = new Text(sentence, word);
		// Add text
		text.getSentence().setSentences("Hi, my name is Arthur, I'm studying Java.");
		text.getTitleWord().setWord("Title");
		// Output text to the console, text title

		view.print(text);

	}
}
