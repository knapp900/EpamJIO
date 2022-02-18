package working_with_string_as_array_characters;

//В строке найти количество чисел.

public class Task_4 {
	public static void main(String[] args) {
//		String str = "in a 400° oven until tender, 30 to 35 minutes. Scoop into a food processor and blend until smooth.";
		String str = "11 Hallo 12 World11 13  ";

		System.out.println(numberCounterInToString(str));
	}

	public static int numberCounterInToString(String sample) {
		int count = 0;
		String tmp = "";
		tmp = sample.replaceAll("[^-?0-9]+", " ").trim();
		for (int i = 0; i < tmp.length(); i++) {
			char ch = tmp.charAt(i);
			if (ch == ' ') {
				count++;
			} else {

			}
		}

		return count + 1;

	}

}
