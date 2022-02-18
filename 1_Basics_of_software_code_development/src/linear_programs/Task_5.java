package linear_programs;

/**
 * 
 * 5. Дано натуральное число Т, которое представляет длительность прошедшего
 * времени в секундах. Вывести данное значение длительности в часах, минутах и
 * секундах в следующей форме: ННч ММмин SSc.
 * 
 * @author Knapp Arthur
 *
 */

public class Task_5 {

	public static void main(String[] args) {
		int val = 30022;
		int SS = val % 60;
		int MM = val % 3600 / 60;
		int HH = val / 3600;
		System.out.println(HH + " " + MM + " " + SS);

	}

}
