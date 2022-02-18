package decomposition;

//Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
//если угол между сторонами длиной X и Y— прямой.

public class Task_9 {
	public static void main(String[] args) {
		int x, y, z, t;
		x = 5;
		y = 4;
		z = 4;
		t = 3;
		System.out.println(square(x, y, z, t));

	}

	private static double square(int x, int y, int z, int t) {
		double diagonal = Math.sqrt(x * x + y * y);
		double s1 = x * y / 2;
		double p = (diagonal + z + t) / 2;
		double s2 = Math.sqrt(p * (p - diagonal) * (p - z) * (p - t));
		return s1 + s2;

	}

}
