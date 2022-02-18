package decomposition;

//Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.

public class Task_3 {
	public static void main(String[] args) {
		double a = 5;
		double res = areaHexagon(a);
		System.out.println(res);
	}

	private static double areaHexagon(double a) {
		double res = Math.pow(a, 2) * Math.sqrt(3) / 4 * 6;
		return res;

	}

}
