package string_builder;

//Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class Task_1 {
	public static void main(String[] args) {
		String str = "Hello    World  Java     ";
		System.out.println(maxLengthSpace(str));

	}

	public static int maxLengthSpace(String str) {
		int count = 0;
		int temp = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
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
