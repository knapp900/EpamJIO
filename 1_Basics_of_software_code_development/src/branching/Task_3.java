package branching;

/**
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они
 * расположены на одной прямой.
 * 
 * @author Knapp Arthur
 *
 */

public class Task_3 {

	public static void main(String[] args) {
		
		int x1 = 100;
		int y1 = 100;

		int x2 = 100;
		int y2 = 100;

		int x3 = 100;
		int y3 = 100;

		if (((x1 - x3) * (y2 - y3)) == ((x2 - x3) * (y1 - y3))) {

			System.out.print("Точки лежат на одной прямой");

		} else {

			System.out.print("Точки не лежат наодной прямой");

		}

	}

}
