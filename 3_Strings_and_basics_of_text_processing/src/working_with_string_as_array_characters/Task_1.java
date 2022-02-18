package working_with_string_as_array_characters;

import java.util.Arrays;

//Дан массив названий переменных в camelCase. Преобразовать названия в snake_case

public class Task_1 {
	public static void main(String[] args) {
		String[] camlCase = new String[] { "helloWorld", "javaOnline", "basicsOfSoftware" };
		System.out.println(Arrays.deepToString(camlCase));
		toSnakeCase(getStringInToArray(camlCase));

	}

	public static String toSnakeCase(String camlCaseString) {
		String res = "";

		for (int i = 0; i < camlCaseString.length(); i++) {
			char ch = camlCaseString.charAt(i);
			if (Character.isUpperCase(ch)) {
				res = res + '_';
				res = res + Character.toLowerCase(ch);
			} else {
				res = res + ch;
			}
		}
		System.out.print(res + ", " );

		return res;
	}

	public static String getStringInToArray(String[] camlCase) {
		String tempString = "";

		for (int i = 0; i < camlCase.length; i++) {
			toSnakeCase(camlCase[i]);
		}

		return tempString;
	}

}
