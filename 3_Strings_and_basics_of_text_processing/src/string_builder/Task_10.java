package string_builder;

//Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
//знаком. Определить количество предложений в строке X.

public class Task_10 {
	public static void main(String[] args) {
		String string = "Hello world.Java online!Yes or Not?";
		System.out.println(numberOfSentencesInLine(string));
	}
	public static int numberOfSentencesInLine (String string) {
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if(string.charAt(i) == '.' || string.charAt(i) == '!' || string.charAt(i) == '?') {
				count++;
			}
			
		}
		return count;
		
	}

}
