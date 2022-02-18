package string_builder;

//Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class Task_5 {
	public static void main(String[] args) {
		String string = "aaaavvv";
		System.out.println(symbolCounter(string));
	}

	public static int symbolCounter(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a') {
				count++;
			}
		}
		return count;
	}

}
