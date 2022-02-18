package working_with_string_as_array_characters;

//В строке найти количество цифр.

public class Task_3 {
	public static void main(String[] args) {
		String str = "Hallo 12 World1";
		System.out.println(dgitCounterInToString(str));

	}

	public static int dgitCounterInToString(String sample) {
		int count = 0;

		for (int i = 0; i < sample.length(); i++) {
			char ch = sample.charAt(i);
			if (Character.isDigit(ch)) {
				count++;
			} else {

			}
		}
		return count;
	}

}
