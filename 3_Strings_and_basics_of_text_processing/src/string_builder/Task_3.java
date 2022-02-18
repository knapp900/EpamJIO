package string_builder;

//Проверить, является ли заданное слово палиндромом.

public class Task_3 {
	public static void main(String[] args) {
		String string = "RACECAR";
		checkPalindromeString(string);
	
	}
	public static void checkPalindromeString(String str) {
		StringBuilder stringBuilder = new StringBuilder(str).reverse();
		if(str.contentEquals(stringBuilder)) {
			System.out.println("Слово " + str + " является палиндромом.");
		}
		else {
			System.out.println("Слово " + str + " не является палиндромом.");
			
		}
		
	}

}
