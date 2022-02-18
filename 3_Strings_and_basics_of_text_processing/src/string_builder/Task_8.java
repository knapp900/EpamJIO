package string_builder;

//Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
//длинных слов может быть несколько, не обрабатывать.

public class Task_8 {
	public static void main(String[] args) {
		String string = "Hello Worlds";
		System.out.println(maxLengthWord(string));

	}

	public static int maxLengthWord(String str) {

		int count = 0;
		int temp = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				temp++;
				if (count <= temp) {
					count = temp;
				}
			} else {
				temp = 0;
			}
		}
		return count;

	}

}
