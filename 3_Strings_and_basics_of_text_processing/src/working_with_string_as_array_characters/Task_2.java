package working_with_string_as_array_characters;

//Замените в строке все вхождения 'word' на 'letter'

public class Task_2 {
	public static void main(String[] args) {
		String str = "Word to word";
		System.out.println(chngeWord(str));

	}
	public static String chngeWord(String str) {
		str = str.toLowerCase();
		String tmp = str.replaceAll("word", "Leter");
		return tmp;
	}
}
