package branching;

/**
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 * Определить, пройдет ли кирпич через отверстие.
 * 
 * @author Knapp Arthur
 *
 */
public class Task_4 {
	public static void main(String[] args) {
		// Размер отверстия.
		int a = 10; 
		int b = 20;
		// Размер кирпича.
		int x = 22; 
		int y = 10;
		int z = 22;
		if ((x <= a) && (y <= b) || (y <= a) && (x <= b) || (x <= a) && (z <= b) || (z <= a) && (x <= b)
				|| (z <= a) && (y <= b) || (y <= a) && (z <= b)) {
			System.out.println("Кирпич пройдет.");
		} else {
			System.out.println("Кирпич не пройдет.");
		}
	}

}
