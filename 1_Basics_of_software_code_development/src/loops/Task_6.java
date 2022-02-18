package loops;

/**
 * 
 * Вывести на экран соответствий между символами и их численными обозначениями в
 * памяти компьютера.
 * 
 * @author Knapp Arthur
 *
 */

public class Task_6 {
	public static void main(String[] args) {
		for (int i = 0; i < Character.MAX_VALUE; i++) {
			System.out.println(i + " = " + (char) i);
		}

	}
}
