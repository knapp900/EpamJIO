package working_with_string_as_array_characters;

//Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
//Крайние пробелы в строке удалить.

public class Task_5 {
	public static void main(String[] args) {
		String str = "    Hello      world.     ";

		System.out.println(trimSpaceString(str));

	}

	public static StringBuilder trimSpaceString(String str) {
		StringBuilder stringBuilder = new StringBuilder();
		String tmp = str.trim();
		boolean flag = false;

		for (int i = 0; i < tmp.length(); i++) {
			if (tmp.charAt(i) == ' ') {
				if (!flag) {
					stringBuilder.append(" ");

				}
				flag = true;
			} else {
				stringBuilder.append(tmp.charAt(i));
				flag = false;
			}
		}

		return stringBuilder;

	}

}
