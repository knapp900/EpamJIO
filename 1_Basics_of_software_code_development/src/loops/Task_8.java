package loops;

/**
 * 
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 * 
 * @author Knapp Arthur
 *
 */

public class Task_8 {
	public static void main(String[] args) {
		int num1 = 85657;
		int num2 = 12587;

		String string = String.valueOf(num1);
		char[] arrayNum1 = string.toCharArray();

		String str = String.valueOf(num2);
		char[] arrayNum2 = str.toCharArray();

		for (int i = 0; i < arrayNum1.length; i++) {
			for (int j = 0; j < arrayNum2.length; j++) {
				if (arrayNum1[i] == arrayNum2[j]) {
					System.out.println("Number " + arrayNum1[i]);
				}
			}
		}

	}

}
