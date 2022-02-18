package string_builder;

//Из заданной строки получить новую, повторив каждый символ дважды.

public class Task_6 {
	public static void main(String[] args) {
		String string = "abc";
		System.out.println(reapidrepeatEveryCharacter(string));
	}

	public static StringBuilder reapidrepeatEveryCharacter(String str) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {

			stringBuilder.append(str.charAt(i));
			stringBuilder.append(str.charAt(i));

		}

		return stringBuilder;
	}

}
