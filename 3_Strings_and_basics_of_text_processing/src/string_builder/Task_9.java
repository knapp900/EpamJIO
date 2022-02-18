package string_builder;

//Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские буквы.

public class Task_9 {
	 public static void main(String[] args) {
	        String string = "Hello World";
	        System.out.println("Количество прописных букв: " + countUppercaseLetters(string) +'\n'
	                          + "Количество строчных букв: " +countLowercaseLetters(string));
	    }

	    public static int countUppercaseLetters(String string) {
	        int count = 0;
	        for (int i = 0; i < string.length(); i++) {
	            if (string.charAt(i) == Character.toUpperCase(string.charAt(i)) && string.charAt(i) != ' ') {
	                count++;
	            }
	        }
	        return count;

	    }

	    public static int countLowercaseLetters(String string) {
	        int count = 0;
	        for (int i = 0; i < string.length(); i++) {
	            if (string.charAt(i) == Character.toLowerCase(string.charAt(i)) && string.charAt(i) != ' ') {
	                count++;
	            }
	        }
	        return count;

	    }
}
