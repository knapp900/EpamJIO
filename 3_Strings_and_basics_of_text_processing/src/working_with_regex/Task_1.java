package working_with_regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
//операции:
//1.Oтсортировать абзацы по количеству предложений;
//2.В каждом предложении отсортировать слова по длине;
//3.Отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
//алфавиту.

public class Task_1 {
	public static void main(String[] args) {
		String string = "Возможно Вы уже знаете, что листья листопадных деревьев меняют цвет осенью, "
				+ "потому что теряют свои зеленые молекулы хлорофилла. "
				+ "Но это не объясняет то, почему листья изначально меняют свой цвет.\n"
				+ "Листопадные деревья позволяют своим листьям опадать, чтобы избежать затрат на подготовку их к зиме. "
				+ "Но смена листвы была бы слишком дорогостоящей, если бы деревья теряли все свои ценные питательные вещества, "
				+ "которые с большим трудом добывали из почвы. "
				+ "В начале деревья перерабатывают листья, разбирая изнутри клетки и аппарат фотосинтеза, чтобы вернуть себе затраченный азот и фосфор, "
				+ "сохранив его в ветках до следующей весны. "
				+ "Это очень сложно сделать, так как во время переработки молекулы хлорофилла продолжают поглощать солнечную энергию. "
				+ "Но фотосинтез уже не происходит и они начинают передавать энергию молекулам кислорода, "
				+ "которая в данный момент не использована. Эти молекулы сеют хаос, повреждая части листа, "
				+ "собирающие и переносящие питательные вещества обратно к дереву. "
				+ "Чтобы минимизировать этот разрушительный эффект, листья разделяют свой хлорофилл в менее опасные молекулы, "
				+ "которые чаще всего прозрачные или иногда желтые.\n"
				+ "После исчезновения ярко-зеленых молекул, желтые и оранжевые пигменты, которые были в листе с самого начала, "
				+ "превращают листья соответственно в желтые и оранжевые. "
				+ "Некоторые деревья выбирают более безопасную защиту от разрушительно эффекта хлорофилла. Когда начинается переработка листа, "
				+ "деревья производят специальные пигменты, "
				+ "чтобы закрыть хлорофилл от солнечного света. Эти пигменты чаще всего красные или пурпурные. "
				+ "Листья деревьев, которые их используют осенью, становятся красными. "
				+ "Деревья являются самыми красивыми фабриками вторичной переработки ресурсов в мире.\n";
//		separationSentences(string);
//		separationParagraphs(string);
		sortSentences(string);

	}

	private static void sortSentences(String string) {
		int[] arr = new int[separationParagraphs(string).size()];
		for (int i = 0; i < separationParagraphs(string).size(); i++) {

			System.out.println(separationSentences(separationParagraphs(string).get(i)).size());
 			System.out.println(separationParagraphs(string).get(i));

		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = separationSentences(separationParagraphs(string).get(i)).size();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < separationParagraphs(string).size(); i++) {
			
				
			
			
		}

	}
//
//	private static String sortWords(String string) {
//
//	}
//
//	private static String sortLexeme(String string) {
//
//	}

	private static ArrayList<String> separationSentences(String string) {
		int count = 0;
		ArrayList<String> a = new ArrayList<String>();
		Pattern re = Pattern.compile("[^.!?\\s][^.!?]*(?:[.!?](?!['\"]?\\s|$)[^.!?]*)*[.!?]?['\"]?(?=\\s|$)",
				Pattern.MULTILINE | Pattern.COMMENTS);
		Matcher reMatcher = re.matcher(string);
		while (reMatcher.find()) {
			count++;
			a.add(reMatcher.group());
		}
//		System.out.println(a.toString() +'\n'+ a.size());
//		System.out.println(a.get(0));
		return a;

	}

	private static ArrayList<String> separationParagraphs(String string) {
		ArrayList<String> b = new ArrayList<String>();
		Pattern re = Pattern.compile(".+\\R");
		Matcher reMatcher = re.matcher(string);
		while (reMatcher.find()) {
			b.add(reMatcher.group());
		}
//		System.out.println(b.toString() + '\n' + b.size());
//		System.out.println(b.get(2));
		return b;

	}

}
