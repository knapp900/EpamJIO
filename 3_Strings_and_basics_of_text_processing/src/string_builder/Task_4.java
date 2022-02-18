package string_builder;

//С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”

public class Task_4 {
	public static void main(String[] args) {
		String string = "информатика";
		makingWord(string);
		
	}
	public static void makingWord(String str) {
		String ch1 = String.valueOf(str.charAt(str.indexOf('т')));
		String ch2 = String.valueOf(str.charAt(str.indexOf('о')));
		String ch3 = String.valueOf(str.charAt(str.indexOf('р')));
		String ch4 = String.valueOf(str.charAt(str.indexOf('т')));
		System.out.println(ch1.concat(ch2).concat(ch3).concat(ch4));
	}

}
